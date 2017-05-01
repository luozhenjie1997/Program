package org.fjzzy.calculate;

public class Multiplication {

	public static void main(String[] args) {
		int amass=multiplication(6,3);
		System.out.println(+amass);
	}
	public static int multiplication(int i,int j) {
		int x=0;
		for (int y=1;y!=0;y<<=1,i<<=1) {
			if ((j&y)!=0) {
				x=x+i;
			}
		}
		return x;
		}
}
