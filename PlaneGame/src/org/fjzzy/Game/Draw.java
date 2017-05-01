package org.fjzzy.Game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import org.fjzzy.GameTool.MainFrame;

/**
 * 此类用来绘制各种东西
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Draw extends MainFrame{	
	int x;
	int y;
	Color c;
	int size;
	Date starTime;
	Date endTime;
	Explode explode;
	static long period;
	
	@SuppressWarnings("rawtypes")
	ArrayList list=new ArrayList();//创建一个容器，用来存储生成的子弹
	PlayerPlaneDate player=new PlayerPlaneDate("image/plane.png", 100, 100, 10);//加载图片
	Bg bg=new Bg("image/bg.jpg", 0, 0);
	
	//绘制（显示）
	public void paint(Graphics g) {
		bg.paintbg(g);
		player.paintPlane(g);
		//生成子弹
		for (int i=0;i<list.size();i++) {
			Bullet b=(Bullet) list.get(i);
			b.drawBullet(g);
			boolean peng=b.getRect().intersects(player.getRect());
			//判断子弹是否与飞机相撞
			if (peng) {
				player.live=false;
				endTime=new Date();
				if (explode==null) {
					explode=new Explode(player.x,player.y);
					period=(endTime.getTime()-starTime.getTime())/1000;
				}
				explode.explode(g);
			}
			if (!player.live) {
				paintFont(g, "游戏结束", 350, 450, Color.white, 50);
				paintFont(g, "生存时间："+period+"秒", 390, 500, Color.white, 20);
			}
		}
		
	}
	@SuppressWarnings("unchecked")
	//添加子弹到容器里面（重写方法）
	public void DrawFrame() {
		super.DrawFrame();//继承父类的制定方法
		addKeyListener(new PlayerKey());
		for (int i=0;i<100;i++) {
			Bullet b=new Bullet();
			list.add(b);
		}
		starTime=new Date();
	}
	//创建一个打印文字的通用方法
	public void paintFont(Graphics g,String str,int x,int y,Color color,int size) {
		Color c=g.getColor();
		Font f=new Font("宋体", Font.BOLD, size);
		g.setFont(f);
		g.setColor(color);
		g.drawString(str, x, y);
		g.setColor(c);
	}
	
	//该内部类用来监听键盘动作来控制飞机是否移动
	class PlayerKey extends KeyAdapter{

		@Override
		//键盘按下
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
		}

		//键盘松开
		@Override
		public void keyReleased(KeyEvent e) {
			player.keyReleased(e);
		}
		
		
	}
}
