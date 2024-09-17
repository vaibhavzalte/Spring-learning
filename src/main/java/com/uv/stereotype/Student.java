package com.uv.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("sai")
	private String name;
	@Value("3")
	private int rollno;
	@Value("#{mylist}")
	private List<String> friends;
	public Student(String name, int rollno, List<String> friends) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.friends = friends;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", friends=" + friends + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
