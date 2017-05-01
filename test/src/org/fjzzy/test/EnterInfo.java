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
			System.out.print("请输入要购买的商品编号：");
			enterGoodsNum=sc.nextLine();
			if (enterGoodsNum.equals("000")) {
				break;
			}
			while (!GoodsList.goodlist.containsKey(enterGoodsNum)) {
				System.out.println("无法找到该商品id，请重新输入。。。");
				System.out.print("请输入要购买的商品编号：");
				enterGoodsNum=sc.nextLine();
			}
			goods=GoodsList.goodlist.get(enterGoodsNum);
			goodsInfo1.add(goods.getGoodsName());
			goodsInfo2.add(goods.getGoodsNun());
			goodsInfo3.add(goods.getGoodsPrice());
			System.out.print("请输入要购买的数量：");
			dateNumber=sc.nextInt();
			while (dateNumber>goods.getGoodsInventory()) {
				System.out.println("输入的数量大于该商品库存，请重新输入。。。");
				System.out.print("请输入要购买的数量：");
				dateNumber=sc.nextInt();
			}
			goodsInfo5.add(dateNumber);
			goods.setGoodsInventory(goods.getGoodsInventory()-dateNumber);
			totalSingle=dateNumber*goods.getGoodsPrice();
			goodsInfo4.add(totalSingle);
			sum=sum+totalSingle;
			System.out.print("添加成功，是否继续添加？：（继续请输入y，否按回车）");
			confirm=sc.next();
			} while (confirm.equals("y"));
			if (enterGoodsNum.equals("000")) {
				flag=false;
				System.out.println("程序结束，感谢使用！");
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
