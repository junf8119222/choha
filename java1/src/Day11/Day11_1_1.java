package Day11;

public class Day11_1_1 {
	
	/////////???????????????????
	//���������� ���� ��Ÿ�� �޼ҵ�� 
	
	
	public static void main(String[] args) {
		
		
					//������ü
		
	//4.
		//Dao: DB���ٰ�ü Dto:�������̵���ü
		
	//5.�͸�ü[�������̽��� ���� ����]
		//������ü: �������̽��� ��ü�� = new Ŭ������();
		//�͸�ü: �������̽� ��ü�� = new �������̽�(){����};//1ȸ��
	Action action = new Action() {
		
		@Override
		public void work() {
			System.out.println("���縦 �մϴ�.");
		}
	};// ���� ��
	
	action.work();
	}

	
}
