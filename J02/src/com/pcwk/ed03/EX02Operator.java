/**
 * ��Ű��: com.pcwk.ed03
 * ���� : EX02Operator.java	
 * �ۼ���: ITSC
 */
package com.pcwk.ed03;

/**
 * @author ITSC
 *
 */
public class EX02Operator {
//	���� ������										
//	1��ŭ ���ϰų�, 1��ŭ ���� ���										
//	���� ��/�� ��ġ�� ���� ������ ����� �޶����� ����										

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore01 = ++gameScore;
		System.out.println("lastScore01:"+lastScore01);
		
		int lastScore02 = --gameScore;
		System.out.println("lastScore02:"+lastScore02);
		
		int lastScore03 = gameScore++;
		System.out.println("lastScore03:"+lastScore03);
	
		int lastScore04 = gameScore--;
		System.out.println("lastScore04:"+lastScore04);
		
	}

}
