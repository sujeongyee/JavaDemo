package study04;

public class ArrayChild extends ArrayParents {
	
	ArrayChild(String name , int age , String hobby){
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}


	@Override
	public void info() { //부모 클래스 메서드 오버라이딩
		System.out.println("----------------------------------------------------");
		System.out.println("이름 : " + name + ", 나이 : " + age+ "살, 취미 : " + hobby + ", 특기 : "+hobby2); //
		
	}


	@Override
	public void year() { // 인터페이스 메서드 오버라이딩
		System.out.println(2024-age+"년생이시네요!");
		System.out.println("-----------------------------------------------------");
		
	}

}
