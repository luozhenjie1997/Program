package org.fjzzy.ex05;

import java.util.*;

public class Program02 {

	public static void main(String[] args) {
		Map<Integer, String> name=new HashMap<Integer, String>();
		name.put(1, "Jack");
		name.put(2, "Rose");
		name.put(3, "Luck");
		System.out.println("1:" +name.get(1));
		System.out.println("2:" +name.get(2));
		System.out.println("3:" +name.get(3));
	}

}