package quiz22;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	
	public static void main(String[] args) {
		
		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,500원";
		
		String pattern1 = "\\d{6}-\\d{7}";
		String pattern2 = "[A-Z]{2}[0-9]{2}";
		String pattern3 = "\\([가-힣]{2,4}[0-9]*단*\\)";
		String pattern4 = "\\d{1},\\d{3}원";
		
		List<String>list = new ArrayList<>();
		list.add(pattern1);
		list.add(pattern2);
		list.add(pattern3);
		list.add(pattern4);
		
		List<String>list2 = new ArrayList<>();
		list2.add(str);
		list2.add(str2);

		for(String a:list2) {
			System.out.println("-----------------");
			for(int i = 0 ; i < list.size() ; i++) {
				Matcher m = Pattern.compile(list.get(i)).matcher(a);
				if(m.find()) {
					System.out.println(m.group());
				}
			}
		}
		
//		System.out.println("-------------------");
//		for(int i = 0 ; i < list.size() ; i++) {			
//			Matcher m = Pattern.compile(list.get(i)).matcher(str);
//			if(m.find()) {
//				System.out.println(m.group());
//			}
//		}
//		System.out.println("------------------");
//		for(int i = 0 ; i < list.size() ; i++) {			
//			Matcher m = Pattern.compile(list.get(i)).matcher(str2);
//			if(m.find()) {
//				System.out.println(m.group());
//			}
//		}
		
		
		
	}

}
