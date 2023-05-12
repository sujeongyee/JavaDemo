package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {
	
	// 사용
		A a = new A(); //public
		//A a2 = new A(1); //default
		//A a3 = new A("홍길동"); // private
		
		public C() {
			a.var1 = 1;
			//a.var2 = 2; // default xx
			//a.var3 = 3; // private xx
			
			a.method1();
			//a.method2();
			//a.method3();
			
			
		}

}
