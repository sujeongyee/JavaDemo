package quiz001;
import java.util.Scanner;
public class Quiz16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a =(int)(Math.random()*100)+1;
		int count = 0;
		
		a:	while(true) {
			count++;
			int b =scan.nextInt();
			if(a==b) {
				System.out.println("정답입니다!");
				break a;
			}else {
				System.out.println(a<b?"더 작은 수를 입력하세요":"더 큰 수를 입력하세요");
			}
		}
		System.out.println(" 정답 시도 횟수 : "+count + "회");


	}

}
