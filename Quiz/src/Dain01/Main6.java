package Dain01;
import java.util.Scanner;
public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int i = 0;
		int sum = 0;
		while(i < n) {
			int a =scan.nextInt(); int b = scan.nextInt();
			sum += (a*b);
			i++;
		}
		if (x == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
