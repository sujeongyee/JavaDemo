package quiz001;
import java.util.Scanner;
public class Quiz10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a =scan.nextInt();
		int b =1;
		while(b<=a) {
			if(b%3==0 || b%4 ==0) {
				System.out.print(b +" ");
			}
			b++;
		}
		scan.close();
	}

}
