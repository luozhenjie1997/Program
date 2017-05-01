package org.fjzzy.ex01;

import java.awt.*;
import java.awt.event.*;

public class TestGUICardLayout {
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Cardlayout cardlayout=new Cardlayout();
	}
}

@SuppressWarnings("serial")
class Cardlayout extends Frame implements ActionListener{
	Panel cardPanel=new Panel();//放置卡片
	Panel controlpaPanel=new Panel();//放置按钮
	Button nextbutton,preButton;
	CardLayout cardLayout=new CardLayout();//定义布局对象
	//构造一个设置卡片布局属性的方法
	public Cardlayout() {
		setSize(300, 200);
		setVisible(true);
		this.addWindowListener(new MyWindowListenerClose());//设置cardPanel为卡片布局
		cardPanel.setLayout(cardLayout);
		cardPanel.add(new Label("frist card",Label.CENTER));
		cardPanel.add(new Label("second card",Label.CENTER));
		cardPanel.add(new Label("thrid card",Label.CENTER));
		nextbutton=new Button("下一张卡片");
		preButton=new Button("上一张卡片");
		nextbutton.addActionListener(this);
		preButton.addActionListener(this);
		controlpaPanel.add(preButton);
		controlpaPanel.add(nextbutton);
		this.add(cardPanel, BorderLayout.CENTER);
		this.add(controlpaPanel, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==nextbutton) {
			cardLayout.next(cardPanel);
		}
		if (e.getSource()==preButton) {
			cardLayout.previous(cardPanel);
		}
	}
	
}