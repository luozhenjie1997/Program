package org.fjzzy.Game;

import java.awt.Graphics;
import java.awt.Image;

import org.fjzzy.GameTool.LoadImage;

public class Explode {
	double x,y;
	static Image[] imgs=new Image[16];
	int count;
	static{
		for (int i=0;i<16;i++) {
			imgs[i]=LoadImage.getImage("image/explode/e"+(i+1)+".gif");
			imgs[i].getWidth(null);
		}
	}
	
	public void explode(Graphics g) {
		if (count<16) {
			g.drawImage(imgs[count], (int)x, (int)y, null);
			count++;
		}
	}
	
	public Explode(double x,double y) {
		this.x=x;
		this.y=y;
	}
}
