package org.fjzzy.test;

import java.util.Calendar;

public class PaintTime {
	static Calendar calendar=Calendar.getInstance();
	private static int year=calendar.get(Calendar.YEAR);
	private static int month=calendar.get(Calendar.MONTH)+1;
	private static int day=calendar.get(Calendar.DATE);
	private static int hour=calendar.get(Calendar.HOUR);
	private static int minute=calendar.get(Calendar.MINUTE);
	private static int second=calendar.get(Calendar.SECOND);
	public static void paint() {
		System.out.println("¶©µ¥ÈÕÆÚ£º"+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
	}
}
