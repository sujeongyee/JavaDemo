package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 통해서 파일명을 입력 받습니다.
		 * 
		 * 2. 입력받은 파일을 filecopy로 복사해서 옮겨주면 됩니다.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		String fileName =  "C:\\Users\\user\\Desktop\\course\\file\\";
		String copyName = "C:\\Users\\user\\Desktop\\course\\filecopy\\";


		try(InputStream is =new FileInputStream(fileName+name);
				OutputStream os = new FileOutputStream(copyName+"copy_"+name)){
			byte[]arr = new byte[100];
			while((is.read(arr)) != -1) {
				os.write(arr);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
