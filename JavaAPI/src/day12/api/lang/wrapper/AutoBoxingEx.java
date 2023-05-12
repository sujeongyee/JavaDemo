package day12.api.lang.wrapper;

public class AutoBoxingEx {
	
	
	public static void main(String[] args) {
		
		//Autoboxing : 기본타입 ~ 클래스형 간의 자동형변환
		
		int a = 100;
		
		Integer val1 = a;
		
		int b = val1;
		
		//래퍼클래스의 특별한 기능들
		//형변환
		
		
		int result1 = Integer.parseInt("10");
		double result2 =Double.parseDouble("3.14");
		long result3 = Long.parseLong("10");
		
		System.out.println(result1 + result2 + result3);		
		
		// 숫자간의 대소비교
	
		System.out.println(Integer.compare(10, 11)); // 앞에 값이 뒤값보다 작으면 음수
		System.out.println(Integer.compare(5, 3)); // 뒤 값이 더 작으면 양수
		
		
	}

}
