package quiz01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Solution {

	static long result;
	public static void solution() {
		/*
		 * 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 
		 * 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다. 
		 * 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, 
		 * k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
		 */

	}

	public static void main(String[] args) {

		int a = 7;
		int b = 20;
		int min = a<b? a:b;
		int max = 0;
		for(int i = 1 ; i <= min ; i++) {
			if(a%i==0 & b%i==0) {
				max = i;
			}
		}
		System.out.println(max);
		
		int result = b/max;
		while(true) {
			if(result % 2 == 0) {
				result/=2;
			}else if(result% 5 ==0) {
				result/=5;
			}else {
				result = 0;
				break;
			}
		}
		
		System.out.println(result);
		





	}

}	