package org.fjzzy.test;

import java.util.Scanner;

public class Login {
	static Scanner sc=new Scanner(System.in);
	private static String strname="luozhenjie";
	private static String strpassed="123456";
	private static String str1;
	private static String str2;
	static boolean flag=true;
	
	public static void main(String[] args) {
		System.out.print("请输入用户名：");
		str1=sc.nextLine();
		System.out.print("请输入密码：");
		str2=sc.nextLine();
		while(flag) {
		if (!str1.equals(strname)||!str2.equals(strpassed)) {
			System.out.println("用户名或密码错误，请重新输入。。。");
			System.out.print("请输入用户名：");
			str1=sc.nextLine();
			System.out.print("请输入密码：");
			str2=sc.nextLine();
		} else {
			flag=false;
			System.out.println();
			break;
		}
		}
		Main.master();
	}
}
