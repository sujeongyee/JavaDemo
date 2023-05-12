package study02;

import java.util.Arrays;

public class PriceQuiz {

	int cash;
	int sum;

	PriceQuiz(int cash){
		this.cash = cash;
	}

	public int account () {
		int[] coinUnit = {10000, 5000, 1000, 500, 100, 50, 10};
		int[] coin = {2, 4, 0, 5, 5, 5, 5};
		sum = 0;
		for(int i = 0 ; i < coinUnit.length ; i++) { //시재 구하는 for문
			sum+= (coinUnit[i]*coin[i]);
		}		
		return sum;
	}
	public void receipt() {
		System.out.println("==========영수증==========");
		String[] fruit = {"사과", "메론", "바나나", "딸기", "수박", "블루베리", "참외", "포도", "배"};
		int[] price = {4990, 7890, 3990, 14990, 17990, 9990, 1990, 24990, 4590};

		int[] arr = new int[5]; // 중복 안되게 가격 저장할 배열생성
		int sum2 = 0;
		int count2 = arr.length-1; // binarySearch해줘야 해서 뒤 부터 저장
		while(count2>=0) { // 5번 저장해줘야함
			int index = (int)(Math.random()*8); // 
			if(Arrays.binarySearch(arr, price[index]) < 0 ) { // 배열 안에 없는 가격일때만 저장하게
				arr[count2] = price[index];
				count2--;
				System.out.println(fruit[index] + " - " + price[index] +"원");
				sum2+=price[index];
			}
			Arrays.sort(arr);
		}
		System.out.println("========================");
		System.out.println("총액 : " + sum2 + "원");
		System.out.println("========================");
		calculate(this.cash, sum2);


	}

	public void calculate(int money , int total) {
		int[] coinUnit = {10000, 5000, 1000, 500, 100, 50, 10};
		int[] coin = {2, 4, 0, 5, 5, 5, 5};

		System.out.println("받은 돈 : "+money);
		int change = money - total;
		System.out.println("거스름 돈 : " + change);
		System.out.println("===========거스름돈 내역=========");
		
		int[] arr = new int[7]; // 거스름돈 넣어줄 배열 하나 선언
		
		if(change>=sum) {
			System.out.println("사장님 시재 보충해주세요!!!");
			return;
		}else {		
			for(int i = 0 ; i < coinUnit.length; i++) { // 갖고 있는 돈의 단위
				for(int j = coin[i] ; j >=0 ; j--) { // 갖고 있는 개수를 위에서부터 차례로 곱해줄건데
					if(coinUnit[i]*j <= change) { // change보다 작으면 배열에 그 단위의 개수를 넣어준다
						change-=coinUnit[i]*j;
						arr[i] = j;
						break;
					}else if(j==0) { // 개수가 0에 도달하면 그 단위의 개수에 0값을 넣어주기
						arr[i] = j;
					}
				}
			}
			
			if(change>0) { // 잔돈이 남았다면
				System.out.println("사장님 시재 보충해주세요..!");
			}else {
				for(int i = 0 ; i < coinUnit.length ; i++) { // 딱 떨어지면
					System.out.println(coinUnit[i] + "원 : "+ arr[i]+ "장");
				}
			}


		}
	}




}



