package com.grm.Academy;

import java.util.ArrayList;

public class Classroom {
	String classname;
	ArrayList<Student>students;
	public Classroom(String classname, ArrayList<Student> students) {
		super();
		this.classname = classname;
		this.students = students;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Classroom [classname=" + classname + ", students=" + students + "]";
	}
	
	

}
