package com.kosta.lec;

public class Lec05배열 {

	// String[] 배열을 가지고 있다. 
	public static void main(String[] args) {	
		// args는 파라미터, arguments 라고 말한다. 즉, 파라미터 받는 자리.
		
		// java	 lec05배열 	 "10" 	"20"
		// 실행  	.class파일 	arg[0]	arg[1]
		
		
		
		// 배열(array)이란? 타입이 [같은]의 변수 [여러 개]를 사용하는 목적.
		// [] 이것이 배열이라고 표기하는 것.
		
//		int num2;	// 변수 선언
//		System.out.println(num1);  // 선언 후 초기화 없이 사용하면 에러.
		
		int num1 = 10;	// 변수 선언 및 초기화
		
		//배열(변수) 선언
//		int[] num;	// 배열 선언.
		// 내가 아무 값도 넣지 않으면 default 값인 0으로 초기화된다.
		// String = null, boolean = false, 유니코드 =\u00000 , 나머지 0
		int[] num = new int[3];
//		System.out.println(num);	// num만 작성하면 주소가 나타남.
		System.out.println(num[0]);	// 배열의 접근은 인덱스(index) 0부터 시작.
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		System.out.println("num.length: " + num.length);	// 배열의 길이 length로 for 문을 돌려라. 하드코딩 X
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
//		가장 배열의 기본 값. 두 개가 같은 것.
		int[] numArr0 = new int[3];			// ------ 가장 많이 사용.
		int[] numArr1 = new int[] {0,0,0};
		
//		내가 원하는 값으로 초기화 하기.
		int[] numArr3 = new int[] {10,20,30} ;	// new int[] 저장하면 자동으로 컴파일된다.
		int[] numArr2 = 		  {10,20,30} ;	// -------- 가장 많이 사용. / 즉, [숫자] 없으면 반드시 뒤에 값이 있어야한다.
		
//		에러 1
//		int 배열변수[3]개 명시 후 {10,20,30} 값 3개 초기화 ----- 에러
//		int[] numArr4 = new int[3] {10,20,30} ;
//		int[] numArr4 = new int[] {0,0,0}{10,20,30} ; ---- 윗줄 설명. new에 3을 또 넣으면 저렇게 되기 때문에 배열인식 안됨 에러됨.
		
//		에러 2
//		선언 후 라인바꿈 후 값을 초기화 하면 에러 => new 가 없음. 즉, 선언만하고 new를 해서 메모리에 올리지 않았기 때문에 주소를 몰라서 찾을 수 없기 때문이다.
//		int[] numArr;
//		numArr = {10,20,30}
//		new int[] 는 선언과 같은 라인에 있을 때만 new int[] 없이도 가능하다.
		
//		System.out.println("==============");
		
//		 구구단 방식 1
		int[] dan = {1,2,3,4,5,6,7,8,9} ;
		int[] gob = {1,2,3,4,5,6,7,8,9} ;
		for(int i=0; i<dan.length; i++) {
			if(dan[i]%2==0) {
				System.out.println(dan[i]+"단");
				for(int j=0; j<gob.length; j++) {
					System.out.println( dan[i] + "x" + gob[j] + "=" + (dan[i]*gob[j]) );
				}				
			}
			System.out.println();
		}
//		구구단 방식2
		int[] dan2 = new int[] {2,4,6,8} ; // 사용자정의
		int[] gob2 = new int[9] ;
		for(int i=0; i<dan2.length; i++) {
			System.out.println(dan2[i]+"단");
			for(int j=0; j<gob2.length; j++) {
				gob2[j] = j + 1;
				System.out.println( dan2[i] + "x" + gob2[j] + "=" + (dan2[i]*gob2[j]) );
			}				
			System.out.println();
		}
		
		System.out.println("==============");
		
//		다차원	1차[]  2차[][]   3차[][][]  ...  n차[][][]... (n차는 가독이 어려워, 피해야한다. => 다차로 해야할 경우엔 클래스로 처리.)
//		행렬  => ex.2행 3렬 // 행->열->깊이... 이런 순서로 들어간다.
//		int[][] score = new int[2][3];
		int[][] score = new int[][] { { 100,70,80 }, {99,88,77} };	// 이게 다차원
//		// 행찍는거 열찍는것.
		System.out.println(score.length); 		//  행:2
		System.out.println(score[0].length); 	// 열: 3
		for(int i=0; i<score.length; i++) {	
			for(int j=0; j<score[0].length; j++) {
				System.out.print(score[i][j] + "\t");		
			}
			System.out.println();
		}
		
		System.out.println("==============");
		
//		int score2[][][] = new int[2][3][4];
//		int score2[][][] = new int[][][] { { {1,2,3,4},{1,2,3,4},{1,2,3,40} } },{10,20,30} ;		
//		score2.length => 2행
//		score2[0].length => 3행
//		score2[0][0].length => 4
//		score2[0][0][0].length => 단일값(스칼라)1은 length 안됨 == 에러.
		
//		int[] 배열명; 이렇게 쓰는게 타입을 빠르게 확인가능.
//		int[] daily~~~grade[]; --이렇게 사용도 되지만 하지 말기.
		
//		가변배열 => 행은 정해져있고, 다차원배열에서 마지막차수의 크기를 지정하지 않는 것.
//		컬렉션은 사이즈 지정이 없고 들어오는 만큼 받는다.
		
//		배열의 복사
//		for문 사용한 배열 복사.
//		int[] num = {1,2,3,4};
//		int[] newNum = new int[3]; 
//		for(int i=0; num=)
		
		// 자바 디자인 = javax의 swing
		
//		System.out.println("==============");
		
		// 문제 풀이 -- 배열 변수
//		int [] arr[];			// 선언만!
//		int[] arr = new int[5];			
//		int[] arr = new int[]{1,2,3,};
//		int[] arr = 		 {1,2,3,4,};		//--- 사용자 정의화
//		int[] arr[] = new int[3][];	// 가변배열
		
//		int[] arr = new int[5] {1,2,3,4,5};	-- 에러
//		int arr[5];	--에러

//		System.out.println(arr);
		
//		// 문제 풀이 -- 총합구하기
		int[] array = {10, 20, 30, 40, 50}; 
		int sum = 0; 
		/* (1) . 알맞은 코드를 넣어 완성하시오 */ 
		for(int i=0; i<array.length; i++) {
			// sum = sum + array[i];
			sum += array[i];
		}
		System.out.println("sum="+sum);
		
		
		// 문제풀이 -- 총합과 평균
		int[][] arr = { { 5, 5, 5, 5, 5}, 
						{10,10,10,10,10}, 
						{20,20,20,20,20}, 
						{30,30,30,30,30} }; 
		int total = 0; 
		float average = 0; 
		/* (1) . 알맞은 코드를 넣어 완성하시오 */ 
//		//내 코드
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				total += arr[i][j];
//			}
//		}
//		average = (float)total / (arr.length * arr[i].length) ;
		
//		// 강사님 풀이
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				cnt++;
			}
		}		
		average = (float)total / cnt ;		// 평균은 밖에 하기.
		// 만약 안에 넣으면 루프가 계속 돌면서 연산하기 때문에, 효율적으로 마지막에 해주는 것이 낫다.
		
		System.out.println("total="+total); 
		System.out.println("average="+average);
