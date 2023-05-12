package dain02;
import java.util.Arrays;
import java.util.Scanner;
public class Main05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[]arr = new int[30];

		for(int a = 0; a < arr.length ; a++) {
			arr[a] = a+1;
		}
		
		for(int b = 0; b < 28;b++) {
			int c = scan.nextInt();
			arr[c-1] = 0;
		}
		
		for(int c :arr) {
			if(c != 0) {
				System.out.println(c);
			}
		}

		scan.close();

	}

}
