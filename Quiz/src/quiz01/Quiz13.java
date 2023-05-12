package quiz01;
import java.util.Scanner;
public class Quiz13 {
	
	public static void main(String[] args) {
		// 1. 7 ~100 까지 정수 중에 7의 배수만 가로로 출력.
		
		for (int a = 7 ; a <=100 ; a++) {
			if(a % 7 ==0) {
				System.out.print(a + " ");
			}
		}System.out.println();
		
		/*
		 * for(int i = 7; i<=100; i+=7) {
		 * 		System.out.println(i + " ")};	
		 * 
		 */
		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력.
		
		int b = 0;
		for(int a = 1 ; a <= 200 ; a++) {
			if (a % 9 == 0) {
				b++;
			}
		}System.out.println(b);
						
		//3. 100 ~ 50 사이의 두 수 사의 합
		
		int sum = 0;
		for(int a=50; a<=100;a++) {
			sum += a;
		}System.out.println(sum);
		
		//4. A~Z까지 가로로 붙여서 출력. A =65,  Z=90
		
		for(char a = 'A' ; a <= 'Z' ; a++ ) {
			System.out.print(a + " ");
		}System.out.println();
		
		// 5. 입력 받은 정수까지 팩토리얼 5팩토리 = 5 * 4 * 3 * 2 * 1
		/*
		Scanner scan = new Scanner(System.in); 1 * 2 * 3 * 4 * 5
		System.out.println("입력 받은 정수는 : ");
		int a= scan.nextInt();
		int point = 1;
		for (int c = 1; c <=a ; c++) {
			point *= c;
		}System.out.println(point);
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 받은 정수는 : ");
		int d= scan.nextInt();
		int point = 1;
		for (int c = d; c != 0 ; c--) { //5 * 4 * 3 * 2 * 1
			point *= c;
		}System.out.println(point);
		
	}

}
