package quiz11;

public class MainClass {
	
	public static void main(String[] args) {
		
		Computer c = new Computer(new KeyBoard(), new Monitor(), new Mouse());
		
		c.getMon().info();
		
		
		
	}
	
	

}
