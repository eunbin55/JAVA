/**
* <pre>
* com.pcwk.exception.ex08.userexception
* Class Name : IDFormatExceptionMain.java
* Description:
* Author: ITSC
* Since: 2022/02/21
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/21 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.exception.ex08.userexception;

import com.pcwk.cmn.LoggerManager;

public class IDFormatExceptionMain implements LoggerManager {
	private String userID;
	
	public String getUseID() {
		return userID;
	}


	public void setUseID(String userID) throws IDFormatException {
		//id == null 예외 발생
		if(null == userID) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userID.length()<8 || userID.length()>20) {//!(8 <= id <= 20) 예외 발생
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용하세요.");
		}
		
		this.userID = userID;
		
		
	}


	public static void main(String[] args) {
		IDFormatExceptionMain idFormat = new IDFormatExceptionMain();
		String id = "a123456";
		
		
		try {
			idFormat.setUseID(id);
			
		} catch(IDFormatException e) {
			LOG.debug("IDFormatException : "+e.getMessage());
//			e.printStackTrace();
		}
		LOG.debug("프로그램 종료");
	}

}
//- IDFormatException : 아이디는 8자 이상 20자 이하로 사용하세요.
//- 프로그램 종료

