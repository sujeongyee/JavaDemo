package Dain01;
import java.util.Scanner;
public class Square01 {

	public static void main(String[] args) {
		
//		1 . 가로 , 세로 길이를 입력 받는다
//		2. 가로, 세로 길이만큼 사각형을 출력
//		3. 단 , 윤곽만 * 모양으로 출력
//		ex 
//		   가로 값 5, 세로 값 4
//		   
//		   *****
//		   *   *
//		   *   *
//		   ***** 
//		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로 > ");
		int a = scan.nextInt(); //가로
		System.out.println("세로 > ");
		int b = scan.nextInt(); //세로
		
		
		for(int i = 1 ; i <= b ; i++) {
			
			for(int j = 1 ; j <= a; j++) {
				
				if(i==1 || j==1 || i==b ||j==a ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}			
			System.out.println();
		}
		
		
	}

}
