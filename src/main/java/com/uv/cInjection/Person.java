package com.uv.cInjection;

public class Person {
private int id ;
private String name;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}
}
