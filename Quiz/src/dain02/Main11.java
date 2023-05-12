package dain02;

import java.util.Scanner;

public class Main11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next(); // 단어 주어짐
		
		for(char i = 'a' ; i <= 'z'; i++) {
			String str = "";
			str += s.indexOf(i);
			System.out.print(str+" ");
		}
		
		
	}

}
