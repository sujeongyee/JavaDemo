package quiz01;
import java.util.Scanner;
public class Quiz04 {
	
	public static void main(String[] args) {
		
		// 1. 두 정수를 입력을 받고, 큰 수를 출력 하면 됩니다.
		// 단, 같은 수라면 " 같은 수 입니다" 출력.
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan. nextInt();
		int b = scan. nextInt();
		
		if(a>b) {
			System.out.println("더 큰 수는 : " + a);
		}else if (b>a) {
			System.out.println("더 큰 수는 : " + b);
		}else {
			System.out.println("같은 수 입니다!!!!");
		}
		
		scan.close();
	}

}
