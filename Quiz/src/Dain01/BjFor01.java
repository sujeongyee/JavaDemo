package Dain01;
import java.util.Scanner;
public class BjFor01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		
//		
//		int n = scan.nextInt();
//		for(int i = 1 ; i <= 9 ; i++ ) {
//			System.out.println(n + " * "+ i + " = " + (n*i));
//		}
//		
//		int t= scan.nextInt();
//		for(int i = 1 ; i <= t ; i++) {
//		int a = scan.nextInt(); int b = scan.nextInt();
//		System.out.println(a+b);
//		}
		
//		int n = scan.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= n ; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		
//		int x = scan.nextInt();
//		int n = scan.nextInt();
//		int sum = 0;
//		for(int i = 1; i <=n ; i++) {
//			int a = scan.nextInt(); int b = scan.nextInt();
//			sum += (a*b);
//		} 
//		if(sum==x) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}

		int x = scan.nextInt();
		
		int count = 0;
		int sum = 0;
		
		for(int i = 1 ; i <= x ; i++) {
			for (int j = 1 ; j <= i ; j++) {
				if(i%j == 0) count++;
			}
			if(count==2) sum += i;
			count = 0;
		}
		
		System.out.println("소수 값의 합은 : " + sum);
		
	}

}
