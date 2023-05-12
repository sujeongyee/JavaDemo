package quiz001;
import java.util.Scanner;
public class Quiz5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(0>a) {
			System.out.println("음수입니다");
		}else if(a==0) {
			System.out.println(a + " 입니다");
		}else {
			System.out.println(a%2==0? "짝수입니다":"홀수입니다");
		}
		scan.close();
	}

}
