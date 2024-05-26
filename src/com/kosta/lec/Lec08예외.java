package com.kosta.lec;
/**
 * 컴파일상 문제, 
 * 런타임(구동시의 문제)에러
 * 			- Exception : 예외
 * 			- Error 	 : 에러
 * 예외처리를 하는 이유?
 * 의도치 않은 에러(문제)가 발생했을 때 프로그램을 정상적으로 끝까지 돌려보려는 목적
 * 
 *  try {
 *  	// 할 일 (정상적인 부분)
 *  } catch (__Exception e) {	// Exception 작은 것부터 시작.
 *  	// 문제 발생시, [예외] 처리 부
 *  } catch (_Exception e) {
 *  
 *  } catch (Exception e) {
 *  
 *  } finally {
 *  	// 정상이든, 예외든 무조건 처리. 즉, 여긴 무조건 실행.
 *  }
 *  
 */

public class Lec08예외 {

	public static void main(String[] args) {
		int res = 0;
		try {
			// 내가 할 일.
			// 코드라인
			System.out.println("1. Try 실행");
			int num = 100;
			res = num/0;	//--> 문제 되는 코드 : 자바는 0으로 나눌 수 없다. 
			// 배열로 3개 돌리고, 문제시 1개 더 추가.
			
//			int[] nb = new int[3];
//			int[] nb1 = new int[] {1,2,3};
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
//			for(int a=0; a<=arr.length; a++) {
//				System.out.print(arr[a]);
//			}
			
		} catch(ArrayIndexOutOfBoundsException e) {	// ArrayIndexOutOfBoundsExceptionn 인덱스
			System.out.println("2. catch 발생");
			System.out.println(e.getMessage());	
			System.out.println(e.getCause());	
			System.out.println(e.getClass());
		} catch(ArithmeticException e) {	// ArithmeticException : 수치형계산 에러시 사용
			// 예외가 발생했을 경우.
			System.out.println("3. catch 발생");
			System.out.println(e.getMessage());	//  결과 : / by zero
			System.out.println(e.getCause());	//	결과 : null
			System.out.println(e.getClass());	//	결과 : class java.lang.ArithmeticException
			// 개발자 예외처리부 코드라인
		} catch(Exception e) {	// Exception 변수명	--- 제일 밑에 와야함.
			System.out.println("4. catch 발생");
			System.out.println(e.getMessage());	
			System.out.println(e.getCause());	
			System.out.println(e.getClass());
		}
		System.out.println();
		System.out.println(res);
		System.out.println("----done----");

	}

}
