package Day14;

import java.awt.Toolkit;

public class Beeptask implements Runnable{
					//�����ϴ�[runnable]
	//implements ���� �߻�޼ҵ� ��!!! �����ϱ�
		//ctrl + �����̽���
	@Override
	public void run() {//Runnable �������̽��� run�޼ҵ� �����ϱ�
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0; i<5; i++) {
			toolkit.beep();//�Ҹ�����
			try {
			Thread.sleep(500); // �ιݿ��ܰ� ������ �߻� -> ����ó��������
			}catch(Exception e) {}
		}
	}
}
