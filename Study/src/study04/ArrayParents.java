package study04;

public abstract class ArrayParents implements YearOfBirth{ //추상 부모 클래스 생성
	
	String name; // 일반 변수 3개
	int age;
	String hobby;
	static String hobby2 = "노래부르기"; // static 변수 1개 선언
	
	
	public abstract void info(); // 추상메서드 info 선언
		

}
