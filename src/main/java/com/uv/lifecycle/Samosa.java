package com.uv.lifecycle;

public class Samosa {
	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price.....");
		this.price = price;
	}

	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void init()
	{
		System.out.println("init-------->");
	}
	public void destroy()
	{
		System.out.println("destroy-------->");
	}
}
