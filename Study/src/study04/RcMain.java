package study04;

public class RcMain {
	
	public static void main(String[] args) {
		
		RC tv = new Tv(); // 부모인터페이스 타입의 tv를 생성 (RC기능만 할수 있음)
		Tv tv2 = (Tv)tv; // 자식으로 강제형변환 (자식의 기능을 함)
		tv2.on();
		tv2.iptv();
		tv2.youtube();
		tv2.up();
		tv2.up();
		tv2.up();
		tv2.down();
		tv2.down();
		tv2.down();
		
		RC ac = new Ac();
		Ac ac2 = (Ac)ac;
		ac2.on();
		ac2.down();
		ac2.down();
		ac2.down();
		ac2.down();
		ac2.down();
		ac2.down();
		ac2.down();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		ac2.up();
		
	}

}
