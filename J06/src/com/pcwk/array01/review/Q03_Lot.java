package com.pcwk.array01.review;

import java.util.Arrays;

public class Q03_Lot {

	public static void main(String[] args) {
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		System.out.println(Arrays.toString(ball));

		for (int i = 0; i < 6; i++) {
			int n = (int) (Math.random() * 45);
//			System.out.print(n);
			
//			0.0<=x<1
//			0<=x<45
			
			
			int tmp = ball[i];
			ball[i] = ball[n];
			ball[n] = tmp;
		
		}
		
//		System.out.println(Arrays.toString(ball));
		for(int i = 0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
	}

}
