package quiz18;

public class StringQuiz02 {

	public static void main(String[] args) {

		/* 주민번호 검증메서드 masking(String)
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		 * 
		 * 조건
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자
		 * 검증데이터 9501012000000 -> 여자
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */

		try {

			System.out.println(masking("97111034222222"));

		}catch (Exception e){

			System.out.println(e.getMessage());
		}


	}

	public static String masking(String ssn) throws Exception {
		String result = "";
		ssn = ssn.replace("-", "");

		if(ssn.length() != 13) {
			
			throw new Exception("주민번호의 길이가 올바르지 않습니다");
		}
		
		if(ssn.charAt(6) == '1' || ssn.charAt(6) == '2'||ssn.charAt(6) == '3'||ssn.charAt(6) == '4') {			

			if(ssn.charAt(6) == '1'||ssn.charAt(6) == '3'){				
				result=String.join("-",ssn.substring(0, 6),"******")+" -> 남자";			
			}
			else{				
				result=String.join("-",ssn.substring(0, 6),"******")+" -> 여자";
			}
		}else {

			throw new Exception("잘못된 주민번호 입니다!");
		}


		return result;
	}

}
