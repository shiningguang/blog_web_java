package com.chen.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.chen.common.db.model.EntityModel;



@Entity
@Table(name="login_user")
public class LoginUser extends EntityModel<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7645817301567868145L;
	
	@Id
	@Column(length = 40)
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
		builder.append("LoginUser : {id=");
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
