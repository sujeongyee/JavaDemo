package quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.Arrays;
import java.util.Collections;
public class Solution {

	static long result;
	public static void solution() {
		/*
		 * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 
		 * 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 
		 * 정수가 담긴 배열 numlist와 정수 n이 주어질 때 
		 * numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 
		 * solution 함수를 완성해주세요.
		 */



	}

	public static void main(String[] args) {

		int[][] board = {{0,0,1,0,0},{0,0,0,0,0}}; // [3][2]
		int[][] board2 = new int [board.length][board[0].length];

		for(int i = 0 ; i < board.length; i++) {
			for(int j = 0 ; j < board[i].length ; j++) {
				if(board[i][j] == 1) {
					board2[i][j] = 1;
					if(i!=0 ) {
						board2[i-1][j] = 1;
						board2[i-1][j+1] = 1;
					}
					if(j!=0) {
						board2[i-1][j-1] = 1;
						board2[i][j-1] = 1;
						board2[i+1][j-1] = 1;
					}
					if(j!=board[i].length-1) {
						board2[i-1][j+1] = 1;
						board2[i][j+1] = 1;
						board2[i+1][j+1] = 1;
					}
				}
			}

		}
		int count = 0;
		System.out.println(Arrays.deepToString(board2));
		for(int k = 0 ; k < board2.length; k++) {
			for(int j = 0 ; j < board2[k].length ; j++) {

				if(board2[k][j]==0) {
					count++;
				}
			}
		}

		System.out.println(count);



	}




}	