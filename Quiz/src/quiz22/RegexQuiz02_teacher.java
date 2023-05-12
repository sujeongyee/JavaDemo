package quiz22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02_teacher {

	public static void main(String[] args) {


		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,500원";

		String pattern1 = "\\d{6}-\\d{6}";
		String pattern2 = "[A-Za-z]{2}+25";
		String pattern3 = "[가-힣]+[0-9a-zA-Z]*[\\\\s]*";
		String pattern4 = "[0-9,]+원"; // \\d+,\\d+원

		List<String>list = Arrays.asList(pattern1,pattern2,pattern3,pattern4);
		
		List<String>list2 = Arrays.asList(str,str2);
		

		for(String a:list2) {
			System.out.println("-----------------");
			for(int i = 0 ; i < list.size() ; i++) {
				Matcher m = Pattern.compile(list.get(i)).matcher(a);
				if(m.find()) {
					System.out.println(m.group());
				}
			}
		}
		
		/*
		 * for(String s : list){
		 * Matcher m1 = Pattern.compile(pattern1).matcher(s);
		 * Matcher m2 = Pattern.compile(pattern2).matcher(s);
		 * Matcher m3 = Pattern.compile(pattern3).matcher(s);
		 * Matcher m4 = Pattern.compile(pattern4).matcher(s);
		 * 
		 * if(m1.find() && m2.find() && m3.find && m4.find){
		 * System.out.println(m1.group);
		 * System.out.println(m2.group);
		 * System.out.println(m3.group);
		 * System.out.println(m4.group);
		 * }
		 * }
		 */





	}



}
