package quiz001;
import java.util.Scanner;
public class Quiz7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String c = scan.next();
		int b = scan.nextInt();
		
		
		switch (c) {
		case "+": 
			System.out.println("두 수의 덧셈은 : "+ (a+b));
		break;
		case "-": 
			System.out.println("두 수의 뺄셈은 : " +(a-b));
		break;
		case "*": 
			System.out.println("두 수의 곱셈은 : " +(a*b));
		break;
		case "/":
			System.out.println("두 수의 나눗셈은 : "+(a/b));
		break;		
		default :
			System.out.println("다시 입력하세요");
		}
		scan.close();
	}

}
