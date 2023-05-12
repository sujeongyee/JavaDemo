package day04;

import java.util.Arrays;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		// 문자열다루기
		// 문자열은 사실 배열입니다. 문자열은 인덱스가 있습니다.
		
		String str = "헬로마이네임이즈예삐예삐요";
		// System.out.println(str[0]); 안돼~
		
		// 문자열을 다루는 다양한 메서드를 제공
		
		// 문자열을 한글자 자르기 charAt
		
		char c = str.charAt(5);
		System.out.println(c);
		
		// 문자열의 위치 확인 indexOf,lastIndexOf ( -1을 반환한다면 없다는 뜻! )
		
		int idx = str.indexOf("네");
		System.out.println("문자의 위치 : " + idx);
		
		int idx2 = str.lastIndexOf("삐");
		System.out.println(idx2);
		
		// 문자열 변환 toUpperCase(대문자로), toLowerCase(소문자로)
		
		String s  = "abcDEF";
		String result = s.toUpperCase(); // 대문자로
		System.out.println(result);
		String result2 = s.toLowerCase(); // 소문자로
		System.out.println(result2);
		
		System.out.println(s); // ✔✔원본 문자열은 그대로 유지✔✔
		
		System.out.println("===============");
		
		// 문자열 변경 replace 
		s = "abcdefaaa";
		
		String result3 =s.replace('a','x');
		System.out.println(result3); // a -> x 로 변경. (전부 다)
		System.out.println(s); //✔✔원본 문자열은 그대로 유지✔✔
		
		String result4 = s.replaceFirst("a" , "x");
		System.out.println(result4); // a -> 로 변경, (첫번째만)
		
		
		System.out.println("=======================");
		// 공백제거 trim
		
		str = "   010-1111-2222";
		String result5 = str.trim();
		System.out.println(result5); // 공백을 제거해서 반환
		System.out.println(str); // 원본은 그대로 입니다.
		
		str = "   안녕 하세요? 오늘은 4월 19일 입니다! ";
		System.out.println(str.trim()); // 처음과 마지막 공백만 사라진다 , 중간 공백은...
		
		System.out.println(str.replace(" ","")); // 모든 공백이 사라집니다
		str = str.replace(" ",""); // 원본까지 바꿔준다!
		
		
		
		System.out.println("============================");
		
		
		// 문자열 자르기
		// 특정 위치에서 자르기 substring - 인덱스 기준
		str = "010-1111-2222";
		String result6 = str.substring(9); // 9 인덱스부터 출력
		System.out.println(result6);
		
		String result7 = str.substring(4,8); // 4번째 인덱스부터 8 인덱스 전까지
		System.out.println(result7);
		
		// 박박 좋은기능
		// split - 특정 문자를 기준으로 자름 (제대로 사용하려면 정규표현식)
		
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		
		// 한글자씩 다 자르고 싶다
		
		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2)); // 스트링배열
		
		// toCharArray - 한글자씩 char형으로 자름
		
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3)); // 캐릭터배열
		
		
		System.out.println("=====================");
		
		// 문자열의 길이
		str = "안녕하세요";
		int a = str.length();
		System.out.println(a);
		
		// 문자열의 비교 equals()
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같음");
		}else {
			System.out.println("두 문자가 다름");
		}
		
		
		// 문자열의 포함여부 contains()
		
		if(str.contains("녕")) {; // 포함 돼있으면 true 없으면 false
			System.out.println("녕이 포함되어 있음");
		} 
		
		
		
	}

}
