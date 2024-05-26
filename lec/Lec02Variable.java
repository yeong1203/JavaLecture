package com.kosta.lec;

// /**/
// /** doc / api 문서 만들때 쓰는 주석*/

// Access Modifier (접근자) 
// public  (default)  protect  private
public class Lec02Variable {
	// 안에서 표현할 수 있는 것도 객체
	// = 객체 (Object) =~ 인스턴스(instance, 메모리에 할당된 객체. = 주소값을 가지고 있는 객체 = 인스턴스화)
	// = 변수 (variable) : 값
	// = 메서드 (method) : 일반 함수 / 기능
	// = 함수(function): '생성자함수'만 함수라고하고 나머지 함수는 메소드

	static String cv;	// 전역변수
	
	public static void main(String[] args) {
//		System.out.println("hello"); // ctrl+space+enter 단축
		// char(고정- 무조건 그 길이만큼 작성을 해야하는 것.) 
		// varchar2(가변)
		// 타입 변수명; 	int age ;	 = 변수 선언
		// 타입 변수명=20; int age=20;  = 변수선언하고 초기화(=값을 할당(값최초할당=초기화)함)
		//				int age = 30 ; 초기화 후 다른 값을 할당== 할당)
		
		
		/**
		 * 지역변수 : 반드시 초기화 후 사용할 것.
		 */
//		String name ;
//		System.out.println(name);

		String name = "abc" ;
		System.out.println(name);
		
		/**
		 * 전역변수 : 초기화 하지 않으면 컴파일시 기본값으로 자동 초기화 
		 */
		 System.out.println(cv);	// 정상
		 
		
		int age = 20 ;
		System.out.println("hello" + age ); // ctrl+space+enter 단축
		// oracle = || / java = + 가 글자 합치기
		
		
		// 2024-04-24 내부변환
		long lv = 1000; // casting  일어나는것.
		long lv2 = 1000l; // casting 내부변환 일어나지 않음.
		System.out.println(lv+","+lv2);
		
		double dv = 3.14;
		double dv2 = 3.14d;
		System.out.println(dv+","+dv2);
		// 값의 차이가 없다.
		// 리터럴 안붙여도 된다. 실수형의 기본타입은 double 이기 때문에.
		
		boolean bv = true;
		boolean bv2 = false;
		// 1->4 (1을 4로 바꿀 수 있나? 가능하다. 원룸에서 방 4개로 짐 이동하면 가능하니? 응!)
		System.out.println(bv);
		System.out.println(bv2);
		
		char cv = 'A'; // 싱글쿼트 '' = 한글자 
		// char => 하나의 값만 가능하기 때문에 'AB' 는 불가 => 2byte
		System.out.println(cv);
		String sv = "smith"; // 2글자이상
		//  멀티글자(단어), 문장은 더블쿼트 "" 사용.
		System.out.println(sv);
		
		
		System.out.println("abc\n def\t"); // \n = 개행, \t = 한번의 탭 => 대표적으로 많이 사용.
		
		
		
//		 boolean db ; // 변수를 선언만하고 초기화를 않은 상태
//		 System.out.println(db); // 선언한 것만을 사용하려고 할 때, 에러남. 값이 없어서.
		 // 즉, 초기화하지 않고 그 값을 참조하려고 하면 에러가 난다. 초기화를 반드시 해야함.	
		 boolean db = true ; 	// 선언 후 초기화 한 값.
		 System.out.println(db); // 반드시 초기화 후 사용!!!
		 
//		 char cv3 = ''; // '' 은 에러남. 빈칸 하나라도 주기.
		 char cv3 = ' '; // blank
		 System.out.println(cv3);
		 
		 String str1 = null; // Ref.타입의 기본값은 null => 값이 없는 것.
		 System.out.println(str1);	// 값이 있어서 null 이 나온다.
		 
		// String 여기서는 주소값 빈값으로 할당되는 것. 
		 String str2 = new String(""); // 1번
		 String str3 = ""; 
		 // str2/ str3 동일한 문법 => 매번 new... 사용할수없어서.
		 System.out.println(str2);
		 System.out.println(str3);
		 
		 
		 // 문자열은 어떤 글자를 붙여도 문자열이다.
		 // 
		 boolean bv3 = false;
		 System.out.println(bv3); 	// boolean 타입 = false
		 System.out.println(bv3+""); // 글자로 false "false"
		 System.out.println(7+7+""); // 문자열 14 = "14"

		 
		 // 정수의 오버플로우(Overflow) = +를 넘어가면 오버플로우
		 // 언더플로우 => + 아래로 내려가면 언더플로우
		 // 1byte = 127 / 만약 128을 넣으면 에러남.
//		 byte b = 128; // 에러 = 수가 담을 수 있는 범위값을 넘어서 = -2^7 ~ 2^7 (127)
//		 System.out.println(b);
		 byte b = 127;
		 System.out.println(b);
		 System.out.println(b+1);	// 1은 int => int는 b보다 큰 애라서 에러없이 나타남.
		 
		 int res = b+1;
		 System.out.println(res);
		 
		 // 큰 타입을 작은 타입으로 강제 캐스팅. => 에러 안나고 연산 문제가 나타날 수 있기 때문에 조심해야한다.
		 // casting (casting 하려는 타입), 근데 결과값을 바이트로 바꾸고 싶은 거라서 같이 묶어야함.
		 byte res2 = (byte)(b + 1);		//  casting 해야함 => 1 <-- 4 : 큰 타입을 작은타입으로 강제 캐스팅 한 것. => 결과값 : -128 (음수값이 나옴), 이유 : 
		 System.out.println(res2);		//
		 // 오버플로우는 그걸 넘어서면 맨처음으로 돌려서 제일 처음 값으로 돌려버림. 즉, 최소값으로 돌려버린다.
		 
		 // ****************************************** 캐스팅
//		 float f = 3.14f; // float(4byte), <-- double(8byte)
		 float f = (float)3.14; // 큰타입을 작은타입으로 변환하는 경우 강제 casting => float 캐스팅 한 것.
		 System.out.println(f); // 
		 // 캐스팅이나 연산할 때, 큰 값은 작은 값에 넣어야 할 때, 참고해서 생각하기.
		 
		 
		 // 작은 타입을 큰 타입으로 변환하는 경우 = 암묵적 캐스팅. 
		 // double(8byte) <-- float(4)
		 double d = 1.4e3f;
		 // double d = (double) 1.4e3f; 암묵적으로 이렇게 작업되고 있다.
		 System.out.println(d);
		 
		 // int보다 작은 타입은 int 캐스팅을 한 후에 변환한다.
		// 문자를 가감산을 하면 숫자를 뱉는다. = short, byte, char = int 보다 작은파일 연산 시, 캐스팅이 일어난다. 즉. 인트보다 작은애들은 내부적으로 인트로 변환 -> 그리고 이진법으로 변경하는 것(=인코딩)
		 System.out.println('A'+'B');	// 10진법 65+66 =131
		 System.out.println('1'+2);		// 10진법 49 + 2 = 51
		 System.out.println('1'+'2');	// 49+50 = 99

		 byte bb = 10;
		 char chch = 'A';
		 int ii = 100;
		 long ll = 1000l;
		 
		 bb = (byte)ii;			// 생략불가, 1 <-- 4
		 chch = (char)bb;		// 생략불가, chch = bb; ==> type mismatch (타입불일치) , 2 <-- 1
		 short s = (short)chch;	// 생략불가, short s = chch; => type mismatch , 2 <-- 2
		 
		 float ff = (float)ll;	// 생략가능, 4(실수) <-- 8(정수) => 실수형이 범위가 더 커서 가능함.
		 ii = (int)chch;		// 생략가능, 4 <-- 1		 
		 // int보다 적은 값은 형변환 되어 넣을 수 있다.
		 
		 System.out.println(bb);
		 System.out.println(chch);
		 System.out.println(s);
		 System.out.println(ff);
		 System.out.println(ii);		 
		 
		 
	}

}
