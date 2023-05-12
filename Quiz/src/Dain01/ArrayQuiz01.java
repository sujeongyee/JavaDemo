package Dain01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
	
	public static void main(String[] args) {
		
		// 배열 내에서 큰 값 작은 값 찾기
		
//		int[] arr = {54,23,12,76,99,1,2,3};
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		int i = 0;
//		
//		while(i < arr.length) {
//		
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//			
//			i++;
//		}
//		
//		System.out.println("가장 큰 값 : " + max);
//		System.out.println("가장 작은 값 : " + min);
		
		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		
//		// 두 수를 입력 받아서 두 수의 위치번째를 변경
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int i = scan.nextInt(); // 1 -> 2
//		int j = scan.nextInt(); // 7 -> 8
//		
//		int temp = 0;
//		
//		temp = arr[i];
//		arr[i] = arr[j];
//		arr[j]= temp;
//		
//		System.out.println(Arrays.toString(arr));
		
		//배열의 정렬 
//		int[] arr = {5, 23, 1, 43, 200, 100, 40};
//		int temp = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j <arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//					
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		
		// 버블 정렬
		
//		int[] arr= {5, 23, 1, 43, 200, 100, 40};
//		
//		for(int i = 0 ; i <arr.length-1;i++) {
//			for(int j = i+1 ; j <arr.length ;j++) {
//				if(arr[j]<arr[i]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
	
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
		
		int[] arr = {1,3,5,10,20,30,50,80,100};
		
		int start = 0;
		int end = 8;
		int count = 0; // 회전수
		Scanner scan = new Scanner(System.in);
		int find = scan.nextInt();
		
		while(start <= end) {
			
			count++;
			int mid = (start+end)/2 ;
			
			if(arr[mid] == find) {
				System.out.println("값을 찾았습니다 " + (mid+1)+"번째 존재함");
				break;
			}
			if(arr[mid]>find) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			
			//값을 못 찾았다 
			if(start > end) {
				System.out.println("값을 찾을수 없습니다.");
			}
			
			
			
		}
		
		
		System.out.println("회전수 : " + count);
		
		
		
	
	
	
	
	
	
	}

}
