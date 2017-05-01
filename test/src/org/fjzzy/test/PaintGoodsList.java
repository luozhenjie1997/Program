package org.fjzzy.test;

import java.util.Collection;
import java.util.Iterator;

public class PaintGoodsList {
	@SuppressWarnings("rawtypes")
	public static void paint() {
		GoodsList.memoryGoodsList();
		System.out.println("====================================================");
		System.out.println("\t\t��Ʒ�б�");
		System.out.println("----------------------------------------------------");
		System.out.println("��Ʒ���\t��Ʒ����\t\t��Ʒ����\t��Ʒ���");
		Collection values=GoodsList.goodlist.values();
		Iterator it=values.iterator();
		while (it.hasNext()) {
			GoodsInfo goodsInfo=(GoodsInfo) it.next();
			System.out.print(goodsInfo.getGoodsNun()+"\t");
			System.out.print(goodsInfo.getGoodsName());
			if (goodsInfo.getGoodsName().length()>4) {
				System.out.print("\t");
			}
			System.out.print(goodsInfo.getGoodsPrice()+"\t");
			if (goodsInfo.getGoodsInventory()==0) {
				System.out.println("������");
			} else {
				System.out.println(goodsInfo.getGoodsInventory());
			}
		}
		System.out.println("====================================================");
	}
}
