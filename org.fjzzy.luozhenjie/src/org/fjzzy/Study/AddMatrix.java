package org.fjzzy.Study;
/**
 * 矩阵数组的加法
 * @author 罗振杰
 *
 */
public class AddMatrix {

	public static void addMatrix(int[][] c){
		for (int i=0;i<c.length;i++) {
			for (int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
	}
	}
	
	public static int[][] add(int[][] a,int[][] b) {
		int[][] c=new int[a.length][b.length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int[][] a={{1,3},{5,7}};
		int[][] b={{2,4},{6,8}};
		int[][] c=add(a,b);
		addMatrix(c);
	}
}
