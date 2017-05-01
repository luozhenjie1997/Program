package org.fjzzy.Study;

import java.util.Scanner;

public class Test {
	
	double x,y,z;
	public void Point(double _x,double _y,double _z){
		x=_x;
		y=_y;
		z=_z;
	}
	public double distance(Test p){
		double result=Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
		return result;
	}
	
	public static void main(String[] args) {
		//三元运算符例子（boolean 条件判断语句？表达式1：表达式2）
		/*@SuppressWarnings("unused")
		boolean n=(4<8)?true:false;
		System.out.println(n);
		
		//if...else语句实例
		int a=3;
		if (a>5) {
			System.out.println("变量i大于5");
		} else {
			System.out.println("变量i小于5");
		}
		
		//if..else完整语句实例
		int i=3;
		if (i>5) {
			System.out.println("变量i大于5");
		} else if (i>3) {
			System.out.println("变量i大于4");
		} else {
			System.out.println("");
		}
		
		//以下为使用do...while来显示小于10的非负数
		int b=0;
		do {
		System.out.println(b);
		b++;
		}
		while (b<10);
		
		//以下表示从1加到100
		int x=0;
		int y=0;
		for (;x<100;) {
			a++;
			y+=x;
		}
		System.out.print(y);
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Test p=new Test();
		Test p2=new Test();
		System.out.print("请输入第一个点的坐标：");
		double pointx=sc.nextDouble();
		double pointy=sc.nextDouble();
		double pointz=sc.nextDouble();
		p.Point(pointx, pointy, pointz);
		System.out.print("请输入第二个点的坐标：");
		double pointx1=sc.nextDouble();
		double pointy1=sc.nextDouble();
		double pointz1=sc.nextDouble();
		p2.Point(pointx1, pointy1, pointz1);
		System.out.println(p.distance(p2));
		*/
		
		
		//以下为测试向一个数组添加元素，d打印指定的元素、依次打印数组元素、显示数组长度。
		int[] array=new int[3];
		String str=new String("abcd");
		String str2="  22  36  ";
		array[0]=23;
		array[1]=28;
		array[2]=33;
		System.out.println(array[1]);
		for (int test=0;test<array.length;test++) {
			System.out.println(array[test]);
		}
		String str22=str2.trim();
		System.out.println("数组长度为"+array.length);
		System.out.println(str.charAt(3));
		System.out.println(str.toString());
		System.out.println(str22.length());
	}
}


	

