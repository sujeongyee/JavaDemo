
package day01;

public class Bye {

	public static void main(String[] args) {

		//main이라 쓰고 ctrl + space를 누르면 실행함수가 만들어집니다.
		/* 자동 완성 기능
		 * 저장 : ctrl + s
		 * 실행 : ctrl + F11
		 * 코드 이동 : alt + 방향키
		 * 코드 복사 : alt + ctrl + 방향키
		 * 되돌리기 : ctrl + z
		 * 한줄 삭체 : ctrl + d
		 * 전체 선택 : ctrl + a
		 * 전체 정렬 : 전체 선택 후 , ctrl + i
		 * sysout 적고 ctrl + space : 출력문 자동완성
		 */

		System.out.println(); 
		//sysout 이라 적고 ctrl+space 출력문 자동완성
		
		System.out.println(1); // 숫자 1
		System.out.println("1"); // 문자열 1
		//System.out.println(안녕하세요); 문자는 무조건 "" 안에
		
		
		// 자바의 출력문의 종류 - 3가지 제공
		// 개행문자 \n 가 없는 출력
		System.out.print("hi");
		System.out.print("hi");
		System.out.print("hi\n");
		System.out.print("\n하이하이\n"); // 이런 형태로도 줄바꿈 가능
		// \n은 엔터 개념이다.
		
		// 개행문자를 마지막에 포함해주는 println
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		
		// 형식 지정 출력문 printf (줄바꿈은 안됨) c언어 st
		// 내가 출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식
		/*
		 * %d - 정수를 대입할 수 있음 데시마
		 * %f - 실수를 대입할 수 있음
		 * %s - 문자열을 대입할 수 있음
		 * 
		 *\n - 줄바꿈
		 *\t - 8칸 공백을 잡고 정렬
		 */
		
		System.out.printf("제 이름은 %s 입니다\n", "동뚜");
		System.out.printf("\n원주율은 %f 입니다", 3.14);
		System.out.printf("\n원주율은 %.2f 입니다\n", 3.14); // 소수점 자리 설정 가능
		System.out.printf("오늘은 %d일 입니다\n",7);
		
		// 제 생일은 xxxx년 xx월 xx일 입니다
		
		System.out.printf("제 생일은 \t%d년 %d월 %d일 입니다",1997,11,10);
		
		
		
		
	}
}
