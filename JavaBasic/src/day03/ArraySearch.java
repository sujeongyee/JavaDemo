package day03;

public class ArraySearch {
	
	public static void main(String[] args) {
		
		// 큰값 찾기 작은값찾기
		int[] arr = {54, 23, 12, 76, 99, 1, 2, 3};
		
		int max = 0; // 큰 값을 저장할 변수
		int min = arr[0];
		int i = 0;
		
		while(i < arr.length) {
			
			if(arr[i]>max) {
				max = arr[i];
			}	
			if(arr[i] <min) {
				min = arr[i];
			}
			
			i++;
		}
		
		System.out.println("가장 큰값: " + max);
		System.out.println("가장 작은값: " + min);
	}

}
