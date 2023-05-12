package day13.generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Object형으로 선언하면 무엇이든 저장 할 수 있지만,
		 * 그 값을 사용 할 때, 알맞은 타입으로 반드시 형변환을 해야 합니다
		 * 
		 * 잘못 형 변환 하면, 예외가 발생합니다.
		 */
		
		ABC abc = new ABC();
		abc.setObj("홍길동");
		// abc.setObj(10);
		
		String name = (String)abc.getObj();
		System.out.println(name);
		
		ABC abc2 = new ABC();
		//Person p = new Person();
		//abc2.setObj(p);
		abc2.setObj(new Person());
		Person p = (Person)abc2.getObj();
		
	}

}
