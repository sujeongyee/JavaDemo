package dain02;
import java.util.Scanner;
public class Main02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		for(int i = 0 ; i <arr.length; i++) {
			arr[i] = scan.nextInt();
			}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j]>max) {
				max = arr[j];
				index = j+1;
			}
		}
		System.out.println(max +" " + index);
		
	}

}
