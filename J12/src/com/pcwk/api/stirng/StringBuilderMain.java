package com.pcwk.api.stirng;

public class StringBuilderMain implements LoggerManager{

	public static void main(String[] args) {
		LOG.debug("================");
		//StringBuilder: 가변배열
		
		//String은 char[]로 데이터를 저장한다.
		//배열은 한 번 크기를 정하면 변경 불가.
		//따라서 별도의 가변 배열을 만들어준다.
		
		//동기화되지 않음, 연산 속도 우수
		StringBuilder sb = new StringBuilder();//16
		LOG.debug(sb.capacity());
		sb.append("01_java   \n");
		sb.append("02_oracle   \n");
		sb.append("03_html   \n");
		LOG.debug(sb.capacity());//70 (자동증가됨)
		
		LOG.debug(sb.toString());
		
	}

}
