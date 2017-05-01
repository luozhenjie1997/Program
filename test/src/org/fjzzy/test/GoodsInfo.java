package org.fjzzy.test;

public class GoodsInfo {
	private String GoodsName;
	private String GoodsNum;
	private double GoodsPrice;
	private int GoodsInventory;
	
	public String getGoodsName() {
		return GoodsName;
	}
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	public String getGoodsNun() {
		return GoodsNum;
	}
	public void setGoodsNun(String goodsNun) {
		GoodsNum = goodsNun;
	}
	public double getGoodsPrice() {
		return GoodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		GoodsPrice = goodsPrice;
	}
	public int getGoodsInventory() {
		return GoodsInventory;
	}
	public void setGoodsInventory(int goodsInventory) {
		GoodsInventory = goodsInventory;
	}
	public GoodsInfo(String goodsNum, String goodsName, double goodsPrice, int goodsInventory) {
		super();
		GoodsName = goodsName;
		GoodsNum = goodsNum;
		GoodsPrice = goodsPrice;
		GoodsInventory = goodsInventory;
	}
	
}
