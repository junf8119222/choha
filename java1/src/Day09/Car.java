package Day09;

import javax.swing.text.TabStop;

public class Car {//cs

	//1.�ʵ�
	Tire frontLeftTire =new Tire("�տ���",6);
	tire frontRightTire =new Tire("�տ�����",2);
	Tire backLeftTire =new Tire("�ڿ���",3);
	Tire backRightTire =new Tire("�ڿ�����",4);
//Ŭ������ ��ü�� = new ������(Ÿ�̾���ġ, Ÿ�̾����);
	
	//2.������
	//3.�޼ҵ�
	int run() {//�ڵ��� ȸ��[��� Ÿ�̾ü�� 1ȸ�� ȸ��] �޼ҵ�
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		//Ÿ�̾ ȸ���� �ߴµ� ����� false�̸� ��ũ
		//true�̸� ���� ����
		if(frontRightTire.roll()==false) {stop();==return 2;}
		if(backLeftTire.roll() ==false) {stop(); return 3;}
		if(backRightTire.roll() ==false) {stop(); return 4;}
		return 0;// return�� 0�̸� ��ũx
	}
	//void stop(){
	
	}
}