package Day04;

import java.util.Scanner;

public class Day04_1 {
	
	public static void main(String[] args) {
		//제어문 : if, switch
		//반복문 : for[], while
		//for 예2) 1~100 누적합계
		for( int j = 1; j<=10; j++ ) {
			sum += j; //sum = sum + j
		}
		System.out.println("for 1~100까지 누적합:" + sum );
		
		// while 예2) 1~100 누적합계
		int j = 1;
		while( j<=100 ) { //2. 조건식 [ true임녀 실행 o 아니면 실행x
			sum2 += j; //4.실행문;
			j++; //3.증감식
		}
		
		System.out.println(" while 1~100까지 누적합: "+sum2);
		
		//while 예3 무한루프
		while(true) {//조건식이 true 실행 // true 상수 => 무한루프
			System.out.println("무한루프");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if( exit==3 )
				break; // 가장 가까운 반복문 탈출 [if제외]
		}
	
}

}
