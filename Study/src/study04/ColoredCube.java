package study04;

public class ColoredCube extends Square{

	ColoredCube(int side) {
		super(side);
	
	}

	@Override
	public void color() {
		System.out.println("정육면체의 색깔 : "+colour);
		
	}

	@Override
	public void draw() {
		System.out.println("빨간색 큐브를 만들었어요");
		
	}
	
	
}
