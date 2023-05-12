package quiz13;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Shape s = new Rect("사각형",5);
		System.out.println(s.getName()+", 넓이는 : " + s.getArea());
		
		Shape sh = new Circle("원",2);
		System.out.println(sh.getName()+", 넓이는 : "+ sh.getArea());
		
	}

}
