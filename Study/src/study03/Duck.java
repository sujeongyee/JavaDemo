package study03;

public class Duck extends Animal {
	
	Duck(){
		super.setSound("오리는 꽥꽥");
	}
	
	public void makeSound() {
		System.out.println("꽥꽥~ 동물 소리를 재생합니다.");
		System.out.println(super.getSound());
	}

}
