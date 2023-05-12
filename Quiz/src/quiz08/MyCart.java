package quiz08;

import java.util.Arrays;

public class MyCart extends Cart {
	
	// 1 . 생성자는 money를 전달 받아서 money값 초기화 , tv = 300, com = 400, radio = 500;
	
	MyCart(int money){
		this.money = money;
		this.tv = 300;
		this.com  = 400;
		this.radio = 500;
	}
	
	// 2 . buy(), add(), info() 메서드 오버라이드
	/*
	 * 상품명 "tv","com","radio"
	 * buy(상품명) 기능
	 * 매개변수가 tv , com , radio 라면 금액에서 상품가격을 차감하고, add()메서드를 실행합니다.
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우에는 적절한 처리
	 */
	void buy(String product) {
		
		if(product.equals("tv") && money > 300) {
			System.out.println(product+ "를 구매합니다!");
			money-=300;
			System.out.println("구매후 잔액은 " + money+" 원 입니다");
			add(product);
			
		}else if(product.equals("com") && money > 400) {
			System.out.println(product+ "를 구매합니다!");
			money-=400;
			System.out.println("구매후 잔액은 " + money+" 원 입니다");
			add(product);
			
		}else if(product.equals("radio") && money > 500) {
			System.out.println(product+ "를 구매합니다!");
			money-=500;
			System.out.println("구매후 잔액은 " + money+" 원 입니다");
			add(product);
			
		}else {
			System.out.println("상품을 구매 할 수 없습니다");
		}
	}
	
	
	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart 배열이 꽉 찼다면, 2배 크기의 카트배열로 옮겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	void add(String product) {
				
		
		if(i>=cart.length) {
			String[] cart2 = new String[cart.length*2];			
			for(int a = 0 ;a <cart.length;a++) {
				cart2[a]=cart[a];
			}
			cart2[i] = product;
			cart = cart2;			
		}else {
			cart[i] = product;
		}
		System.out.println(product+"를 카트에 추가합니다");
		i++;	
		
		
		info();
	}
	
	/*
	 * info() 는
	 * cart배열에 담긴 물건 목록만 (null 제외) 출력해주세요.
	 * 
	 */
	
	void info() {
		String result = "";
		for(String a : cart) {
			
			if(a != null) {
				result += a+" ";
			}
		}
		
		System.out.println("카트에 담긴 목록은 : " + result);
		System.out.println("=====================================");
	}
}
