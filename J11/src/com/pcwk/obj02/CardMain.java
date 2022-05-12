package com.pcwk.obj02;

public class CardMain {

	public static void main(String[] args) {
		Card c01 = new Card();
		Card c02 = new Card();
		
		
		System.out.println(c01.toString());//Card [kind=SPADE, number=1]
		System.out.println(c02.toString());//Card [kind=SPADE, number=1]
		
		
//		System.out.println(c01.toString());//com.pcwk.obj01.Card@26f0a63f
//		System.out.println(c02.toString());//com.pcwk.obj01.Card@4926097b
	}

}
