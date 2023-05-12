package day06.str_ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("==================");
		
		System.out.println(str1 == str2);  // true
		// 같은 파일 같은 메서드에서 선언해서 예외적으로 같은 객체를 참조한것 뿐
		System.out.println(str1 == str3); // false
		// 직접 생성명령을 내리거나 다른 클래스에서 넘어온 String은 다른 주소를 나타내게 됩니다 
		System.out.println(str1.equals(str3)); // true
		
		
		if(str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
		// null safety
		// 본의 아니게 null(널 안정성이 없어서)에 점을 찍게 되는 경우가 생긴다 -> 에러 발생
		str1 = null;
		str1.equals(str3);
		
		if(str1 != null && str1.equals(str3)){
			
		}
		
		
		
		
	}

}
