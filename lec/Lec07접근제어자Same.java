package com.kosta.lec;

public class Lec07접근제어자Same {
	public int samePublicPoint = 100;
	
	protected int sameProtectedPoint = 222;
	
			int sameDefaultPoint = 333;
			
	private int samePrivatePoint = 444;		
	/**
	 * private의 값을 줘야하는 경우가 있을 수 있다.
	 * 가져갈 수 있게 해주는 방법.
	 * public 리턴타입 get메소드명() {
	 * 		return this.변수명;
	 * }
	 */
	public int getSamePrivatePoint() {
		return this.samePrivatePoint;	// return 값을 this. 
	}
	
}
