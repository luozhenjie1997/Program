package org.fjzzy.NewGame;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
/**
 * 图片加载工具类
 * @author unkonw
 *
 */
public class LoadImage {
	public static Image LoadingImage(String path){
		URL u=LoadImage.class.getClassLoader().getResource(path);
		BufferedImage img=null;
		try {
			img=ImageIO.read(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}
}
