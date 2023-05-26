package study5;

import java.util.Arrays;

public class ArrayException {

	public static void main(String[] args) {

		String[] arr = {"124","245","a415","4874","5ef5","1548"};
		int[] arr2 = new int [arr.length];
		int index = 0;
		int index2 = 0;

		x:		while(index>=arr.length) {


			try {
				arr2[index2] = Integer.parseInt(arr[index]);				
			} catch (NumberFormatException e) {
				try {
					StringBuilder sb = new StringBuilder(arr[index]);
					System.out.println(sb.toString());
					for(int i = 0 ; i < sb.length() ; i++) {
						if(sb.charAt(i)-90>0) {
							System.out.println(sb.charAt(i));
							sb.deleteCharAt(i);
							i--;
						}
					}
					arr2[index2]=Integer.parseInt(sb.toString());
					index2++;
					arr2[index2]=Integer.parseInt(sb.toString());
				}catch(ArrayIndexOutOfBoundsException d) {
					arr2 = Arrays.copyOf(arr2, arr2.length+1);								
					index--;
				}

			}



		}

		System.out.println(Arrays.toString(arr2));



	}

}
