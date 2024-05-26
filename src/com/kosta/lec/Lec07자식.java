package com.kosta.lec;

// 오버라이딩
// 원래 부모 클래스 따로 파야함.
class Lec07부모 {
	public void userCheck(String uid) {
		System.out.println("부모 userCheck()...");
	}
}

// .java 파일 하나당 class 하나! 그리고 public은 .java 파일이랑 이름이 같은애를 public을 준다. 왠만하면 public도 하나만하기. 
//       public class 클래스명 {  } 이 하나!
public class Lec07자식 extends Lec07부모 {  // ,  extends Lec07부모
	
	/**
	 * 오버 라이딩 (over riding)
	 * 상속(extends 키워드 유무 확인. 있어야 오==
	 * 1. 선언부(헤더) : 동일
	 * 	  바디(내용부) : 동일 or 변형
	 * 2. 부모 접근제어자 < 자식 접근제어자		// 부모것도 가지고 가고 내것도 가져가야해서 큰 걸로 가지고 가야함.
	 * 3. 예외 : 부모(4) > 자식(3)
	 * 
	 */
	
	public void userCheck(String uid) {
		System.out.println("자식 userCheck()...");
	}
	
	
	int num = 100;
	public float add(float a, float b) {
		return a+b;
	}
	public void myPrint(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Lec07자식 t = new Lec07자식();
		System.out.println(t.num);
//		t
		/**
		 * notify() => 깨우는 것. / wait() 
		 * 이 것들은 queue 에서 사용.
		 */
	}

}
