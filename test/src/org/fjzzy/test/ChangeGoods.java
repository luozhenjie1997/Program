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
		System.out.print("������Ҫ��ӵ���Ʒ��ţ�");
		newGoodsNum=sc.nextLine();
		System.out.print("������Ҫ��ӵ���Ʒ���ƣ�");
		newGoodsName=sc.nextLine();
		System.out.print("������Ҫ��ӵ���Ʒ���ۣ�");
		newGoodsPrice=sc.nextDouble();
		System.out.print("������Ҫ��ӵ���Ʒ��棺");
		newGoodsInventory=sc.nextInt();
		Main.master();
	}
}
