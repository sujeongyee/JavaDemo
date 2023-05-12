package quiz01;
import java.util.Scanner;
public class Quiz19 {
	
	public static void main(String[] args) {
		
		//금액의 동전 -
		// 어떤 금액 x 가 주어졌을 때 , 큰 금액부터 거슬러서 몇개가 나와야 하는지 출력.
		
		int[] arr = {1000, 500, 100 , 50, 10};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("금액 > ");
		int x = scan.nextInt();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			int a = x /arr[i]; // 17 주어진값 / 지금 값 몫
			
			x -= a * arr[i]; // 주어진값의 변경 , 방금 계산된 값을 빼버리기
			
			System.out.println(arr[i]+"원 : "+ a + "개");
		}		
		
		/*
		 * System.out.println(arr[i] + "원:" + x/arr[i]);
		 * x = x % arr[i];
		 * 
		 */
	}
}
