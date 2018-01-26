
package com.raju.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User implements Serializable  {
  private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
@Column(name="u_id")
private Integer id;
@Column
private String name;
@Column
private String mobile;
@Column
private String mailId;
@Column
private String country;
@Column
private String password;
 private String newpassword;
 
	public String getNewpassword() {
	return newpassword;
}

public void setNewpassword(String newpassword) {
	this.newpassword = newpassword;
}

	public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
	@Override
public String toString() {
		return "[userid :"+id+" Name :"+name+" mobile :"+mobile+" mailId :"+mailId+"]";
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public Integer getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setMailId(String mailId) {
		this.mailId=mailId;
	}
	public String getMailId() {
		return mailId;
	}

	
}
