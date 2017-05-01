package org.fjzzy.calculate;

public class Add {

	public static void main(String[] args) {
		int and=add(6,3);
		System.out.println(+and);
	 }
	public static int add (int i,int j) {
		int x=i^j;
		int y=i&j;
		while (y!=0) {
			i=x;
			j=y<<1;
			x=i^j;
			y=i&j;
	    }
		return x;
	}
}



