package day03;

import java.util.Arrays;

public class Arraysort02 {
	
	public static void main(String[] args) {
		
		// 버블정렬 - 가장느림 (큰 값을 뒤로 보낸다)
		int[] arr= {5, 23, 1, 43, 200, 100, 40};
		
		// 5, 23, 1, 43, 200, 100, 40 
		// 5, 1, 23, 43, 100, 40, 200 // 1회전 이웃비교 6번비교
		// 1, 5, 23, 43, 40, 100, 200 // 2회전 5번 비교
		// 1, 5, 23, 40, 43, 100, 200 // 3회전 4번 비교
		
		// 바깥 반복문은 회전수 1회전에 마지막값 2회전 뒤에서 두번째 3회전 뒤에서 3번
		// 안쪽 반복문은 
		
		
//		for(int i = 0 ; i < arr.length-1; i++ ) {
//			for(int j = i+1 ; j <arr.length; j++) {
//				if(arr[j]<arr[i]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		// 아주 유용한 기능  
		
		
		Arrays.sort(arr);	// 가장 빠른 퀵정렬	
		System.out.println(Arrays.toString(arr));
		
	
	}

}
