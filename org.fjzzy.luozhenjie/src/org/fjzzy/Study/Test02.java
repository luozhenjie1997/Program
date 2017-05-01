package org.fjzzy.Study;

public class Test02 {

	public static void main(String[] args) {
		
	}

}

class TotalNumber{
	private int fristNumber;
	
	public TotalNumber(int fristNumber) {
		this.setFristNumber(fristNumber);
	}
	public int getFristNumber() {
		return fristNumber;
	}
	public void setFristNumber(int fristNumber) {
		this.fristNumber = fristNumber;
	}
}

class DateNum{
	private int date;
	
	public DateNum(int date){
		this.setDate(date);
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
}

class Date {
	
	public static void DateNumber() {
		TotalNumber total = new TotalNumber(5);
		int a=total.getFristNumber();
		for (int i=0;i<=a;i++) {
			
		}
	}
}
