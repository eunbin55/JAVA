package com.pcwk.array01.review;

import java.util.Arrays;

public class Q04_Sort {

	public static void main(String[] args) {
		int[] numArr = {7, 4, 5, 1, 3};
		
		//sort 전 데이터
		for( int n : numArr) {
			System.out.print(n+",");
		}
		System.out.println();
		
		for(int i = 0; i<numArr.length-1; i++) {
			
			for(int j = 0; j < numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
				}
			
			}
			System.out.println(Arrays.toString(numArr));
			
			
		}
		
	}

}
