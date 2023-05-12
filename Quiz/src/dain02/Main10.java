package dain02;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 숫자의 개수
		
		String m = scan.next(); // 공백없이 숫자 나열
		char[] arr = new char[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = m.charAt(i);
		}
		int sum = 0;
		for(int a : arr) {
			sum+=a;
		}
		System.out.println(sum-(48*n));

		scan.close();
	
	}

}
