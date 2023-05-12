package quiz001;
import java.util.Scanner;
public class Quiz19 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {1000, 500, 100 , 50, 10};
		
		System.out.println("금액>");
		int a = scan.nextInt();
		
		
		for(int i = 0; i <arr.length ; i++) {
			int b = a / arr[i];
			a -= arr[i]*b;
			System.out.println(arr[i] + " : " + b + "개");
		}
		scan.close();
	}

}
