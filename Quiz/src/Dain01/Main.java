package Dain01;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int h = scan.nextInt();
       int m = scan.nextInt();
       
       if (h!=0 && m>=45) {
    	   System.out.println(h +" "+(m-45));
       }else if (h!=0 && m<45) {
    	   System.out.println((h-1)+" "+(m+15));
       }else if (h==0 && m>=45) {
    	   System.out.println(h + " " + (m-45));
       }else if (h==0 && m<45) {
    	   h = 24;
    	   System.out.println((h-1) + " "+(m+15));
       }

	}
}
		
