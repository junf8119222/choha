package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����:"); int year =scanner.nextInt();
		System.out.println("��:"); int month =scanner.nextInt();

		�޷�(year, month);
	
	}//m e
		//1.�޷¸޼ҵ�
		public static void �޷�( int year, int month) {
		
		//1.Ķ���� Ŭ������ ���� ��¥/�ð� ��ü ȣ��
		Calendar calender = Calendar.getInstance();
		//2.����, ��, �� ȣ��
		int year = calender.get( Calendar.YEAR);
		int month = calender.get( Calendar.MONTH)+1;//+1 �ϴ� ����: 0:1��
		int day = calender.get( Calendar.DAY_OF_MONTH );
		//*�ش� ���� 1���� ���� ã��
			//1.����� ���� Ķ���� ����
			Calendar.set
		
		//3.���
		System.out.println("****+");
		
		//*���� �� 1���� ��ġ �տ� ���� ä���
		for( int i = 1; i<sweek ; i++ ) {
						//3��1�� = ȭ =3
			System.out.print("\t");//�������
			}
		
		//1�Ϻ��� ��������¥���� ���
		for(int=i; i<=eday ; i++) {
			
			//���࿡ ���� üũ
			if(i==day) System.err.print(i+"*\t");
			System.out.println(i+"\t");// i = �ϼ� ���
			
			//����ϸ��� �ٹٲ�ó��[�����=7] ������ 7�������
			if(sweek % 7 ==0) System.out.println();
			
			sweek++;//�Ϸ羿 ���� ����
		}
			
		//��ư[1.��(������) 2.��(������) 3.�ٽð˻�]//try{} �ȿ��� ����[����]��
		//�߻��ϸ� catch �̵�(���α׷� �ٿ�x)
		
		}//while ened
	}//�޷� �޼ҵ� end

}//c e
