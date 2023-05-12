package quiz001;

public class quiz2 {
	
	public static void main(String[] args) {
		int a = (int)(Math.random()*100)+1;
		System.out.println(a);
		System.out.println(a%3==0? "3의 배수입니다":"3의 배수가 아닙니다");
	}

}
