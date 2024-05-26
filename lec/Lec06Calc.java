package com.kosta.lec;

public class Lec06Calc {
	
	/**
	 * 클래스 새로 생성 => 해당 함수들의 묶음. 즉, 공통들의 엄마와 같음
	 * void / 자료형이 있는데, 
	 * void는 return을 하지 않을때 사용. 
	 * void 없이 하는 것은 return 값을 줄 때, 보통 사용한다.
	 */
	
	
	/**
	 * method Area // 클래스 정보가 들어 있다.
	 * 
	 * 
	 * 
	 * Stack(LIFO) <-> Queue (FIFO)
	 * 
	 * 
	 * 
	 */
	// 가비지 컬렉터가 메모리 수시로 돌아다니면서 사용하지 않는 것을 지워준다.
	
	// 클래스 정보 들어 있다.
	// 클래스 -> 스테틱 붙은애들 따라 오고 -> Card class에서 new 한 애들이 어디서 온것인지 알고 있어야 한다. new 했을 때 올라온 애들을 쓸 수 있다. == 메모리 올라옴.
	// 클래스 붙은 애들은 주소를 가지고 있다. -> 
	// 힙은 각자의 영역주소에 들어온다. ->> 각자의 영역에 new 해서 올때 인스턴스들이 따라 들어오기 때문에 쓸 수 있다.
	
	// 지역변수 메서드 사라질 때 함께 사라진다 --> stack 순서.
	// 메서드 - 장점 : 관리 편하고 사용도 변하기위해서.
	
	
	// stack 구조(== LIFO ) <-> queue 
	public static void main(String[] args) {
		
		Lec06Calc rv = new Lec06Calc();	// rv 변수 == 예약어 금지, 숫자 시작 금지
		int mul = rv.mul(7, 5);
		System.out.println(mul);
		
		String result = add("바","나나");
		System.out.println(result);

	}
	

	// 클래스 메서드
	public static String add(String aa, String bb) {
		String res = aa + bb;
		return res;

	}
	// 인스턴스 메서드
	public int mul(int a, int b) {
		int res = a * b ;
		return res;
		// return은 왠만하면 최소화 하기 => 한번만...!
	}
	

}
