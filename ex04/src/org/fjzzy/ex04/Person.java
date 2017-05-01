package org.fjzzy.ex04;

public class Person {
	//以下为用类来显示学生信息
	private String stunum;
	private String name;
	private String gender;
	private int age;
	
	
	public String getStunum() {
		return stunum;
	}


	public void setStunum(String stunum) {
		this.stunum = stunum;
	}


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

	public void speak(){
		System.out.println("学号:" + stunum);
		System.out.println("姓名:" + name);
		System.out.println("性别:" + gender);
		System.out.println("年龄:" + age);
    }

    //以下为利用构造方法来重新初始化值
	public Person() {
		super();
		stunum="";
		name="";
		gender="男";
		age=0;
	}

    //以下为使用构造方法来显示学生信息
	public Person(String stunum, String name, String gender, int age) {
		super();
		this.stunum = stunum;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
}


