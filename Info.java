package com.hibernate.HibApp;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "Info")
public class Info {
	
	@Id
	private int rollno;
	private String name;
	private int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Info [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
