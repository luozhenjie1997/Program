package org.fjzzy.ex01;

import java.awt.*;
import java.awt.event.*;

public class GUIButtonExit {

	public static void main(String[] args) {
		final Frame f=new Frame("窗体");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,80,30));//流式布局管理器，组件靠左对齐，水平间距为20，垂直间距为30。
		//f.setLayout(new BorderLayout());//边界布局管理器
		f.setSize(200, 300);
		f.setLocation(300, 200);
		f.addWindowListener(new MyWindowListenerClose());//为窗口组件注册监听器
		Button btn=new Button("退出");
		f.add(btn);
		//f.add(btn,BorderLayout.NORTH);//按钮在最北端显示
		//用匿名内部类的方式为按钮注册监听器
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}

