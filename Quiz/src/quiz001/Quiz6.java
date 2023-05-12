package quiz001;
import java.util.Scanner;
public class Quiz6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		
		if(a>b && a>c) {
			max=a;
			if(b>c) {
				mid = b; min = c;
			}else {
				mid =c ; min =b ;
			}
			
		}
		if(b>a && b>c) {
			max= b;
			if(a>c) {
				mid = a; min = c;
			}else {
				mid = c; min = a;
			}
		}
		if(c>a && c>b) {
			max=c;
			if(a>b) {
				mid= a; min=b;
			}else {
				mid= b; min =a;
			}
		}
		
		System.out.printf("max : %d, mid : %d, min : %d",max,mid,min);
		scan.close();
	}

}
