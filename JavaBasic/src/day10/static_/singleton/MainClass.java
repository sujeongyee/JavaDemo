package day10.static_.singleton;

public class MainClass {
	
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s.getDomain());
		
	}

}
