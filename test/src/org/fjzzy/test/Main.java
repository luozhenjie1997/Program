package org.fjzzy.test;

import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	static String Number;
	
	public static void master() {
		System.out.print("��ӭʹ�ñ�����ϵͳ\n��ϵͳ�ṩ���¹���\n1.��������\n2.�޸���Ʒ\n"
				+ "�������Ӧ�����������Ӧ����:");
		Number=sc.nextLine();
		switch (Number) {
		case "1":
			EnterInfo.Enter();
			break;
		case "2":
			ChangeGoods.Change();
			break;
		}
	}
}
