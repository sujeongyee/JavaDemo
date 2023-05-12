package dain03;

import java.util.Arrays;

public class pro03 {

	public static void main(String[] args) {
		String my_string = "akerfio";
		String result = solution(my_string);
		System.out.println(result);

	}

	static String solution(String my_string) {
		String answer = "";
		String[] arr = my_string.split("");
		System.out.println(Arrays.toString(arr));
		for(int a = 0 ; a < arr.length ;a++) {
			if(arr[a].equals("a")||arr[a].equals("e")||arr[a].equals("i")||arr[a].equals("o")||arr[a].equals("u")) {
				answer += "";
			}else {
				answer += arr[a];
			}
		}

		return answer;
	}

}