//		
//		
//		
//		// 문제 풀이 -- 동전 거스름
//		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
//
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		int res =0;
		for(int i=0;i<coinUnit.length;i++) {
			// 강사님 풀이
//			res = money%coinUnit[i];
//            cnt = money/coinUnit[i];
//            money = rest;
//            System.out.println(coinUnit[i] + "원 : " + cnt);
            
             res=money/coinUnit[i];
             System.out.println(coinUnit[i]+"원 : "+res+"개");
//             money = money - (coinUnit[i] * res) ;
             money -= (coinUnit[i] * res);
		}
		
		System.out.println("-------------------------------");
		
		// 문제
		System.out.println((char)65);
//		1. 32~126 아스키 코드
		int inputNum = 65; // 아스키코드를 문자로
	    char inputChar = 'A'; // 문자를 아스키코드로
	    String inputStr = "ABC";	//
		
		for(int i=32; i<=126; i++) {
			System.out.print(i + "\t");
		};
		System.out.println();
		for(int i=32; i<=126; i++) {
			System.out.print((char)i + "\t");
		};
	    
		System.out.println();
	    System.out.println("============================ ");
	    
//	    int inputNum = 65;
	    char a = (char)inputNum;
	    System.out.println(a);
	    
//	    char inputChar = 'A';
	    int b = (int)inputChar;
	    System.out.println(b);
	    
	    /**
	     String str = "abc";
	     is equivalent to:
	     	
	     	char data[] = { 'a', 'b', 'c' };	-- 배열의 캐릭터 즉, 캐릭터를 배열에 넣은 것. == data
	     	String str = new String(data) ;
	     * 
	     */
	    
	    // 배열 선언, new, 초기화, 스트링/캐릭터 캐스팅. -- 다음 쪽지 시험에 나올확률 높당.ㅎㅎ
		
	    
	    // 클래스 상수 영역과 힙영역은 따로 있다
	    // 
	    String str1 = "abc";	// "" 안에 내용은 전부 리터럴. 문자형 리터럴
	    // 문자 리터럴을 따로 뽑아서  .class파일로 저장되는데, 그 파일을 클래스로더가 올릴때 따로 모아서 자주하는 것들은 찾아서 다시 재활용해서 쓰는 것. 메모리 새로 할당받는거 아님. 메모리 측면에서는 좋다고는 한다.
	    
	    String str2 = new String("abc");	// 인스턴스 리터럴 = 인스턴스해서 리터럴한 것.
	    // 인스턴스 리터럴은 힙영역에 저장됨. 
	    // 같은 abc라도 new가 있으면 새로운 메모리를 판다.
	    // new가 있으면 메모리에 새롭게 만들어 str2의 주소값을 저장해 그것을 가르키고있다.
	    
	    char data[] = { 'a', 'b', 'c' };
	    String str3 = new String(data);
	    
	    String str4 = new String(new char[] {'a', 'b','c'});
	    
	    // 결과값은 동올히다. but, 문법의 차이, 메모리 
	    
	    // char charAt(i) : str --> char ==> casting 해주는 것.(메소드를 이용해서 캐스팅 가능)
