package dain03;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a;
		int b;

		System.out.println(" 공백 없는 10자 이상 문자열을 입력하시오 >");

		String s = scan.next();

		System.out.println("0 이상 5 미만의 정수를 입력하시오 >");

		while(true) {
			a = scan.nextInt();
			if(a < 0 || a >= 5 ) {
				System.out.println("잘못 입력 했습니다 다시 입력해주세요");
			}else {
				break;
			}
		}

		System.out.println("5 이상 10 미만의 정수를 입력하시오 >");

		while(true) {
			b = scan.nextInt();
			if(b < 5 || b >= 10 ) {
				System.out.println("잘못 입력 했습니다 다시 입력해주세요");
			}else {
				break;
			}
		}
		String[] arr = s.split("");
		System.out.println("입력하신 정수 : "+ a +" , "+b);
		System.out.println(a+"번째 인덱스 -> " +arr[a]+" 부터 "+ b + "번째 인덱스 -> "+arr[b]+" 까지 늘어납니다!" );


		String result = "";
		int count = 2;
		for(int i = 0 ; i < arr.length ; i++ ) {		
			if(i >= a && i <= b) {
				for(int j = 0 ; j < count ; j++) {
					result += arr[i];
				}
				count++;
			}else {
				result += arr[i];
			}
		}
		System.out.println(result);
	}

}
