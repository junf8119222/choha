package Day15;

public class TargetThread extends Thread {
	
	//����ó��
	@Override
	public void run() {//������ ����: NEW: ��ü�����ǰ� ��Ƽ������ ������
		
		for(long i=0; i<100000000; i++) {// ������ ����:RUNNABLE:��Ƽ������ ������
			//10�� �ݺ�
		//1.5�ʰ� ��� [�и��� = 1000/1��]
			try {Thread.sleep(1500);}	//������ ����: WAITING :��Ƽ������ �Ͻ�����
			catch(Exception e) {}
			
			for(long i=0; i<100000000; i++) {// ������ ����: RUNNABLE : ��Ƽ������ ������
				//10�� �ݺ�
				
			}//for end
		
		}
	}//run�޼ҵ尡 ����Ǹ� ������ ����: TERMINATERD:��Ƽ������ ����

}
