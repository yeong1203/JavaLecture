package com.kosta.lec;

import java.util.Scanner;	// util에 있는 Scanner를 사용하겠다는 뜻.

public class Lec06String {

	public static void main(String[] args) {

		String msg   = "exit";
		String name2 = "exit";
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println(msg   + "," + System.identityHashCode(msg));
		System.out.println(name  + "," + System.identityHashCode(name));
		System.out.println(name2 + "," + System.identityHashCode(name2));
		
		
		if(msg.equals(name)) {
			System.out.println(11);
		} else {
			System.out.println(22);
		}
		
		/**
		 * msg와 name이 같으면 이라는 조건이지만, 사실 이 조건이 맞지 않다!
		 * 이유?
		 * msg는 String 타입의 변수에 있는 값이지만, name은 new를 하여 새로운 메모리를
		 * 할당 받았고, 거기에 입력되는 값의 주소값을 가지고 있기 때문에 msg와 다르다.
		 * 값으로 같다는 조건을 넣으려면 equals()라는 함수를 사용해야 한다.
		 * 만약 대소문자 구분 하지 않는다고 하면 equals() 말고 equalsIgnoreCase()를 사용해야한다. 
		 */

//		if(msg == name) {
//			System.out.println(11);
//		} else {
//			System.out.println(22);
//		}

	}

}
