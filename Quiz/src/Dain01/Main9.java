package Dain01;
import java.util.Scanner;
public class Main9 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int N = scan.nextInt();
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

