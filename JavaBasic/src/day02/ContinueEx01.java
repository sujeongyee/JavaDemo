package day02;

public class ContinueEx01 {
	
	public static void main(String[] args) {
		
		// continue는 반복문을 건너뜀
		// for문에서는 증/감식으로 이동됩니다!
//		for(int i = 1; i <= 10; i++) {
//			
//			if(i == 5) {
//				continue;
//			}
//			
//			System.out.println(i);
//			
//		}
		
		// while문에서는 
		int i = 1;
		while(i <= 10) {
			
			if(i == 5) {
				i++;
				continue; // 증감식을 만나지 못하고 5에서 무한반복
			}
			System.out.println(i);
			i++;
		}
		
	}

}
