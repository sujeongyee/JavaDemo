package study02;

public class PriceQuizMainClass {
	
	public static void main(String[] args) {
		
		PriceQuiz p = new PriceQuiz(100000);
		System.out.println("시재 : " + p.account() + "원");
		p.receipt();
		
	}

}