//	    String inputStr = "ABC";
//	    char c = inputStr.charAt(0);
//	    System.out.println(c+","+(int)c);
	    char c = ' ';	// 선언 밖에서 하는 게 좋다. for문 내부에 넣지 말기.
	    for(int i=0; i<inputStr.length(); i++) {	// 문자열의 길이 => length() ==> 함수
	    	c = inputStr.charAt(i);		// charAt(i) == 글자하나만.
	    	System.out.println(c+","+(int)c);	// 글자그대로		    	
	    }
		    
//		 루프 돌릴 때, 스트링 변수 넣어서 할당해서 사용하는 것.. 조심!! 무조건 새로 생성하는 것이기 때문에 하나 생성할때 4byte씩 계속 사용.
//	    스트링 빌더나 스트링 버퍼 => 기존에 값을 임시로 옮겨뒀다 새로 들어온 것과 합쳐서 4byte만 사용함.
	    
//	    String temp = "A";
//	    for(int i=0; i<1000; i++ ) {
//	    	temp += i;
//	    } // 루프에 스트링에대한 변형을 가자히 말라! == 중요한 부분. // 좋은 방법 아니다.
	    
	    
	    // char[] : toCharArray(str) --> char[]		--> 캐릭터배열을 준다. // 글자 전부를 출력.
	    char[] carr = inputStr.toCharArray();
	    for(int i=0; i<carr.length; i++) {	// 배열에서는 length.
	    	System.out.println(carr[i] + "," + (int)carr[i]);
	    }
	    
	    System.out.println("===============================");
		
	    
	    
	    
	    
	}

}
