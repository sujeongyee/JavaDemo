package Dain01;

public class Quiz01 {
	public static void main(String[] args) {
		// 2번 풀이
		/*
		int sum= 0;
		for(int a = 1; a<=100; a++) {
			if(a% 3 == 0) {
				sum +=a;
			}
		}System.out.println(sum);
		*/

		/*
		while(true) {
			int a = (int)(Math.random()*6+1);
			int b = (int)(Math.random()*6+1);
			System.out.println(a + " " +b);
			if(a + b == 5 ) {
				break;
			}
		}
		*/
		/*
		for (int a = 0 ; a<4;a++) {
			for(int b = 0 ; b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		for (int a = 1 ; a<5;a++) {
			for(int c = 4; c > a ;c--) { // 4 3 2 1
				System.out.print(" ");}
			for(int b = 0 ; b < a;b++) {
				System.out.print("*");}
			System.out.println();
			}
			
		
		
		
	}

}
