package Day14;

import java.awt.Toolkit;

public class Day14_4 {
	
	public static void main(String[] args) {
		
		
		//p.576 ��Ƽ������ ����
			//���μ��� : �ü�������� ���� ���� �ϳ��� ���ø����̼�
			//�ü���� ���μ��� �ʿ��� �޸� �Ҵ�[�ڹٿ��� �޸� ����x �ü��(������)o]
			//�̱� ������: �ڵ� �о��ִ� �帧 1�� = main�޼ҵ� 
			//��Ƽ ������: �ڵ带 �о��ִ� �帧 ������ = main �޼ҵ�� ������
			//����: ����� �����帧������ / �����尡 �ϳ��� ó��
				//������� : �ڵ�1->�ڵ�2->�ڵ�3->�ڵ�4->�ڵ�5
			//Thread Ŭ����(���ο����) vs Main�޼ҵ�(���ν����尡 ����)
				//1. Thread Ŭ���� 
					//1.����Ŭ������ extends Thread
					//2.run() �޼ҵ� �������̵�[������]
					//3.��ü ����
					//5.��ü.start()
					//*start() �޼ҵ� ȣ��� run�޼ҵ� ����
				//2. Runnable �������̽�
					//1.����Ŭ������ implements Runnable
					//2.run() �޼ҵ� �����Ѵ�.
					//3.�ܺο��� ������ü �����Ѵ�.
					//4.Thread Ŭ���� ��ü ������ 
					//5.thread Ŭ����
					//*.start
		//p.581 ����1
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();//�Ҹ� ���� �޼ҵ� ���� Ŭ����
		
		for(int i = 0; i<5; i++) {
			toolkit.beep();//.beep():�Ҹ� �޼ҵ�
		try {	
			Thread.sleep(500);//��������(main������)��
		}catch(Exception e) {}
	}
		for( int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);//0.5 �Ͻ�����
		}catch(Exception e) {}
	}
		
	//P.582 ����2
	//1.Ŭ���� ��ü ����
	Thread thread2 = new BeepThread();
	//����Ŭ���� = �ڽ�Ŭ������ ������ 
	//			�θ�<----�ڽ�[�ڵ�����ȯ]
	//			�θ�----->�ڽ�[��������ȯ]
	//2.������ ��ü�� start()
		//run �޼ҵ� ȣ�� ����[��Ƽ������ ����]
	thread2.start();
			
		//*��Ƽ ������(main������, beepT)
	//1.�������̽��� ������ü
	Runnable runnable = new Beeptask();
	//2.Thread Ŭ���� ��ü ������ �����ڿ� ������ü �ֱ�
	Thread thread = new Thread(Beeptask);
	//3.thread ��ü�� start() �޼ҵ� ȣ��
	thread.start();
	
	//���
	for(int i = 0; i<5; i++) {
		System.out.println("��");
		try0
	
	
	}
	//�������̽� �����
		//1.Ŭ�������� implements �� �Ŀ� ����=> ������ü
		//2.�������̽��� new �����ڸ� ���� �߻�޼ҵ� ���� =>�͸�
		
	
	//*�͸� ������ ��ü
	Runnable runnable = new Runnable() {
		//*�������̽��� new(�޸��Ҵ�)
		//*�޸� �Ҵ��ϱ� ���ؼ� �߻�޼ҵ� ���� => �͸�ü[Ŭ���� ����x]
		
		
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5 ; i++) {
				toolkit.beep();
				try {Thread.sleep(500);}
				catch(Exception e) {}
			}
			
		}
	};
		System.out.println("MAIN�޼ҵ� �ȿ� �ִ� ������ �̸�:"+Thread.currentThread().getName());
			//Thread.currentThread(): �� �ڵ带 �о��ִ� ������ ȣ��
							//.getName():������ �̸� ȣ�� //setName():������ �̸� ����
		System.out.println("�۾� ������ �̸�:"+thread.getName());
System.out.println("-----------------------��Ƽ������ ---------------");	

		//p.599

		for(int i =1; i<=10; i++) {
					//10ȸ �ݺ�ó��
			//i�� 1�϶� ���� ���� ������ ��ü ���� = thread1
			//* ���� �����Ǿ ��ȯ�Ҵ�[�ü��=>�����층]
			//�̹Ƿ� ���� ���� ����x 
			
			//1.i��° ������ ��ü ����
			Thread thread4 = new CalcThread("thread"+i);
			
			//*�켱����
				//���࿡ 10�� �ƴϸ� �켱���� ���� 10�̸� �켱���� 10
			if(i !=10 ) {thread4.setPriority(thread.MIN_PRIORITY);}
			
			//2.i��° ������ ����
			thread4.start();
			
		}
	}

}
