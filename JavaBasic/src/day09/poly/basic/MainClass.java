package day09.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method1(); // 상속 받은
		c.method2(); // 오버라이드 된
		c.method3(); // 내꺼
		
		System.out.println("==========다형성 적용(형변환)======");
		
		// Parent처럼 사용 됩니다. 단 자식의 오버라이드 된 메서드가 실행됩니다.
		Parent p = c;
		p.method1();
		p.method2();
		// p.method3();
		
		System.out.println(p); // parent타입
		System.out.println(c); // child타입
		System.out.println(p==c); // child로 생성된 자식은 원래의 객체를 유지함
		
		
		System.out.println("======클래스 강제 형변환=====");
		
		//원본이 child 로 생성되었다면, 강제 형변환이 가능함
		
		Parent pp = new Child();
		System.out.println(pp);
		Child cc =(Child)pp; // 강제 현변환
		cc.method1();
		cc.method2();
		cc.method3();
		
		// 주의 할점 => 다형성이 적용되었던 객체만 강제형변환이 가능함
		Object obj = new Object();
		// Child ccc = (Child)obj; // runtime exception
		
		System.out.println("=========형변환의 또 다른 예시===========");
		
		String str = "홍길동";
		Object o = str;
		System.out.println(o);
		
		String result = (String) o ;
		
		
		
		
		
	}

}
