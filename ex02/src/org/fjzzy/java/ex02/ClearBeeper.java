package org.fjzzy.java.ex02;

import stanford.karel.Karel;

public class ClearBeeper extends Karel {

	private static final long serialVersionUID = 1L;

	public void run() {
		// 从这开始你的程序！
		    while (frontIsClear()) {
		    	if  (noBeepersPresent())  {
		    	move();
		    	}
			    if (beepersPresent()) {
			    	if (frontIsClear()) {
			    	pickBeeper();
			    	move();
			    	}
			    }
			    if (frontIsBlocked()) {
			    	if (beepersPresent()) {
			    		pickBeeper();
			    	}
				    if (facingEast()) {
						turnLeft();
						move();
						turnLeft();
					}
			    }
				if (frontIsBlocked()) {
				    if (beepersPresent()) {
				    	pickBeeper();
				    	}
				    if (facingWest()) {
				    	if (leftIsClear()) {
				    	if (rightIsClear()) {
						turnLeft();
				    	turnLeft();
				    	turnLeft();
				    	move();
				    	turnLeft();
				    	turnLeft();
				    	turnLeft();
				    	}
				    	}
				    	}
				    }
			    }
	}
}



//注意：一个括号对为一完整的语块（英文括号）！！！语块优先顺序按从大到小执行。
//           直走的时候
//           当Karel前面没有墙时开始循环 {
//           如果Karel所在位置是没有Beeper且Karel前面没有墙,Karel会前进,否则捡起Beeper后再前进或停止

//           转弯的时候（右侧墙）
//           如果Karel前面有墙[
//           如果Karel所在位置有Beeper则捡起beeper
//           如果 Karel面向东面，则左转后前进再左转]

//           转弯的时候（左侧墙）
//           如果Karel前面有墙[
//           如果Karel所在位置有Beeper则捡起beeper
//           如果Karel面向西面且左右方没有墙，则左转三次后再前进后在左转三次] }


   
		 
	

				   



				  
			

      








				
					

					
				








				



		    




			
		



			
						
		
		   
			
		
			

				
		



		 
	

		    



		    
	


		
					
			
		

			   
			     
	 


	
			
			
		
			


		



		
			
	

