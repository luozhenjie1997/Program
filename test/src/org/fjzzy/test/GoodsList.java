package org.fjzzy.test;

import java.util.HashMap;

public class GoodsList {
	static GoodsInfo gd1=new GoodsInfo("001", "��¶��Ȫˮ", 1.00, 100);
	static GoodsInfo gd2=new GoodsInfo("002", "����ţ��", 3.00, 75);
	static GoodsInfo gd3=new GoodsInfo("003", "����ӡ����", 2.00, 95);
	static GoodsInfo gd4=new GoodsInfo("004", "��������", 3.50, 65);
	static HashMap<String, GoodsInfo> goodlist=new HashMap<String, GoodsInfo>();
	
	public static void memoryGoodsList() {
		goodlist.put("001", gd1);
		goodlist.put("002", gd2);
		goodlist.put("003", gd3);
		goodlist.put("004", gd4);
	}
}
