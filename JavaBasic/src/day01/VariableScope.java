package day01;

public class VariableScope {
	
	public static void main(String[] args) {
		
		//변수는 중괄호 안에서 선언되고, 중괄호 안에서만 유효합니다.
		
		int num1 = 10;
		int num2 = 20;
		// int num1 = 10, num2 = 20;  한번에도 표현 가능
		
		int num4 = 0; // 변수와 선언부
		if(true) {
			
			int num3 = num1 + num2; //30
			
			//요기에서 num4의 값을 변경을 하고, 바깥에서 사용하고 싶음 -> 변수 선언을 바깥 쪽에 미리 해주면 됨
			num4 = 1000;
		}
		
		int num3 = 100; //num3은 if문장을 벗어나면서 사라졌기 때문에 동일한 이름 선언가능
		System.out.println(num3);
		System.out.println(num4);
	}

}
