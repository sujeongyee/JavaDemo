package quiz01;

public class Quiz02 {
	
	// 1~100 까지의 랜덤한 정수를 생성
	
	// 랜덤하게 나온수가 3의 배수인지 , 아닌지 3항연산식으로 결과 출력.
	
	public static void main(String[] args) {
		double a =Math.random()*100;
		int b = (int) a;
		String result = b%3==0 ?"3의 배수입니다" : "3의 배수가 아닙니다" ;
		
		System.out.println(b + "는 " + result);

//	public static void main(String[] args) {
//		int a =(int)(Math.random()*100) + 1;
//		
//		System.out.println(a % 3 == 0? a + "는 3의 배수" : a + "는 3의 배수가 아님");
//		
	}
		//String result = a%3==0 ?"3의 배수입니다" : "3의 배수가 아닙니다" ;
		//System.out.println(a + "는 " + result);}
	
	
}
