package Day03;

import java.util.Scanner;

public class DAY03_3 
	
	{public static void main(String[] args) {
	
		//제어문 : 1. if문 2.switch문
			//if : 논리검사(true 혹은 false)	/ 경우의수 정해져 있지 않는경우
				// >= <= < == !=
		//switch : 데이터 검사				/ 경우의수 정해져 있는 경우
				//동일한 case이면 실행문 처리 후 -> 다음 case
		//형태 
			// switch (검사대상)
			//		case '값' : 실행문;
			//		case '값' : 실행문;
			//		case '값' : 실행문;
			//		default : 실행문;
			// }
		
		//break 
		//예1) 점수가 90점 이면 A 80점이면 70점이 C 그외 탈락
		int 점수 =80;
		if( 점수 == 90 )System.out.println("A등급");
		else if( 점수 == 80 ) System.out.println("B등급");
		
		
		switch (점수) {
		case 90 : System.out.println("A등급");	break;
		case 80 : System.out.println("B등급");	break;
		case 70 : System.out.println("C등급");	break;
		default : System.out.println("D등급");	break;
		}
		
		//	예2)
		int 버튼 = 3;
		switch( 버튼 ) {
		case 1 : System.out.println("1층으로 이동"); break;
		case 2 : System.out.println("2층으로 이동"); break;
		case 3 : System.out.println("3층으로 이동"); break;
		case 4 : System.out.println("4층으로 이동"); break;
		default : System.out.println(" 정지 ");
		}
		
		// 예3)
		char 등급 = 'B'
		switch( 등급 ) {
			case 'A':
			case 'B':System.out.println("우수 회원"); break;
			case 'C':
			case 'D':System.out.println("일반 회워너"); break;
			default :System.out.println(" 손님 ");
		}
		//예4)
		String 직급 = "과장";
		switch (직급) {// 선택조건 때문에 .equals 사용x
			case "부장": System.out.println("700만원"); break;
			case "과장": System.out.println("500만원"); break;
			default : System.out.println("300만원");
		}
		
		//문제1)
		Scanner scanner = new Scanner(System.in)
        System.out.println(" 국어 :"); int 국어 = scanner.nextInt()
        System.out.println(" 영어 :"); int 영어 = scanner.nextInt()
        System.out.println(" 수학 :"); int 수학 = scanner.nextInt()
        int 평균 = (국어+영어+수학)/3;
        System.out.println("평균 :" + 평균 + "나누기/10 :"+평균/10);
        
		}
	}

}
