package Day10;

public interface RemoteControl {//인터페이스 선언
	
	//멤버
		//1.상수필드 : 고정된 데이터
		public int MAX_VOLUME = 10; //리모컨의 최대 소음
		public int MIN_VOLUME = 0;	//리모컨의 최소 소음
		//2.추상필드** : 선언 o 구현x
			//abstract:추상 [인터페이스에서는 생략]
		public void turnOn();//{}중략[구현x]
		public void turnOff();//구현x
		public abstravoid setVolume();//구현x
		//3.디폴트메소드	:선언 o 구현o
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음 처리");
			}
			else {
				System.out.println("무음 해제");
			}
		}
		//4.정적메소드	: 선언o구현o[객체없이 가능]
		static void changeBaterry() {
			System.out.println("건전지 교체합니다.");
		}
}
