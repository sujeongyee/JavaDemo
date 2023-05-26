package study03;

public class My___Parents {
	
	// 멤버변수로는 private int num , num2
	private int num;
	private int num2;
	int result;
	
	
	//반환타입 int 매개변수x  method1(num과 num2의 합을 리턴) 
	public int method1() {
		return num+num2;
	}
	// 반환타입 int 매개변수 x method2 (변수인num-num2를 리턴)   
	public int method2() {
		return num-num2;
	}
	// 반환타입 int고 매개변수 int a,b를 받는 method3(매개변수 a와 b를 곱한값을 리턴)
	public int method3(int a, int b) {
		return a*b;
	}
	
	//private 멤버 변수를 가진 클래스가 구현해야 할 기능 생성
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	

}
