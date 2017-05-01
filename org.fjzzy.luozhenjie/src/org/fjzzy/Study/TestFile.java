package org.fjzzy.Study;

import java.io.File;

public class TestFile {

	/**
	 * 构造一个printFile(方法，用来打印树状结构的文件目录。
	 * @param f为所需要展开树状结构目录的路径。（展开的是最后一个）。
	 * @param leavel为获取展开后路径的级数。
	 */
	public static void printFile(File f,int leavel) {
			for (int i=0;i<leavel;i++) {
				System.out.print(" ");
			}
			if (leavel>0) {
				System.out.print("-");
			}
			System.out.println(f.getName());
			if (f.isDirectory()) {
				File[] files=f.listFiles();
				for(File temp:files) {
					printFile(temp, leavel+1);
				}
			}
	}
	
	public static void main(String[] args) {
		/*File f=new File("F:/java学习/工程（例子）/aa");
		File f2=new File("F:/java学习/工程（例子）","Karel判断指令.xlsx");
		//File f3=new File(f2, "Karel判断指令.xlsx");
		File f4=new File("F:/java学习/工程（例子）/File测试类/aa/bb/cc/dd");
		File f5=new File(f2,"aa/bb/cc/dd");
		if (f.isDirectory()) {
			System.out.println("存在此目录");
		} else {
			System.out.println("不存在此目录");
		}
		if (f2.isFile()) {
			System.out.println("存在此文件");
		}
		f4.mkdirs();
		f5.delete();
		System.out.println("删除成功");*/
		
		File file=new File("F:/java学习/工程（例子）");//工程（例子）为最开始的目录。
		printFile(file, 0);
	}

}
