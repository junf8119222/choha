package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도:"); int year =scanner.nextInt();
		System.out.println("월:"); int month =scanner.nextInt();

		달력(year, month);
	
	}//m e
		//1.달력메소드
		public static void 달력( int year, int month) {
		
		//1.캘린더 클래스내 현재 날짜/시간 객체 호출
		Calendar calender = Calendar.getInstance();
		//2.연도, 월, 일 호출
		int year = calender.get( Calendar.YEAR);
		int month = calender.get( Calendar.MONTH)+1;//+1 하는 이유: 0:1월
		int day = calender.get( Calendar.DAY_OF_MONTH );
		//*해당 월의 1일의 요일 찾기
			//1.사용자 정의 캘린더 설정
			Calendar.set
		
		//3.출력
		System.out.println("****+");
		
		//*현재 월 1일의 위치 앞에 공백 채우기
		for( int i = 1; i<sweek ; i++ ) {
						//3월1일 = 화 =3
			System.out.print("\t");//공백출력
			}
		
		//1일부터 마지막날짜까지 출력
		for(int=i; i<=eday ; i++) {
			
			//만약에 오늘 체크
			if(i==day) System.err.print(i+"*\t");
			System.out.println(i+"\t");// i = 일수 출력
			
			//토요일마다 줄바꿈처리[토요일=7] 요일이 7배수마다
			if(sweek % 7 ==0) System.out.println();
			
			sweek++;//하루씩 요일 증가
		}
			
		//버튼[1.◀(이전달) 2.▶(다음달) 3.다시검색]//try{} 안에서 예외[에러]가
		//발생하면 catch 이동(프로그램 다운x)
		
		}//while ened
	}//달력 메소드 end

}//c e
