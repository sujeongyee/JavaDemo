package day03;

import java.util.Arrays;

public class ArrayBasic {
	
	public static void main(String[] args) {
		
		// 배열 - 변수의 집합 , 데이터타입
//		int[] arr2;
//		int[] arr = new int [5];
//		int[] arr1= {1,2,3,4,5};
//		
//		System.out.println(arr1.length);
//		System.out.println(Arrays.toString(arr1));
//		
		
		int[] arr;
		
		// 배열의 생성
		
		arr = new int[5];
		
		// 배열의 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// 배열의 모형
		System.out.println(arr); // 주소값 (배열의 생성위치)
		System.out.println(Arrays.toString(arr)); // 많이 씁니다 외우세요
		
		// 배열의 값의 변경
		arr[2] = 100;
		System.out.println(Arrays.toString(arr)); // 많이 씁니다 외우세요
		
		
		// 배열의 길이
		System.out.println("배열의 길이 :  "+arr.length); // 암기!
		
		// 배열을 선언하는 다양한 방법
		int[] arr2 = new int[3];
		
		//2nd
		int[] arr3 = new int[] {1,2,3};
		
		
		//3nd
		int[] arr4 = {1,2,3};
		
		//배열은 초기 값을 지정하지 않으면 기본값으로 자동초기화
		//int는 0, double = 0.0 , String = null
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
	}

}
