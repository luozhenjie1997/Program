package org.fjzzy.NewGame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//创建一个MyWindowListenerClose类来继承WindowAdapter类，用来点关闭按钮时退出窗口。
public class MyWindowListenerClose extends WindowAdapter{
	//第一种退出方式
	public void windowClosing(WindowEvent e){
		System.exit(0);//直接结束虚拟机
	}
	
	//第二种退出方式，即重写windowClosing方法
	/*public void windowClosing(WindowEvent e){
		Window window=e.getWindow();//返回与该窗口特有的关系，即关闭按钮。
		window.setVisible(false);//使窗口隐藏。
		window.dispose();//释放由此窗口所使用的所有本机屏幕资源。
	}*/
	
	//第三种退出方式
	/*public void windowClosing(WindowEvent e){
		Window window=e.getWindow();
		window.setVisible(false);
		System.exit(0);
	}*/
}

