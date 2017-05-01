package org.fjzzy.calculate;

public class Division {

	public static void main(String[] args) {
		int over=Division(16,8);
		System.out.println(+over);
	}
	public static int Division(int i,int j){
		int x=0;
		for (int y=6;y>=0;y--) {
			if ((i>>y)>=j) {
				x=x+(1<<y);
				i=i-(j<<y);
			}
		}
		return x;
	}
}
