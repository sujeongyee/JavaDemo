package Dain01;

import java.util.Scanner;
public class Main13 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int time = 0;

		String num = scan.next();
		num = num.trim();
		num = num.toUpperCase();
		char[] arr = num.toCharArray();
		for(int a : arr) {
			if(65<=a&&a<68) {
				time += 3;
			}else if(68<=a&&a<71) {
				time += 4;
			}else if(71<=a&&a<74) {
				time += 5;
			}else if(74<=a&&a<77) {
				time += 6;
			}else if(77<=a&&a<80) {
				time += 7;
			}else if(80<=a&&a<84) {
				time += 8;
			}else if(84<=a&&a<87) {
				time += 9;
			}else {
				time += 10;
			}

		}





		System.out.println(time);

	}

}
