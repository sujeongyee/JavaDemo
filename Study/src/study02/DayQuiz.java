package study02;

import java.util.Arrays;
import java.util.Scanner;

public class DayQuiz {
	
	public static void main(String[] args) {
		
		/*
		 * 2023년도의 월과 일을 입력했는때 요일을 출력하는 메소드를 만드세요.
		 * (Date클래스는 사용하지 않습니다.)
		 */
		
		weekDay();
		plusString();
		
	}
	
	
	public static void weekDay() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력 > ");
		int month = scan.nextInt();
		
		System.out.print("일 입력 > ");
		int day = scan.nextInt();
		
		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31}; // 2023년의 각 달의 일수를 배열로
		String[] arr2 = {"일","월","화","수","목","금","토"}; // 요일도 배열로
		
		int sum = 0;
		for(int i = 0 ; i < month-1 ; i++) { // 입력 받은 month 전 달까지 일의 총합
			sum+= arr[i];
		}
		sum= (sum+day) % 7 -1; // 1월 1일 기준으로 총합 % 7 -1(인덱스) == 요일이 나옴
		System.out.println(arr2[sum]+"요일");
		System.out.println("==================================");
		
	}
	
	public static void plusString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력 >");
		String plus1 = scan.nextLine();
	
		System.out.println("문자열 입력 >");
		String plus2 = scan.nextLine();
		String[] arr = (plus1+" " +plus2).split(" "); // 공백 기준으로 나눠야 하니까 두개를 더한 사이에 공백
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
