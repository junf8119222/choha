package Day02;

public class Day02_3 {public static void main(String[] args) {
	
	
	
	//*.입력-> 저장->계산 ->출력
	//1.입력 객체를 만든다.[자료형은 소문자, 클래스명 대문자]
	//Scanner scanner = new scanner(system.in); //키보드로부터 데이터를 저장하는 객체!!!
	
	//2.입력받은 값을 변수에 저장한다. [ 입력객체는 입력 받을때마다 기존 데이터가 사라진다.
	int 기본급 = scanner.nextInt(1);
		// 입력 객체명.nextInt() : Int형 데이터 가져오기
		// 입력 객체명.next() : 문자열 데이터 가져오기
	System.out.print("수당입력 : ")); int 수당 = scanner.nextint();
	
	//3.변수를 연산(계산) 한다.
	int 세금 = (int)(기본급*0.1) //int*double후에 int형으로 변환
	int 실수령액 = 기본급 + 수당 -세금; 
	
	//4. 출력한다.
	System.out.println("회원님의 실수령액 : " 실수령액);
					//문자열   +		변수형( 변수내 데이터 호출 )
					// + : 1. 연결연산자 기능 2. 더하기 기능
	
	
	//p.64책보기
	/*1.산술
	 * 		// 1. +(더하기)2.-(빼기)3.*(곱하기) 4./나누기=>몫  5..%나누기=>나머지
	 *//산술연산자 예제
	 int 정수1 = 10; int 정수2 = 20;//각각 10과 20를 저장하는 2개의 변수선언
	 System.out.println("더하기 :"+ 정수1 + 정수 2);
	 System.out.println("더하기 :"(정수1+정수2)); 문자열 + 정수-> 연결연
	 System.out.println("빼기 :"+(정수1-정수2));
	 System.out.println("곱하기:"+(정수1/정수2));
	 System.out.println("나누기(몫):" +(정수1/정수2)); 몫 0
	 
	 *2.비교[ 결과는 true 아니면 false]
	 		// > 초과 < 미만
	 		//	>=이상 <= 이하
	 		// ==같다 != 같지않다.[다르다]
	 *3.논리 [2개이상 비교 연산자 사용시]
			 && 이면서 이고 모두 그리고 and
			 || 이거나 거나 또는 하나라도 or  [엔터 위에 원화 기호 + shift]
			! 부정 [반대] true 
			
	 *4.대입 
	     = : 대입 오른쪽값이 왼쪽으로 이동[저장]
	     += : 오른쪽값이 왼쪽값과 더하기 후에 왼쪽값에 대입
	     	변수명 = 변수명 +10
	     	//1. 변수를 호출
	     	//2. 변수에 10을 더한다.
	     	//3. 해당 변수에 더한값을 대입
	     	변수명 +=10
	     	//1. 변수를 호출
	     	//2. 오른쪽값을 더한후에 변수에 대입
	     	변수명 += 10 위에 식과 같다. 식이 줄어 든다. 
	 *5. 증감[*: 일정간격으로 변화]
			 //1. ++: 1증가  		2.  --:1감소
			 //
			 //증감연산자 예제
			 정수1++ // 변수명 뒤에 ++할경우 해당 변수내 데이터에 +1
	 *6. 상항연산자 [조건연산자]
	 * 			조건식 ? 참 :거짓
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 	//증감연산자 예제
	 정수1++ // 변수명 뒤에 ++할경우 해당 변수내 데이터에 +1
	 System.out.println("선위증가:"+ ++정수1):	//11 출력
     System.out.println("후위증가: "+ 정수1++);	//11출력
	 	//명령어처리는 동시처리 불가능-> 처리 순서가 존재
	 	//++변수 : 먼저 증가후에 print 실행
	 	//변수++ : print 실행후에 증가
	 
	 //비교연산자 예제[
	 System.out.println("이상 : "+ (정수1>= 정수2) ); //10>=20 :거짓
	 
	 //논리연산자 예제
	 	// and && : 2개 이상의 비교연산자가 모두 true => 결과도 true 아니면 false
	 	// or || : 2개 이상의 비교연산자가 하나라도 true => 결과도 true 아니면 false
	 int 정수3 =30; int 정수4 =40;
	 System.out.println("and:"+ (정수1>=정수2 && 정수4 >=정수3));
	 							//false    true => 결과 false
	 System.out.println("or:"+( 정수1 >= 정수2 || 정수4>=정수3));
	 				// false or true => 결과 true
	 System.out.println("not부정 :" + !(정수1>=정수2 ||정수4>=정수3));
	  							//결과
	 //대입연산자 예제
	 정수1 = 정수1 + 10;  System.out.println("정수1 :" + 정수1);
	 정수1 += 10;   System.out.println("정수1 : " 정수1);
	 System.out.println("정수1 :" +(정수1 -= (정수1-=10) );
	 
	 // 조건연산자 예제
	 int 점수 = 85;
	 char 등급 =점수 > 90 ? 'A' : 'B';
	 			// 조건식   ? 참(true) :거짓 (false) // 외우기
	 			//점수변수가 90 초과하면 A대입 아니면 B대입
	 System.out.println("등급 :" + 등급);
	 char 등급2 = 점수 >90 ?'A' : 점수> 80 ?'B':'C'
		 			// 조건식 ? 참 : 거짓 [조건식? 참: 거짓]
		 			// 점수변수가 90 초과하면 A 대입 아니면 점수변수가 80 초과하면 B대입 아니면 C
	 
}

}
