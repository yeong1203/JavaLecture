package com.kosta.lec;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 문제 1
		int x = 2 ;
		int y = 5;
		char c = 'A'; // 'A' : ASCII 코드 65
		System.out.println(y += 10 - x++);	// 13
		// ++ 은 ; 벗어나야 올라간다. 
		System.out.println(x+=5);			// 5
		// ++을 거쳐서 x는 3이다. 그래서 결과값이 5
		System.out.println('C'-c);			// 2
		// 'C'-'A' => 67-65 => (컬퓨터는 인코딩 과정을 거쳐 디코딩하여 결과를 보기 쉽게 만들어 나온다. 결과는 2 / 연산은 글자연산도 int로 뱉는다. ) 
		System.out.println('5'-'0');		// 5	-- 인트로 인식해서 연산이 됨.
		System.out.println(c+1);			// 인트 연산이라서 인트로 뱉어냄 
		System.out.println(++c);	// 전위	-- 포인트 개념으로 이동하는데, c를 찍었 
		System.out.println(c++);	// 후위 -- 숫자로 보고싶으면 int 캐스팅하기. ex. (int)c++ 로 작성하면 아스키 코드로 찍힘
		System.out.println(c);		// charactor를 찍으라고 한것이기 때문에 문자가 나타난다.
		// 전위, 후위는 포인트를 올려라 내려라 하는 것.
		
		
		
		
		
//		내풀이
//		문제 1
//		7 
//		4 
//		2 
//		6 
//		66 
//		67 
//		68
//		'A'
//		-----------------------
//		문제 2
//		4,5		-- 맞췄지롱
//		-----------------------
		System.out.println("-----구분선------");
//		문제 3
		int score = 70;
		
		if (score >= 90) { 
			// 오버로딩 -- 담에 설명 (하나의 클래스에서 다양한 타입들을 설정가능.)
			// 내가 넣은 값을 아웃풋으로 출력해준다.			
			System.out.println('A');
		} else if (score >= 80) {
		  System.out.println('B') ;
		} else if (score >= 70) {
		  System.out.println('C');
		} else {
		  System.out.println('F');
		}
		
		// 다른 풀이
//		char grade = '\u0000';
//		if (score >= 90) {
//			//
//		} else if () {
//			
//		} else if () {
//			
//		} else {
//		
//		}

		// String에 연산을 하지 않는다. 왜냐하면 메모리를 계속 사용함.
		// A+C는 A는 그대로 두고 다른 메모리에 AC를 넣고, 또 AC를 두고 ACD를 둔다.
		// String의 변수에 null을 넣으면, 나중에 return상황 발생시 null이 발생할 위험하다. 그래서 초깃값 blank를 넣어주는게 좋다.
		// sal number(10) default 0, -- 기본값에 null 방지 위해서 넣는거서.
		
		// Oracle
		// ename varchar(10) default ' ', (홑따옴표사용!!!) -- default보다 not null을 주로 사용.
		
		// ename에 null이라고 넣는 방법
		// insert into emp values (1, null, 100); -- 대놓고 null 설정
		// insert into emp values (1, '', 100) ; -- 빈값도 null
		// insert into emp(empno, sal) values (1,100); -- 취급도 안해서 null 

		





	}

}
