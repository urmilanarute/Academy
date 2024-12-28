package com.grm.Academy;

import java.util.ArrayList;

public class Institiute {
	String institiuteName;
	ArrayList<Classroom>classroom;
	
	public Institiute(String institiuteName, ArrayList<Classroom> classroom) {
		super();
		this.institiuteName = institiuteName;
		this.classroom = classroom;
	}
	public String getInstitiuteName() {
		return institiuteName;
	}
	public void setInstitiuteName(String institiuteName) {
		this.institiuteName = institiuteName;
	}
	public ArrayList<Classroom> getClassroom() {
		return classroom;
	}
	public void setClassroom(ArrayList<Classroom> classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return "Institiute [institiuteName=" + institiuteName + ", classroom=" + classroom + "]";
	}
	
	

}
