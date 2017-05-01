package org.fjzzy.ex05;

public class Type {

	public static void main(String[] args) {
		String type = "HelloWorld";
		for (int i = type.length() - 1;i >= 0;i--) {
			char x = type.charAt(i);
			String s = String.valueOf(x);
			if (s.equals(s.toUpperCase())) {
				System.out.print(s.toLowerCase());
			} else {
				System.out.print(s.toUpperCase());
			}
		}
	}
}
