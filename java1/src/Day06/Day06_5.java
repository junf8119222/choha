package Day06;

public class Day06_5 {
	
	public static void main(String[] args) {
		
		//p.207
		
		//1. ������ڷ� ��ü ����
		Korean k1 = new Korean();
			//2.��ü �����Ŀ� �ʵ� �� ����
			k1.name ="���缮";
			k1.ssn ="123123-123123";
			System.out.println("k2 ����:"+k2.nation);
			System.out.println("k2 �̸�:"+k2.name);
			System.out.println("k2 �ֹε�Ϲ�ȣ:"+k2.ssn);
		//2. �ʵ� 2���� ���� �����ڷ� ��ü ����
		Korean k2 = new Korean("���ڹ�","011225-1234567");
		System.out.println("k2 ����:"+k2.nation);
		System.out.println("k2 �̸�:"+k2.name);
		System.out.println("k2 �ֹε�Ϲ�ȣ:"+k2.ssn);
	}
		//1.������� ��ü
	Korean �ѱ���1 = new Korean();
			//�ѱ���1 ������ ���ѹα��̰� �̸�, �ֹε�Ϲ�ȣ ����
		//2.�ʵ� 1�� ������ ��ü ����
	Korean �ѱ���2= new Korean("���缮");
			//�ѱ���2 ������ ���ѹα��̰� �̸��� ���缮�̰� �ֹε�Ϲ�ȣ�� ����
	
		//3.�ʵ�2�� ������ ��ü ����
	Korean �ѱ���3 = new Korean("��ȣ��", "123456-123456");
			//�ѱ���3 ������ ���ѹα��̰� �̸��� ��ȣ���̰� �ֹε�Ϲ�ȣ�� ����
			
		//4.�ʵ�3�� ������ ��ü ����
	Korean �ѱ���4 = new Korean("�Ϻ�", "�ŵ���","123456-123456");

}