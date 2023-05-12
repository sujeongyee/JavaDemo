package day02;
import java.util.Scanner;
public class BreakEx02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.println("4 X 3 = ?");

			System.out.println("정답 > ");
			int answer = scan.nextInt();

			if(answer == 12) {
				System.out.println("정답입니당!");
				break;
			}else {
				System.out.println("오답입니다. 다시 입력하세요");
			} 
		}
	}

}
