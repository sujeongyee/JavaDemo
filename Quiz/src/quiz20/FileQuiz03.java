package quiz20;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileQuiz03 {

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
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String fileName = sdf.format(now)+"file";
		String path = "C:\\Users\\admin\\Desktop\\course\\file\\";
		File file = new File(path+fileName);
		file.mkdir();
		
		// 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		InputStream w = System.in;
		Reader fr = new InputStreamReader(w);
		BufferedReader bs= new BufferedReader(fr);
		try {
			String txtName = bs.readLine();
			path= path+"\\"+ fileName +"\\" + txtName+".txt";
			Writer fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
			
			while(true) {
				String line = bs.readLine();
				if(line.equals("그만"))break;
				bw.write(line + "\n");		
				bw.flush();
			}
			bs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		try {
			Reader fr2 = new FileReader(path);
			BufferedReader br = new BufferedReader(fr2);
			
			while(true) {
				String result = br.readLine();
				if (result==null) break;
				System.out.println(result);				
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
