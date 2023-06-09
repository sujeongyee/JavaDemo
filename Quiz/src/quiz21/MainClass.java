package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {

		// 지역명,규모구분,연도,월, 분양가격 - > 1행 x 4800개

		/*
		 * 1. 버퍼리더 이용해서 한줄씩 읽습니다.
		 * 2. split(",",5); 를 사용해서 Data객체에 한줄 단위로 저장을 하고
		 * 3. List <Data> 에 하나씩 추가를 합니다.
		 * 
		 * 4. 람다식을 이용해서 지역 : (서울, 4분기중 9~12월, 분양가격 : 2000 이상)인 객체만 뽑아서
		 * 새로운 리스트로 반환 
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\file\\주택도시보증공사_전국 평균 분양가격.csv";
		List<Data> ld = new ArrayList<>();
		Data d = new Data();
		try(BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(path),"EUC-KR"))) {
			String result ;
			r.readLine(); // (제목행) 한번 넘어감
			while((result = r.readLine())!=null) {
				String[] arr = result.split(",",5);
				arr[4]=arr[4].replace(",", "").replace("\"", "");
				d = new Data(arr[0],arr[1],arr[2],arr[3],arr[4]);
				ld.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	

//		List<Data> list = ld.stream().filter(a -> a.getRegion().equals("서울")).
//				filter(b-> Integer.parseInt(b.getMonth()) > 8 && Integer.parseInt(b.getMonth()) < 13 )
//				.filter(c -> Integer.parseInt(c.getPrice())>= 2000 )
//				.toList();
		
		List<Data> list = ld.stream().filter(a -> a.getRegion().equals("서울") && Integer.parseInt(a.getMonth()) > 8 && Integer.parseInt(a.getMonth()) < 13 && Integer.parseInt(a.getPrice())>= 2000).toList();


		
		for(Data a : list) {
			System.out.println("지역 : "+a.getRegion()+", 규모구분 : " +a.getSize()+", 연도 : "+a.getYear()+", 월 : "+a.getMonth()+", 분양가격: "+a.getPrice());
		}



	}

}
