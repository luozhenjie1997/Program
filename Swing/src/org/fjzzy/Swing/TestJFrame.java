package org.fjzzy.Swing;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TestJFrame extends JFrame{
	
	public TestJFrame() {
		this.setTitle("窗口");
		this.setSize(1280, 720);
		this.setLocation(300, 150);
		this.setResizable(false);//禁止使用最大化按钮
		JPanel jPanel=new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JButton bl=new JButton("存档");
		bl.setBounds(1130, 550, 100, 30);
		JButton b2=new JButton("读档");
		b2.setBounds(1130, 580, 100, 30);
		JButton b3=new JButton("设置");
		b3.setBounds(1130, 610, 100, 30);
		JButton b4=new JButton("回想");
		b4.setBounds(1130, 640, 100, 30);
		this.add(bl);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		jPanel.add(bl);
		jPanel.add(b2);
		jPanel.add(b3);
		jPanel.add(b4);
		JTextArea jTextArea=new JTextArea(12,200);
		JScrollPane jScrollPane=new JScrollPane(jTextArea);
		jTextArea.setEditable(false);
		this.add(jScrollPane,BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new TestJFrame();
	}
}
