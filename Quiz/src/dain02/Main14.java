package dain02;

import java.util.Arrays;
import java.util.Scanner;

public class Main14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		String[] arr = a.split("");
		String[] arr2 = b.split("");
		
		String temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		
		String temp2 = arr2[0];
		arr2[0] = arr2[2];
		arr2[2] = temp2;
		
		
		String str = "";
		String str2 = "";
		
		for(int c = 0 ; c < arr.length ; c++) {
			str+= arr[c];
		}
		for(int d = 0 ; d < arr.length ; d++) {
			str2+= arr2[d];
		}
		
		
		int e = Integer.parseInt(str);
		int f = Integer.parseInt(str2);
		
		if(e>f) {
			System.out.println(e);
		}else {
			System.out.println(f);
		}
		
		
		
	}

}
