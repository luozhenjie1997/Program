package org.fjzzy.NewGame;

import java.awt.Graphics;
import java.awt.Image;

/**
 * 此类用于加载各种天体的位置
 * @author Administrator
 *
 */
public class Star {
	
	Image img;
	double x,y;
	double width,height;
	
	public void paintStar(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public Star(Image img) {
		this.img=img;
	}
	
	public Star(Image img,double x,double y) {
		this(img);
		this.x=x;
		this.y=y;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	
	public Star(String path,double x,double y) {
		this(LoadImage.LoadingImage(path), x, y);
	}
	
	public Star() {
		
	}
}
