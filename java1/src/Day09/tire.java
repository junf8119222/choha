package Day09;

public class tire {// 클래스 선언
	//필드 
	public int maxRotation;// 최대 회전수[회전가능수]
	public int accumulatedRotation;// 누적 회전수
	public String location;// 타이어 위치
	
	//22.생성자[객체 생성시 초기값(처음값)
	public Tire( String location , int maxRotation) {
		//타이어 위치, 최대 회전수
		this.location =location; //외부로부터 전달받은 인수를 내부변수에 대입
		this.maxRotation =maxRotation;
	}	

	//메소드
	public boolean roll() {//타이어 회전 구현 메소드
		if(accumulatedRotation < maxRotation){
		//만약에 누적회전수가 최대회전수 작으면[ 수명남음 ]
		}
	}//me
}//ce
