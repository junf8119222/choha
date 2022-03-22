package Day15;

public class StatePrintThread extends Thread {
	
	//�ʵ�
	private Thread targetThread;
	
	//������
	public StatePrintThread( Thread targetThread) {
		this.targetThread = targetThread;
	}
	//����ó��
	@Override
	public void run() {
		//������ ���� ȣ��
		Thread.State state = targetThread.getState();//�� ������ ���� ȣ��
		System.out.println("Ÿ�� ������ ����:"+state);
		//������ ���� ����
		if(state==StatePrintThread.State.NEW) {//������ �������� ��
			targetThread.start();
		}
		if(state==Thread.State.TERMINATED) {//TERMINATERD: ������ ������� ��
			break;
		}
	}

}
