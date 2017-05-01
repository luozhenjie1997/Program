package org.fjzzy.ex05;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> exa = new ArrayList<String>();
		exa.add("stu1");
		exa.add("stu2");
		exa.add("stu3");
		exa.add("stu4");
		for (int i=0;i<exa.size();i++) {
			System.out.println("第" + (i+1) + "元素为："+exa.get(i));
		}
		System.out.println("-----------------------------------------");
		for (String lis:exa) {
			System.out.println(lis);
		}
		System.out.println("-----------------------------------------");
		Iterator<String> list=exa.listIterator();
		while (list.hasNext()) {
			Object it=list.next();
			System.out.println(it);
		}
	}

}
