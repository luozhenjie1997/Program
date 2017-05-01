package org.fjzzy.ex05;

public class Person {
	private String name;
	private String gender;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名:" + name);
		System.out.println("性别:" + gender);
		System.out.println("年龄:" + age);
		System.out.println("------------------------------------");
	}

}
