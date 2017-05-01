package org.fjzzy.test;

import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	static String Number;
	
	public static void master() {
		System.out.print("欢迎使用本收银系统\n本系统提供以下功能\n1.收银功能\n2.修改商品\n"
				+ "请输入对应编号来进入相应功能:");
		Number=sc.nextLine();
		switch (Number) {
		case "1":
			EnterInfo.Enter();
			break;
		case "2":
			ChangeGoods.Change();
			break;
		}
	}
}
