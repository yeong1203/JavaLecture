package com.kosta.lec;

public class Lect04조건문 {

	public static void main(String[] args) {
		
		// -----------------------------------------------------
		// if (조건식) {  문장들  }
		// 오라클에서 if문 같은 것 => CASE ... WHEN _(조건식)__ THEN ... END
		// -----------------------------------------------------
		
	
		// 예문 if ~~ else if ...
		int score = 70;
//		if(score>=90) { // { } 괄호 블럭을 없앨 경우, 맨 마지막 한줄만 출력된다.
//			System.out.println("A");
//			System.out.println("^^");
//		}
		
//		if(score >= 90) {
//			System.out.println("A");
//		} else if(score >= 80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else if(score >= 60) {
//			System.out.println("D");
//		}
		
		
//		if () ~~ else if () ... else ...
//		if(score >= 90) {
//			System.out.println("A");
//		} else if(score >= 80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else if(score >= 60) {
//			System.out.println("D");
//		} else  {
//			System.out.println("F");
//		}

		
		
		// if() ~~  else ...
		if(score >= 90) {
			System.out.println("A");
		} else {
			System.out.println("F");
		}	
		
		// if / else if () 각 조건식 필수		
		System.out.println("---done---");
		
		
		
		// 2024-04-25
		// Switch
//		switch (변수) {
//			case 값:
//				// 수행할 내용
//				break; // 이게 없으면 다음조건 계속 비교, 비교하고 아니면 값이 나오지 않아도 default 값도 함께 나온다.
//			case 값:
//				// 수행할 내용
//				break;
//			
//			default:	// 이걸안쓰면 else를 안쓴것. 그럼 break는 쓰도 그만 안써도 그만
//				디폴트 줄것.
//				break;
//		} 
		
		int scores = 70 ;
		switch(scores) {	
			case 90:	// 조건문은 오지 못하고, 값만 비교할 때 쓰자! 조건문 쓰려면 그냥 if문 사용하기.
				System.out.println("A");
				break;	// --> 이 조건에 맞으면 break걸고 switch문에서 빠져나감.
			case 80:
				System.out.println("B");
				break;
			case 70:
				System.out.println("C");
				break;
			
			default:
				System.out.println('F');
		}
		
		System.out.println("------------");
		
		// and &&
		// or ||
		
		// where job = 'CLERK' and sal > 2000;
		// age 10~19 사이 => 10
		// age 20~29 사이 => 20 이고, 성별이 m이면 100
		// age 30 ~ 39 사이 =-> 30
		// gen = 'm', 'f'
		// 이도 저도 아닌 것은 아니다라고 하
		
		// 중첩 전
		int age = 19;
		char gen = 'm';
		if(age >= 10 && age < 20 && gen == 'm') {
			System.out.println(50);
		} else if (age >= 20 && age < 30 && gen == 'm') {
			System.out.println(100);
		} else if (age >= 30 && age < 40 && gen == 'm') {
			System.out.println(0);
		} else if (age >= 10 && age < 20 && gen == 'f') {
			System.out.println(0);
		} else if (age >= 20 && age < 30 && gen == 'f') {
			System.out.println(0);
		} else if (age >= 30 && age < 40 && gen == 'f') {
			System.out.println(0);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

		// 중첩 
		//int age = 29;
		age=29;
//		char gen = 'm';
		gen='m';
		if( age >= 10 && age < 20 && gen == 'm' || gen == 'f') {
			if(gen=='m') {
				System.out.println(50);
			} else {
				System.out.println(0);				
			}
		} else if( age >= 20 && age < 30 && gen == 'm' || gen =='f') {
			if(gen=='m') {
				System.out.println(100);
			} else {
				System.out.println(0);				
			}
		} else if (age >= 30 && age < 40 && gen == 'm' || gen == 'f' ) { 
			System.out.println(0);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		// ctrl + a => ctrl + i -- 전체 선택 후 들여쓰기. 정렬 정리해줌. 선택 영역 후 ctrl + i 해서 정렬하기.
		
		
		// 강사님 풀이
		// 방법 1 = 성별 먼저에 나이 넣기.
	//		int age = 25;
	//		char gen ='f'
	//		if( gen == 'm' ) {
	//			
	//		} else {
	//			
	//		}
		
	//		if(age>=10 && age<20 ) {
	//			
	//		} else if(age>=10 && age<20 ) {
	//			
	//		} else if(age>=10 && age<20 ) {
	//			
	//		}
	//		성별 구분한 if문을 나이 구분한 if문 안에 다 넣어준다.
		
		// 방법 2 = 나이 사이에 성별 넣기 => 강사님 풀이
		if(age>=10 && age <20) {
			if(gen == 'm') {
				System.out.println(50);
			} else {
				System.out.println(0);
			}
		} else if(age>=20 && age <30) {
			if(gen == 'm') {
				System.out.println(100);
			} else {
				System.out.println(0);
			}
		} else if(age>=30 && age <40) {
			if(gen == 'm') {
				System.out.println(0);
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");			
		}
		// 반드시 if문 안에 if문 추가 시, 다른 부분도 함께 똑같은 형태로 작성. => 코드의 흔들림이 없다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
