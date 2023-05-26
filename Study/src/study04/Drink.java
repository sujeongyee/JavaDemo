package study04;

public class Drink extends Menu{
	
	private int size; //size(음료 양) 변수를 private로 선언
	
	Drink(){ //기본생성자
		
	}
	
	Drink(int size){ //size를 매개변수로 받는 생성자
		this.size = size;
	}
	
	Drink(String name , int price , int size){ // name과 price, size을 매개변수로 받는 생성자

		super.setName(name);
		super.setPrice(price);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//음료 종류(name), 사이즈(size), 주문량, 주문가격 출력
	public void sell(int orderQuantity) {
		System.out.println("음료 종류 : "+super.getName() +", "
				+ "사이즈(ml) : "+size+", 주문량 : "+orderQuantity + ", 주문 가격 :"+super.getPrice()*orderQuantity);
	}

}
