package day08.modi.cls.pac2;

import day08.modi.protec.pac1.A;

public class D extends A {
	
	
	// protected는 상속 관계에서 super를 통해 접근이 가능함
	
	public D() {
		super();
		
		super.bool = true;
		super.method();
	}
	
	//  override됨
	protected void method() {
		
		
	}

}
