package org.fjzzy.Game;

import java.awt.*;

import org.fjzzy.GameTool.LoadImage;

/**
 * 此类用来显示背景图片
 * @author Administrator
 *
 */
public class Bg {
	
	Image img;
	double x,y;
	
	public void paintbg(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public Bg(Image img) {
		this.img=img;
	}
	
	public Bg(Image img,double x,double y) {
		this(img);
		this.x=x;
		this.y=y;
	}
	
	public Bg(String path,double x,double y) {
		this(LoadImage.getImage(path), x, y);
	}
	
	public Bg() {
	}
}
