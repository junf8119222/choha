package Day10;

public class Day10_2_1 {
	
	public static void main(String[] args) {
		
		//�������̽�[�߻�޼ҵ�]
			//����: ������ �����Ͽ� ������ ����� ����
				//���� �ٸ� Ŭ�����鰣�� ��ü���� ������ �������� ����
			//�߻�: ����[O] ����[X]
				//�������̽����� �����ϰ� �� Ŭ�������� �����Ѵ�.[������]
			//��) �������̽�: ����Ű, A��ư ,B��ư
			//	ö�ǰ��� Ŭ����
			//	A��ư :����
			//	B��ư :���
		//		�౸���� Ŭ����
			//	A��ư :��
			//	B��ư :���
		//1.�������̽� ��ü ����
		RemoteControl rc;
		//�������̽��� ��ü��
		//2.�������̽��� �ڷ�����Ŭ���� �޸� �Ҵ�
		rc = new Televion();
		//3.�������̽� ����
		rc.turnOn();//tv ���� �޼ҵ�
		rc.turnOff();//tv ���� �޼ҵ�
		rc.setVolume();//tv
		
		System.out.println("������ ����: |TV--->����� ��ü");
		
		//4.�������̽��� �����Ŭ�����޸� �Ҵ�[��ü]
		rc = new Audio();
		//5.�������̽� ����
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		//**�͸�������ü: Ŭ���� ���� �߻�޼ҵ� ����**
		RemoteControl rc2 = new RemoteControl() {
			//�������̽��� ��ü�� = new �������̽���
			//????????????????????????????????????override �����ٰ� ���� ����
		
			
			//����Ʈ �޼ҵ� ȣ��
			rc2.setMute(true);//�������̽����� �̹� �����Ǿ��ִ� ���޼ҵ�
			
			//���� �޼ҵ� ȣ��
			RemoteControl.changeBaterry();//��ü ����
			
			//�޸� �Ҵ� �޴� ���
				//�޸� �Ҵ� �ؾ��ϴ� ����: �ܺ� Ŭ����/�������̽��� �ʵ�(������),�޼ҵ�(������) ����
				//1.new ������
				//2.static ������
			
			