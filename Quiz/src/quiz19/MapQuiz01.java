package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) {
				System.out.println("등록할 메뉴 정보를 입력해주세요");
				
				System.out.println("메뉴 이름 >");
				String name = scan.next();
				System.out.println("메뉴 가격 >");
				int price = scan.nextInt();
				
				if(!map.containsKey(name)) {
					map.put(name, price);
					System.out.println("정상 입력되었습니다!");
				}else {
					System.out.println("이미 등록된 메뉴입니다");
				}
				
			} else if(menu == 2) { //메뉴판 전체 보기
				
				Set<String> list =map.keySet();
				for(String a: list) {
					System.out.print("메뉴 : " + a + " - ");
					System.out.println(map.get(a) + "원");
				}
				/*
				 * Set<Entry<String,Integer>> entrySet = map.entryset();// 안써도 됨
				 * Iterator <Entry<String,Integer>> iter = entrySet.iterator(); // 안써도 되긴 함
				 * for(Entry<String,Integer> entry : map.entrySet()){
				 * 		System.out.println("메뉴 : " + entry.getKey() + ", 가격 : " + entry.getValue());
				 * }
				 */
				
			} else if(menu == 3) {// 메뉴판 수정
				System.out.println("변경할 메뉴를 입력해주세요");
				String name = scan.next();
				if(map.containsKey(name)) {
					System.out.println("변경할 가격을 입력해주세요");
					int price = scan.nextInt();
					map.put(name, price);
					System.out.println("변경 완료");
				}else {
					System.out.println("변경할 메뉴가 없습니다");
				}
				
			} else if(menu == 4) { //삭제
				System.out.println("삭제할 메뉴를 입력해주세요");
				String name = scan.next();
				if(map.containsKey(name)) {
					map.remove(name);
					System.out.println("메뉴 삭제 완료");
				}else {
					System.out.println("삭제할 메뉴가 존재하지 않습니다");
				}
			} else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			}

		}


	}
}
