package dain02;

import java.util.Scanner;

public class Main07 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 몇개의 바구니를
		int m = scan.nextInt(); // 몇번 역순으로 바꿀지
		
		int[] arr = new int[n];
		
		for(int b = 0 ; b < arr.length ; b++) { // 1~ n 까지의 바구니 배열 생성
			arr[b] = b+1;
		}
		
		for(int a = 1 ; a <= m ; a++) { // m 만큼 반복문 돌리기
			int i = scan.nextInt(); // 1
			int j = scan.nextInt(); // 4
			
			
		
			
		}
		
	}

}
