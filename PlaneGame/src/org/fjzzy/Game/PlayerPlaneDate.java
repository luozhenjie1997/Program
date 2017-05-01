package org.fjzzy.Game;

import java.awt.Image;

import org.fjzzy.GameTool.LoadImage;

/**
 * 此类用来加载玩家控制的飞机以及其显示的位置
 * @author Administrator
 *
 */
public class PlayerPlaneDate extends DrawPlayerPlane{	
	double speed;
	
	public PlayerPlaneDate(String path,double x,double y,double speed) {
		this.img=LoadImage.getImage(path);
		this.x=x;
		this.y=y;
	}
	
	public PlayerPlaneDate(Image img, double x, double y) {
		super(img, x, y);
	}
	
	public PlayerPlaneDate(String path, double x, double y) {
		super(path, x, y);
	}
}
