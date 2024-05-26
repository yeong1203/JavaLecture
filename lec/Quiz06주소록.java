package com.kosta.lec;


import java.lang.*;	// 제일 높은 lang이 기본제공으로 올라온다.
import java.util.Scanner;	// 사용자에게 입력받은 것을 사용하겠다는 것.

public class Quiz06주소록 {

	public static void main(String[] args) {
		/**
		 * for => 횟수가 정확하게 있을 때,
		 * while => 증감문은 선택(옵션) 필요할때만
		 * do~while => 단 한번 무조건 실행 후 조건
		 * 
		 * 스트링 리터럴 => 상수리터럴 파일에 따로 저장되기 때문에 동일 값인 것들은 주소가 동일하다.
		 * 스트링 리터럴은 같다는 비교 값은 ==
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);	// System.in = 스캐너에 있는 inputstream??
//
//		System.out.println("이름은?");
//		String name = sc.nextLine();
//
//		System.out.println("나이는?");
//		int age = sc.nextLine();	// 바로 int로 넣을 수 있음.
//		System.out.println(name + "\t" + age);
		
		String run = "exit";
		while(true) {
			System.out.print("이름은? ");
			String name = sc.nextLine();	// nextLine()은 한줄 다 읽는 것.
			if(name.equals(run)) {	
				// name.equalsIgnoreCase("exit") == 대소문자 구분 없이 할 때,
				break;
			} 
			System.out.println("전화번호:");
			String age = sc.nextLine();
			System.out.println(name + "\t" + age);
		}
		
		System.out.println("---done---");
//		-------------------------------------------------
		// 캐스팅 :: 참조타입(String)을 기본타입 int로 변경할 수 있나?
		// String res = (int) str;
//		int numAge = Integer.parseInt(age);	// 기본타입
//		System.out.println(numAge+2);
//		--------------------------------------------------
//		int num = sc.nextInt();
//		System.out.println(num+2);
		
		
	}

}
