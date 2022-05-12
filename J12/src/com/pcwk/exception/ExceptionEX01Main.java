package com.pcwk.exception;

import com.pcwk.api.stirng.LoggerManager;

public class ExceptionEX01Main implements LoggerManager{

	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		
		for(int i = 0; i <= 20; i++) {
			//0.0 <= x < 1.0
			result = number / (int)(Math.random()*10);
			LOG.debug("result: "+result);
			
		}
		LOG.debug("프로그램 종료!");//프로그램이 비정상 종료!(여기까지 내려오지 않음)
		
	}

}
//2022-02-18 15:34:18,676 DEBUG [main] stirng.LoggerManager (ExceptionEX01Main.java:15)     - result: 12
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.pcwk.exception.ExceptionEX01Main.main(ExceptionEX01Main.java:14)
