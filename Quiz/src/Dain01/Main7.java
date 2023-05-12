package Dain01;
import java.util.Scanner;
public class Main7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 4의 배수가 주어진다 20 5번 반복
		int i = 1;
		
		while (n >= i) {
			if(i % 4 == 0) {
			System.out.print("long ");}
			i++;
		}
		System.out.print("int");
		
	}

}
                  