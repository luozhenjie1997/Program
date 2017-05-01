package org.fjzzy.Study;

public class Triangle {

	public static void main(String[] args) {
		int i,j;
		int x=10;
		System.out.println("正三角形：");
		for (i=1;i<=x;i++) 
		{
			for (j=i;j<=x;j++) 
			{
				System.out.println(" ");
			}
			for (j=i;j>=1;j--)
			{
				if (j>=10) 
					System.out.println("*");
				 else 
					System.out.println(j);
			}
			for (j=2;j<=i;j++) 
			{
				if (j>=10) 
					System.out.println("*");
				else 
					System.out.println(j);
			}
			System.out.println();
		}
	}
}


