package quiz01;

public class Quiz12 {
	
	public static void main(String[] args) {
		//1000까지 정수 중에서 4의 배수이면서 , 8의  배수가 아닌 수의 개수
		//50~100까지의 합계
		//1.
		int i = 1;
		int j = 0; 
		while(i <=1000) {
			if (i % 4 == 0 && i % 8 != 0) {
				j++;
			}
			i++;
		}
		System.out.println("개수 : " + j );
		
		//2.
		
		int k = 50;
		int sum = 0;
		while(k <= 100) {
			sum+=k;
			k++;
		}
		System.out.println("50부터 100까지의 합은 : " + sum);
		
		
		
		
	}

}
