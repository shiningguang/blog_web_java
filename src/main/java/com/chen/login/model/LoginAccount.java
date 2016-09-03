package com.chen.login.model;

import com.chen.common.db.model.EntityModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author ： chen
 * Date ： 16/9/3
 * Time : 下午5:03
 */
@Entity
@Table(name = "login_account")
public class LoginAccount extends EntityModel<String> {

    @Id
    @Column(name = "uid",length = 40)
    private String uid;
    @Column(name = "email")
    private String email;
    @Column(name = "salt")
    private String salt;
    @Column(name = "password")
    private String password;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LoginAccount{");
        sb.append("uid='").append(uid).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", salt='").append(salt).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
