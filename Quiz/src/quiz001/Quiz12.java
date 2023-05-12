package quiz001;

public class Quiz12 {
	
	public static void main(String[] args) {
		int a= 1;
		int count = 0;
		while(a <= 1000) {
			
			if(a % 4 ==0 && a % 8 !=0) {
				count++;
			}			
			a++;
		}
		
		System.out.println(count);
		
		
		int b = 50;
		int sum = 0;
		
		while(b <=100) {
			sum += b;
			b++;
		}
		
		System.out.println(sum);
		
	}

}
