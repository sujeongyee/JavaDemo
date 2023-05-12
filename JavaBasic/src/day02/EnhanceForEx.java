package day02;

public class EnhanceForEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		//향산된 for문 - 배열같은 연속된 타입을 돌리기에 적합
		for(int a : arr) { 
				
			System.out.print(a);
			
		}
		
		System.out.println("---------------------");
		
		String[] arr2 = {"월","화","수","목","금","금","금"}; 
		
		for (String a : arr2) {
			System.out.println(a + "요일");
		}
		
		System.out.println("---------------------------");
		
		int[] score = {50,40,30,20,10};
		
		// 이 값들의 합계와 평균을 출력
		
		int sum = 0;
		
		for(int b : score ) {
			sum +=b; 
		}
		double c = sum/ score.length;
		System.out.println("이 값들의 합계은 : " +  sum );
		System.out.println("평균 : " + (double)(sum)/score.length);
		
		
		
	}

}
