package Day11;

import java.util.Scanner;

import Day06.Board;

public class Day11_4_1BoardApp {
	/*
	 * �Խ���/��� ���α׷�[����ó��, ����ó��, ����Ʈ]
	 *		//[m]�Խù� Ŭ����
	 *				//��ȣ=�ε���, ����, ����, �ۼ���, �ۼ���, ��ȸ��, ��۸���Ʈ
	 *		//[m]��� Ŭ����
	 *				//����, �ۼ���, �ۼ���
	 *		//[c]��Ʈ�ѷ� Ŭ����
	 *				//1.��� 2.���� 3.���� 4.���� 5.���� 6.��۾���
	 *				//7.�Խù����� 8.�Խù��ҷ����� 9.������� 10.��ۺҷ����� 
	 *		//[v]Day11_4_1BoardApp Ŭ����
	 *				//�����[�Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ����]
	 * 
	 *   
	 * 
	 *  
	 */
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		Controller.load();//2.���� [��� �Խù�] �ҷ�����
		while(true)
		try {//���ܹ߻�: ����ڰ� ���� �Է½� ���� �߻�!!!->catch �̵�
			//��� �Խù� ���
			System.out.printf("%s\t%10s\t%10s\t%2s \n","��ȣ","����","�ۼ���","��ȸ��");
			int i = 0;//����Ʈ�� �ε���
			for(Board board : Controller.boadList) {
				System.out.printf(" \n", i, board.getTitle(),
						board.getWriter(), board.getDate(), board.getViewcount());
				i++;
			}
			System.out.println("1.���� 2.���� ����:");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("***�Խù� ���***");
				//nextLine(): �������� �Է°���[����: nextLine �տ� �ϴ� next �ϳ���]
				//�ذ���: �Ϲ� next�� nextLine ���̿� nextLine()
				scanner.nextLine();
				System.out.println("����:"); String ���� = scanner.nextLine();
				System.out.println("����:"); String ���� = scanner.nextLine();
				System.out.println("�ۼ���:"); String �ۼ��� = scanner.next();
				System.out.println("��й�ȣ[����/������]:"); String ��й�ȣ = scanner.next();
				Controller.write(����, ����, �ۼ���, ��й�ȣ); //�μ� ����
			}
			else if(ch==2) {
				
				System.out.print("�� �Խù� �н�����:");  String password = scanner.next();
				scanner.nextLine();//[�Ϲ� next ������ nextLine ����ϰ� �Ǹ� ���� �߻�[]
			}
			else {}
		}catch(Exception e) {
			System.err.println("�޽���))��ȣ�� �Է����ּ���.");
			scanner = new Scanner(System.in);
		}	
	}// me
	
}// ce
