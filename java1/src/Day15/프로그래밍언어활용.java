package ����;

import java.util.Scanner;

public class ���α׷��־��Ȱ�� {
	
	public static void main(String[] args) {
			// main�߰�ȣ�ȿ� �ڵ带 �Է��ؾ� ������ �ȴ�.

		�л�[] �л���� = new �л�[100];
		
		while( true ) { // ���ѹݺ� 
			Scanner scanner = new Scanner(System.in); // �Է¹��� �� ���� ��ü
			
			System.out.println("---------------------------"); // ����ϰ� �� �ٲ�
			System.out.println("\t��\t��\tǥ"); // \t : �鿩����
			System.out.println("---------------------------");
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
			System.out.println("---------------------------");
			
				// �迭�� ��� �л�(��ü) �������� 
//				for( int j = 0 ; i<�л����.length ; i++ ) {
//					
//					�л� temp = �л����[i];
//					if( temp != null ) {
//						System.out.println( (j)+"\t"+temp.�̸�+"\t"+temp.����+"\t"+temp.����+"\t"+temp.����+"\t"+temp.����+"\t"+temp.���+"\t1");
//					}
//				}
				// �� for ���׷��̵� ���� 
				int j = 0; // �ε����� ���� 
				for( �л� temp : �л����  ) { 
					// �迭�� �л��� �����Ҷ��� �������
					if( temp != null ) {
						System.out.println( (j) +"\t"+temp.�̸�+"\t"+temp.����+"\t"+temp.����+"\t"+temp.����+"\t"+temp.����+"\t"+temp.���+"\t1");
					}
					j++; //�ε��� ����
				}
			
			System.out.println("--------------------------");
			System.out.println("1.�л��߰� 2.�л�����  :");
			int �޴����� = scanner.nextInt();
			if( �޴����� == 1 ) {
				System.out.print("�̸� : ");	String �̸� = scanner.next();
				// �ڷ��� ������ = ��
			// ���ڿ��ڷ��� �̸� = �Է°� ��������
				System.out.print("���� : ");	int ���� = scanner.nextInt();
				System.out.print("���� : ");	int ���� = scanner.nextInt();
				System.out.print("���� : ");	int ���� = scanner.nextInt();
				int ���� = ���� + ���� + ����;	
				double ��� = ���� / 3.0;
				
				// 1. ��ü���� ��� : Ŭ������ ��ü��(�ƹ��ų�) = new ������();
				�л� s1 = new �л�(�̸�, ����, ����, ����, ����, ���);
				// 2. �迭�� ���� 
				for( int i = 0 ; i<100 ; i++ ) { // i�� 0~99���� �ݺ� [ ��? 0���� ����?? �迭�� �ε��������� ����ҷ��� [ �ε��� 0���� ~ ]
			//  �ݺ���( ���۰�     ;   ����(�����°�) ; ����
					if( �л����[i] == null  ) {
						// ���࿡ i��° �ε��� ���� null(��ü�� ����=�л��̾���) 
						�л����[i] = s1; // �л� ��ü�� �迭�� ����������
						System.out.println("*�л�����");
						break; // ����
					}
				}
				
			}else if(�޴����� == 2 ) {
				System.out.println("������ �л���ȣ(�ε���) : "); int ������ȣ = scanner.nextInt();
				�л����[������ȣ] = null;
				
			}
			
			
			
		}
	} // 
} // 
