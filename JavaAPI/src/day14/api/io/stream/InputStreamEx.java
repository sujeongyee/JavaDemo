package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 읽는데 사용하는 클래스 FileInputStream
		 * 2. 생성자 매개벼수에 읽을 파일의 경로가 들어갑니다.
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\file\\example.txt";

		try {
			InputStream is = new FileInputStream(path);
//			int result = is.read();
//			System.out.println((char)result); // 한글자 읽었다

//			System.out.println(is.read()); 

              //1st
              //read()는 한글자씩 데이터를 읽고 , 더 읽을 값이 없으면 -1 반환
//			while(true) {
//				int result = is.read();
//				if(result == -1) {
//					System.out.println("그만");
//					break;}
//				System.out.println((char)result);
//				}
			//2nd
			//read(배열)

			byte[] arr = new byte[100];
			int result = is.read(arr); // 읽어들인 크기 반환
			System.out.println(result);
			
			int i = 0;
			while(true) {
				if(arr[i]==0) break;
				
				System.out.println((char)arr[i]);
				
				i++;
			}
			
			int result2 = is.read(arr); // 더 읽을 값이 없다면 -1 반환
			System.out.println(result2);
			

//			System.out.println(Arrays.toString(arr));
			is.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}




	}

}
