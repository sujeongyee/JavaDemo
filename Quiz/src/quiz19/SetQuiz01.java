package quiz19;

import java.util.Random;
import java.util.TreeSet;



public class SetQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 중복되지 않는 6자리 수 (로또번호)
		 * 
		 * 1. Random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또 번호를 저장해주세요
		 */
		
		Random num = new Random();
		TreeSet<Integer> lotto = new TreeSet<>();
		
		while(true) {
			lotto.add(num.nextInt(45)+1);
			if(lotto.size()==6) {
				break;
			}
		}
		System.out.print("로또 번호는 : ");
		for(int b : lotto) {
			System.out.print(b + " ");
		}
		
		
		
		
		
	}

}
