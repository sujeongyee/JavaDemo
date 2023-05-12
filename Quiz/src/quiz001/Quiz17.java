package quiz001;
import java.util.Scanner;
public class Quiz17 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] arr= {"+","-"};
		
		int correct = 0;
		int wrong = 0;
		int dap = 0;
		
a :		while(true) {
			System.out.println("----------------");
			int a = (int)(Math.random()*100)+1;
			String b = arr[(int)(Math.random()*2)];
			int c = (int)(Math.random()*100)+1;

			if(b==arr[0]) {
				dap = a+c;
			}else {
				dap = a-c;
			}

			System.out.println(a +b +c +" = ?");
			System.out.println("문제를 그만 푸시려면 0 을 입력하세요.");
			int d =scan.nextInt();

			if(d==0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답 : "+correct);
				System.out.println("오답 : "+wrong);
				break a;
			}else if(d == dap) {
					System.out.println("정답입니다");
					correct++;
				}else {
					System.out.println("오답입니다");
					wrong++;
				}
			}
		scan.close();


	}

}
