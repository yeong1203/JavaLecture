package com.kosta.lec;

public class Quiz03roofstar {

	public static void main(String[] args) {
		// for문 요약.
		// 1번 for == 행
			// 2번 for == 열
		
//		for(int a=2; a<=6; a+=2) {
//			System.out.println(a+"단");
//			for(int b=2; b<=8; b+=2) {
//				System.out.print(a+"X"+b+"="+(a*b)+"\t");
//			}
//			System.out.println();
//		}
//
//		for(int a=2; a<=6; a+=2) {
//			System.out.print(a+"단"+"\t");
//		}
//		System.out.println();
//		for(int b=2; b<=8; b+=2) {
//			for(int c=2; c<=6; c+=2) {
//				System.out.print(c+"x"+b+"="+(b*c)+"\t");
//			}
//			System.out.println();
//		}
//		
//		// ***** 이렇게 정렬
//		for(int i=0; i<5; i++ ) {
//			System.out.print("*");
//		}
//		
//		// *****을 세로로 정렬
//		for(int a=0; a<5; a++) {
//			System.out.println("*");
//		}
//		
//		// ***** 을 5행 연속 출력
//		for(int a=0; a<5; a++) {
//			for(int b=0; b<5; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<5; i++) {	
//			for(int a=0; a<(i+1); a++) {
//				System.out.print("*");			
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<5; i++) {
//			for(int a=5; a>i; a--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		by 성근님
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(i>= j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		System.out.println("==============================");
//	      *
//	     **
//   	***
// 	   ****
//	  *****
		
//		for(int i=0; i<5; i++) {
//			for(int a=5; a>i; a--) {
//				System.out.print(" ");
//				// 5-0 5-1 5-2 5-3 5-4
//			}
//			for(int a=0; a<(i+1); a++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// by 형섭님  / 추천 => 알고리즘 == 효율적
//		for(int i=4; i>-1; i--) {
//			for(int j=0; j<5; j++) {
//				if(j<i) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//		}
		
//		System.out.println("==============================");
//		 *****
//		  ****
//		   ***
//		    **
//		     *
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<(i+1); j++) {
				System.out.print(" ");
			}
			for(int p=5; p>i; p--) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		System.out.println("==============================");
//		
//		// 루프 는 5개가 맞지만 별을 2개씩 늘려야 하기 때문에 
//		// count 9 또는 10 회, 열 9개 => 
		int num=10;
//		for(int i=10; i<num; i++) {
//			for(int j=0; j<num-(i-1); j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<(2*i+1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < num; i++) 		{
			for (int j = 0; j < num - i - 1; j++) { //빈칸출력
				System.out.print(' ');
			}
			for (int k = 0; k < 2 * i + 1; k++) { // 각 행은 2N+1개 만큼 출력
				System.out.print('*');
			}
			System.out.println("");
		}
//		다른 사람 풀이
		
		System.out.println("==============================");
//		=======================================================
		
		// for문 연습 문제
		// 1~20까지 정수 중 2 또는 3의 배수가 아닌 수들의 총합.  => 73
//		int sum = 0;
//		for(int i=1; i<=20; i++) {
//			if(i%2 != 0 && i%3 != 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//		
//		// 강사님 풀이
//		int tsum = 0;
//		for(int i=1; i<=20; i++) {
//			if((i%2 !=0) && (i%3 != 0)) {
//				tsum += i;
//			}
//		}
//		System.out.println(tsum);
		
		System.out.println("=======================");
		
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을때 
		// 몇까지 더해야 {총합이 100이상}인지
//		tsum = 0;
//		int inum = 1;
//		while(tsum < 100) {
//			if(inum%2 == 1) {	// 홀수
//				tsum += inum ;
//			} else {			// 짝수
//
//				tsum = tsum + (inum * -1);
//			}
//			inum++;
//		}
//		System.out.println(inum -1);
		
		System.out.println("=======================");
		
		// 다음의 for문을 while문으로 변경
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		/** 
		 * for(초기화; 조건문; 증감문) {
		 * 	
		 * }
		 * 
		 * 초기화;
		 * for( ; ;) {
		 * 	 조건문
		 * 	 증감문
		 * }		
		 * 
		 *  초기화;
		 *  while(조건문) {
		 *  	증감문;
		 *  }
		 */
		
//		  int i = 0;
//		  while(i<=10) {
//			  int j = 0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;				
//			}
//			System.out.println();
//			i++;
//		  }
//
//		System.out.println();
//		
//		System.out.println("=======================");
//		
//		//두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력.
//		for(int a=0; a<6; a++) {
//			for(int b=0; b<6; b++ ) {
//				if(a+b == 6) {
//					System.out.println(a+","+b);			
//				}
//			}
//		}
//		System.out.println("=======================");
//		// 강사님 풀이 == 변수없이
//		for(int ju1=1; ju1<=6; ju1++) {
////			System.out.println(ju1);
//			for(int ju2=1; ju2<=6; ju2++) {
////				System.out.println(ju2);
//				if(ju1+ju2 == 6) {
//					System.out.println(ju1+","+ju2);
//				}
//			}
//		}
		
		int a=1;
		do {
			int b=1;
			while(b<=6) {
				if(a+b == 6) {
					System.out.println(a+","+b);
				}
				b++;
			}
			a++;
		} while(a<=6) ;
		
		System.out.println("=======================");
		
		
		// 앞 뒤가 똑같은 수인지 확인하는 것.
		//----------------------------------회문
		// 12321 토마토 기러기 별똥별
//		int number = 777;
//		int tmp = number;
//		int result = 0; 
//		while (tmp != 0) {
//		    int digit = tmp % 10; // 끝자리 하나 빼내는 코드
//		    result = result * 10 + digit; 
//		    tmp /= 10; // 몫을 빼내는 코드
//		} // 1의자리를 꺼내서 계속 *10을 해주는 것. 즉, 100의 자리에 들어간다.
//		if (number==result) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		
		
		
	}

}
