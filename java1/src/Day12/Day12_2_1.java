package Day12;

public class Day12_2_1 {

	public static void main(String[] args) {
		
		//String �޼ҵ�
		//p.499 charAt() : ���ڿ����� Ư������ ����
		String ssn ="010624-1230123"; //�ֹε�Ϲ�ȣ
		char sex =ssn.charAt(7);
		
		switch(sex) {//switch ���[switch(�˻���)]
			case'1':// sex ������ ���� ���� 1�̸�
			case'3':System.out.println("����"); break;// sex������ ����
			case'2'://sex ������ ���� ���� 3�̸�
			case'4':System.out.println("����"); break;// sex������ ����
		}
		//p.501 equals() : ���ڿ� ��
			//�⺻�ڷ��� ����ϴ� ������ ������ ��밡��[==]
			//String Ŭ���� ����ϴ� ��ü�� == ������ ���Ұ��� [equals]
		
		//�ڹ� �޸�[]
		
		
		
		//1.���ڿ� ����
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";//��ü�� new �����ڰ� �ʼ������� String Ŭ������ �ڵ� ��ü
		//2.���ڿ� ��
		
		//p.502 getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes(); //���ڿ� ->����Ʈ�� ��ȯ
		System.out.println("����1bytes �ѱ�2bytes:"+ bytes1.length);//�迭��.length : �迭���� �ʵ�
		
		String str1 = new String(bytes1);
		System.out.println("����Ʈ�� -> ���ڿ�:"+str1);
		//1.���ڵ�Ÿ��[���ڵ�/���ڵ�: ��ȯ ���]
		//1.EYC-KR[�ѱ�/����:�ѱ� 2����Ʈ]
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println("EUC-KR ����:"+bytes2.length);
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("����Ʈ�� -> ���ڿ�:" +str2);
		
		//UTF-8
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println("EUC-KR ����:"+bytes3.length);
		String str3 = new String(bytes3, "UTF-8");
		System.out.println("����Ʈ�� -> ���ڿ�:" +str3);
		
		//P.504 indexOf() :���� ��ġ[�ε���] ã��
		String subject ="�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location); //3�� �ε������� ���α׷��� ã�� ����
		
		if(subject.indexOf("�ڹ�") !=-1) {//�ε����� 0�� ����
			
			//p.505 length(): ���ڿ� ����
			String ssn2 = "76312313465";
			int length = ssn2.length(); //���ڳ� ���ڼ�[���� ���ϱ�]
			if(length==13) {//���࿡ ���ڿ��� 13�����̸�
				System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
			}else {
				System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
			}	
System.out.println("--------------------------------------");
			//p.506 replace("��������", "���ο� ����"): ���ڿ� ��ġ[����]
			String oldstr ="�ڹٴ� ��ü������ �Դϴ�. . �ڹٴ� ǳ���� API��"
			String newStr = oldstr.replace("�ڹ�", "JAVA");
							//���ڿ�.replace("��������","���ο� ����")
			System.out.println("�������ڿ�: "+oldstr);
			System.out.println("���ο�ڿ�:"+newStr);
		System.out.println("-----------------------------");
		//p.507 substring() vs split() : ���ڿ� �ڸ���
		String ssn3 = "880815-1234567"
		
		//split
			//"880815-1234567" "-" ���� �ڸ���� 2���� -> �迭��ȯ
			//[0]: 880815 [1]:1234567
		
				
				
		//p.508
			//�������ڿ�.toLowerCawe() -> ���� [�ҹ��ڷ� ��ȯ]
			//�������ڿ�.toUpperCase() -> ���� [�빮�ڷ� ��ȯ]

		//p.509
			//���ڿ�.trim() : �յ� ��������
		//p.510 valueOf() : �⺻Ÿ��[int, double ��]-> ���ڿ� ��ȯ
		String str2 = String.valueOf(10); //int�� 10-> String 10���� ��ȯ
		String str3 = String.valueOf(10.5); //double�� 10.5 -> String 10.5����
		String str4 = String.valueOf(true);//boolean�� true-> String true
		String str5 = 10+""; // int���� String ������ ����[�Ұ���]
		
			}
			
		}
		
	}
	
	
}
