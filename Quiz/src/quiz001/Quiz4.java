package quiz001;
import java.util.Scanner;

public class Quiz4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		if(i==j) {
			
			System.out.println("같은 수 입니다!");
		}else{
			System.out.print("더 큰 수는 ");
			System.out.println(i>j? +i:j);
		}
		
		scan.close();
	}

}
