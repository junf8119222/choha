package Day15;

public class ThreadA extends Thread{
	
	//�ʵ�
	public boolean stop = false; //���� �÷���
	public boolean work = true; //�۾����࿩��(����) �÷���

	//����ó��
	@Override
	public void run() {
		while(!stop) {//stop�� false�̸� ���ѷ���
			
			if(work) {
				System.out.println("Thread �۾� ����");
			}else {// work�� false�̸� 
				Thread.yield();//�ٸ������忡�� �纸
			}
		}//while end
	}
}
