package org.fjzzy.test;

import java.util.Scanner;

public class ChangeGoods {
	static String newGoodsName;
	static String newGoodsNum;
	static double newGoodsPrice;
	static int newGoodsInventory;
	
	@SuppressWarnings("resource")
	public static void Change() {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入要添加的商品编号：");
		newGoodsNum=sc.nextLine();
		System.out.print("请输入要添加的商品名称：");
		newGoodsName=sc.nextLine();
		System.out.print("请输入要添加的商品单价：");
		newGoodsPrice=sc.nextDouble();
		System.out.print("请输入要添加的商品库存：");
		newGoodsInventory=sc.nextInt();
		Main.master();
	}
}
