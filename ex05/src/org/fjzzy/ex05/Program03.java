package org.fjzzy.ex05;

import java.util.*;

public class Program03 {

	public static void main(String[] args) {
		Person stu1 = new Person("张三", "男", 18);
		Person stu2 = new Person("李四", "男", 21);
		Person stu3 = new Person("王五", "男", 24);
		
		Map<String,Person> map = new HashMap<String,Person>();
		map.put("44**************01",stu1);
		map.put("44**************05",stu2);
		map.put("44**************07",stu3);
		
		map.get("44**************01").show();
		map.get("44**************05").show();
		map.get("44**************07").show();
	}

}
