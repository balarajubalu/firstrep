package com.raju.DTO;



public class UserLogin {
private String username;
private String password;
private Long mobile;
private String mailId;

@Override
public String toString() {
	return "UserLogin [username=" + username + ", password=" + password + ", mobile=" + mobile + ", mailId=" + mailId
			+ "]";
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
