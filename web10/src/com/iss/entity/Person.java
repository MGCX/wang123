package com.iss.entity;

import java.util.Date;

public class Person {
public Person() {
	
}
private String name;
private int age;
private char sex;
private Date birthday;
private boolean isMarry;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public boolean isMarry() {
	return isMarry;
}
public void setMarry(boolean isMarry) {
	this.isMarry = isMarry;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
	result = prime * result + (isMarry ? 1231 : 1237);
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + sex;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (age != other.age)
		return false;
	if (birthday == null) {
		if (other.birthday != null)
			return false;
	} else if (!birthday.equals(other.birthday))
		return false;
	if (isMarry != other.isMarry)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (sex != other.sex)
		return false;
	return true;
}
}
