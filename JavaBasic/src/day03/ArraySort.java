package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		// 배열의 정렬  - 정렬은 대략 6개
		// 선택정렬

		int[] arr= {5, 23, 1, 43, 200, 100, 40};

		for(int i = 0 ; i < arr.length-1; i++) { // 0 인덱스부터 5인덱스까지
			for (int j = i + 1 ; j < arr.length ; j++) { // i+1 ~ 끝까지
				if(arr[i]>arr[j]) { // 비교대상이 작다면, swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}

		System.out.println(Arrays.toString(arr));
	}

}
