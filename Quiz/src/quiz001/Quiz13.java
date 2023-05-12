package quiz001;
import java.util.Scanner;
public class Quiz13 {
	
	public static void main(String[] args) {
		
		// 1.
		
		for(int i = 7 ; i <= 100 ; i++) {
			if(i%7==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 2.
		int count = 0;
		for(int i = 1 ; i <=200 ; i++ ) {
			if(i%9==0) {
				count++;
			}			
		}
		System.out.println(count);
		
		//3.
		int sum = 0;
		for(int i = 100; i >= 50; i--) {
			sum += i;
		}
		System.out.println(sum);
		
		//4.
		for(char A ='A'; A <= 90; A++) {
			System.out.print(A + " ");
		}
		System.out.println();
		
		//5.
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		sum = 1;
		for(int a = 1; a <=i ;a++) {
			sum*=a;
		}
		System.out.println(sum);
		scan.close();
	}

}
