package quiz001;
import java.util.Scanner;
public class Quiz14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //가로길이
		int b = scan.nextInt(); //세로길이
		
		for(int i = 1 ; i <= b ; i++) {
			for(int j = 1 ; j <= a; j++) {
				if(i==1 || i == b || j ==1 || j==a) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		scan.close();
	}
}
