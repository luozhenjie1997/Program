package org.fjzzy.NewGame;

import java.awt.Graphics;

/**
 * 此类及实现各种效果，但要继承窗口类
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Effect extends MyFrame{
	Star bg=new Star("image/bg.jpg", 0, 0);
	Star sun=new Star("image/sun.jpg", Constant.Game_Width/2, Constant.Game_Height/2);
	ModeMotion mercury=new ModeMotion("image/Mercury.jpg", 50, 50, 0.1, sun,false);
	ModeMotion venus=new ModeMotion("image/Mercury.jpg", 90, 90, 0.09, sun,false);
	ModeMotion earth=new ModeMotion("image/Earth.jpg", 140, 130, 0.05, sun,false);
	ModeMotion moon=new ModeMotion("image/moon.jpg", 15, 15, 0.2, earth,true);
	ModeMotion mars=new ModeMotion("image/Mars.jpg", 190, 175, 0.04, sun,false);
	ModeMotion jupiter=new ModeMotion("image/Jupiter.jpg", 260, 245, 0.03, sun,false);
	ModeMotion saturn=new ModeMotion("image/Saturn.jpg", 320, 310, 0.03, sun,false);
	
	public void paint(Graphics g) {
		bg.paintStar(g);
		sun.paintStar(g);
		mercury.PaintMove(g);
		venus.PaintMove(g);
		earth.PaintMove(g);
		moon.PaintMove(g);
		mars.PaintMove(g);
		jupiter.PaintMove(g);
		saturn.PaintMove(g);
	}
}