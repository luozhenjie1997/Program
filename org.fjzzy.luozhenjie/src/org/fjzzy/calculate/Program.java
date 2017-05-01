package org.fjzzy.calculate;

public class Program {

	public static void main(String[] args) {
		System.out.println("以下为显示一定范围内的素数：");
		prime(100);
	}
    public static void prime(int k) {
		for (int i=1;i<k;i++) {
			 if (i%7!=0&i%5!=0&i%3!=0&i%2!=0&i!=1) {
				 System.out.println(+i);
			 } else {
				 if (i<=7&i>1&i!=6) {
					 if (i/2!=2&i/3!=3|i/5==1) {
						 System.out.println(+i);
					 }
				 }
			   }
		}
	}
}

		/*for (int i = 2; i <= 100; i++) { 
            int temp = (int) Math.sqrt(i); 
            if (i <= 3) {  
                System.out.println(i);  
            } else {  
                for (int j = 2; j <= temp; j++) {  
                    if (i % j == 0) {  
                        break;  
                    }  
                    if (j >= temp) {  
                        System.out.println(i);  
                    }  
                }  
  
            }  
	}*/

         /*for (int i=1;i<100;i++) {
             itcast:for (int j=2;j<i;j++) {
	            int k=i%j;
	               if (k<1){
		              break itcast;
	               }
	              if (j>i-2) {
	    	          System.out.println(+i);
	              }
              }
        }*/




	




        

		

	
	

	

