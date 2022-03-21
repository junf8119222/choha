package Day14;

public class 컨트롤러 {
	
	//1.메소드
		//1.입차메소드[인수o반환o]
	public boolean 입차(String 차량번호) {
		
		//코드실행 자리
		
		return true;
	} 
		//2.입차메소드[static 메소드는 객체없이 호출 가능]
	public static boolean 입차2( String 차량번호 ) {
		
		
		return true;
	}
		//3.출차 메소드
	public void 출차(String 차량번호) {
		//코드실행 자리
		//void는 retrun 생략 가능
	}
	
		//4.매출메소드
	public String 매출() {
		//코드실행 자리
		return "오늘 매출 :00000원";
	}
		//5.차량리스트
	public void 차량리스트() {
		//코드실행자리
	}
}
