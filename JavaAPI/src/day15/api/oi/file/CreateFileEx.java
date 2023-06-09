package day15.api.oi.file;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {

		/*
		 *  File 클래스
		 *  외부경로에 폴더 or 단순한 파일 생성이나 삭제를 할 수 있습니다.
		 *  
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\file\\20230504";

		try {
			File file = new File(path);

			if(! file.exists()) { // 존재하면 true, 존재하지 않으면 false				
				file.mkdir();// make directory
				System.out.println("폴더생성완료");
			}else {
				System.out.println("이미 폴더가 존재합니다.");
			}

			// 삭제
			if(file.exists()) {
				file.delete();
				System.out.println("폴더삭제완료");
			}else {
				System.out.println("없는 폴더 이구먼유");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		




	}

}
