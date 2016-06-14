package org.apache.jsp.WEB_002dINF.views.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>登录</title>\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"网站模板下载,网站后台登录模板,后台登录模板HTML,后台模板登录,后台登录模板下载\" />\r\n");
      out.write("<meta name=\"description\" content=\"JS代码网提供大量的网站后台模板下载以及手机网站模板下载\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/login/js/jquery-1.9.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/login/images/login.js\"></script>\r\n");
      out.write("<link href=\"/static/login/css/login2.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>\r\n");
      out.write("\t\t登录\r\n");
      out.write("\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"login\" style=\"margin-top: 50px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"switch\" id=\"switch\">\r\n");
      out.write("\t\t\t\t<a class=\"switch_btn_focus\" id=\"switch_qlogin\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0);\" tabindex=\"7\">快速登录</a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"switch_btn\" id=\"switch_login\" href=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\ttabindex=\"8\">快速注册</a>\r\n");
      out.write("\t\t\t\t<div class=\"switch_bottom\" id=\"switch_bottom\"\r\n");
      out.write("\t\t\t\t\tstyle=\"position: absolute; width: 64px; left: 0px;\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"web_qr_login\" id=\"web_qr_login\"\r\n");
      out.write("\t\t\tstyle=\"display: block; height: 235px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--登录-->\r\n");
      out.write("\t\t\t<div class=\"web_login\" id=\"web_login\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"login-box\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"login_form\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"http://www.js-css.cn\" name=\"loginform\"\r\n");
      out.write("\t\t\t\t\t\t\taccept-charset=\"utf-8\" id=\"login_form\" class=\"loginForm\"\r\n");
      out.write("\t\t\t\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"did\" value=\"0\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"to\" value=\"log\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"uinArea\" id=\"uinArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"input-tips\" for=\"u\">帐号：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputOuter\" id=\"uArea\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"u\" name=\"username\" class=\"inputstyle\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pwdArea\" id=\"pwdArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"input-tips\" for=\"p\">密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputOuter\" id=\"pArea\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"p\" name=\"p\" class=\"inputstyle\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"padding-left: 50px; margin-top: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"登 录\" style=\"width: 150px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"button_blue\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--登录end-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--注册-->\r\n");
      out.write("\t\t<div class=\"qlogin\" id=\"qlogin\" style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"web_login\">\r\n");
      out.write("\t\t\t\t<form name=\"form2\" id=\"regUser\" accept-charset=\"utf-8\"\r\n");
      out.write("\t\t\t\t\taction=\"http://www.js-css.cn\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"to\" value=\"reg\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\tname=\"did\" value=\"0\" />\r\n");
      out.write("\t\t\t\t\t<ul class=\"reg_form\" id=\"reg-ul\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"userCue\" class=\"cue\">快速注册请注意格式</div>\r\n");
      out.write("\t\t\t\t\t\t<li><label for=\"user\" class=\"input-tips2\">用户名：</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputOuter2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" id=\"user\" name=\"user\" maxlength=\"16\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"inputstyle2\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><label for=\"passwd\" class=\"input-tips2\">密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputOuter2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" id=\"passwd\" name=\"passwd\" maxlength=\"16\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"inputstyle2\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t<li><label for=\"passwd2\" class=\"input-tips2\">确认密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputOuter2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" id=\"passwd2\" name=\"\" maxlength=\"16\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"inputstyle2\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><label for=\"qq\" class=\"input-tips2\">QQ：</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputOuter2\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" id=\"qq\" name=\"qq\" maxlength=\"10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"inputstyle2\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" id=\"reg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"margin-top: 10px; margin-left: 85px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"button_blue\" value=\"同意协议并注册\" /> <a href=\"#\" class=\"zcxy\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"_blank\">注册协议</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cl\"></div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--注册end-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"jianyi\">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
