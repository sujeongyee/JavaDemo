package day10.static_.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		String[] arr = {"안녕" , "Hi", "Hello","ni hao"};
		int[] arr2 = {1,5,8,7,9,10};
		char[] arr3 = {'a','b','c','d'};
		//MyArrays.printArray(arr);
		//MyArrays.printArray(arr2);
		//MyArrays.printArray(arr3);
		
		System.out.println(MyArrays.printArray(arr));
		System.out.println(MyArrays.printArray(arr2));
		System.out.println(MyArrays.printArray(arr3));
		
		
		// 클래스가 여러번 로드 되더라도 static은 단 한번 실행됨
		
		System.out.println(Init.price);	
		System.out.println(Init.price);	
		System.out.println(Init.price);	
		System.out.println(Init.price);	
		System.out.println(Init.price);	
		System.out.println(Init.price);	
		System.out.println(Init.price);	
		System.out.println(Init.price);	
		System.out.println(Init.price);	
	
	}

}
