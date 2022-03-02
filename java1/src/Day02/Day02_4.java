package Day02;

import java.util.Scanner;

public class Day02_4 {
	
	public static void main(String[] args) {
		//1.입력->저장>출력//세고 빼고
		Scanner scanner = new Scanner(System.in); 
		//2.입력받을 데이터 -> 변수로 이동		
		System.out.println("금액 : ");	int 금액 = scanner.nextInt();
		//3.연산
		System.out.println(" 입력한 금액 : " + 금액);
		System.out.println(" 십만원 : " + (금액/100000) + "장");
		
		//금액 = 금액 -( 금액/100000)*100000;
		금액 -= 금액 -( 금액/10000)*10000; //금액에서 십만원 단위 제외
		System.out.println(" 만원 :"+ (금액/10000) + "장");

		System.out.println(" 문제3) 정수 입력:");	 int 문제3 = scanner.nextInt();// 하나의 정수를 입력
		System.out.println(" 입력한 정수는 7의 배수 판단 :" +( 문제3%7 == 0));
	
		
	    
	    //금액 = 금액 -( 금액/100000)*100000;
	   
	    // %f : 실수 표현
	    	// %.숫자f		// %2.f :소수 2자리 까지 표현
	    					// %5.f :소수 5자리 까지 표현
	   //문제10 : 키를 정수를 입력받아 표준체중 출력하기
	    		// 표준체중 계산식 =>(키 - 100)*0.9
		System.out.println("문제10) 키: "); int 키 = scanner.nextInt();
		System.out.println("표준체중: " + (키-100)*0.9);
		
		//문제11 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 => 몸무게/((키/100)*(키/100))
		System.out.println("문제11) 키 :"); int 키2 = scanner.nextInt();
		System.out.println("문제11) 몸무게 : "); int 몸무게 =scanner.nextInt();
		System.out.println("BMI: " + 몸무게/((키2/100)*(키2/100)));
		//double 로하는게 낫다 키/100.0로 계산 마지막 printf
		
		//문제12 inch를 입력받아 cm로 고치기
		//* 1inch=2.54cm
		System.out.println("문제12) inch"); int inch =scanner.nextInt();
		System.out.println("inch -> cm : "+ 2.54*inch);
		
		//문제13 
		//중간고사 , 기말고사 ,수행평가를 입력 받아 반영비율 계산하기
			//소수 둘째 자리까지 점수 출력하기
		//중간고사 반영비율 =>30% //기말고사 반영비율 =>30%  //수행평가 반영비율 => 40%
		
		System.out.print(" 문제13) 중간고사 : "); double 중간고사 = scanner.nextDouble();
		System.out.print(" 문제13) 기말고사 : "); double 기말고사 = scanner.nextDouble();
		System.out.print(" 문제13) 수행평가 : "); double 수행평가 = scanner.nextDouble();
		중간고사 = 중간고사 * 0.3; 기말고사 *=0.3; 수행평가 *=0.4;
		System.out.printf(" 반영비율 총점 :%.f \n" , (중간고사+기말고사+수행평가));
		//문제14
		//
		
		
		
		
		
		
	}

}
