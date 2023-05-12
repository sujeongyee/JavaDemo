package day12.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {
		
		int[] arr = {3,1,2,5,6,7};
		
		// 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 탐색
		int result = Arrays.binarySearch(arr, 4); // 배열명, 찾을값
		System.out.println(result); // 음수가 나오면 값은 없다
		
		int result2 = Arrays.binarySearch(arr, 5);
		System.out.println(result2); // 찾는 값의 인덱스가 나옴
		
		// 배열복사
		
		int[] newArr = Arrays.copyOf(arr, arr.length); // 복사할 배열, 새로운 배열의 길이
		System.out.println(Arrays.toString(newArr));
		int[] newArr2 = Arrays.copyOf(arr, arr.length*2);
		System.out.println(Arrays.toString(newArr2));
		
		// 배열크기지정복사
		
		
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3); // 1부터 3미만
		System.out.println(Arrays.toString(newArr3));
		
		// 배열의 원소비교
		if(Arrays.equals(newArr, arr)) {
			System.out.println("같다용");
		}else {
			System.out.println("다르다용");
		}
		
		
		
		
		
	}

}
