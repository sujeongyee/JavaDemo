package day02;
import java.util.Scanner;
public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("점수 입력 > ");
		int point = scan.nextInt();
		
	// 변수의 연산식이 들어갈 수 있습니다
		switch (point/10) {
		case 9:
			// 제어문 ?
			if(point>=95) {
				System.out.println("A+ 학점입니다");
			} else {
			System.out.println("A 학점입니다");
			}
			System.out.println("상위 10프로네요~!");
			break;
		case 8:
			System.out.println("B 학점입니다");
			break;
		case 7:
			System.out.println("C 학점입니다");
			break;
		case 6:
			System.out.println("D 학점입니다");
			break;
		default:
			System.out.println("재수강 입니다^^!!");
			break;
		}
		
	}

}
