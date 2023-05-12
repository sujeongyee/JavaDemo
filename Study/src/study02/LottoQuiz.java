package study02;

import java.util.Arrays;
import java.util.Scanner;

public class LottoQuiz {

	public static void main(String[] args) {

		/* 1. 복권을 구매하러 왔습니다. 구매한 복권의 번호를 출력합니다.
		 * (복권 숫자는 랜덤입니다. 범위는 1~45 까지 입니다!)
		 * (Random 클래스는 API 주제여서 사용하진 않았으나, 사용하셔도 됩니다.)
		 * 2. 이번 주 당첨 번호를 출력하고
		 * 3. 내가 산 복권번호와 이번주 복권 번호를 비교해서
              꽝인지, 당첨이 됐는지 출력해봅시다.
              (당첨 유무 출력은 자유롭게 해주셔도 됩니다!)
              4. 단, 복권을 구매할 때 수동으로 번호 3개를 지정합니다.
              (수동으로 3개, 자동으로 3개 출력되면 됩니다.)
              ex. lotto(3,7,10);	
              출력시 -> [3,7,10,39,36,43]
		 */	
		Scanner scan = new Scanner(System.in);
x:		while(true) { // 당첨되면 끝남!
			
			System.out.print("수동으로 구매할 로또 번호 : "); // 수동 3개 입력 받기
			int a= scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			System.out.print("구매한 로또 번호 : ");
			int[] arr = lottoBuy(a,b,c);

			System.out.print("이번 주 로또 번호 : ");
			int[] arr2 = lottoNum();

			int count = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				if(Arrays.binarySearch(arr2,arr[i])>0) { // 같은 값이 몇개 있는지 count 해주고 당첨여부
					count++;
				}
			}
			switch(count) {
			case(6) : System.out.println("1등 당첨입니다! 축하합니다!");
			break x;
			case(5) : System.out.println("2등 당첨입니다! 축하합니다!");
			break x;
			case(4) : System.out.println("3등 당첨입니다! 축하합니다!");
			break x;
			case(3) : System.out.println("4등 당첨입니다! 축하합니다!");
			break x;
			case(2) : System.out.println("5등 당첨입니다! 축하합니다!");
			break x;
			default : System.out.println("꽝입니다! 다음 기회에..");
			}

			System.out.println("--------------------------------");
		}

	}

	public static int[] lottoBuy (int a,int b,int c) {  // 내가 산 로또 번호 출력
		int[] arr = new int[6];

		arr[0] = a;
		arr[1] = b;
		arr[2] = c;

		for(int i = 2 ; i >=0  ; i--) {	// 매개 값으로 지정해준 수동 로또 번호 제외하고 3개의 랜덤 번호 생성		
			while(true) {
				int d = (int)(Math.random() * 45)+1;
				Arrays.sort(arr); // binarySearch 하려면 Arrays.sort사용 자동으로 큰값들이 뒤로
				if(Arrays.binarySearch(arr, d) < 0) { // 없는 숫자라면 -1을 반환 , 값을 넣어주면 while문 탈출
					arr[i] = d;
					break;
				}
			}			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		return arr;

	}

	public static int[] lottoNum() { //당첨 번호 출력
		int[] arr2 = new int[6];

		for(int i = 5 ; i >= 0 ; i--) {//6개의 랜덤 번호 생성
			while(true) {
				Arrays.sort(arr2);
				int d = (int)(Math.random() * 44)+1;				
				if(Arrays.binarySearch(arr2, d) < 0) { // 없는 숫자라면 -1을 반환
					arr2[i] = d;
					break;
				}
			}			
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		return arr2;

	}


}
