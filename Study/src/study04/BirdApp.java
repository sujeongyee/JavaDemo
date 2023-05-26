package study04;

public class BirdApp {
	
	public static void main(String[] args) {
		
		Crow c = new Crow(); 
		c.setName("꽈꽈"); // 이름 지어주기
		c.fly();
		c.sing();
		c.showName();
		
		System.out.println("=================");
		
		Sparrow s = new Sparrow();
		s.setName("짹짹"); // 이름 지어주기
		s.fly();
		s.sing();
		s.showName();
		
	}

}
