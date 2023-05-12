package dain02;
import java.util.Scanner;
public class Main01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int [n];
		int b = 0;
		int max = 0;
		int min = 0;
		
		for(int a = 0 ; a < n ; a++) {
			b = scan.nextInt();
			arr[a] = b;
		}
		max = arr[0];
		min = arr[0];
		for(int c : arr ) {
			if(c>max) {
				max = c;
			}else if(c<min) {
				min = c;
			}			
					}

		System.out.println( min + " "+ max);
		
	}

}
