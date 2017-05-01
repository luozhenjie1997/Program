package org.fjzzy.ex01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class TestDraw {

	public static void main(String[] args) {
		FrameDraw frameDraw=new FrameDraw();
		frameDraw.Drawing();
	}

}

class FrameDraw extends Frame {
	void Drawing() {
		setSize(1280,720);
		setLocation(300, 200);
		setVisible(true);
		addWindowListener(new MyWindowListenerClose());
		paint(getGraphics());
	}

	@Override
	public void paint(Graphics g) {
		/*//添加两种不同的字体
		Font f=g.getFont();
		g.setFont(f.deriveFont(WIDTH, 30));
		g.drawString("添加的字体", 200, 300);
		g.setFont(f);//恢复默认
		g.drawString("添加的字体2", 500, 300);
		
		//添加各种规则图形并添加颜色
		Color color=g.getColor();
		g.setColor(Color.BLUE);//设置颜色
		g.drawLine(1000,400,600,400);//画直线（第二个与第四个数字一样为一条直线）
		g.setColor(color);//恢复默认颜色
		g.drawLine(1000,600,600,600);
		g.drawRect(100, 300, 200, 300);//画矩形
		g.drawOval(350, 450, 200, 200);//画圆
		g.drawOval(350, 50, 200, 300);//画椭圆
*/	}
}
