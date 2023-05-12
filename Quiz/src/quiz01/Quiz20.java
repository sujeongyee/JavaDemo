package quiz01;
import java.util.Arrays;
import java.util.Scanner;
public class Quiz20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n]; //크기가 n인 배열 생성
		

		
		for(int i = 0; i <n ; i++) { //배열에 값 넣어주기
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int j = 0 ; j < n ; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}else if(arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println(min + " "+max);
		
	}

}
