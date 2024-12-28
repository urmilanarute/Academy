package com.grm.Academy;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("App")
	public Institiute Check() {
		ArrayList<Student>student=new ArrayList<Student>();
		student.add(new Student(1, "Pallavi", "Java", 985472));
		student.add(new Student(2, "Radha", "Java", 965478));
		student.add(new Student(3, "Mahima", "Java", 965412));
		
		ArrayList<Student>student1=new ArrayList<Student>();
		student1.add(new Student(1,"Santosh", "Paython", 925450));
		student1.add(new Student(2,"Suraj", "Paython", 925450));
		student1.add(new Student(3,"Paaru", "Paython", 9284550));
		
		Classroom cr=new Classroom("Java", student);
		Classroom cr1=new Classroom("Paython", student1);
		
		ArrayList<Classroom>alclassroom=new ArrayList<Classroom>();
		alclassroom.add(cr);
		alclassroom.add(cr1);
		
		Institiute in=new Institiute("Kiran Academy", alclassroom);
		
		

		

		return in;
		
	}

}
