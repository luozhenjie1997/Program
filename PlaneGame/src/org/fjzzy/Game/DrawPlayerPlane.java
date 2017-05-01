package org.fjzzy.Game;

import java.awt.*;
import java.awt.event.KeyEvent;

import org.fjzzy.GameTool.LoadImage;

public class DrawPlayerPlane {
	Image img;
	double x,y;
	boolean up,down,left,right,live=true;

	//飞机的移动数据
	public void move() {
		if (down) {
			y+=10;
		}
		if (up) {
			y-=10;
		}
		if (left) {
			x-=10;
		}
		if (right) {
			x+=10;
		}
	}

	//控制飞机的行动
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left=true;
			break;
		case KeyEvent.VK_UP:
			up=true;
			break;
		case KeyEvent.VK_DOWN:
			down=true;
			break;
		case KeyEvent.VK_RIGHT:
			right=true;
			break;
		default:
			break;
		}
	}
	//控制飞机的静止
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left=false;
			break;
		case KeyEvent.VK_UP:
			up=false;
			break;
		case KeyEvent.VK_DOWN:
			down=false;
			break;
		case KeyEvent.VK_RIGHT:
			right=false;
			break;
		default:
			break;
		}
	}
	public void paintPlane(Graphics g) {
		if (live) {
			g.drawImage(img, (int)x, (int)y, null);
			move();
		}
	}

	//在图片周围模拟一个矩形，用于碰撞检测
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,img.getHeight(null),img.getHeight(null));
	}
	
	public DrawPlayerPlane(Image img) {
		this.img=img;
	}
	
	public DrawPlayerPlane(Image img,double x,double y) {
		this(img);
		this.x=x;
		this.y=y;
	}
	
	public DrawPlayerPlane(String path,double x,double y) {
		this(LoadImage.getImage(path), x, y);
	}
	
	public DrawPlayerPlane() {
	}
	
}
