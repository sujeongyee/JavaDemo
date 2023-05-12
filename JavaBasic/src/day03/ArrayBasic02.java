package day03;

public class ArrayBasic02 {
	
	public static void main(String[] args) {
		
		// 배열의 순회
		
    	int[] arr = {1,2,3,4,5,6,7,8,9,10}; // 길이 10 인덱스 9
//		
//		int a = 0;
//		while (a < arr.length) {
//			
//			System.out.println("배열의 " + a+" 인덱스 : "+arr[a]);
//			
//			a++;
//		}
//		
//		for(int b:arr) {
//			System.out.println(b);
//		}
//		
		
		// 배열값들의 합
//		int sum = 0; 내가 푼거
//		for(int a : arr) {
//			System.out.print(a + " ");
//			sum+= a;
//		}
//		System.out.println();
//		System.out.println("배열 값들의 합은 : "+sum);
		
    	int sum = 0; // 쌤 풀이
		int a = 0;
		while(a < arr.length) {
			sum += arr[a];
			a++;
		}
		System.out.println("배열 값들의 합은 : " + sum);
		
		
	}

}
