package quiz18;

import java.util.Scanner;

public class StringQ01 {
	
	public static void main(String[] args) {
		
		/*
		 * 스캐너를 사용해서 id를 입력 받습니다.
		 * 아이디는 공백을 포함해서 받을 수 있습니다. nextLine()
		 * 
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력 받습니다.
		 * 5글자 이상이라면 "id가 등록되었습니다" 출력후 종료
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		String id = "";
		while(true) {
			id = scan.nextLine();
			if(id.replace(" ", "").length() <5) {
				System.out.println("다시 입력하세요");
			}else {
				System.out.println("아이디가 등록되었습니다");
				break;
			}
		}
		System.out.println("등록된 아이디 : " + id);
		
		
		
	}

}
