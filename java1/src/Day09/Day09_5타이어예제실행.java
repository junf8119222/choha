package Day09;

public class Day09_5Ÿ�̾������ {//cs
	
	public static void main(String[] args) {//ms
	
		//1.��ü ����[�ڵ��� 1�� ����]
		Car mycar =new Car();
			//Ŭ���� �� Ÿ�̾� ��ü�� 4�� -> mycar ����
		//2.�޼ҵ� ȣ��
		for(int i =1 ; i<=5; i++) {
			
			int problemLocation = mycar.run();// �ڵ��� ȸ���޼ҵ� ȣ��=>5��
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾� ��ü");
				mycar.frontLeftTire =new HankookTire("�տ���", 15);
				//����Ŭ���� ��ü�� =new ����Ŭ����();
				//����� ������ ����
			}
		}
	}//me

}//cs
