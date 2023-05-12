package Dain01;
import java.util.Scanner;
public class Main3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 1;
		while (b<10) {
			System.out.println(a + " * " + b + " = "+(a*b) );
			b++;
		}
		
		
	}

}
