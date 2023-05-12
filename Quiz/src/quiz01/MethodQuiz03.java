package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {
	
	public static void main(String[] args) {
		char[] arr = {'A','B','C','D','E'};
		int [] arr2 = {1,2,3,4,5};
		
		System.out.println();
		
		//String result = method6(arr);
		//System.out.println(result);
		int result2 = method7(arr2); 
		System.out.println(result2);
		String[] arr3 = method8("민","정","아","나","대","지","마");
		System.out.println(Arrays.toString(arr3));
		
		
//		String result = method6(arr);
//		System.out.println(result);
	}// 메인의 끝
	
	
//	static String method6(char[] arr) {
//		String str = ""; 
//		for(int a = 0 ; a < arr.length ; a++) {
//			str += arr[a];
//		}
//		return str;
//	}
	
//	static String method6(char[] arr) {
//		String str = "";
//		for(int a = 0; a < arr.length ; a++) {
//			str += arr[a];
//		}
//		
//		return str;
//	}
	
	
//	static int method7(int[] arr2) {
//		int sum = 0;
//		for(int a = 0; a < arr2.length ; a++) {
//			sum+= arr2[a];
//		}				
//		return sum;
//	}
	
	
	static int method7(int[]arr2) {
		int sum = 0;
		for(int i : arr2 ) {
			sum += i;
		}
		
		return sum;
	} 
	
	
	
	
//	static String[] method8 (String a, String b) {
//		
//		String[] arr3 = {a,b};
//		
//		return arr3;
//	}
	
	static String[] method8 (String a , String b, String c, String d, String e,String f,String g) {
		
		String[] arr3 = {a,b,c,d,e,f,g};
		
		return arr3;
	}
	
	


}
	
	
