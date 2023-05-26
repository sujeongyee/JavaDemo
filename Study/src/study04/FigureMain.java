package study04;

public class FigureMain {
	
	public static void main(String[] args) {
		
		ColoredCircle cc = new ColoredCircle(5);
		cc.color();
		cc.getArea();
		cc.draw();
		
		ColoredCube cube = new ColoredCube(5);
		cube.color();
		cube.getArea();
		cube.draw();
		
		
	}

}
