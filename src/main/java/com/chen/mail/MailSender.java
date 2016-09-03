package com.chen.mail;


import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.chen.login.model.LoginUser;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.core.task.TaskExecutor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Author ： chen
 * Date ： 16/9/3
 * Time : 下午1:38
 */
public class MailSender {

    @Inject
    private JavaMailSender javaMailSender;
    @Inject
    private SimpleMailMessage simpleMailMessage;
    @Inject
    private FreeMarkerConfigurer freeMarkerConfigurer;
    @Inject
    private TaskExecutor taskExecutor;
    /**
     * 构建邮件内容，发送邮件。
     * @param user  用户
     * @param url   链接
     */
    public void send(LoginUser user, String url,String email) {
        String nickname = user.getNickname();
        String to = email;
        String text = "";
        Map<String, String> map = new HashMap<String, String>(1);
        map.put("url", url);
        try {
//            从FreeMarker模板生成邮件内容
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate("register_mail.ftl");
//            模板中用${XXX}站位，map中key为XXX的value会替换占位符内容。
            text = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        this.taskExecutor.execute(new SendMailThread(to,null,text));
    }
    //    内部线程类，利用线程池异步发邮件。
    private class SendMailThread implements Runnable {
        private String to;
        private String subject;
        private String content;
        private SendMailThread(String to, String subject, String content) {
            super();
            this.to = to;
            this.subject = subject;
            this.content = content;
        }
        @Override
        public void run() {
            sendMail(to, subject, content);
        }
    }
    /**
     * 发送邮件
     * @param to        收件人邮箱
     * @param subject   邮件主题
     * @param content   邮件内容
     */
    public void sendMail(String to, String subject, String content) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
            messageHelper.setFrom(simpleMailMessage.getFrom());
            if (subject != null) {
                messageHelper.setSubject(subject);
            } else {
                messageHelper.setSubject(simpleMailMessage.getSubject());
            }
            messageHelper.setTo(to);
            messageHelper.setText(content, true);
            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}