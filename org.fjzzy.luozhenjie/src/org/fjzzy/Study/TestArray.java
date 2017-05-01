package org.fjzzy.Study;

import java.util.*;

public class TestArray {

	public static void main(String[] args) {
		int[] b={3,4,7,1,6,8,2,9,0,5};
		System.out.print("数组:"+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("重新按从小到大顺序排列后为："+Arrays.toString(b));
		System.out.println("元素"+b[2]+"的索引为："+Arrays.binarySearch(b, 2));
	}

}
