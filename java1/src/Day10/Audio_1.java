package Day10;

import java.rmi.Remote;

public class Audio_1 implements RemoteControl{
	//완전히 잘못작성
	private int volume;
	
	@Override
	public void turnOff() {
		System.out.println("오디오를 켭니다.");
		
	}
	@Override
	public void setMute(boolean mute) {
		System.out.println("오디오를 끕니다.");
	}
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff{
		System.out.println("Audio를 끕니다.");
	}
	
	
}
