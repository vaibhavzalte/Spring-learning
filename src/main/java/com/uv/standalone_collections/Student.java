package com.uv.standalone_collections;
import java.util.List;
public class Student {
	private List<String> names;
	@Override
	public String toString() {
		return "Student [names=" + names + "]";
	}


	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
}
