package org.fjzzy.HomeWork;

public class Student {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
		public void show() {
			System.out.println("姓名：" + name);
			System.out.println("年龄：" + age);
		}
	}

