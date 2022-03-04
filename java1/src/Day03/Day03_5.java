package Day03;

public class Day03_5 {
	
	public static void main(String[] args) {
		
		//별문제3 : 입력받은 줄 수 만큼 출력
		System.out.println("문제3) 줄수 :"); int
		for( int i = 1 ; i<=line3 ;i++) {
			//* i는 1부터 입력받은 줄 수까지 1씩 증가
			// 1. 별찍기
			for( int s = 1; s<=i ; s++) {
				System.out.println("*");
			}
			//2. 줄바꿈처리
			System.out.println(); // 줄 바꿈
		}
		//순서도
			//사용자가 3을 입력했을때
			// i=1 i<=3[true] -> i++
				// s=1 s<=2 [true] -> * -> s++
				// s=2 s<=2 [false] -> * -> 반복문 종료
		//줄바꿈
		//i=2 i<=3 [true] -> i++
			// s=1 s<=2 [true] -> * -> s++
			// s=2 s<=2 [true] -> * -> s++
			// s=3 s<=2 [false] -> for2 반복문종료
		//줄바꿈
		//i=3 i<=3 [true] -> i++
			// s=1 s<=3 [true] -> * -> s++
			// s=2 s<=3 [true] -> * -> s++
			// s=3 s<=3 [true] -> * -> s++
			// s=4 s<=4 [false] -> for2 반복문종료
		// 줄바꿈
		// i=4 i<=3 [false} for1 반복문종료
		
		//1.별찍기
		for( int = 1; s<=line4 ; s++ ) {
			
		//2.ㅂ
		}
		
	
}

}
