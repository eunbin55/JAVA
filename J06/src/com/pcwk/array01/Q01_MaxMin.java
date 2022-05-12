package com.pcwk.array01;

public class Q01_MaxMin {

	public static void main(String[] args) {
//		Q2. 최대값과 최소값 구하기								
//		배열의 요소중 제일 큰 값과 제일 작은 값을 찾는다.								
//		int[] score = {79, 88, 91, 33, 100, 55, 95}
//		1. 최대값 변수, 최소값 변수
//		2. 배열요소를 1개씩 비교해 최대값을 찾는다.
//			배열이 최대값보다 더 크면, max=비교한 배열을 할당
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];//최대값
		int min = score[0];//최소값
		
		for(int i=1; i<score.length;i++) {
			//최대값
			if(max<score[i]) {
				max = score[i];//우항을 좌항에 넣는다는 개념(무조건)
			}
			
			//최소값
			if(min>score[i]) {
				min = score[i];
			}
			
		}
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);

//===============내가 푼 예제=========================		
//		int[] score = {79, 88, 91, 33, 100, 55, 95};
//		int Max = 0; => 변수명은 소문자로 해야함
//		int Min = 0;
//		
//		
//		for(int i=0; i<score.length;i++) {
//			if(score[i]>score[i+1]) {
//				System.out.println(score[i]);
//				
//			}else {
//				System.out.println(score[i+1]);
//				break;
//			}
//		}

	}

}
