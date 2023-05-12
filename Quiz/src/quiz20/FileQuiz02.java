package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class FileQuiz02 {
	
	public static void main(String[] args) {
		
		   /*
	       * 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다
	       * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
	       * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
	       *    \r\n을 적절하게 이용해서 파일 출력을 완료 
	       *    
	       * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
	       */
		// 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다
		
		Date date = new Date();		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);		
		String path = "C:\\Users\\user\\Desktop\\course\\file\\";		
		File file = new File(path+today);
		file.mkdir();
		
		// 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		
		Scanner scan = new Scanner(System.in);
		String tn = scan.next();
		File file2 = new File(path+today+"\\"+tn+".txt");
		
		// 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		
		String result="";
		try (Writer w = new FileWriter(file2);
				BufferedWriter bw = new BufferedWriter(w);){
			while(!result.equals("그만")) {
			result = scan.next();
			bw.write(result+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		
		String result2 = "";
		try(BufferedReader br = new BufferedReader(new FileReader(file2))) {			
			while((result2=br.readLine())!=null) {
				System.out.println(result2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
