package dain02;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] arr = new int[n] ;
		
		for(int a = 0 ; a < n ; a++) {
			int b = scan.nextInt();
			arr[a] = b;
			if(b<x) {
				System.out.print(b+ " ");
			}
		}		
	}
}
