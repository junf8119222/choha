package Day10;

import java.rmi.server.RemoteRef;

public class Televion implements RemoteControl , Seachable{
				//Ŭ������ implements �������̽���
						//�����ϴ�
	private int volume;		
	//ctrl+�����̽���
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
			
	}
	@Override
	public void setVolume( int volume ) {
		if(volume>RemoteControl.MAX_VOLUME) {
			//�������� �ִ�������� ũ�� ������ 10���� ����[����]
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			//���𱠤��� �ּҼ������� ������ ������ 0���� ����[����]
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}	
		System.out.println("���� tv ����: "+this.volume);
		
	}
	////////////////////////////////????????????????????search???
		//////////////////void����????super����????
	}

}
