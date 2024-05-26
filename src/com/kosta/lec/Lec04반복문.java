package com.kosta.lec;

public class Lec04반복문 {

	public static void main(String[] args) {
/**	
 	초기화 int i = 0
 	조건문 i<=3
 	증감문 i++  / i = i+1 / i += 1  (3개모두 같은 말) 
 	
 	for(초기화; 조건문; 증감문) {
 	
 	}
 	
 	초기화;
 	while(조건문) {
 		증감문;
 	} 
 	// while은 break를 항상 생각해야함.
 	
 	초기화;
 	do {
 		증감문;
 	} while(조건문)
 	=> do~while 문은 일단 한 번 실행하고 보는 것. / 무조건 주고 시작할 때 사용.
 	
 */

//	 	for(초기화; 조건문; 증감문) {
//	 	 	
//	 	}
		
//
//		/*// 동작 방법 == for문의 원리 ==> 초기화는 밖에 있어도 돌아간다.
//		 int i = 0;
//		 for (  ; i <=3 ;  ) {
//		 	system.out.println(i);
//		 	i++;
//		 }
//		 
//		 // 조건도 빼고 작성한다고 하면,
//		 int i=0;
//		 for ( ;  ; ) {
//		 	
//			i++;
//		 }
		
//		*/
//		for(int i = 0; i<=3; i++) {
//			System.out.println(i);
//		}
//		
//		
//		// debug f5 f6 f7 f8 => 디버그 단축키, f6은 눈에 보이는 부분 을 보여주고, 더 깊게 보려면 f7, f8은 디버깅 종료
//		debug
//		f5 - 들여쓰기 라인위로 이동.
//		f6 - 다음 같은 라인 이동 == 같은 선상은 F6
//		f7 - 들여쓰기 처럼 들어갔다가 그 라인 해당하는 위쪽 바깥라인으로 나온다. 즉 들여쓴 곳 바로 바깥라인으로 => 들어갔다가 빠져나오는 것.
//		f8 - debug exit

		
//		 while(조건문) {
//			// Todo
//		 }
//		int i = 0;	// 선언과 동시에 초기화. while은 초기화문 밖에서 작업
//		while(i<=3) {
//			System.out.println(i);
//			i++;
//		}
//		-------------------------------------------------------

//		
//		// do-while 문
//		// do {
//		//	// 할 일 = Todo
//		// } while(조건문) ;
//		// 
//		i = 0; // 재할당한 것. int 빼기 = 선언하는 것이라서 두번 하지 말기.
//		do {
//			System.out.println(i);
//			i++;
//		} while(i<=3) ;
//		
/**
		무한루프 => 아래 3가지는 초기화,조건,증감 모두 없어서 무한루프
		
		for(;;) {
			System.out.println();
		}
		while(true) {
			//
		}
		do {
			//
		} while(true) ;
*/		
//		------------------Quiz---------------------------
		
//		// 0부터 시작해서 0,2,4,6,8 출력하는 프로그램을 작성하시오.
//		
//		for( int i=0; i<= 8; i++ ) {
//			if(i%2 == 0) {
//				System.out.print(i+" ");
//			} 
//		}
//		
//		/*
//		 1. 다른풀이
//		  for(int i=0; i<=8; i+=2) {
//		  	System.out.print(i+" ");
//		  }
//		  
//		  2. for(int num=0; num<5; num++) {
//		  	System.out.println(num*2)
//		  }
//		  
//		*/
//		
//		
//		System.out.println("\t");
//		
//		int i = 0;
//		while(i<=8) {
//			if(i%2==0) {
//				System.out.print(i+" ");
//			}
//			i++;
//		}
//		/*
//		 1. 다른풀이
//		 int i = 0 ;
//		 while(i<=8) {
//		 	System.out.print(i+" ")
//		 	i+=2;
//		 }
//		 
//		 2. 다른풀이
//		 int num =0;
//		 while(num<=4) {
//		 	System.out.println(num*2);
//		 	num++;
//		 }
//		 */
////		System.out.println("/n"+i);	  -- ln 은 줄바꿈이란 뜻.
//		
//		
//		System.out.println("\t");
//		
//		i = 0;
//		do {
//			if( i%2 == 0 ) {
//				System.out.print(i+" ");
//			} 
//			i++;
//		} while(i <= 8) ;
//
//		/* 다른 풀이
//		 i=0;
//		 
//		 
//		 2. 다른풀이
//		 num =0;
//		 do {
//		 	System.out.print(num*2+"\t");
//		 	num++
//		 } while(num<=4) ;
//		 
//		 */
//		
//		
		
		// --------------- 중첩 루프문 (구구단)
		// 구구단. 2~5단
		// 2/4/6단, 2/4/6/8 곱
		/**
		 	기본출력
			for(int d=2; d<=6; d+=2) {
				System.out.println(d+"단");
				for(int g=2; g<=8; g+=2) {
					System.out.println(d+"X"+g+"="+(d*g));
				}
				System.out.println(" ");
			}
		
		*/
		
		// 행으로 정렬
		for(int dan=2; dan<=6; dan+=2) {
			System.out.println(dan + "단");
			for(int gob=2; gob<=8; gob+=2) {
				System.out.print(dan+"*"+gob+"=" + (dan*gob)   +"\t" );
			}
			System.out.println();
		}		
	

		// 열로 정렬
		for(int dan=2; dan<=6; dan+=2) {
			System.out.print(dan+"단"+"\t" );
		}
		System.out.println();
		
		for(int gob=2; gob<=8; gob+=2) {
			for(int dan=2; dan<=6; dan+=2) {
				System.out.print(dan+"*"+gob+"=" + (dan*gob)   +"\t" );
			}
			System.out.println();
		}
		
		
		// for문 요약.
		// 1번 for == 행
			// 2번 for == 열
		
		// *****
		for(int i=0; i<5; i++ ) {
			System.out.print("*");
		}
		
		// for 
	}

}
