package quiz13;

public class Rect extends Shape {
	
	/*  사각형은 side 변수를 가집니다.
	 *  사각형은 생성될때 이름과, side를 받을수 있도록 생성자 선언.
	 *  getArea() = 사각형의 너비를 구하도록 오버라이딩
	 */
	
	private int side;
	
	
	public Rect(String name , int side){
		super("사각형");
		this.side = side;
	}
	
	
	public double getArea() {
		
		double result = side * side;
		
		return result;
	}

}
