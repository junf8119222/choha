package Day14;

public class Sound extends Thread{

	static boolean stop = true; //���� ����[true ���� false ����]
	
	//�޼ҵ�
	public void soundstop(boolean stop) {
		this.stop = stop;
		if(stop) {System.out.println("�Ҹ��ѱ�~~~~~");}
		else {System.out.println("�Ҹ� ����~~~~~~");}
	}
	
	@Override
	public void run() {
		
		while(this.stop) {//stop������ true�̸� ���ѷ��� [�������� : stop ������]
			System.out.println("~~~~�Ҹ� �����~~~~");
			try {Thread.sleep(10000);} catch(Exception e) {}
		}
	}
	
}
