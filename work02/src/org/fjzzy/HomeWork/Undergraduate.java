package org.fjzzy.HomeWork;

public class Undergraduate extends Student{
	private String degree;

	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}
	public void show() {
		System.out.println("姓名：" + getName());
		System.out.println("年龄：" + getAge());
		System.out.println("学位：" + degree);
	}
}
