package org.fjzzy.test;

import java.util.Iterator;
import java.util.Scanner;

public class PaintOrder {
	static Scanner sc=new Scanner(System.in);
	
	@SuppressWarnings("rawtypes")
	public static void paint() {
		System.out.println("====================================================");
		OrderNum.paintNum();
		System.out.println("----------------------------------------------------");
		Iterator it1=EnterInfo.goodsInfo1.iterator();
		Iterator it2=EnterInfo.goodsInfo2.iterator();
		Iterator it3=EnterInfo.goodsInfo3.iterator();
		Iterator it4=EnterInfo.goodsInfo4.iterator();
		Iterator it5=EnterInfo.goodsInfo5.iterator();
		System.out.println("��Ʒ���\t��Ʒ����\t\t��Ʒ����\t��������\t������");
		while (it2.hasNext()) {
			System.out.print(it2.next()+"\t");
			System.out.print(it1.next()+"\t\t");
			System.out.print(it3.next()+"\t");
			System.out.print(it5.next()+"\t");
			System.out.println(it4.next());
		}
		System.out.println("----------------------------------------------------");
		EnterInfo.goodsInfo1.clear();
		EnterInfo.goodsInfo2.clear();
		EnterInfo.goodsInfo3.clear();
		EnterInfo.goodsInfo4.clear();
		EnterInfo.goodsInfo5.clear();
		System.out.println("\t\t\t\t\t�ϼƣ�"+EnterInfo.getSum());
		EnterInfo.setSum(0);
		PaintTime.paint();
		System.out.println("====================================================");
		System.out.print("���س�������");
		sc.nextLine();
	}
}
