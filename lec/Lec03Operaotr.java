package com.kosta.lec;

public class Lec03Operaotr {
	// 클래스 내에는 변수 또는 메소드만 들어옴. 
	// 실행 구문은 메서드 진입점을 통과해 그 안에서만 사용할 수 있음. 
	//          즉, 메소드 안에 있어야 실행이 된다.
	
	
	// 메서드 : 진입점
	public static void main(String[] args) {	
		// 실행 구문들은 main 안에 즉, 메서드 안에서 해야함.
		// 메서드 안에 메서드 넣는게 없다고 할 수 있지만, 사용하면 X
		// 이 영역에서 변수나 실행 구문 사용가능.
		
		boolean status = true;
		System.out.println(!status);	// ! : 부정
		
		int num = 3;
		System.out.println(++num);	// 증감연산
		
		num = 5;
		System.out.println(num/2);	// / : 몫
		System.out.println(num%2);	// % : 나머지
		
		// 대입연산자(할당) = 옵셔너리
		int a = 10;
		int res = a + 5;
		System.out.println(res);
		
		int b = 10;
		// b = b + 5;
		b += 5;					// b = b + 5;를 줄인 것.
		System.out.println(b);
		
		// 비교연산 : 같다 == , 다르다 !=   / [오라클은 = 같다. ""아닌 '' 이걸로 사용]
		int num1 = 10;
		int num2 = 20;
		if(num1 == num2) {
			System.out.println("다르다");
		} else {
			System.out.println("같다");
		}
		
		
		// 증감(전위)
		int i = 5;
		int j = 0;
		j = ++i ; // i 값을 ++ 한 후에 j에 대입(넣는다)된다.
		System.out.println(i+","+j);
		
		// 증감(전위)
		int k = 5;
		int m  = 0;
		m = k++ ; // k값을 먼저  m에 먼저 넣어 대입 후, k를 ++한다.
		// k를 먼저 m에 대입해서 m은 5, 그래서 여기 벗어나면 k는 증감하여 6이 된다.
		System.out.println(m+","+k);
		
		
		// 이항연산자 특징
//		byte c = (byte)a + b;	// error
		
		int cc = (int)a + b;	// 오류 안나게할 수 있는 방법 1
		byte d = (byte)(a+b);	// OK, // 오류 안나게할 수 있는 방법 2	
		System.out.println(cc);
		System.out.println(d);
		
		
		byte b1 = 10;
		byte b2 = 20;
		// byte char short 가감산 연산 시 내부적으로 int 변환 후 연산 --> 결과는 int
		// byte res2 = b1 + b2;		//에러
		int res2 = (byte)(b1+b2) ;
		int res3= (byte) b1+ b2 ;	//에러  byte + int ="
		System.out.println(res2);
		System.out.println(res3);
				
//		char c2 = (캐스팅변환)(합산할 것);
//		int i = 'B' + 'A' ; 	// 아스키 코드로 계산.
		// int보다 작은 애들은 암묵적으로 캐스팅하기 때문에 int로 작업.
		
		// 비트연산 1 0 비교
		//  &(and) | (or) ^(XOR)
		// XOR = ^ , 서로 다른지 확인.
		
		// 논리 연산 : true, false 비교
		//  &&(and) || (or)
		// 결제, 과금, 포스기 할 때 주로 사용. => 신입은 일단 개념은 무조건 알기.
		
		
		// 삼항 연산자
		// 변수타입 변수 = (조건식) ? 식1 : 식2 ;
		// ___타입  변수  = (조건식)? __ : __ ;
		int num3 = 10;
		int num4 = 20;
		String ans = (num3 != num4) ? "다르다" :"같다" ;
		System.out.println(ans);
		
		// A: 90 / B : 80
		char grade1 = 'B';
		int score5 = (grade1 == 'A') ? 90 : 80 ;
		System.out.println(score5);
		
		
		// 연산자 중첩 -- 삼항연산자는 최대 두번 중첩까지만 가능! => 여러개 비교할 거면 if 작업하기.
		// grade = 90 A, grade = 80, grade = 70 C
		char grade2 = 'C';
		int score = (grade2 == 'A') ? 90 : ((grade2 == 'B') ? 80 : 70 ) ;
		System.out.println(score);
		
		
		// 상수 => 대문자, 초기화 값을 넣으면 이후 다른 값을 넣을 수 없다. 재할당 불가능.
		// final 예약어는 이 후 값을 변경이 불가능함을 의미함. 재할당 되지 않음.
		final int MAX = 100;
//		MAX = 200;	// 재할당 시도 --- 에러
		
		// 상수 => 재할당 X, 사용은 가능.
		// MAX 상수에 직접 값을 할당하는 것은 안됨. but, 변수에 넣어서 사용하거나 프린트처럼 실행하는 것은 괜찮다.
		int rssss = MAX + 20 ;	// 다른 변수에 넣는 것은 상관없다.
		System.out.println(rssss);
		System.out.println(MAX + 20); // 할당만 안되고, 프린트는 된다.
		
		

// ==============================================================		
		
		
		// 기출문제 1
		// num 값에 따라 양수, 음수, 0을 출력하는 코드. 3항연사자 사용해서 풀기.
		int num6 = 10;
		String result = (num6 > 0) ? "양수" : ((num6 < 0 ) ? "음수" : "0" ) ; // char 가 아닌 이유? 한자리가 아닌 두글자 이상이라서 String
		System.out.println(result);

		
		// 기출문제 2
		// num의 값 중 백자리 이하를 버리는 코드. 만일 num의 값이 456이라면 '400', 111이라면 100이 된다.
		// 백의 자리만 남기고 출력
		// ex) 456 -> 400 		123 --> 100
		int num7 = 456;
		int num8 = (Math.round((num7/100)*100));
		System.out.println(num8);
	
		
		// by 원혁님
		int quizNum2 = 456;
		int quizNum2X = quizNum2 - (quizNum2 % 100);
		System.out.println("3-4 : " + quizNum2X);

		// by 재훈님
		int tn = 456;						// 456.0 --> 4.56ㄹf		int t = (int) ((float)tn * 0.01f);
		int t = (int) ((float)tn * 0.01f);	// 4
		System.out.println(t * 100);		// 400
		// by 형섭님
		num = 456;
		int rem = num % 100;
		num -= rem;
		System.out.println(num);

		// by 정현님
		int num88 = 456;
		int ans3 = (num88 / 100) * 100;
		System.out.println(ans3);
		System.out.println((num88 / 100) * 100);
		
		// by 허 정님
		int num9 = 456;
        num9 -= 56;		// (quizNum2 % 1100)
        System.out.println(num9);
		
		
	}

}
