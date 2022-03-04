package Day03;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class Day03_2 { 
	
	public static void main(String[] args) {
		
			//입력 객체 ={ } 당 1번 선언
				Scanner scanner = new Scanner(System.in);
				
				// 문제1: 2개의; 정수를 입력받아서 더 큰수 출력
				System.out.println("정수3입력:");
				int 정수1 = scanner.nextInt(); // int 형 변수 선언하고 입력 받은 데이터를 정수로 가져와서 대입
				System.out.println("정수4입력:");
				int 정수2 =scanner.nextInt();
				
				// 제어
				if( 정수1 > 정수2 )		System.out.println(" 더 큰수 : " + 정수1);
				// 만약에 입력받은 정수1변수가 정수2변수 보다 크면 실행 아니면 다음 조건 
				else if( 정수1 < 정수2 ) 	System.out.println(" 더 큰수 : " + 정수2);
				// [다음조건] 정수1변수가 정수2 보다 작으면 실행 아니면 그외
				else 					System.out.println(" 같다 ");
				// 나머지[그외] 실행 
				
		// 나머지[그외] 실행
				
				
		
		//문제2: 3개의 정수를 입력 받아서 가장 큰수 출력
		System.out.println("정수1입력:");	int 정수3 = scanner.nextInt();
		System.out.println("정수2입력:");	int 정수4 = scanner.nextInt();
		System.out.println("정수3입력:");	int 정수5 = scanner.nextInt();
		int max = 정수3;// 가장 큰수를 저장하는 임시 저장
		
		//문제3: 4개의 정수를 입력받아서 가장 큰수 출력
		System.out.println("정수1입력:"); int 정수6 = scanner.nextInt();
		System.out.println("정수2입력:"); int 정수7 = scanner.nextInt();
		System.out.println("정수3입력:"); int 정수8 = scanner.nextInt();
		System.out.println("정수4입력:"); int 정수9 = scanner.nextInt();
		int max2 = 정수6;
		if( max2 < 정수7 ) { max2 = 정수7; }
		if( max2 < 정수8 ) { max2 = 정수8; }
		if( max2 < 정수9 ) { max2 = 정수9; }
		System.out.println(" 가장 큰수 : "+ max2 );
				
		
		
		//문제5: 4개의 정수를 입력받아서 오름차순 /내림차순
				System.out.println("정수1입력:"); int 정수13 = scanner.nextInt();//변수명 중복x
				System.out.println("정수2입력:"); int 정수14 = scanner.nextInt();
				System.out.println("정수3입력:"); int 정수15 = scanner.nextInt();
				System.out.println("정수4입력:"); int 정수16 = scanner.nextInt();
				
				//첫번째 값 기준으로 비교
				if( 정수13 > 정수14 ) {int temp = 정수13 ; 정수13 = 정수14; 정수14 = temp; }
				if( 정수13 > 정수14 ) {int temp = 정수13 ; 정수13 = 정수14; 정수14 = temp; }
				if( 정수13 > 정수14 ) {int temp = 정수13 ; 정수13 = 정수14; 정수14 = temp; }
		//문제6:점수를 입력받아 점수가 90점 이상이면 합격 아니면 불학격 출력
		System.out.println("점수 :");	 int  점수	=	scanner.nextInt()
		if( 점수 >= 90 )System.out.println(" 합격. ");
		else System.out.println("불합격. ");
		
		//문제7
		// 점수를 입력받아 점수가 90점 이상이면 A등급
		//			점수가 80점 이상이면 B등급
		//			점수가 70점 이상이면 C등급
		//			그외 재시험
		System.out.println("점수 : "); int 점수2 = scanner.nextInt();
		if(점수2>=90)System.out.println("A등급");
		else if(점수2>=80)System.out.println("B등급");
		else if(점수2>=80)System.out.println("C등급");
		else System.out.println("재시험");
		
		//문제8 로그인 페이지
		//[ 입력 ]: 아이디와 비밀번호
		//로그인 성공 아니면 로그인 실패 출력
		
		System.out.println("----------로그인 페이지----------");
		boolean	로그인성공 = false;
			//boolean : 1비트 true 혹은 false 저장
		if(id.equals("admin")) {	// id는 클래스 객체이기 때문에 ==불가능
			//객체 비교시에는 .equals()사용
		//문제9 
		System.out.println("국어점수 :"); int 국어 = scanner.nextInt();
		System.out.println("영어점수 :"); int 영어 = scanner.nextInt();
		System.out.println("수학점수 :"); int 수학 = scanner.nextInt();
		int 평균 = (국어+영어+수학)/3;
		if( 평균>=90 ) { //평균 90점 이상이면
			
			//if
			if( 국어 == 100 ) System.out.println("국어우수");
			if( 영어 == 100 ) System.out.println("영어우수");
			if( 수학 == 100 ) System.out.println("수학우수");
			
		}
		else if( 평균>=80 ) {//평균 80점 이상이면
			if( 국어>=90 ) System.out.println("결과 : 국어장려");
			
		}
		}
		
	
	}

}
