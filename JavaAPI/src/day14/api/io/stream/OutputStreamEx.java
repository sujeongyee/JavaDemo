package day14.api.io.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
	//	new OutputStream(); 추상클래스임으로 객체 생성 불가
		
		/*
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream 입니다.
		 * 2. 생성자 매개값으로 파일을 쓸 경로가 들어갑니다.
		 * 3. io 패키지 거의 모든 클래스들은 생성자에 throws가 걸려있음
		 * 반드시 예외처리 문장안에서 사용합니다.
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\file\\example.txt";
		//FileOutputStream out = new FileOutputStream(path);
		
		
		try {
			OutputStream out = new FileOutputStream(path);
//			1st
//			out.write(65); // 한글자씩
//			out.write(66);
//			out.write(67);
			
//			2nd
//			byte[] arr = {65,66,67,68,69}; // 배열에 들어있는 데이터를 한번에 씀
//			out.write(arr);
			
//			3rd
			String str = "안녕하세요 저는 박수정입니다"; // 한글쓰지 마세요
			byte[] arr2 = str.getBytes(); 
			out.write(arr2);
			out.close();// 자원해제
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
