package com.pcwk.oop03;

public class StaticPractice {

	public static int num = 11;
	
	static {//클래스 초기화 블럭//보통 이렇게 쓰는 경우는 없음. 가능하단것만 알아두기.
		//static 변수의 복잡한 초기화
		System.out.println("클래스 초기화 블럭");
	}
	
	
	
	public StaticPractice() {
		super();
		System.out.println("default생성자");
	}



	public static void say() {
		System.out.println("인스턴스를 생성하지 않고도 사용 가능.");
	}
}
