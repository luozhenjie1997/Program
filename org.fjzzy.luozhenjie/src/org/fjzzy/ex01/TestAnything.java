package org.fjzzy.ex01;

import java.util.*;

public class TestAnything {

	public static void sum(int a) {
		int sumMath=0;
		for (int i=1;i<=a;i++) {
			sumMath+=i;
		}
		System.out.println("结果为"+sumMath);
	}
	
	public static int factorial(int a) {
		if (a==1) {
			return 1;
		} else {
			return a*factorial(a-1);
		}
	}

	public static void main(String[] args) {
		
		for (int i=1;i<=9;i++) {
			for (int j=1;j<=i;j++) {
				int k=i*j;
				System.out.print(i+"*"+j+"="+k+"\t");
			}
			System.out.println();
		}
		sum(100);
		
		System.out.println(factorial(5));
		
		int i;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入数字：");
		i=sc.nextInt();
		sum(i);
	}

}
