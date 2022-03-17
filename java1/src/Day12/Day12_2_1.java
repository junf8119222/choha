package Day12;

public class Day12_2_1 {

	public static void main(String[] args) {
		
		//String 메소드
		//p.499 charAt() : 문자열에서 특정문자 추출
		String ssn ="010624-1230123"; //주민등록번호
		char sex =ssn.charAt(7);
		
		switch(sex) {//switch 제어문[switch(검사대상)]
			case'1':// sex 변수의 값이 문자 1이면
			case'3':System.out.println("남자"); break;// sex변수의 값이
			case'2'://sex 변수의 값이 문자 3이면
			case'4':System.out.println("여자"); break;// sex변수의 값이
		}
		//p.501 equals() : 문자열 비교
			//기본자료형 사용하는 변수는 연산자 사용가능[==]
			//String 클래스 사용하는 객체는 == 연산자 사용불가능 [equals]
		
		//자바 메모리[]
		
		
		
		//1.문자열 선언
		String strVar1 = new String("신문철");
		String strVar2 = "신문철";//객체는 new 연산자가 필수이지만 String 클래스만 자동 객체
		//2.문자열 비교
		
		//p.502 getBytes() : 문자열 -> 바이트열 변환
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes(); //문자열 ->바이트열 변환
		System.out.println("영문1bytes 한글2bytes:"+ bytes1.length);//배열명.length : 배열길이 필드
		
		String str1 = new String(bytes1);
		System.out.println("바이트열 -> 문자열:"+str1);
		//1.인코딩타입[인코딩/디코딩: 반환 방식]
		//1.EYC-KR[한글/영문:한글 2바이트]
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println("EUC-KR 길이:"+bytes2.length);
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("바이트열 -> 문자열:" +str2);
		
		//UTF-8
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println("EUC-KR 길이:"+bytes3.length);
		String str3 = new String(bytes3, "UTF-8");
		System.out.println("바이트열 -> 문자열:" +str3);
		
		//P.504 indexOf() :문자 위치[인덱스] 찾기
		String subject ="자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); //3번 인덱스에서 프로그래밍 찾기 성공
		
		if(subject.indexOf("자바") !=-1) {//인덱스는 0번 시작
			
			//p.505 length(): 문자열 길이
			String ssn2 = "76312313465";
			int length = ssn2.length(); //문자내 글자수[길이 구하기]
			if(length==13) {//만약에 문자열내 13글자이면
				System.out.println("주민번호 자리수가 맞습니다.");
			}else {
				System.out.println("주민번호 자리수가 틀립니다.");
			}	
System.out.println("--------------------------------------");
			//p.506 replace("기존문자", "새로운 문자"): 문자열 대치[변경]
			String oldstr ="자바는 객체지향언어 입니다. . 자바는 풍부한 API를"
			String newStr = oldstr.replace("자바", "JAVA");
							//문자열.replace("기존문자","새로운 문자")
			System.out.println("기존문자열: "+oldstr);
			System.out.println("새로운문자열:"+newStr);
		System.out.println("-----------------------------");
		//p.507 substring() vs split() : 문자열 자르기
		String ssn3 = "880815-1234567"
		
		//split
			//"880815-1234567" "-" 기준 자르기시 2조각 -> 배열반환
			//[0]: 880815 [1]:1234567
		
				
				
		//p.508
			//영문문자열.toLowerCawe() -> 영문 [소문자로 변환]
			//영문문자열.toUpperCase() -> 영문 [대문자로 변환]

		//p.509
			//문자열.trim() : 앞뒤 공백제거
		//p.510 valueOf() : 기본타입[int, double 등]-> 문자열 변환
		String str2 = String.valueOf(10); //int형 10-> String 10으로 변환
		String str3 = String.valueOf(10.5); //double형 10.5 -> String 10.5으로
		String str4 = String.valueOf(true);//boolean형 true-> String true
		String str5 = 10+""; // int형을 String 변수에 저장[불가능]
		
			}
			
		}
		
	}
	
	
}
