package com.uv.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mango {
	private int price;

	public Mango(int price) {
		super();
		this.price = price;
	}

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mango [price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

@PostConstruct
public void start() {
	System.out.println("intit mangooo");
}

@PreDestroy
public void end() {
	System.out.println("destroy mangooo");
}
}
