package org.fjzzy.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EnterInfo {
	static boolean flag=true;
	static HashSet<String> goodsInfo1=new HashSet<String>();
	static HashSet<String> goodsInfo2=new HashSet<String>();
	static HashSet<Double> goodsInfo3=new HashSet<Double>();
	static ArrayList<Double> goodsInfo4=new ArrayList<Double>();
	static ArrayList<Integer> goodsInfo5=new ArrayList<Integer>();
	private static int dateNumber;
	private static double totalSingle;
	private static double sum=0;
	
	@SuppressWarnings("resource")
	public static void Enter() {
		while (flag) {
			GoodsInfo goods;
			String enterGoodsNum;
			String confirm;
			PaintGoodsList.paint();
			do {
			Scanner sc=new Scanner(System.in);
			System.out.print("������Ҫ�������Ʒ��ţ�");
			enterGoodsNum=sc.nextLine();
			if (enterGoodsNum.equals("000")) {
				break;
			}
			while (!GoodsList.goodlist.containsKey(enterGoodsNum)) {
				System.out.println("�޷��ҵ�����Ʒid�����������롣����");
				System.out.print("������Ҫ�������Ʒ��ţ�");
				enterGoodsNum=sc.nextLine();
			}
			goods=GoodsList.goodlist.get(enterGoodsNum);
			goodsInfo1.add(goods.getGoodsName());
			goodsInfo2.add(goods.getGoodsNun());
			goodsInfo3.add(goods.getGoodsPrice());
			System.out.print("������Ҫ�����������");
			dateNumber=sc.nextInt();
			while (dateNumber>goods.getGoodsInventory()) {
				System.out.println("������������ڸ���Ʒ��棬���������롣����");
				System.out.print("������Ҫ�����������");
				dateNumber=sc.nextInt();
			}
			goodsInfo5.add(dateNumber);
			goods.setGoodsInventory(goods.getGoodsInventory()-dateNumber);
			totalSingle=dateNumber*goods.getGoodsPrice();
			goodsInfo4.add(totalSingle);
			sum=sum+totalSingle;
			System.out.print("��ӳɹ����Ƿ������ӣ���������������y���񰴻س���");
			confirm=sc.next();
			} while (confirm.equals("y"));
			if (enterGoodsNum.equals("000")) {
				flag=false;
				System.out.println("�����������лʹ�ã�");
				break;
			}
			PaintOrder.paint();
		}
	}

	public static double getSum() {
		return sum;
	}

	public static void setSum(double sum) {
		EnterInfo.sum = sum;
	}
	
}
