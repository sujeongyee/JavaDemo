package quiz001;
import java.util.Scanner;
public class Quiz11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = 1;
		int sum = 0;
		while(b<=a) {
			if(a%b==0) {
				sum+=b;
			}
			b++;
		}
		System.out.println("약수의 합 : "+sum);
		scan.close();
	}

}
