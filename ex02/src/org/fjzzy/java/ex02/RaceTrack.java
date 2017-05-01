package org.fjzzy.java.ex02;

import stanford.karel.Karel;

public class RaceTrack extends Karel {

	private static final long serialVersionUID = 1L;

	public void run() {
		// 从这开始你的程序！
		int m=0;
		while (m++<4) {
			while (frontIsClear()) {
				move();
		    }
			turnLeft();
		}
		while (facingSouth()) {
			if (frontIsClear()) {
				move();
			}
		}	
	}
}
