package study03;

public class MyMain {
	
	public static void main(String[] args) {
		
		My___Child01 child = new My___Child01();		
		System.out.println(child.method1());
		System.out.println(child.method2());
		System.out.println(child.method3(5, 10));
		
		My___Child02 child2 = new My___Child02(7,8);
		System.out.println(child.method1());
		System.out.println(child.method2());
		System.out.println(child.method3(5, 7));
		
		
		
		
	}

}
