package org.fjzzy.Study;

import java.text.*;
import java.util.*;

public class ValueDate {

	static String temp;
	public static void main(String[] args) throws ParseException {
		System.out.println("璇疯緭鍏ユ墍鏌ヨ鐨勬椂闂达細");
		while (true) {
		Scanner sc=new Scanner(System.in);
		temp=sc.nextLine();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date=format.parse(temp);
		Calendar calendar=new GregorianCalendar();
		calendar.setTime(date);
		int day=calendar.get(Calendar.DATE);
		calendar.set(Calendar.DATE, 1);
		int max=calendar.getActualMaximum(Calendar.DATE);
		System.out.println("鏃t涓�\t浜孿t涓塡t鍥沑t浜擻t鍏�");
		for (int j=1;j<calendar.get(Calendar.DAY_OF_WEEK);j++) {
			System.out.print(" "+"\t");
		}
		for (int i=1;i<=max;i++) {
			int week=calendar.get(Calendar.DAY_OF_WEEK);
			System.out.print(i);
			if (i==day) {
				System.out.print("*");
			}
			System.out.print("\t");
			if (week==Calendar.SATURDAY) {
				System.out.println();
			}
			calendar.add(Calendar.DATE, 1);
		}
		}
	}

}
