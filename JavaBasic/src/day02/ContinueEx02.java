package day02;

import java.util.Scanner;

public class ContinueEx02 {
	
	public static void main(String[] args) {
		
		//continue의 활용????
		//퀴즈 15번 
		
		/*
		 * 1. 입력 받은 수까지의 소수들의 합
		 * 입력 7
		 *  -> 바깥 반복문은 7까지 회전
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 >");
		int num = scan.nextInt();
		
		int sum = 0; // 소수의 합을 누적 변수
		int count =0; // 약수의 개수를 셀 변수

		x: for (int i = 1 ; i < num ; i++) {
			
			count = 0 ; // 초기화
			
			 for(int j = 1 ; j <= num ; j++) {
				//적절한 시점 초기화
				if(i % j ==0) {
					count++;
				}
				if(count > 2) {
					continue x;
				}
				
				
				
			} //end for
			if (count == 2) { //소수를 sum에 누적
				sum += i ;
			}
			

		}
		
		System.out.println("소수의 합 : " +sum);
		
		
		
		
		
	}

}
