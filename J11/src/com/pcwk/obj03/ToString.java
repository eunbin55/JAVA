package com.pcwk.obj03;

public class ToString {

	public static void main(String[] args) {
		String str = new String("KOREA IT");
		
		//toString()이 문자열이 반환되도록 오버라이딩 되어있다.
		System.out.println(str);
		System.out.println(str.toString());

//		toString() 날짜 문자열이 반환 되도록 오버라이딩 되어있다.
		java.util.Date today = new java.util.Date();//import없이 클래스를 사용
		System.out.println(today);
		System.out.println(today.toString());
		
	}

}
//KOREA IT
//KOREA IT
//Thu Feb 17 11:07:52 KST 2022
//Thu Feb 17 11:07:52 KST 2022
