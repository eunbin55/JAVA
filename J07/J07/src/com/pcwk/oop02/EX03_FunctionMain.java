package com.pcwk.oop02;

public class EX03_FunctionMain {

	public static void main(String[] args) {
		int first = 11;
		int second = 13;
		
		int sum = add(first, second);
		System.out.println(first + "+"+second +"="+sum);

		int substract = subtract(first, second);
		System.out.println(first + "-"+second +"="+substract);
		
		int multi = multiply(first, second);
		System.out.println(first + "*"+second +"="+multi);
		
		double d1 = divide(first, second);
		System.out.println(first + "/"+second +"="+d1);
		
		
		
	}
//	나누기
//	
//	public static 리턴형 함수이름(파람1,파람2) {
//		return
//	}
	/**
	 * 나누기
	 * @param num1
	 * @param num2
	 * @return num1 / num2
	 */
	public static double divide (double num1, double num2) {
//		public static double divide (int num1, int num2) {
//			return num1 / (1.0*num2);
//		}
		return num1 / num2;
	}
	
	/**
	 * 곱하기
	 * @param num1
	 * @param num2
	 * @return num1 * num2
	 */
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	/**
	 * 빼기
	 * @param num1
	 * @param num2
	 * @return num1 - num2
	 */
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	/**
	 * 두 수 더하기! 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int add(int num1, int num2) {
		int result = 0;
		
		result = num1 + num2;
		
		
		return result;
	}
	
}
//11+13=24
//11-13=-2
//11*13=143
//11/13=0.8461538461538461

