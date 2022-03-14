package Day09;

public class 은행컨트롤러 {//클래스
	
	//해당 클래스는 은행 관련 컨트롤러
	//M: 모델[데이터ㅏ]
	//V: 뷰[입출력]
	//C: 모델[M]과 뷰[V] 연결 역할
	
	//뷰에서 요청하는 서비스[기능] 제공
		//1.계좌생성[C]
	public boolean 계좌생성(String 비밀번호, String 계좌주, int 은행번호) {return false;}
		//1.입력받은 값을 가져온다[인수]
			//계좌번호 자동생성
		//2.객체화[다수의 변수를 하나의 객체로 만들기]
			if(은행번호==1) {
				은행 temp =new 국민은행("0", 비밀번호, 계좌주,0);
			}
			else if(은행번호==2) {
				은행 temp =new 신한은행("0",계좌주,);
			}
			else if(은행번호==3) {
				은행 temp =new 하나은행("0");
			}
		//2.입금[U]
	public boolean 입금() {return false;}
		//3.출금[U]
	public boolean 출금() {return false;}
		//4.이체[U]
	public boolean 이체() {return false;}
		//5.내계좌목록[R]
	public boolean 내계좌목록() {return false;}
		//6.대출[U]
	public boolean 대출() {return false;}

}
