package org.fjzzy.calculate;

public class Subtraction{

	public static void main(String[] args) {
		int poor=Subtraction(11,8);
		System.out.println(+poor);
	 }
	public static int Subtraction(int i,int j) {
		while (j!=0) {
			int x=i&j;
			i^=x;
			j^=x;
			i|=j;
			j<<=1;
			}
		return i;
	}
}
