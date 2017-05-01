package org.fjzzy.test;

import java.util.Collection;
import java.util.Iterator;

public class PaintGoodsList {
	@SuppressWarnings("rawtypes")
	public static void paint() {
		GoodsList.memoryGoodsList();
		System.out.println("====================================================");
		System.out.println("\t\t商品列表");
		System.out.println("----------------------------------------------------");
		System.out.println("商品编号\t商品名称\t\t商品单价\t商品库存");
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
				System.out.println("已售罄");
			} else {
				System.out.println(goodsInfo.getGoodsInventory());
			}
		}
		System.out.println("====================================================");
	}
}
