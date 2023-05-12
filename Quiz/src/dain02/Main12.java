package dain02;

import java.util.Scanner;

public class Main12 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int t = scan.nextInt();
		String result = "";
		
		for(int i = 0 ; i < t ; i++) {
			int r = scan.nextInt();
			String s = scan.next();
			result = "";
			for(int j = 0; j < s.length() ; j++) {
				for(int k = 0 ; k <r; k++) {
				result += s.valueOf(s.charAt(j));}
								
			}
			System.out.println(result);
			
		}
		
		
	}

}
