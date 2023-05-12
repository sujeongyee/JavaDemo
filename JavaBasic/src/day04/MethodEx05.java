package day04;

import java.util.Arrays;

public class MethodEx05 {
	
	public static void main(String[] args) {
		// 배열의 한계점 -> 크기가 정적
		// Stack 스택  - Last in First Out (LIFO)
		
		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));
		pop();
		pop(); // 배열이 삭제되는 기능
		int r = pop(); // 삭제 된 데이터도 확인 가능
		System.out.println(r);
		System.out.println(Arrays.toString(arr));

	} //메인의 끝

	static int[] arr = {1,2,3}; 
	
	// push 메서드 -> 특정 요소를 마지막에 추가
	
	static void push (int data) {
		// 1. 배열의 크기를 +1 한 새로운 배열을 만듦
		// 2. arr 배열의 요소를 복사
		// 3. 마지막에 추가
		int[] temp = new int[arr.length+1];
		for(int i = 0; i < arr.length ; i++) {
			temp[i] = arr[i];
		}
		temp[temp.length-1] = data;
		//4. 원본배열을 temp로 변경
		arr = temp;
		temp = null;		
	}
	
	// pop 메서드 -> 특정요소를 마지막에서 삭제 (반환 - 삭제된 데이터)
	
	static int pop () {
		
		if(arr.length > 0) {
		
		// 1. 삭제할 데이터를 백업		
		// 2. 사이즈가 arr 보다 -1인 사본 배열을 생성		
		// 3. 원본 배열을 사본으로 복사  (맨 마지막 데이터만 제외)
		// 4. 사본 배열을 원본 배열로 변경
		
		int del = arr[arr.length-1];		
		int[] temp = new int[arr.length-1];
		
		for(int i = 0 ; i < temp.length ; i++) {
			temp[i] = arr[i];
		}
		arr= temp;
		temp = null;
		
		return del;		
		}
		
		return 0;
	}
	
	
}
