package Dain01;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a==b && b==c && a==c) {
			System.out.println(10000+c*1000);
		}
		else if(a==b && b==c) {
			System.out.println(1000+a*1000);
		}else if (a==b || b==c) {
			System.out.println(1000+b*100);
		}else if (a==c) {
			System.out.println(1000+a*100);
		}else if (a > b && a>c) {
			System.out.println(a*100);
		}else if(b > a && b>c) {
			System.out.println(b*100);
		}else {
			System.out.println(c*100);
		}
	
	} 

}
