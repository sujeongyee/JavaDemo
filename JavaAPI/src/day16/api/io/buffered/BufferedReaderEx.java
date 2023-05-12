package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * BufferedReader는 입력에 대한 성능향상보조스트림 입니다
		 * Reader클래스와 같이 사용됩니다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\file\\text.txt";		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path));) {
//			String result = br.readLine();
//			System.out.println(result); // 한줄씩 읽음
			String result;
			while((result=br.readLine())!=null) {
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
