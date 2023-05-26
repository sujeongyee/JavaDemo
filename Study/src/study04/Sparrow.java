package study04;

public class Sparrow extends Bird{ // 참새 클래스 생성

	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	@Override
	public void fly() { 
		System.out.println("참새("+getName()+")가 숨어있습니다.");

	}

	@Override
	public void sing() {
		System.out.println("참새("+getName()+")가 울지 않습니다.");

	}

	@Override
	public void showName() {
		System.out.println("참새의 이름은 "+getName()+"입니다.");

	}



}
