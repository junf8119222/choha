package Day14;

public class 호랑이소리 extends Thread{

	//재정의
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("으르렁"+i);
			try {Thread.sleep(500);}
			catch( Exception e) {}
		}
	}
	
}

