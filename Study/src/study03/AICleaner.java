package study03;

public class AICleaner extends Machine{
	
	// 생성자
		AICleaner(int battery){
			super(battery);
			
		}
		
		// 메소드 - 전원 상태를 리턴하는 cleaning()함수
		public boolean cleaning() {
			/*
	    	 * 배터리 상태가 5 미만이면, "Charge Me!"를 출력하고 전원off, false 리턴
	    	 * 그렇지 않으면, 배터리가 3씩 줄어들고, "Cleaning up!, battery: n" 출력, true 리턴 
	    	 */
			if(battery < 5) {
				System.out.println("Charge Me!");
				powerOff();
				return false;
			}else {
				battery-=3;
				System.out.println("Cleaning up!, battery: " + battery);				
				return true;
			}
			
		}

}
