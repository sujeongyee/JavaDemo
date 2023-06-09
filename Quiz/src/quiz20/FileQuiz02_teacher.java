package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02_teacher {


	public static void main(String[] args) {



		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String str = br.readLine();

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date)+ "file";



		Scanner scan = new Scanner(System.in);
		System.out.println("파일명 > ");
		String fileName = scan.nextLine();


		String filePath = "C:\\Users\\user\\Desktop\\course\\file\\" + now;
		String path = filePath + "\\" + fileName + ".txt"; 

		File file = new File(filePath);
		if(file.exists() == false) {
			file.mkdir();
			System.out.println("폴더생성완료");
		}else {
			System.out.println("이미존재합니다");
		}

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path));
				BufferedReader br = new BufferedReader(new FileReader(path));
				) {

			while(true) {
				System.out.println(">");
				String str = scan.nextLine();
				
				bw.flush();			
				if(str.equals("그만")) {
					System.out.println("종료합니다");
					break;
				}
				bw.write(str + "\n"); // 쓴다
			}
			String result;
			while((result = br.readLine()) != null) {
				System.out.println(result);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}




	}

}
