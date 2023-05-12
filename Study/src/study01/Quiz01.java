package study01;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] stock = new String[100];
		int[] price = new int[100];
		int count = 0;
		
		while(true) {
			
			System.out.print("추가할 물품 >>");
			stock[count] = scan.next();
			
			System.out.print("물품 가격 >>");
			price[count] = scan.nextInt();
			
			System.out.print("그만 추가하고 싶으면 0 입력 >>");
			String zero = scan.next();
			
			if(zero.equals("0")) break;
			count++;
		}
		
		System.out.println("======================");
		System.out.print("상품 목록 [");
		
		for(int i = 0 ; i < count; i++) {
			System.out.print(stock[i] + "-" + price[i] + " / ");
		}
		
		System.out.print(stock[count]+"-"+price[count]+"]");
		System.out.println();
		System.out.println("============================");
		System.out.print("구매 가능 물품 : ");
		
		int count2 = 0;
		String result = "";
		
		for(int i = 0 ; i <= count ; i++) {			
			if(price[i] <= 2000) {
				count2++;
			}
		}
		
		int count3 = 0;
		for(int i = 0 ; i <= count ; i++) {			
			if(count3==(count2-1)) {
				result += stock[i];
				break;
			}
			if(price[i] <= 2000) {
				result += stock[i] + ", ";
				count3++;
			}
		}
		
		System.out.println(result);
		System.out.println(count2 + "개 구매 가능");
		
		
	}
	
	
	

}
