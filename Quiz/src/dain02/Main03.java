package dain02;
import java.util.Arrays;
import java.util.Scanner;
public class Main03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 마지막 바구니 값
		int m = scan.nextInt(); // 몇개의 줄로 넣을지
		int[] arr = new int[n];


		for(int b = 0 ; b < m ; b ++) {
			int i = scan.nextInt(); // 몇번부터
			int j = scan.nextInt(); // 몇번까지
			int k = scan.nextInt(); // 몇번공을
			for(int c = i ; c <= j ; c++) {
				arr[c-1] = k;
			}
		}
		for(int c = 0; c < arr.length; c++) {
			System.out.print(arr[c] + " ");
		}
	}
}
