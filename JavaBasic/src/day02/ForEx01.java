package day02;

public class ForEx01 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int a= 1; a <= 10 ; a++) {
			sum += a ;
		}
		System.out.println("합계 : " + sum);
		
		System.out.println("--------------------");
		
		// 1에서부터 10까지 나열 반대로!
		for(int b = 0; b < 10; b++) {
			System.out.println(10-b);
		}
		for (int c = 10; c >= 1 ; c--) { // 정답
			System.out.println(c);
		}
		
		
	}

}
