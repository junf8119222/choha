package Day10;

import java.rmi.Remote;

public class Audio_1 implements RemoteControl{
	//������ �߸��ۼ�
	private int volume;
	
	@Override
	public void turnOff() {
		System.out.println("������� �մϴ�.");
		
	}
	@Override
	public void setMute(boolean mute) {
		System.out.println("������� ���ϴ�.");
	}
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff{
		System.out.println("Audio�� ���ϴ�.");
	}
	
	
}
