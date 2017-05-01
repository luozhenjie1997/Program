package org.fjzzy.ex01;

import java.awt.*;

public class TestUnkonwLayout {

	public static void main(String[] args) {
		Frame f=new Frame("窗体");
		f.setSize(1280, 720);
		f.setLayout(null);
		f.setLocation(300, 200);
		Button btn1=new Button("按钮1");
		Button btn2=new Button("按钮2");
		btn1.setLocation(40, 60);
		btn1.setBounds(1000, 300, 100, 30);
		btn2.setLocation(40, 60);
		btn2.setBounds(140, 90, 100, 30);
		f.add(btn1);
		f.add(btn2);
		f.setVisible(true);
		f.addWindowListener(new MyWindowListenerClose());
	}

}
