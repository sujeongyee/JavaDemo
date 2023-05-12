package day10.static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	// 일반 메서드 - 일반 멤버와, 정적 멤버 모두 사용이 가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}	
	
	// 정적 메서드 - 일반 멤버에 사용 할 수 없음, 정적 멤버는 사용이 가능
	//			   단, 객체생성을 통해서는 일반멤버 사용이 됩니다.
	public static int method02() {
		Count c = new Count() ;
		// a = 10 ;  사용 할수 없다 왜냐, static이 생성될 당시에 a변수는 없음
		c.a = 10;
		b++;
		return b; 
		
		
	}
	
	

}
