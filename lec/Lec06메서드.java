package com.kosta.lec;

public class Lec06메서드 {
	
	// 오버로딩 :: 메소드 정의(준비)
	public static void main(int args) // ------ 구성: 헤더
	{									// --- 그상 : 바디 between{ and } 
		System.out.println("오버로딩 main");
		System.out.println("오버로딩 main");
		System.out.println("오버로딩 main");
		System.out.println("오버로딩 main");
		System.out.println("오버로딩 main");
	}
	
	
	
	/**
	 * void method는 return이 없다.
	 * 즉, 호출 후 void res=myPrint("hello"); <<------ 에러남.
	 * myPrint("hello");
	*/
	public static void myPrint(String prm) {	// 파라미터 = 뭘 줘야하는지, void = 뭘 주는지 확인.
		System.out.println(prm);
	}

	public static void main(String[] args) { // main String[] 타입부터 확인.
		
		// void 는 리턴이 없다.
		myPrint("hello");
		
		// 메서드를 사용 === 메서드 호출 == 메서드를 가져다 쓰겠다. (오버로딩 된 메서드 호출방법.)
		main(7); 	// static method 에서 --> static method 호출  -- 에러남.
	
		// add(1,8); --------에러---------static method -- method
		// add() 메서드에 static 붙이는 방법
		// 클래스 참조변수(new).add();
		
		// public => 공용으로 사용하는 것. + static
		// 인스턴스 개인
		
		Lec06메서드 rv = new Lec06메서드();		// Lec06메서드() => 기본생성자
		int callRes = rv.add(1,8);	// add method에 static을 붙이는 방법. / 두개를 내 주고, 하나를 받기.
//		int callRes;
		System.out.println(callRes);
		/**
		 * 메서드 
		 * 1. static  유무 확인 
		 * 2. 파라미터 타입 및 갯수 + 순서까지 동일한지 확인
		 * 3. return 해주기.
		 */
		
//		System.out.println(rv.add(1, 8));	// 비추...! :: 
//		비추한 이유? print => 1회성 출력. 변수에 담아서 보통 여기 저기 가져다 쓰기 때문에, 바로 1회성 프린트로 넘기면 안됨. 
//		가독을 위해서라도 반드시 변수에 담에서 사용하기.
		
	}
	// int === res
	// int a, b 두개를 주시고, int 두개를 받고 == 호출하면 
	public int add(int a, int b) {	// method에서 public int add 중 사용된 타입 int는 리턴 타입이라고 한다.
		int res = a + b ;	//res = 결과
		// 지역변수라서 다른 메서드에서 사용하라고 주는 것.
		return res;
	}
	

}
