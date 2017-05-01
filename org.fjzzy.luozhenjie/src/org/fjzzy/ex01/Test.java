package org.fjzzy.ex01;

public class Test {

	public static void main(String[] args) {
		Square squareArea = new Square();
		Circle circleArea = new Circle();
		System.out.println("正方形面积：" + squareArea.area(2));
		System.out.println("圆形面积：" + circleArea.area(3));
	}

}
