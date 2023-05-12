package dain03;

import java.util.Arrays;
import java.util.Scanner;

public class pro04 {

	public static void main(String[] args) {
		String a = "안녕 하세요";
		a = a.replace(" ", "");
		String[] arr = a.split("") ;
		String result = "";
		for(int i = arr.length-1 ; i >=0 ; i--) {
			result+=arr[i];
		}
		System.out.println(result);


	}




}


