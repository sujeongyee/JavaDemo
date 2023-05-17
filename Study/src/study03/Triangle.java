package study03;

public class Triangle extends Shape{
	int side, side2 ; 
	
	Triangle(String name , int side, int side2){
		super.setName(name);
		this.side = side;
		this.side2 = side2;
		System.out.println("도형이름 : "+super.getName() + " " + getArea(side,side2));
	}
	
	public double getArea(double a, double b) {
		return (a*b)/2;
	}

}
