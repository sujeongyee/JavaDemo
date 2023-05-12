package quiz05;

public class Calculator { //부모클래스
	
	int result = 0;
	double pi;
	
	void att(int a) {
		result += a;
		System.out.println("누적된 result 값 : "+ result);
	}
	void sub(int a) {
		result -= a;
		System.out.println("감소된 result 값 : " + result);
	}
	double circle(int a) {
		pi = 3.14;
		double result = a*a*pi;
		return result;
	}

}
