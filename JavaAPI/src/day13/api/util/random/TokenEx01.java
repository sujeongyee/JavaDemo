package day13.api.util.random;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenEx01 {
	
	public static void main(String[] args) {
		
		// 빠른 문자열 분리
		//split()
		//toCharArray()
		
		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다";
		
		StringTokenizer token1 = new StringTokenizer(str1);
		
		// 토큰의 개수 확인
		int cnt = token1.countTokens();
		System.out.println("나눠진 문자열 개수 : " + cnt);
		
		//다음 토큰의 여부 확인
		System.out.println(token1.hasMoreTokens());
		System.out.println(token1.hasMoreElements());
		
		while(token1.hasMoreTokens() != false) {
			System.out.println(token1.nextToken());
		}
		
		
		// 다음 토큰의 확인
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
		
//		for(int i = 0 ; i < cnt ; i++ ) {
//			String a = token1.nextToken();
//			System.out.println(a);
//		}
		
		
		System.out.println("===============================");
		// 다양한 구분자를 한번에 지정해서 토큰화 가능
		
		String str2 = "2022/11/31/홍길동/010-1111-2222/서울시/www.example.com";
		
		// - / . 기준으로 자름
		StringTokenizer token2 = new StringTokenizer(str2, "-/.");
		
		while(token2.hasMoreTokens() != false) {
			System.out.print(token2.nextToken()+ " ");
		}
		
		System.out.println("============================");
		// 구분자를 토큰에 포함시킴
		System.out.println(str2);
		StringTokenizer token3 = new StringTokenizer(str2, "/" , true);
		for(int i = 1;token3.hasMoreTokens();i++) {
			System.out.println(token3.nextToken());
		}
		
		
		System.out.println("----------------------------------");
		
		 /*
	       * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
	       * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
	       * 3. 분리한 토큰의 개수를 출력
	       * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
	       *    1. 안녕
	       *    2. 하세요.
	       *    3. 오늘은 
	       * 5. 분리된 문자열을 배열에 저장
	       */
		

		
		
			
		
		
		
		
	}

}
