package day08.super_;

public class Child extends Parent {
	
	

	String me;
	
	// 부모님의 기본 생성자가 없을 때 해결 2 가지 방안
	// 1. 부모님의 기본생성자를 만든다. -> 올바르지 않다
	// 2. 자식에서 super()를 통해서 부모님의 생성자와 강제 연결한다.
	
	Child (String me) {
		super("홍순자","홍길동");
		this.me = me;
	}
	String info() {
		return "name : " + mother + ", name : "+father + ", name : " + me ;
	}	
	

}
