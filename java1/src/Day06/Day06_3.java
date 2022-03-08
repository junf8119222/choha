package Day06;

import java.util.Scanner;

public class Day06_3 {
	
	//회원제 프고그램[클래스 버전]
		//1.필드
			//1.아이디2.비밀번호3.이름4.전화번호
		//1.초기메뉴[1.회원가입2.로그인3.아이디찾기,4.비밀번호찾기]
			//1.회원가입시
			//2.로그인시 아이디와 비밀번호가 동일하면 로그인처리
			//3.아이디찾기는 이름과 전화번호가 동일하면 아이디 출력
			//4.비밀번호찾기는 아이디 전화번호가 동일하면 비밀번호 출력
//자바에서 메모리 사용하는 방법
	//1.변수: 메모리 1개 할당
		//int 변수명 =값;
	//2.배열:선언한 길이만큼 할당
		//int[] 배열명 =new int[100]
	public static void main(String[] args) {
		//위에 선언하는 이유:main 
		Scanner scanner = new Scanner(System.in)
		Member[] memberlist = new member[100];
		//Member 클래스로 만들어진 객체(id,pw,name,phone) 100개 저장할 수 있는 배열 선언
		
		
		 while(true) {// 프로그램 실행 무한루프[종료조건:x]
			 
			 System.out.println("-----------회원제[클래스버전]----------");
			 System.out.println("1.회원가입2.로그인3.아이디찾기4.비밀번호찾기");
			 System.out.print("선택:");	int ch = scanner.nextInt();
			 
			 if(ch==1) {//회원가입
				 //1.id, password, name, phone 입력 받기=> 변수4개
				 System.out.println("------------회원가입 페이지--------------");
				 System.out.println("아이디: ");	String id = scanner.next();
				 System.out.println("비밀번호:");	String password = scanner.next();
				 System.out.println("이름:");		String name = scanner.next();
				 System.out.println("연락처:");	String phone = scanner.next();
				 
				 //2.객체 생성
				 Member member = new Member();
				 
				 //3.입력받은 변수4개를 객체내 필드에 저장하기
				 member.id =id;
				 //객체내 필드 =입력받은 값
				 member.password =password;
				 member.name =name;
				 member.phone =phone;
				 
				 //4. 여러개 객체를 저장하는 배열에 저장
				 	//1.공백 인덱스 찾기[공백이 아니면 기존회원이 존재]
				 int i =0;//인덱스 위치 변수;
				 for(Member temp : memberlist) {
					 //*memberlist 배열내 member 객체 하나씩 꺼내와서 temp 저장 반복
					 //2. 공백에 인덱스에 객체 저장
					 if(temp==null) {//만약에 해당 객체가 공백이면
						memberlist[i] =member;//해당 인덱스에 새로 만들어진 객체 저장
						System.err.println("알림)) 회원가입 성공");
						break;//for 나가기[ 안나가면 모든 공백에 객체 저장되기 때문에]
					 }
					 i++;//인덱스 증가
				 }//for 문 end
				 
			 }//회원가입 end
			 else if(ch==2) {//로그인
				 //1.입력받기
				 System.out.println("-------------로그인 페이지-------------");
				 System.out.println("아이디:");	String loginid =scanner.next();
				 System.out.println("비밀번호:");	String loginpassword =scanner.next();
				 
				 //2. 기존 배열[회원리스트] 내 입력받은 값과 비교
				 boolean logincheck =false;// true:로그인실패으로 사용될 목적
				 for(Member temp : memberlist) {
					 //*memberlist내 0번 인덱스부터 끝 인덱스까지 하나씩 temp에 대입
					 if(temp !=null && temp.id.equals(logincheck) &&
							 temp.password.equals(loginpassword)) {
						 //*객체가 null일때는 equals 불가[null 아닌 상태에서만 equals하자]
						 System.err.println("알림)) 로그인 성공");
						 logincheck =true;//로그인 성공했다는 표시 남기기
					 }//for end
				 }//3.로그인 성공 무
				 if(logincheck==false) {//로그인성공시에는 아래 코드 실행불가
				 System.err.println("알림))동일한 회원정보가 없습니다.");
				 }
			 
			 else if(ch==3) {//아이디 찾기
				 //1.이름과 연락처를 입력 받는다.
				 System.out.println("--------------아이디찾기 페이지--------------");
				 System.out.println("이름:");		String name = scanner.next();
				 System.out.println("연락처:");	String phone = scanner.next();
				 //2.배열내 동일한 이름과 연락처가 있는지 확인한다.[로그인처리 비슷]
				 boolean findcheck =false;
				 for(Member temp :memberlist) {
					 
					 if(temp != null && temp.name.equals(name) )
				 }
			 }
			 else if(ch==4) {
				 System.out.println("아이디:");	String id =scanner.next();
				 System.out.println("비밀번호:");	String password =scanner.next();
				 for(Member temp memberlist) {
					 if(temp ! =null && temp.id.equals(id) &&
							 temp.phone.equals(phone)	) {
						 System.out.println("알림)) 비밀번호 찾기 성공");
						 System.out.println("회원 비밀번호:"+ temp.password);
						 findcheck =true; //찾았의면 true 변경
					 }
				 }
			 }//비밀번호 찾기
			 else {System.out.println("알림)) 알수없는 번호입니다.");}//그외
			 //4.여러개 객체를 저장하는 배열에 저장
			 	//1.공백에 인덱스 찾기[공백이 아니면 기존회원이 존재]
			 int i =0;//인덱스 위치 변수;
			 for(Member temp : memberlist) {
				 //2.공백에 인덱스 위치 변수
				 if(temp==null) {
					 memberlist[i] =member;//해당 인덱스에 새로 만들어진 객체 저장
					 System.err.println("알림]]");
					 break;//for 나가기[안나가면 모든 공백에 동일한 객체 저장되기 때문에]
				 }
				 i++;//인덱스 증가
			 }//for문 end
			 
		 }//프로그램 실행 while end
	}// main end
}// class end
