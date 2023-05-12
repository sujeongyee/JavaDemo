package quiz001;
import java.util.Scanner;
public class Quiz15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a= scan.nextInt();
		int count = 0;
		int sum = 0;
		for(int i = 1 ; i <= a ; i++) {
			for(int j = 1 ; j <=i ; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum+=i;
			}
			count=0;
		}
		System.out.println(sum);
		scan.close();
	}

}
