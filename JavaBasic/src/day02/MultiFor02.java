package day02;

public class MultiFor02 {
	
	public static void main(String[] args) {
		
		// 회전수가 변경되는 중첩반복문
		// i 값에 따라 j의 값을 변경
		// 1 - 1
		// 2 - 1
		// 2 - 2
		// 3 - 1
		
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.println(i+"-"+j);
			}			
		}
		
		// 별 출력하기
		/*
		*
		**
		***
		****
		*****		
		 */
		
		for(int i = 1 ; i <=5 ; i++) {
			for(int j = 1 ; j <= i ; j++ ) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		/*
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 */
		
		int star = 10;
		
		for(int i = 1 ; i <= star ; i++) {
			//공백
			for(int j = 1; j <= star - i;j++ ) { //4 3 2 1
				System.out.print(" ");
			}
			 
			for(int j = 1; j <= 2*i-1 ; j++) { // 1 3 5 7 9
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
