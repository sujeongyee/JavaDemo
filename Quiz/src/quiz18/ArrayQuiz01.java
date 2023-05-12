package quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {
	
	public static void main(String[] args) {
		
		// arr과 arr2는 길이가 1차이가 납니다.
		// arr은 마라톤 참가자 
		// arr2는 마라톤 완주자
		// 완주하지 못한 사람을 찾으세요
		
		String[] arr = {"홍길동", "홍길자", "이순신", "신사임당"};
		String[] arr2 = {"홍길동", "이순신", "신사임당"};
		
		System.out.println(test(arr,arr2));
		
	}
	
	
	public static String test(String[] arr, String[] arr2) {
		
		
//		String result = "";
//		
//		for(String a : arr) {
//			int b = Arrays.binarySearch(arr2, a);
//			if(b<0) {
//				result = a;
//			}
//		}
//		
//		String[] newArr = Arrays.copyOf(arr2, arr2.length+1);
//		String result = "";
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for(int i = 0 ; i < arr2.length ; i++) {
			if(!arr[i].equals(arr2[i])) {
				return arr[i];
			}
		}
		
		return arr[arr.length-1];
	}

}
