package com.pcwk.oop01.inter;

public class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int divide(int num1, int num2) {
//		return num1 / num2;// 예외발생)by zero: 0으로 나눌 수 없음
		if(num2 != 0) {
			return (int)(num1 / (num2*1.0)) ;
		}else {
			return Calc.ERROR;
		}
	}

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}
	
	public void showInfo() {
		System.out.println("Calc interface구현");
	}
	

}
