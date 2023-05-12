package day03;

import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 학생정보를 등록할 배열을 while 문 바깥에 선언.
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] infoList = new String[100];

		// 고객수
		int count = 0;
		// 조회할 위치
		int index = -1; 

x:		while(true) {

			System.out.println("[정보] 고객수 : " + count + ", 조회위치 : " + index);
			System.out.println("[메뉴]1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료");
			System.out.println("=======================================================================");
			System.out.println("메뉴 입력 > ");
			String menu = scan.next();

			switch(menu) {
			case "1" :
				/* 추가:
				 * 이름, 성별, 간단한정보를 입력받아서 각각의 배열에 순서대로 저장될수 있게 처리합니다.
				 *  count 를 증가합니다
				 */
				System.out.print("이름 > ");
				nameList[count] = scan.next();
				System.out.print("생년월일 > ");
				ageList[count] = scan.nextInt();
				System.out.println("성별 > ");
				infoList[count] = scan.next();

				count++;
				index++;
				break;

			case "2" : 
				/*
				 * 이전 정보 출력:
				 * 정보출력은 index 위치로 출력
				 * 이전 정보출력을 누르면 index를 -1 시키고 해당위치에 정보를 출력.
				 * 조건
				 * index가 0보다 작다면, 출력하지 않도록 처리.
				 */
				if(index<=0) {
					System.out.println("고객 정보가 없습니다");
				}else {
					index--;
					System.out.println(nameList[index]);
					System.out.println(ageList[index]);
					System.out.println(infoList[index]);
				}				

				break;

			case "3" : 
				/*
				 * 다음 정보 출력:
				 * 다음 출력은 index 위치로 출력합니다.
				 * 다음 정보출력을 누르면 index를 + 1 시키고 해당위치에 정보를 출력.
				 * 조건
				 * count-1 보다 index가 같거나 크다면, 츨력하지 않도록 처리.
				 */
				if(count-1 <= index) {
					System.out.println("고객 정보가 없습니다.");
				}else {
					index++;
					System.out.println(nameList[index]);
					System.out.println(ageList[index]);
					System.out.println(infoList[index]);
				}

				break;

			case "4" : 
				/*
				 * 현재 정보 출력 :
				 * index가 가르키고 있는 위치정보를 출력.
				 * 
				 * 조건
				 * 출력 할 수 있는 조건을 생각해서 처리.
				 */
				if(index < count) {
					System.out.println(nameList[index]);
					System.out.println(ageList[index]);
					System.out.println(infoList[index]);
				}else {
					System.out.println("고객 정보가 없습니다");
				}

				break;

			case "5" : 
				/*
				 * 정보 수정:
				 * 새로운 이름, 나이 , 정보를 입력 받아서
				 * 현재 위치의 정보를 수정해주면 됩니다.
				 * 
				 * 조건
				 * 4번과 동일
				 */
				System.out.println("정보 수정!");
				System.out.println("이름 > ");
				nameList[index] = scan.next();
				System.out.println("생년월일 > ");
				ageList[index] = scan.nextInt();
				System.out.println("성별 > ");
				infoList[index] = scan.next();

				break;

			case "6" : 
				/*
				 * 현재 정보 삭제:
				 * 현재 삭제하려는 index부터 ~~~ 뒤에 있는 배열요소를 
				 * 댕겨와서 덮어 씌웁니다.
				 * 사람수 감소
				 * 
				 * 조건 : 4번과 동일
				 */
				if(index >= count ) {
					System.out.println("정보를 삭제 할수 없습니다.");
					break;
				}
				while (index <count) {
					nameList[index] = nameList[index+1];
					ageList[index] = ageList[index+1];
					infoList[index] = infoList[index+1];
					index++;
				}
				count--;
				System.out.println("정보가 삭제 됐습니다");
				index -= count -1;
				//index = index - count +1

				break;

			case "7" : 

				System.out.println("종료됩니다.");

				break x;

			default :
				System.out.println("잘못 입력 했습니다.");
				break;
			}


		}




	}

}
