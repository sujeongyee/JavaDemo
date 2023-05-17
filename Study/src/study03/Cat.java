package study03;

public class Cat extends Animal{
	
	Cat(){
		super.setSound("야옹이는 야옹");
	}
	
	public void makeSound(){
		System.out.println("야옹~ 동물 소리를 재생합니다.");
		System.out.println(super.getSound());
	}

}
