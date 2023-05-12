package quiz13;

public class Circle extends Shape {
	/*  원은 radius 변수를 가집니다.
	 *  원은 생성될때 이름과, radius를 받을수 있도록 생성자 선언.
	 *  getArea() = 원의 너비를 구하도록 오버라이딩
	 */
	private int radius;
	
	
	public Circle(String name , int radius) {
		super("원");
		this.radius = radius;
	}
	
	
	public double getArea() {
		
		double result = radius * radius * Shape.PI;
		
		return result;
	}

}
