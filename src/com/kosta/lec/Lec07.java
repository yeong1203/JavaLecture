package com.kosta.lec;

public class Lec07 {

	public static void main(String[] args) {
		/**
		 * import 빌려오는 것
		 * extends, implements = 상속
		 * 
		 * class가 여러개가 올것이다. class 가져다 쓸 때 결정.
		 * 
		 * 단일 상속(single inheritance) => 하나만 상속.
		 * 다중 상속(interface) => 개발의 꽃
		 * 
		 * 오버라이딩(overriding)
		 * 부모를 호출하는 형태 = super
		 * import 패키지 정보 == 어디껄 빌려올지
		 * 
		 * 상속 = reuse => 리모델링 가능. 부모것이지만 내것이다. 뜯어 고쳐서 사용할 수 있는 것이 reUse
		 * 상속 하는 이유? 개발시간을 단축할 수 있어서 좋다.
		 * 기존 클래스를 재사용해서 새로운 클래스를 작성하는 것.
		 * 두 클래스의 관계 : 부모 parent / 자식 child 
		 * 멤버 = class / 생성자와 초기화 블럭 제외.
		 * 자손의 멤버 개수는 부모보다 같거나 많다. 즉, 적을 수 없다.
		 * class 자식클래스 extends  부모클래스 { ... }
		 * ex. 부모에게 여러명의 자식이 있을 수 있다.
		 * ex. 카드결제, 체크카드 결제, 포인트결제 --- 신용인증(공통이자 부모)
		 * 
		 * 포함관계(composit) : 한 클래스의 멤버변수로 다른 클래스를 선언하는 것.
		 * -- 즉, 남의 클래스를 멤버로 가지고 있는 것을 포함관계라고 한다.
		 * 상속은 new 할 필요가 없다. 
		 * 
		 * 
		 * 상속 관계 : is a
		 * 포함 관계 : has-a
		 * 
		 * 부모는 작은 것. 공통적인 부분의 제일 작은 것. == Door
		 * 
		 * 컴파일 하면 자동으로 import java.lang.Object; 가 되어진다.
		 * 
		 * 
		 * 
		 */
//		class User {  }
//		class Cart {
//			int point = 0;
//			User u = new User();
//			
//			Card(User u) {  // 레퍼런스 타입 u 주소를 가지고 있다.
//				u.id = ~~~
//			
//			main {
//					new Card
//				}
//			}
//		}
		
//		class Cart { }  // composite
//		class User() { }  //
//		
//		
//		class Door { }	// 부모
//		class Car extends Door {	// 자식.
//			
//		}

	}

}
