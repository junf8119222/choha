package Day14;

import java.awt.Toolkit;

public class Beeptask implements Runnable{
					//구현하다[runnable]
	//implements 사용시 추상메소드 꼭!!! 구현하기
		//ctrl + 스페이스바
	@Override
	public void run() {//Runnable 인터페이스내 run메소드 구현하기
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0; i<5; i++) {
			toolkit.beep();//소리내기
			try {
			Thread.sleep(500); // 인반예외가 무조건 발생 -> 예외처리무조건
			}catch(Exception e) {}
		}
	}
}
