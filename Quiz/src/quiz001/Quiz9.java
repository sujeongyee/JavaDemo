package quiz001;
import java.util.Scanner;
public class Quiz9 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = 1;
		System.out.println("구구단"+a+"단");
		while(b<10) {
			System.out.println(a + "x" + b + " = "+(a*b));
			b++;
		}
		scan.close();
	}

}
