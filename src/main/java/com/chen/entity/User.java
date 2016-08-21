package com.chen.entity;

import com.chen.common.db.model.EntityModel;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Author ： chen
 * Date ： 16/8/18
 * Time : 上午12:47
 */
@Entity
@Table(name="login_user")
public class User extends EntityModel<String> {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name = "system-uuid",strategy="uuid")
    @Column(length=40)
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="nickname")
    private String nickname;

    @Column(name = "qq")
    private String qq;

    @Column(name="email")
    private String email;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User : {id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", nickname=");
        builder.append(nickname);
        builder.append(", qq=");
        builder.append(qq);
        builder.append(", email=");
        builder.append(email);
        builder.append("}");
        return builder.toString();
    }


}
