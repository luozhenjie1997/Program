package org.fjzzy.Game;

import java.awt.*;

import org.fjzzy.GameTool.Constant;

/**
 * 此类用来画子弹以及其随机的轨迹
 * @author Administrator
 *
 */
public class Bullet {
	double x,y;
	double speed=3;
	double degree;
	double width=10;
	double height=10;
	
	//使子弹轨迹变为随机
	public Bullet() {
		degree=Math.random()*Math.PI*2;
		x=Constant.Game_Width/2;
		y=x=Constant.Game_Height/2;
	}
	//描绘子弹以及使其在碰到墙壁后反弹
	public void drawBullet(Graphics g) {
		Color c=g.getColor();
		g.setColor(Color.YELLOW);
		g.fillOval((int)x, (int)y, (int)width, (int)height);
		g.setColor(c);
		
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		if (y>Constant.Game_Height-height||y<30) {
			degree=-degree;
		}
		if (x>Constant.Game_Width-width||x<0) {
			degree=Math.PI-degree;
		}
	}
	
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,(int)width,(int)height);
	}
}
