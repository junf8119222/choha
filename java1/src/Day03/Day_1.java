package Day03;

public class Day_1 {
	
	public static void main(String[] args) {
			
			// 1일차 : 출력 , 입력
			// 2일차 : 저장(변수), 계산(연산)
			// 제어문
				// 컴퓨터의 판단력~~ => 경우의 수
				// 형태
					// 1. IF( 조건[true/fasle] )실행문;
					// 2. IF( 조건식 ) 실행문[참];
					//		else 실행문[거짓];
					// 3. 실행문이 2줄 이상( ; 2개 이상
					// 4.IF( 조건1 ) { 실행문[참1] }
					//	 ELSE IF( 조건2 ) {실행문 [참2] }
					//	 ELSE IF( 조건3 ) {실행문 [참3] }
					//	 ELSE  [실행문 거짓]; }
					// 5. if 중첩
					//		if( 조건식 ) {
					//			if( 조건식 ){ 실행문; }
					//
					//		}else{
					//			if( 조건식 )( 실행문; )
					//			else { 실행문; }
					//		}
		// 예제 1
		if( 3> 1 ) System.out.println("예) 3이 1보다 크다. ");
			// 만약에 3이 1보다 크면 출력o 아니면 출력x
			// true이면 실행
		//예제 2
		if( 3>5 ) System.out.println("예) 3이 5보다 크다. ");
			// 만약에 3이 5보다 크면 출력o 아니면 출력x
		//예제 3
		if( 3>1 ) System.out.println("예3) 3이 1보다 크다.");
		else System.out.println("예3_2) 3이 1보다 작다.");
		
		//예제4
		if( 3>2 ) { // true 실행문 시작 [실행문 (;) 2개이상일때 ]
			System.out.println("true"); 
			System.out.println("3이 2보다 크다."); }
		} //true 실행문 끝
		else // false 실행문 시작
			System.out.println("false");
		//예제5
		if( 3>5 ) System.out.println("예5) 3이 5보다 크다");
		else if( 3>4 ) System.out.println("예5) 3이 4보다 크다.");
		else if( 3>3 ) System.out.println("예5) 3이 3보다 크다.");
		else if( 3>2 ) System.out.println("예5) 3이 2보다 크다.");
		else System.out.println("true 없다.");//실행 x 패키지 1개 효율 o
		//결과가 1개일 때 유리// 제일 중요한 것은 효율이 아닌 실행
		
		if( 3>5 ) System.out.println("예5) 3이 5보다 크다");
		if( 3>4 ) System.out.println("예5) 3이 4보다 크다.");
		if( 3>3 ) System.out.println("예5) 3이 3보다 크다.");
		if( 3>2 ) System.out.println("예5) 3이 2보다 크다.");
		if( 3<2 ) System.out.println("true 없다.");//실행 x 5개 패키지 효율x
		// 경우에 따라 결과가 여러가지인 경우
	}
	}
		

}
