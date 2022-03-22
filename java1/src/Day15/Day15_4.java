package Day15;

public class Day15_4 {

	public static void main(String[] args) {
		
		//12장 : 스레드
			//코드-> 파일 ->프로세스[프로그램]
			//목적 : 병렬처리
				//main메소드에 main스레드 포함
			//사용방법
				//1.Thread 클래스
				//2.Runnable 인터페이스
			//run 메소드: 멀티스레드이 실행코드
		
		//예1) Thread 클래스를 이용한 병렬처리 객체 만들기
		
		음악 m1 = new 음악();
		m1.start(); //run메소드 실행 ->스레드 실행
		
		//예2) Runnable 인터페이스를 이용한 병렬처리 객체
		채팅 c1 = new 채팅();
		//c1.start();runnable는 start() 메소드를 가지고 있지 않음
		Thread thread = new Thread(c1);
		thread.start();
		while(true) {//main 스레드 실행중
			System.out.println("*프로그램 작동중*");
		
				Thread.sleep(500);//0.5초간 일시정지
			
			}
		//p.591 동기화
			//멀티스레드 사용시 동기화 선택[단일스레드 사용시에는 동기화X]
			//*여러개 스레드 동일한 메소드 호출
			//동시다발적으로 하나의 메소드 호출
			
		}
	}

