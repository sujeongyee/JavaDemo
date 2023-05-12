package day07.overload;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(2);
		b.input("메롱");
		b.input(2, 3.0);
		b.input(4.2, 5);
		b.input(2, '나', 3.54);
		
		
		
	}

}
