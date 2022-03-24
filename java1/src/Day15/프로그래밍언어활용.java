package 과제;

import java.util.Scanner;

public class 프로그래밍언어활용 {
	
	public static void main(String[] args) {
			// main중괄호안에 코드를 입력해야 실행이 된다.

		학생[] 학생목록 = new 학생[100];
		
		while( true ) { // 무한반복 
			Scanner scanner = new Scanner(System.in); // 입력받을 때 쓰는 객체
			
			System.out.println("---------------------------"); // 출력하고 줄 바꿈
			System.out.println("\t성\t적\t표"); // \t : 들여쓰기
			System.out.println("---------------------------");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
			System.out.println("---------------------------");
			
				// 배열내 모든 학생(객체) 꺼내오기 
//				for( int j = 0 ; i<학생목록.length ; i++ ) {
//					
//					학생 temp = 학생목록[i];
//					if( temp != null ) {
//						System.out.println( (j)+"\t"+temp.이름+"\t"+temp.국어+"\t"+temp.영어+"\t"+temp.수학+"\t"+temp.총점+"\t"+temp.평균+"\t1");
//					}
//				}
				// 위 for 업그레이드 버전 
				int j = 0; // 인덱스용 변수 
				for( 학생 temp : 학생목록  ) { 
					// 배열내 학생이 존재할때만 출력하자
					if( temp != null ) {
						System.out.println( (j) +"\t"+temp.이름+"\t"+temp.국어+"\t"+temp.영어+"\t"+temp.수학+"\t"+temp.총점+"\t"+temp.평균+"\t1");
					}
					j++; //인덱스 증가
				}
			
			System.out.println("--------------------------");
			System.out.println("1.학생추가 2.학생삭제  :");
			int 메뉴선택 = scanner.nextInt();
			if( 메뉴선택 == 1 ) {
				System.out.print("이름 : ");	String 이름 = scanner.next();
				// 자료형 변수명 = 값
			// 문자열자료형 이름 = 입력값 가져오기
				System.out.print("국어 : ");	int 국어 = scanner.nextInt();
				System.out.print("영어 : ");	int 영어 = scanner.nextInt();
				System.out.print("수학 : ");	int 수학 = scanner.nextInt();
				int 총점 = 국어 + 영어 + 수학;	
				double 평균 = 총점 / 3.0;
				
				// 1. 객체생성 방법 : 클래스명 객체명(아무거나) = new 생성자();
				학생 s1 = new 학생(이름, 국어, 영어, 수학, 총점, 평균);
				// 2. 배열에 저장 
				for( int i = 0 ; i<100 ; i++ ) { // i는 0~99까지 반복 [ 왜? 0부터 하죠?? 배열의 인덱스용으로 사용할려고 [ 인덱스 0부터 ~ ]
			//  반복문( 시작값     ;   조건(끝나는값) ; 증감
					if( 학생목록[i] == null  ) {
						// 만약에 i번째 인덱스 값이 null(객체가 없다=학생이없다) 
						학생목록[i] = s1; // 학생 객체를 배열내 저장했으면
						System.out.println("*학생저장");
						break; // 멈춤
					}
				}
				
			}else if(메뉴선택 == 2 ) {
				System.out.println("삭제할 학생번호(인덱스) : "); int 삭제번호 = scanner.nextInt();
				학생목록[삭제번호] = null;
				
			}
			
			
			
		}
	} // 
} // 
