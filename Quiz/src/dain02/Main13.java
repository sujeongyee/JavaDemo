package dain02;

import java.util.Arrays;
import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine().trim();

		if(s.equals("")) {
			System.out.println(0);
		}else {
			String a = s.trim();
			String[] arr = a.split(" ");
			System.out.println(arr.length);
		}

	}

}
