package Dain01;
import java.util.Scanner;
public class Main12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		
		int count = 0;
		int b = 0;
		for(int a = 0 ; a < arr.length ; a++) { //배열의 생성
			
			b = scan.nextInt();
			arr[a] = b;		
			
		}
		int c = scan.nextInt();
		for(int d : arr) {
			if(d != c) {
				continue;
			}else {count++;}
		}
		System.out.println(count);
		scan.close();
	}

}
