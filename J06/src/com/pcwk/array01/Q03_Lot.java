package com.pcwk.array01;

import java.util.Arrays;

public class Q03_Lot {

	public static void main(String[] args) {
		int[] ball = new int[45];

		// 1. 숫자 1~45를 할당
		// 2. shuffle 6개 추출

		// 1.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		System.out.println(Arrays.toString(ball));

		//2.
//					 셔플의 강도	
		for (int i=0; i < 6; i++) {
			//0.0<=x<1.0
			//0.0<=x<45.0    => 양변에 45 곱하기
			//(int)0<=x<45
			//0<=x<45
			int n = (int)(Math.random()*45);
//			System.out.println(n);	잘 나오는지 확인
			 
			int tmp = ball[i];//ball[i] 와 ball[n]자리교환
			ball[i] = ball[n];
			ball[n] = tmp;
		}
		//중복되지 않는 6개 숫자
//		System.out.println(Arrays.toString(ball));
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+",");
		}

	}

}











