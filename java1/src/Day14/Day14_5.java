package Day14;

public class Day14_5 {
	
	public static void main(String[] args) {
		
		//예: 강아지소리, 고양이소리, 호랑이소리 동시에 출력
		//1.Thread 클래스로부터 extends(상속)
			//오버라이딩 -> 재정의
		//2.Runnable 인터페이스로부터 implements(구현)
			//오버라이딩 -> 구현
		
		//*main 스레드가 새로 생성된 스레드 호출한다
		강아지소리 강아지 = new 강아지소리();
		//자식클래스의 객체로 부모클래스내 메소드 실행
		강아지.start();
		
		고양이소리 고양이 = new 고양이소리();
		고양이.start();
		
		호랑이소리 호랑이 = new 호랑이소리();
		호랑이.start();
		
		
		
	}

}
