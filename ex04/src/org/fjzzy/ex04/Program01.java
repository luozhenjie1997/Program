package org.fjzzy.ex04;

public class Program01 {

	public static void main(String[] args) {
		//以下为创建对象来利用类显示学生信息
		Person student1=new Person();
		student1.setStunum("1606005142");
		student1.setName("罗振杰");
		student1.setGender("男");
		student1.setAge(19);
		student1.speak();
		
		//显示重新初始化的值
		Person student2=new Person();
		student2.speak();
		
		//以下为创建对象来利用构造的方法来显示学生信息
		Person student3=new Person("1606001001","张三","男", 20);
			student3.speak();
		
	}
}
