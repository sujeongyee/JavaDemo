package dain02;
import java.util.Arrays;
import java.util.Scanner;
public class Main04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int a = 0; a < arr.length;a++) {
			arr[a] = a+1;
		}
		int m = scan.nextInt();
		
		for(int b = 0; b < m ; b++) {
			int temp = 0;
			int i = scan.nextInt();
			int j = scan.nextInt();
			temp = arr[i-1];
			arr[i-1] =arr[j-1];
			arr[j-1] = temp;
		}
		for(int c = 0 ; c < arr.length; c++) {
			System.out.print(arr[c]+" "); 
		}
	}

}
