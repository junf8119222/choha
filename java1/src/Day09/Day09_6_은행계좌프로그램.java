package Day09;

import java.util.Scanner;

public class Day09_6_은행계좌프로그램 {

	//은행계좌프로그램 [상속]
		//은행[super]
		//국민은행[sub], 신한은행[sub], 하나은행[sub]
		//주 기능: 1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출
	
	//**main 밖에서 선언하는 이유
		//*모든 클래스에서 사용하기 위해 static 배열로 선언
		//static변수는 프로그램 시작시 메모리 할당->프로그램 종료시 
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in)
		
		while(true) {//프로그램 무한루프[종료조건x]
			
			System.out.println("----------------계좌 시스템-------------");
			System.out.print("1.계좌생성2.입금3.출금4.이체5.내계좌목록6.대출");
			int 선택 = scanner.nextInt();
			//컨트롤러 메소드 호출용 객체
			은행컨트롤러 컨트롤 = new 은행컨트롤러();
			if(선택==1) {
				//입력
				System.out.println("+++계좌등록 페이지+++"); 
				System.out.println("비밀번호:"); String 비밀번호=scanner.next();
				System.out.println("계좌주"); String 계좌주 =scanner.next();
				System.out.println("은행선택<1.국민2.신한3.하나>:"); int 은행번호 =scanner.nextInt();
				//컨트롤러 연결
				String 계좌번호 = 컨트롤.계좌생성(비밀번호, 계좌주, 은행번호)//메소드 호출[인수 3개]
				//메소드 반환 저장 = 계좌번호 혹은 null
				//메소드 실행후 메세지 출력
				if(계좌번호 !=null) {//계좌번호 가 null 아니면 
					System.out.println("**계좌 생성**");
					System.out.println("고객님의 계좌번호:"+계좌번호);
				}else{//계좌번호가 null이면
					System.out.println("알림]] 계좌등록 실패(관리자에게 문의)");
				}
			}
			else if(선택==2) {
				System.out.println("+++입금 페이지+++");
				System.out.println("계좌번호:"); String 계좌번호 = scanner.next();
				System.out.println("입금액:"); int 입금액 = scanner.nextInt();
			
				boolean result = 컨트롤.입금( 계좌번호, 입금액);
				
				if(result) {
					System.out.println("**입금 성공**");
				}else {
					System.out.println("알림]] 입금 실패 (동일한 계좌 없습니다.)");
				}
				
			}else if(선택==3) {
				System.out.println("+++출금 페이지+++");
				System.out.print("계좌번호:"); String 계좌번호 = scanner.next();
				System.out.print("비밀번호:"); String 비밀번호 = scanner.next();
				System.out.print("출금액"); int 출금액 = scanner.nextInt();
				
				int result = 컨트롤.출금(계좌번호, 비밀번호, 출금액);//메소드 호출: 객체명.메소드명(인수1,인수2,인수3)
				
				if(result==1) {
					System.out.println("**잔액 부족**");
				else if(result==2) {
					System.out.println("**출금 성공**");
				else if(result==3) {
					System.out.println("**올바른 정보가 아닙니다.**");
				}
			
			}else if(선택==4) {
				System.out.println("+++이체 페이지+++");
			}
			else if(선택==5) {
				System.out.println("+++계좌목록 페이지+++");
				System.out.println("내계좌주:"); String 계좌주 = scanner.next();
				은행[] 내계좌목록 =컨트롤.내계좌목록(계좌주);
				
				System.out.println("***검색한 계좌주 님의 계좌목록***");
				int i=1;
				for(은행 temp : 내계좌목록) {
					if(temp !=null)// 공백제외[공백이면 출력 오류 발생]
						System.out.println(i+"번 계좌번호:"+temp.get계좌번호() );
					i++;
				}
			}
			else if(선택==6) {
				System.out.println("+++대출 페이지+++");
			}else {
				System.err.println("알림]] 알수없는 번호입니다.");
			}
		}//while 프로그램 end	
			
	}//me
}//cs
