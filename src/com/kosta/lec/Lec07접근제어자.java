package com.kosta.lec;	// 폴더 위치 



// 내가 쓰려는 파일을 명확하게 해주는 것이 좋다. 무엇을 사용하지는 잘 모르기 때문에.
// 다른 패키지의 클래스를 가져다 사용하려면 import 해야한다.
// 패키지1.패키지2.패키지3.*; // *는 클래스자리(.java 파일자리)
import com.kosta.other.Lec07접근제어자Other; 

// 동일 패키지의 클래스를 가져다 사용할 경우 import 생략
import com.kosta.lec.Lec07접근제어자Same;

public class Lec07접근제어자 extends Lec07접근제어자Other {	// Lec07접근제어자Other 상속받아서 사용 == protected 때문에 상속받음.
	/**
	 * 접근 제어자 큰 것부터 순서대로
	 * public > protected > default > private
	 * public :: 아무나 와서 사용가능.
	 * protected :  패키지는 다르지만 사용은 가능하다. 하지만 자신을 new해서 사용해야 한다. 왜냐하면 protected는 쓰게는 해준다고 한 거라서.
	 * 				동일 패키지 and 다른 패키지 사용할 때는 상속해서 사용해야 한다.
	 * default 아무 것도 안쓰는 것.== add()
	 * 			동일한 패키지 안에서만 접근 가능.   
	 * private : 해당 클래스 안에서만 사용이 가능하다. 벗어날 수 없다. == self 조인과 같음. 자기만 사용 가능하다.
	 * 
	 * 오버라이딩
	 * 1. 선언부가 같아야 한다.
	 * 2. 조상의 메서드나 protected라면, protected나 public으로만 변경할 수 있다.
	 *    => 자식은 조상의 상속 범위가 같거나 커질 수 있지만 좁아 질 수는 없다.
	 * 3. 부모의 메서드보다 많은 수의 예외를 선언할 수 없다.
	 *    상속받았는데 더 많은 문제가 발생할 경우, 부모가 겪은 예외보다는 내가 더 많아지면 안됨.
	 * throws => 문제가 발생했다는 것을 알려주는 예외.
	 * Exception => 예외의 최대 꼭대기
	 * 예외에도 부모 자식 관계가 있기 때문에 부모보다 예외가 낮아야한다.
	 * 
	 */
	
	public static void main(String[] args) {
		/**
		 *  같은 패키지 내에서는 private 빼고 다른 클래스에 있는 모든 변수/메서드 사용 가능.
		 */
		
		// public 
		// 같은 패키지 않에 있으면 import 하지 않아도 된다.
		Lec07접근제어자Same same = new Lec07접근제어자Same();
		System.out.println(same.samePublicPoint);
		System.out.println(same.sameProtectedPoint);
		System.out.println(same.sameDefaultPoint);
//		System.out.println(same.samePrivatePoint);	// 에러, 변수가 들어간 클래스 안에서만 사용가능.
		
		
		/**
		 * Getter메서드
		 * : private 변수는 외부에서 접근이 불가능 
		 * -> 값을 가져가는 public 함수를 사용해 값을 가져감
		 * -> public get__() 함수를 사용해 값 접근 가능.
		 */
		int res = same.getSamePrivatePoint();
		System.out.println(res);
		
		
		
		/**
		 * 다른 패키지 내에서는 private, default는 사용 불가.
		 * 				  굳이 꼭 사용하겠다 -> protected는 상속된 자식은 사용 가능.  => 부모자식관계로 반드시 관리되어져야 할 때, 의도적 protected를 붙여서 사용한다.
		 */
		
		Lec07접근제어자Other other = new Lec07접근제어자Other();
		System.out.println(other.otherPublicPoint);
//		System.out.println(other.otherProtectedPoint);// 패키지가 달라서 불가능.
//		패키지가 다른 클래스 내에 있는 Protected 변수/메서드를 사용하고 싶으면 반드시 상속!!!
		
//		System.out.println(other.otherProtectedPoint);	//  상속해도 에러
		
		// protected
		Lec07접근제어자 my = new Lec07접근제어자();	// static이 없어서 따로 new 처리
		System.out.println(my.otherProtectedPoint);	
		
		System.out.println(otherProtectedPoint_static);	// static  붙인 것.
		
		// 뭘 해도 error 나는 예제.
//		System.out.println(my.otherDefaultPoint); // 상속을 받았어도 패키지가 달라서 에러
//		System.out.println(my.otherPrivatePoint);// 패키지 상속 둘 다 필요없음. 변수가 들어간 클래스 안에서만 사용. 벗어나면 불러올 수 없음
	}

}
