package study4_1;

public class Steak extends Menu{

	private int perGram; // 스테이크 1인분양 변수를 private로 선언


//	Steak(){
//		super("0",0);
//	}
	
	Steak() { //기본생성자
		
	}

	Steak(int perGram){ // perGram을 매개변수로 받는 생성자
	
		this.perGram = perGram;
	}


	Steak (String name,int price, int perGram){//name과 price, perGram을 매개 변수로 받는 생성자
		super.setName(name);
		super.setPrice(price);
		this.perGram = perGram;
	}
		

	public int getPerGram() {
		return perGram;
	}

	
	public void setPerGram(int perGram) {
		this.perGram = perGram;
	}
	//스테이크 종류(name), 무게(perGram), 주문량, 주문가격 출력
	public void sell(int orderQuantity) { // sell 메서드 오버라이딩
		System.out.println("스테이크 종류 : "+super.getName() +", "
				+ "1인분 무게(g) : "+perGram+", 주문량 : "+orderQuantity + ", 주문 가격 :"+super.getPrice()*orderQuantity);
	}

}
