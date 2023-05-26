package study03;

public class Circle extends Shape{
	
	int radius;
	
	Circle(String name, int radius){ // 생성될때 이름과 radius를 받는다
		super.setName(name);
		this.radius = radius;
		System.out.println("도형이름 : "+super.getName() + " " + getArea(radius));
	}
	
	public double getArea(double a) {		
		
		return a * a * 3.14;
	}
	
	
	

}
