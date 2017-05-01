package org.fjzzy.NewGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/**
 * 此类为定义行星的运动方式
 * @author Administrator
 *
 */
public class ModeMotion extends Star{
	
	boolean Trace;
	double longAxis;//长轴
	double shortAxis;//短轴
	double degree;//角速度
	double speed;//线速度
	Star center;//太阳中心
	
	//显示图片并以一定轨迹运动
	public void PaintMove(Graphics g) {
		if (!Trace) {
			paintTrace(g);
		}
		paintStar(g);
		x=(center.x+center.height/2)+longAxis*Math.cos(degree);//轨迹长轴
		y=(center.y+center.width/2)+shortAxis*Math.sin(degree);//轨迹短轴
		degree+=speed;//角度
	}
	
	public void paintTrace(Graphics g) {
		double _x,_y,_width,_height;
		_width=longAxis*2;
		_height=shortAxis*2;
		_x=(center.y+center.width/2)-longAxis;
		_y=(center.y+center.height/2)-shortAxis;
		Color c=g.getColor();
		g.setColor(Color.BLUE);
		g.drawOval((int)_x, (int)_y, (int)_width, (int)_height);
		g.setColor(c);
	}
	
	public ModeMotion(String path, double longAxis, double shortAxis, double speed, Star center, boolean Trace) {
		this.x=center.x+longAxis;
		this.y=center.y;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		this.img=LoadImage.LoadingImage(path);
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
		this.Trace=Trace;
	}

	public ModeMotion(Image img, double x, double y) {
		super(img, x, y);
	}
	
	public ModeMotion(String path, double x, double y) {
		super(path, x, y);
	}
	
}
