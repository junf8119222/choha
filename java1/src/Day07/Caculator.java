package Day07;

public class Caculator {
	//클래스 선언
	
	//1.필드
	//2.생성자
		//만약에 생성자가 선언이 1개도 없으면
		//기본 생성자가 자동 추가됨
		//기본생성자:매개변수가 없다
	//3.메소드
	void powerOn() {
		System.out.println();
	}
	//1.void:리턴타입
		//void: 함수가 종료되면서 나가는 데이터가 없다,
			//return; 생략 가능[단 실행부 중간에 사용시 함수 종료]
	//2.powerOn:메소드이름[아무거나]
	//3.(매개변수[인수]):함수로 들어오는 데이터
	//4.{실행코드}:함수 실행부
	
	int plus( int x , int y) {//인수o반환o
		int result =x+y;
		return result;//함수를 호출했던 곳으로 이동
	}
	//1.int: 리턴 타입[함수가 종료되면서 int형 데이터가 반환]
	//2.plus: 메소드이름[아무거나]
	//3.( int x , int y) : int형 2개 매개변수 받기
		//함수호출시 함수로 들어오는 x와 y는 int형으로 받기
	//4.{실행부}
	
	double divide( int x, int y) {//인수o반환o
// 리턴타입 메소드명(인수1,인수2){실행코드; return 실수데이터}		
	
		double result = (double)x/(double)y;
				//(자료형)변수명: 강제형변환
			 		//int형변수->double 변경
						//왜??? 나누기후에 소수점 있을 수 있기 때문에
		return result;	//결과값 --->메소드 호출했던 곳으로 이동
	}
	
	void poweroff() {
//	리턴타입	메소드명(){}
		System.out.println("전원을 끕니다.");
	}
	
	
	
	
	
	
	
	
	
	