package quiz001;
import java.util.Scanner;

public class Quiz3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("키>");
		int cm = scan.nextInt();
		System.out.println("나이>");
		int age = scan.nextInt();
		
		if(cm>=140 && age>=8) {
			System.out.println("놀이기구 탑승 가능");
		}else {
			System.out.println("놀이기구 탑승 불가능");
		}
		
		scan.close();
	}
	
	
	
}