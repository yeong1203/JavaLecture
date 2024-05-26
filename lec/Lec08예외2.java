package com.kosta.lec;

public class Lec08예외2 {
	public void myPrint() {
		//  예외는 어디든 한 번 사용되면 그대로 실행하기 때문에 
// -------------------------------------------------------------------------
		try {
			System.out.println("11");
			System.out.println("22");
			// 예외를 만들어 던진다. --> 호출한 놈한테 던진다.
			// 자바의 런타임이 Exception을 받아서 실행해준다.
//			Exception myExc = new Exception();
			ArithmeticException myExc = new ArithmeticException();
			throw myExc;	// throw해서 밖으로 던져버림.
		} catch(Exception e) {
			System.out.println("44");
			System.out.println(e.getClass());
		} finally {
			System.out.println("55");
		}
	}
// -------------------------------------------------------------------------
	public static void main(String[] args) {
		
		System.out.println("----start----");
		Lec08예외2 t = new Lec08예외2();
		t.myPrint();	// 호출한 놈이 throw 해서 받음. 위에서 try~ catch안하면 부른놈이 catch 처리해야함.
		
		System.out.println("myPrint() call done..........");
		
		int res = 0;
		try {
			// 코드라인
			System.out.println("1. Try /실행");
			int num = 100;
			res = num/0;	//--> 문제 되는 코드 			
		} catch(ArithmeticException e) {	// ArithmeticException : 수치형계산 에러시 사용
			// 예외가 발생했을 경우.
			System.out.println("2. catch 발생");
			System.out.println(e.getMessage());	//  결과 : / by zero
			System.out.println(e.getCause());	//	결과 : null
			System.out.println(e.getClass());	//	결과 : class java.lang.ArithmeticException
			// 개발자 예외처리부 코드라인
		} catch(Exception e) {	// Exception 변수명	--- 제일 밑에 와야함.
			// 예외가 발생했을 경우.
			System.out.println("3. catch 발생");
			System.out.println(e.getMessage());	
			System.out.println(e.getCause());	
			System.out.println(e.getClass());
			// 개발자 예외처리부 코드라인
		} finally {
			System.out.println("try-catch-무조건 실행");	
		}
		/**
		 * finally{ } 한 후로 커넥션을 닫아준다.
		 */
		
		
		try {
			System.out.println("4.try (배열코드)");
//			int[] nb = new int[3];
//			int[] nb1 = new int[] {1,2,3};
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
//			for(int a=0; a<=arr.length; a++) {
//				System.out.print(arr[a]);
//			}	
			
		} catch(ArrayIndexOutOfBoundsException e) {	// ArrayIndexOutOfBoundsExceptionn 인덱스
			System.out.println("5. catch 발생");
			System.out.println(e.getMessage());	
			System.out.println(e.getClass());
		} catch(Exception e) {	// Exception 변수명	--- 제일 밑에 와야함.
			// 예외가 발생했을 경우.
			System.out.println("6. catch 발생");
			System.out.println(e.getMessage());	
			System.out.println(e.getClass());
			// 개발자 예외처리부 코드라인
		}
		
		System.out.println();
		System.out.println(res);
		System.out.println("----done----");

	}

}
