package study03;

public class My___MainClass {
	
	public static void main(String[] args) {
		
		My___Child01 c1 = new My___Child01();
		System.out.println(c1.method1());
		System.out.println(c1.method2());
		
		My___Child02 c2 = new My___Child02(5,10);
		System.out.println(c2.method1());
		System.out.println(c2.method2());
		
		My___Child03 c3 = new My___Child03();
		System.out.println(c3.method3(5,2));
		
		
		System.out.println(c3.method4("안녕", "하세요"));
		System.out.println(c3.method4(5, 7));
		
		
		
	}

}
