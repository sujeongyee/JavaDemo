package Dain01;
import java.util.Scanner;
public class Main10 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i =0 ; i < a ; i++) {
			for(int j =0 ; j < a-1 ; j++) {
				System.out.print(" ");
			}
			for(int k =0 ; k<i+1; k++) {
				System.out.print("♡");
			}
			System.out.println();
		}

	}

}
