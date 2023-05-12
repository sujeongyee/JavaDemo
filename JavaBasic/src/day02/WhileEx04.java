package day02;
import java.util.Scanner;
public class WhileEx04 {
	
	public static void main(String[] args) {
		
		/*
		 * 입력을 받을 횟수를 지정
		 * 처음 5를 입력 받으면
		 * 5번 입력받을 수 있도록
		 * 
		 * 입력 받은 값들의 합
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 받을 횟수 : > ");
		int i = scan.nextInt();
		
		
		int j = 0;
		int sum = 0;
		while(j<i) {
			int a = scan.nextInt(); int b = scan.nextInt();
			//System.out.println(a+ " "+b);
			sum = a+b;
			j++;
		}
		System.out.println("입력 받은 값들의 합은 : " + sum );
	}

}
