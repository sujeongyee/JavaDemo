package study4_1;

public class Menu implements Restaurant{ // 레스토랑 인터페이스를 구현하는 menu클래스 생성
	
	private String name;
	private int price;
	
	Menu(){ // 기본생성자? 기본생성자가 없다면 자식클래스 생성자에서 아래 생성자에 임의의 값을 넣어줘야 함 
		
	}
	
	// 매개변수 받는 생성자
	Menu(String name, int price){
		this.name = name;
		this.price=price;
	}

	@Override // 오버라이딩 . 기능은 없다
	public void sell(int orderQuantity) {
		
	}

	// getter , setter 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public int getPrice() {
		return price;
	}

	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
