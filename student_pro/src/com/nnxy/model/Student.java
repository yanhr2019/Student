package com.nnxy.model;

public class Student {
private int id;
private String username;
private String password;
private int sex;
private int age;
public Student(int id, String username, String password, int sex, int age) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.sex = sex;
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", age=" + age
			+ "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
