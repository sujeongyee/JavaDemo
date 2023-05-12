package day10.static_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("c1의 a : " +c1.a); // 1
		System.out.println("c1의 b: "+c1.b); // 1
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("c2의 a : " + c2.a); // 1
		System.out.println("c2의 b : " + c2.b); // 2
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("c3의 a: " + c3.a); // 1
		System.out.println("c3의 b: " + c3.b); // 3
		
		System.out.println("=================");
		
		/*
		 *  static은 클래스 밖에 1개가 생성이 되기 때문에
		 *  
		 *  객체 생성없이 클래스 이름. 변수명 으로 사용 됩니다.
		 */
		
		Count.b++;
		Count.b = 100;
		System.out.println(Count.b);
		
		// 여기서 c2의 b는 몇일까요? 100
		
		// Math.PI 이 친구도 static 변수
	
	
	}

}
