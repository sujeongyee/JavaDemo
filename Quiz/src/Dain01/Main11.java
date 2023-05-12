package Dain01;
import java.util.Scanner;
public class Main11 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int i = 1;
		
		while(i<=t) {
			int a = scan.nextInt(); int b = scan.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
			i++;
		}
	}

}
