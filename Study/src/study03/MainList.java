package study03;

import java.util.Arrays;

public class MainList {
	
	public static void main(String[] args) {
		
		// 랜덤 배열 생성 (int)
		int is = (int)(Math.random()*15) + 5;
		int[] arr = new int[is];
		for(int i = 0 ; i < is ; i++) {
			arr[i]= (int)(Math.random()*100 + 1);
		}
		// 랜덤 배열 생성 (char)
		int cs = (int)(Math.random()*15) + 5;
		char[] arr2 = new char[cs];
		for(int i = 0 ; i < cs ; i++) {
			arr2[i]= ((char) ((int) (Math.random() * 26) + 65));
		}
		
		
		Ascending a = new Ascending();
		a.make(arr);
		a.make(arr2);
		
		Descending d = new Descending();
		d.make(arr);
		d.make(arr2);
		
		
	}

}
