package day04;

public class MethodEx01 {
	
	public static void main(String[] args) {
		
		
		/*
		 * 메서드는 생성과 호출이 있습니다. 
		 * 메서드는 메서드안에서 생성 할 수 없습니다.
		 * 
		 */
		
		int result = calSum();
		
		
		System.out.println("1~10까지의 합은 : " +calSum());
		System.out.println("1~10까지의 합은 : " +calSum());
		System.out.println("1~10까지의 합은 : " +calSum());
		System.out.println("1~10까지의 합은 : " +result);
		
		String result2 = calSum2();
		System.out.println(result2);
		
	} // 메인 메서드 끝나는 지점

	// 반환유형 이름 ()
	
	static int calSum() {
		
		int sum = 0;
		for(int i = 1; i<= 10;i++) {
			sum += i;
		}
	
		return sum; // 합계를 반환
	}
	
	// 문자열 반환하는 메서드 생성
	
	static String calSum2() {
		
		//A ~ Z 까지 문자열 합
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str ; // 문자열 반환
	}
	
	
}
