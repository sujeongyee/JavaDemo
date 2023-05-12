package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {

	public static void main(String[] args) {

		/*
		 * FileInputStream , FileOutputStream 은
		 * 동영상 , 이미지 파일을 읽거나 쓸때 사용합니다.
		 */
		String readpath = "C:\\Users\\user\\Desktop\\course\\file\\메서드1.mp4";
		String writepath = "C:\\Users\\user\\Desktop\\course\\filecopy\\메서드1_copy.mp4";

		// 향상된 try~catch문
		// Closeable 인터페이스를 상속받은 클래스만 사용이 가능
		// close 작업을 대신 함


		try(InputStream is =new FileInputStream(readpath);
				OutputStream out =	new FileOutputStream(writepath)) {

			//읽음
			byte[] arr = new byte[100];

			int result; 	
			while( ( result = is.read(arr) ) != -1) { // 읽은 값이 -1이 아닐때까지
				// 쓰기
				out.write(arr, 0, result); // arr데이터를 0에서 ~ 바이트 배열의 result까지만

			}

			is.close();
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
//		} finally {
//			try {
//				is.close();
//				out.close();
//			} catch (Exception e2) {
//				System.out.println("파일 close에러");
//			}
//			
//		}





	}

}
