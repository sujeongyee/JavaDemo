package study04;

public class ColoredCircle extends Circle{

	ColoredCircle(int raidus) {
		super(raidus);
	}
	
	@Override
	public void color() {
		System.out.println("원의 색깔 : " + colour);
	}

	@Override
	public void draw() {
		System.out.println("빨간 원을 만들었어요");
		
	}

}
