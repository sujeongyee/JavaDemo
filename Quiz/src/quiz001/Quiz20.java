package quiz001;
import java.util.Scanner;
public class Quiz20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int j = 0 ; j < arr.length; j++) {
			if(max < arr[j]) {
				max=arr[j];
			}else{
				min=arr[j];
			}
		}
		System.out.println(min+" "+max);
		scan.close();
	}

}
