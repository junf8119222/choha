package Day03;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class Day03_2 { 
	
	public static void main(String[] args) {
		
			//�Է� ��ü ={ } �� 1�� ����
				Scanner scanner = new Scanner(System.in);
				
				// ����1: 2����; ������ �Է¹޾Ƽ� �� ū�� ���
				System.out.println("����3�Է�:");
				int ����1 = scanner.nextInt(); // int �� ���� �����ϰ� �Է� ���� �����͸� ������ �����ͼ� ����
				System.out.println("����4�Է�:");
				int ����2 =scanner.nextInt();
				
				// ����
				if( ����1 > ����2 )		System.out.println(" �� ū�� : " + ����1);
				// ���࿡ �Է¹��� ����1������ ����2���� ���� ũ�� ���� �ƴϸ� ���� ���� 
				else if( ����1 < ����2 ) 	System.out.println(" �� ū�� : " + ����2);
				// [��������] ����1������ ����2 ���� ������ ���� �ƴϸ� �׿�
				else 					System.out.println(" ���� ");
				// ������[�׿�] ���� 
				
		// ������[�׿�] ����
				
				
		
		//����2: 3���� ������ �Է� �޾Ƽ� ���� ū�� ���
		System.out.println("����1�Է�:");	int ����3 = scanner.nextInt();
		System.out.println("����2�Է�:");	int ����4 = scanner.nextInt();
		System.out.println("����3�Է�:");	int ����5 = scanner.nextInt();
		int max = ����3;// ���� ū���� �����ϴ� �ӽ� ����
		
		//����3: 4���� ������ �Է¹޾Ƽ� ���� ū�� ���
		System.out.println("����1�Է�:"); int ����6 = scanner.nextInt();
		System.out.println("����2�Է�:"); int ����7 = scanner.nextInt();
		System.out.println("����3�Է�:"); int ����8 = scanner.nextInt();
		System.out.println("����4�Է�:"); int ����9 = scanner.nextInt();
		int max2 = ����6;
		if( max2 < ����7 ) { max2 = ����7; }
		if( max2 < ����8 ) { max2 = ����8; }
		if( max2 < ����9 ) { max2 = ����9; }
		System.out.println(" ���� ū�� : "+ max2 );
				
		
		
		//����5: 4���� ������ �Է¹޾Ƽ� �������� /��������
				System.out.println("����1�Է�:"); int ����13 = scanner.nextInt();//������ �ߺ�x
				System.out.println("����2�Է�:"); int ����14 = scanner.nextInt();
				System.out.println("����3�Է�:"); int ����15 = scanner.nextInt();
				System.out.println("����4�Է�:"); int ����16 = scanner.nextInt();
				
				//ù��° �� �������� ��
				if( ����13 > ����14 ) {int temp = ����13 ; ����13 = ����14; ����14 = temp; }
				if( ����13 > ����14 ) {int temp = ����13 ; ����13 = ����14; ����14 = temp; }
				if( ����13 > ����14 ) {int temp = ����13 ; ����13 = ����14; ����14 = temp; }
		//����6:������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���а� ���
		System.out.println("���� :");	 int  ����	=	scanner.nextInt()
		if( ���� >= 90 )System.out.println(" �հ�. ");
		else System.out.println("���հ�. ");
		
		//����7
		// ������ �Է¹޾� ������ 90�� �̻��̸� A���
		//			������ 80�� �̻��̸� B���
		//			������ 70�� �̻��̸� C���
		//			�׿� �����
		System.out.println("���� : "); int ����2 = scanner.nextInt();
		if(����2>=90)System.out.println("A���");
		else if(����2>=80)System.out.println("B���");
		else if(����2>=80)System.out.println("C���");
		else System.out.println("�����");
		
		//����8 �α��� ������
		//[ �Է� ]: ���̵�� ��й�ȣ
		//�α��� ���� �ƴϸ� �α��� ���� ���
		
		System.out.println("----------�α��� ������----------");
		boolean	�α��μ��� = false;
			//boolean : 1��Ʈ true Ȥ�� false ����
		if(id.equals("admin")) {	// id�� Ŭ���� ��ü�̱� ������ ==�Ұ���
			//��ü �񱳽ÿ��� .equals()���
		//����9 
		System.out.println("�������� :"); int ���� = scanner.nextInt();
		System.out.println("�������� :"); int ���� = scanner.nextInt();
		System.out.println("�������� :"); int ���� = scanner.nextInt();
		int ��� = (����+����+����)/3;
		if( ���>=90 ) { //��� 90�� �̻��̸�
			
			//if
			if( ���� == 100 ) System.out.println("������");
			if( ���� == 100 ) System.out.println("������");
			if( ���� == 100 ) System.out.println("���п��");
			
		}
		else if( ���>=80 ) {//��� 80�� �̻��̸�
			if( ����>=90 ) System.out.println("��� : �������");
			
		}
		}
		
	
	}

}
