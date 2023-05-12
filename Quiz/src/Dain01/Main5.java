package Dain01;
import java.util.Scanner;
public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = 1;
		int sum = 0;
		while (b <= a) {
			sum+=b;
			b++;
		}
			System.out.println(sum);
	}

}
