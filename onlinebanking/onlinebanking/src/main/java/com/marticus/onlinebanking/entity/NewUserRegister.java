package com.marticus.onlinebanking.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="registereduser")
public class NewUserRegister {
 private Long id;
 private String Name;
 //@DateTimeFormat(pattern="dd/MM/yyyy")
 private Date BirthDay;
 private String Email;
 private Long MobileNo;
 private String BankCardNo;
 private Long AadharNo;
 
 
public NewUserRegister(Long id, String name, Date birthDay, String email, Long mobileNo, String bankCardNo,
		Long aadharNo) {
	super();
	this.id = id;
	Name = name;
	BirthDay = birthDay;
	Email = email;
	MobileNo = mobileNo;
	BankCardNo = bankCardNo;
	AadharNo = aadharNo;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Date getBirthDay() {
	return BirthDay;
}
public void setBirthDay(Date birthDay) {
	BirthDay = birthDay;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Long getMobileNo() {
	return MobileNo;
}
public void setMobileNo(Long mobileNo) {
	MobileNo = mobileNo;
}
public String getBankCardNo() {
	return BankCardNo;
}
public void setBankCardNo(String bankCardNo) {
	BankCardNo = bankCardNo;
}
public Long getAadharNo() {
	return AadharNo;
}
public void setAadharNo(Long aadharNo) {
	AadharNo = aadharNo;
}
 
 
 
 
	
}
