package quiz22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RegexQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1. 버퍼리더를 사용해서 건담.txt를 읽어들입니다
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴분석
		 * Product 객체에 저장하고, 리스트에 저장
		 * 
		 * 3. 외부라이브러리 (POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록 하는 기능
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\file\\건담.txt";
		String filePath = "C:\\Users\\user\\Desktop\\course\\file\\건담.xlsx";
		
		String pattern1 = "\\d{8}-\\d{2}-\\d+";
		String pattern2 = "건담[\\s가-힣]*";
		String pattern3 = "\\[[가-힣A-Z]*\\]";
		String pattern5 = "[0-9,]+원";
		
		List<Product> list2 = new ArrayList<>();
		
		XSSFWorkbook excel = null;
		XSSFRow xRow = null;;
		XSSFCell xCell = null;
		XSSFSheet sheet = null;
		File file = new File(filePath);
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
				FileOutputStream a= new FileOutputStream(file)) {
			
			String str,aa,bb,cc,dd,ee;

			while((str=br.readLine())!=null) {
				dd=str;
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m5 = Pattern.compile(pattern5).matcher(str);
				while(m1.find() && m2.find() && m3.find() && m5.find()) {
					aa = m1.group();
					bb = m2.group();
					cc = m3.group();
					ee = m5.group();
					dd = dd.substring(m3.end(), m5.start()-1);
					Product g = new Product(aa,bb,cc,dd,ee);
					list2.add(g);
				}
			}
			
			excel = new XSSFWorkbook();
			sheet = excel.createSheet("메롱메롱~");
	
			xRow = sheet.createRow(0); // 세로
			xCell = xRow.createCell(0); // 가로
			xCell.setCellValue("날짜");
			xCell = xRow.createCell(1);
			xCell.setCellValue("지점");
			xCell = xRow.createCell(2);
			xCell.setCellValue("등급");
			xCell = xRow.createCell(3);
			xCell.setCellValue("내용");
			xCell = xRow.createCell(4);
			xCell.setCellValue("가격");
			for(int i = 1 ; i < list2.size();i++) {
				xRow = sheet.createRow(i);
				xCell = xRow.createCell(0);
				xCell.setCellValue(list2.get(i).getDay());
				xCell = xRow.createCell(1);
				xCell.setCellValue(list2.get(i).getStore());
				xCell = xRow.createCell(2);
				xCell.setCellValue(list2.get(i).getGrade());
				xCell = xRow.createCell(3);
				xCell.setCellValue(list2.get(i).getDetail());
				xCell = xRow.createCell(4);
				xCell.setCellValue(list2.get(i).getPrice());

			}
			excel.write(a);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
