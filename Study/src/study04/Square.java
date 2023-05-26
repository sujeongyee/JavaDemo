package study04;

public abstract class Square implements Shape{
	
	double side;
	
	Square(int side){
		this.side = side;
	}

	@Override
	public void getArea() {
		System.out.println("정육면체 넓이는 : "+ (side*side*6));
		
	}
	
	public abstract void draw();
	

	

}
