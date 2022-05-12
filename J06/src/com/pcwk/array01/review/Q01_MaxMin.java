package com.pcwk.array01.review;

public class Q01_MaxMin {

	public static void main(String[] args) {
//		1. 최대값 변수, 최소값 변수
//		2. 반복문으로 배열요소 1개씩 비교하기

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}

			if(min > score[i]) {
				min = score[i];
			}
			
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);

	}

}
