package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		
		
		//p.601 스레드 제어
			
			//1.Thread.sleep(): 주어진 시간동안 일시 정지
				//시간 단위: 밀리초(1000/1초)
				//일반 예외 발생: 일시정지상태에서 주어진 시간이 되기전에 실행대기[종료] 되었을때 미리 처리 코드
			//2.Thread.yield(): 다른 스레드에게 실행 양호[대기상태]
			//3.Thread.join():다른 스레드이 종료를 기다림[다른 스레드가 끝날때까지 기다림]
		//p.602 sleep 예제
		Toolkit toolkit = Toolkit.getDefaultToolkit();///소리 관련 클래스
		for(int i =0; i<10; i++) {//10번 반복
			toolkit.beep();//소리내기[소리가 1번 작동중에 for문 끝남]
			try{Thread.sleep(3000);}//3초간 일시정지
			catch(Exception e) {}
		}
		
		//p.604~606 yield()
		//1. 객체 생성
		ThreadA threadA = new ThreadA();
		//2. 객체 생성
		ThreadB threadB = new ThreadB();
		//3.스레드 시작
		threadA.start();
		threadB.start();
		//4.스레드 3초간 일서정지
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		//5.스레드A에 work 값 변경[해당 스레드 일시정지]
		threadA.work = false; // ->Thread.yield();
		
		//4.스레드 3초간 일시정지
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		//5.스레드A에 work 값 변경[해당스레드 일시정지 풀기]
		threadA.work = true;
		
		//4.스레드 3초간 일시정지
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		//6.스레드A, 스레드B 종료
		threadA.work = true;
		threadB.work = true;
		
		//p.607: join()
		//1.객체 생성
		SumThread sumThread = new SumThread();
		//2.스레드 실행
		sumThread.start();
		
		/*
		 * try{// 3.스레드 join
		 * 		sumThread.join();//일반 예외처리 발생
		 * }catch(Exception e){}
		 * 
		 * 
		 * 
		 * 
		 */
		
		//4.
		System.out.println("1~100 합: "+sumThread.getsum());
		//*main 스레드가 join 안했을 때: 0
			//SumThread가 더하기를 끝나기전에 main스레드 sum 출력
		//*main 스레드가 join 했을때: 5050
		
	}

}
