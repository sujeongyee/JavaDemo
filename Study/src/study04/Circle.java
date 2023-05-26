package study04;

public abstract class Circle implements Shape{
	
	double radius;
	Circle(int radius){
		this.radius = radius;
	}

	@Override
	public void getArea() {
		System.out.println("넓이는 : "+ (radius*radius*3.14));
	}
	
	public abstract void draw();
	

	@Override
	public void color() {
		
	}

}
