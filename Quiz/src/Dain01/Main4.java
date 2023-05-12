package Dain01;
import java.util.Scanner;
public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int i = 0;
		while(i < T) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
			i++;
		}
	}

}
