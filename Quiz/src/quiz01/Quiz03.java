package quiz01;
import java.util.Scanner;
public class Quiz03 {
	
	public static void main(String[] args) {
		
		// 키는 140이상, 나이는 8세 이상인 경우만 "놀이기구 탑승 가능"
		
		Scanner scan = new Scanner(System.in);
		
		double cm = scan.nextDouble();
		int age = scan.nextInt();
		
		System.out.println("당신의 키는 : " + cm + "cm\n당신의 나이는 : " + age + "살 이므로" );
		
		if(cm >= 140 && age >=8) {
			System.out.println("놀이기구 탑승 가능");
		} else {
			System.out.println("놀이기구 탑승 불가능");
		}
		scan.close();
	}

}
