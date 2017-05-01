package org.fjzzy.test;

public class OrderNum {
	private static int orderNum=1;
	public static void paintNum() {
		if (orderNum<10) {
			System.out.println("¶©µ¥±àºÅ£º0000"+orderNum);
		} else {
			if (orderNum<100) {
				System.out.println("¶©µ¥±àºÅ£º000"+orderNum);
			} else {
				if (orderNum<1000) {
					System.out.println("¶©µ¥±àºÅ£º00"+orderNum);
				} else {
					if (orderNum<10000) {
						System.out.println("¶©µ¥±àºÅ£º0"+orderNum);
					} else {
						System.out.println("¶©µ¥±àºÅ£º"+orderNum);
					}
				}
			}
		}
	}
}
