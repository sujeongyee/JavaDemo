package study03;

import java.util.Scanner;

public class CalApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int result;
		
x:		while(true) {
	
			System.out.print(">>");
			String an = scan.next();
			
			if(an.equals("q")) { // q가 입력 되면 종료
				System.out.println("종료합니다.");
				break;
			}
			String operator = scan.next();
			int b = scan.nextInt();
			
			int a = Integer.parseInt(an);
			
			switch (operator){
			case "+" :  
				Add add = new Add();
				add.setValue(a,b);
				result = add.calculate();
				System.out.println(">> "+result);
				break;
			case "-" : 
				Sub sub = new Sub();
				sub.setValue(a, b);
				result = sub.calculate();
				System.out.println(">> "+result);
				break;
			case "*" : 
				Mul mul = new Mul();
				mul.setValue(a,b);
				result = mul.calculate();
				System.out.println(">> "+result);
				break;
			case "/" : 
				Div div = new Div();
				div.setValue(a,b);
				result = div.calculate();
				System.out.println(">> "+result);
				break;
			case "q" : 
				System.out.println("종료합니다");
				break x;
			default :
				System.out.println("알 수 없는 연산입니다.");

			}
		}

	}

}
