package com.pcwk.oop01;

public class MyDate {

	private int day;//일
	public int month;//월
	public int year;//년도
	
	public MyDate() {}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		if(month == 2) {
			
			if(day<1 || day >18) {
				System.out.println("일수를 확인하세요.");
			}else {
				
				this.day = day;
			}
		}
		
	}

}
