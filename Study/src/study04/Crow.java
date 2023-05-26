package study04;

public class Crow extends Bird { // 까마귀 클래스생성
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void fly() {
		System.out.println("까마귀("+getName()+")가 날아다닙니다.");
		
	}

	@Override
	public void sing() {
		System.out.println("까마귀("+getName()+")가 소리내어 웁니다.");
		
	}

	@Override
	public void showName() {
		System.out.println("까마귀의 이름은 "+getName()+"입니다.");
		
	}

}
