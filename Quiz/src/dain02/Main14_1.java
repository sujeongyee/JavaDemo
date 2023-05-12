package dain02;

import java.util.Arrays;

public class Main14_1 {
	
	
	public static void main(String[] args) {
		
		String a = "234" ;
		
		String[] arr = a.split("");
		
		String temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		
		String str = "";
		
		for(String b : arr) {
			str += b;
		}
		
		int c = Integer.parseInt(str);
		
	}

}
