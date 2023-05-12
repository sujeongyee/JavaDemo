package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		List<User> list = new ArrayList<>(); // 배열 대체

		while(true) {

			System.out.println("[1. 등록 | 2. 회원정보확인 | 3.회원정보검색 | 4. 회원정보삭제 | 5. 프로그램종료 ]");
			System.out.println("메뉴(번호)>");

			int menu = scan.nextInt();

			switch (menu) {
			case 1: {
				// 이름, 나이를 입력 받아서 user 객체에 저장, 리스트에 순서대로 추가
				System.out.println("이름 : ");
				String name = scan.next(); 
				System.out.println("나이 :");
				int age= scan.nextInt();

				User u = new User(name,age);
				list.add(u);
				System.out.println("회원 등록 완료!");
				break;
			}
			case 2: {
				// 리스트에 담긴 모든 회원 이름, 나이를 출력
				for(User u2 : list) {
					System.out.println("이름 : "+ u2.getName()+", 나이 : "+u2.getAge());
				}
				break;
			}
			case 3: {
				// 찾을 이름을 새롭게 입력 받아서, 이름이 있다면, 이름과 나이를 출력
				// 조건 - 찾는 이름이 없다면 "~~~는 목록에 없습니다" 출력
				System.out.println("찾을 이름 >");
				String search = scan.next();
				boolean bool = true;
				for(int i = 0 ; i < list.size();i++) {					
					String name = list.get(i).getName();					
					if(name.equals(search)) {
						System.out.println("이름 : "+ name + ", 나이 : "+ list.get(i).getAge() );
						bool = false; // 실행했음
						break;
					}
				}
				if(bool) {
					System.out.println(search + "는 목록에 없습니다");
				}
				break;
			}
			case 4: {
				// 삭제할 이름을 입력 받아서, 이름과 동일한 user객체를 1개만 삭제
				String de = scan.next();
				for(User b:list) {
					if(b.getName().equals(de)) {
						list.remove(b);
						System.out.println(b.getName()+"님의 회원 정보를 삭제 했습니다");
					}
				}
				break;
			}
			case 5: {
				System.out.println("프로그램종료");
				System.exit(0);
				break;
			}
			default:
				System.out.println("메뉴를 잘못 선택했습니다.");
				break;
			}



		}






	}

}
