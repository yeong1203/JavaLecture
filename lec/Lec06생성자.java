package com.kosta.lec;

public class Lec06생성자 {
	/**
	 * Lec06 u = new Lec06();
	 * 
	 * 생성자(Constructor) 함수
	 * 역할 : 인스턴스 초기화하는 메서드 (1. 최초로 클래스의 주소를 만드는 메서드, 2.인스턴스 변수의 초기화 시킬 값을 지정하는 용도)
	 * 인스턴스를 초기화하기 위한 목적으로 사용한다. == 생성자 함수를 사용하는 이유? 면접질문 나올 수 있음.
	 * 
	 * 기능 == function == method 
	 * 
	 * 중요
	 * 생성자 : 리턴이 없어도 void 타입 적지 않는다.
	 * 클래스 이름과 동일한 메서드
	 * 일반 메서드의 조건을 모두 가지고 있다. 
	 * 그래서 오버로딩도 가지고 있다.
	 * 
	 * <자바문법에서 동일한 부분?>
	 * 클래스 이름과 동일한 메서드 :: Lec06();
	 * 클래스의 인스턴스 생성(t = new 클래스())  t == this --> t.iv  t.insmethod()
	 * 
	 * <일반 메서드와 차이점>
	 * 메서드 : 리턴이 없으면 void 타입
	 * 생성자 : 리턴이 없어도 void 타입 적지 않는다.
	 * public void addNumber() { ... }
	 * public      Lec06() { .... }
	 * 
	 * <기본생성자>
	 * 클래스이름() {
	 * 
	 * }
	 * 
	 * 
	 * this => 인스턴스 자신을 가리키는 참조변수. 인스턴스 주소가 저장되어 있음.
	 * 
	 * 블럭 초기화 => 생성자일때만. 
	 * 블럭 {...}  and static { ... }
	 * 블럭 초기화에 공통이라고 해서 결제 내역(로그) 넣음. 즉, 생성자보다 우선시 되는 것을 넣는 것이기 때문에 넣으면 안됨.
	 * 무조건 공통인게 아니라 생성자보다 우선 실행되어야 하는 것. 즉, 전처리 해야할 것만 블럭에 넣기.
	 * 
	 * 
	 * 생성자 없을 때, 빌드 기본생성자 자동으로 생성해 줌.
	 * 
	 * 힙영역에 들어가는 것들 == static이 없는 것.
	 * 
	 * 초기화블럭
	 * 생성자가 4개가 있는데, 똑같은 행위를 반복해야할 경우가 있는데, 먼저 해야할 일을 공통으로 초기화블럭으로 작업해 놓고 생성자 함수 4개 생성함.
	 * 
	 */
	
	int userPoint = 0;	// iv
	
	// 생성자 함수도 오버로딩 가능하다.
	// public Lec06생성자() { }
	// public Lec06생성자(int userPoint) { }
	
	// 기본생성자 : ()안에 파라미터가 없다.
	// 클래스 내에 생성자가 하나도 없을 경우, 컴파일러가 기본 생성자를 만들어준다. 언제? 컴파일할 때!
	public Lec06생성자() { 
		/**
		 * this() : 생성자 함수  // 생성자를 부르는 방법
		 * this() : main() 함수에서 사용 불가. static에서 new 해야 사용할 수 있기 때문에 자체로 사용이 불가능하다!
		 * 생성자함수() 안에서는 this() 사용 가능. 단, 첫 줄에! this() 한번만 사용 가능하다. 
		 */
		this(5); 	// this()는 맨 앞에 사용해야함.
		new Lec06생성자(10);
		add(10,20);
		mul(5,3);
		
		System.out.println("매개변수가 없는 생성자 : Lec06생성자( )");
//		new Lec06생성자(3); == this(5);
	}
	
	public void mul(int n1, int n2) {	// new 되면 올라가기 때문에 어차피 생성자도 같은 이유로 올라간다. 그래서 사용 가능.
		System.out.println( "인스턴스 메서드 mul : "+ n1 * n2);
	}
	
	
	public static void add(int a, int b) {
		System.out.println("클래스 메서드 static add : "+a+b);	// string에 뭘 더해도 string
	}
	
	// 매개변수가 있는 생성자 : ()안에 파라미터가 있다.
	// [ 인스턴스(화) 변수, 번역변수 ] vs. [지역변수] : 구분을 위해 this 사용
	// this : 클래스가 인스턴스화 된 주소값
	public Lec06생성자(int userPoint) {	// "파라미터가 있는 생성자"라고 함.
		// 전역 변수   =   지역변수
		this.userPoint = userPoint;
		System.out.println(this);
		System.out.println("매개변수가 있는 생성자 : Lec06생성자(int userPoint) ");
	}

	public static void main(String[] args) {
		// 클래스명 참조변수 = new 생성자() ;
//		Lec06생성자 obj = new Lec06생성자(5000);
//		System.out.println(obj);
		
		/**
		 static 메서드 안에서 this 사용 불가
		 this는 new 생성자함수()를 통해 호출 후 만들어 진 주소를 지칭하는 키워드
		 즉, 언제 new 할 줄 알고.. 실행시 메모리에 바로 올라가는 static 메서드 안에서는 사용 불가.
		 */
//		this();		// 얘도 불가.
//		System.out.println(this);  // this는 new가 된 주소이기 때문에 당장 올라가는 static에 사용 X
//		System.out.println(iv);		// this가 안되는 이유? instance variable 이 static에 사용 불가능 한 이유와 동일하다.
		// 클래스명  참조변수 = new 
		Lec06생성자 bbbb = new Lec06생성자();
		System.out.println(bbbb);	// Lec06생성자를 최초 생성된 주소.
		System.out.println("=================");
		Lec06생성자 ssss = new Lec06생성자(5000);
		System.out.println(ssss);		
	
	}
	
	public void add3(int a, int b) {
//		Lec06생성자 bbbb = new Lec06생성자();
		this.userPoint = 10;
		System.out.println(this);
	}
	
	
	
	// 

}
