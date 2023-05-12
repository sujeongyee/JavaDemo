package day08.modi.member.pac1;

public class B {
	
	
	// 사용
		A a = new A(); //public
		A a2 = new A(1); //default
		//A a3 = new A("홍길동"); // private
		
		public B () {
			a.var1 = 1;
			a.var2 = 2;
			// a.var3 = 3; 프라이빗이기 문에 접근 불가
			
			a.method1();
			a.method2();
			// a.method(); 접근 풀가
		}


}
