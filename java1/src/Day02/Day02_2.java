package Day02;

public class Day02_2 	
{ public static void main(String[] args) {
	
	byte var1 = -128; System.out.println(var1);
	byte var2 = -30; System.out.println(var2);
	byte var3 = 30; System.out.println(var3);
	//byte var4 = 300; System.out.println(var4);
		//오류발생 ; 128 이상은 저장할 수 없다.
	byte var4 = 'j'; System.out.println(var4);
	// 문자 -> 정수
	// p.43 char : 2바이트[1문자] 유니코드(자바:전세계 모든 문자) vs 아스키코드
	char c1 = 'a'; System.out.println( c1 );
	char c2 = 97; System.out.println( c2 );		//10진수 표현
		//정수 -> 문자 변환
	char c3 ='\u0041'; System.out.println( c3 );	//16진수 표현 :	
	char c4 = '가'; System.out.println( c4 );
	char c5 = 44032; System.out.println( c5 );
	char c6 = '\uac00'; System.out.println( c6 );
	// 진법 [왜 ??? : 컴퓨터가 2진수만 사용하면 표현단위 적다---> 표현단위 다양성
		//2진수 : 0 ,1
		//8진수 : 0 ~ 7
		//10진수 : 0 ~ 9
		//16진수 : 0 ~ 9 a b c d e f
	
	short num1 = 30000; System.out.println( num1 );
	
	int num2 = 10; System.out.println( num2 ); //10진수
	int num3 = 012; System.out.println( num3 );// 8진수는 앞에 0 붙이기
	int num4 =0xA;	System.out.println(	num4 ); //16진수는 앞에 0x 붙이기
	
	long num5 = 10000000000l;	System.out.println( num5);		
	//[데이터 뒤에 L] INT형 -> long형 
	
	
	//p.47~48 float[ 데이터 뒤에 f ] : 4바이트 / double (실수 기본타입): 8바이트 ;17자리
	//뭐가 더 크다만 알면 됨
	double num6 = 3.14; System.out.println( num6 );
	float num7 = 3.14f; System.out.println( num7 );
	
	double num8 = 0.123456789123456789;
	float num9 =0.123456789123456789f;
	
	//p.48 boolean : 1비트 [true 혹은 false]
		//스위치 : on, off
	boolean bo1 = true; System.out.println( bo1 );
	
		//p.49 : 타입변환
			//*크기순서 : byte -> short -> int-> long -> float -> double
			//1.자동 형변환
				//작은 상자에서 큰상자로 이동가능
				//큰상자에서 작은 상자로 이동 불가
			byte 바이트 = 10;
			int 인트 = 바이트;//자동 형변환 o
			//short 쇼트= 인트;//자동 형변환 x 오류 발생
	
			//2. 강제 형변환 ( 캐스트 )
				//큰 상자에서 작은 상자로 이동 가능인데... 단 : 데이터 손실
				//(변경할자료형)변수명
			short 쇼트 = (short)인트;// int형 변수를 short로 변환하는데 데이터 잘림
					
}

}
