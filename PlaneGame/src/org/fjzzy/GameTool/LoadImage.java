package org.fjzzy.GameTool;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
/**
 * 图片加载工具类
 * @author unkonw
 *
 */
public class LoadImage {
	private LoadImage(){}
	public static Image getImage(String path){
		BufferedImage bi=null;
		try {
			URL u = LoadImage.class.getClassLoader().getResource(path);
			bi = javax.imageio.ImageIO.read(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bi;
	}
}
