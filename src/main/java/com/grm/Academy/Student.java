package com.grm.Academy;

public class Student {
	int sid;
	String name;
	String classname;
	int mob;
	public Student(int sid, String name, String classname, int mob) {
		super();
		this.sid = sid;
		this.name = name;
		this.classname = classname;
		this.mob = mob;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", classname=" + classname + ", mob=" + mob + "]";
	}
	
	

}
