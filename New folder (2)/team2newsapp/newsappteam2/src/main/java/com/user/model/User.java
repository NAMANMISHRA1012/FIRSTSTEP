package com.user.model;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name="user_info")
public class User 
{
  @Id
  @Column(name="user_id")
  private int userId;
  @Column(length =50,name="user_name")
  private String userName;
  @Column(unique=true , name="user_email")
  private String email;
  @Column(nullable=false)
  private String passWord;
public User(int userId, String userName, String email, String passWord) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.email = email;
	this.passWord = passWord;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public long getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", passWord=" + passWord + "]";
}
  

  
}
