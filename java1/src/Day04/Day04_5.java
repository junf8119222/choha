package Day04;

import java.util.Scanner;

public class Day04_5 {
	
	public static void main(String[] args) {
	int[] ����ڹ�ȣ = new int[6];	//����ڰ� ������ ��ȣ ���
	int[] ��÷��ȣ = new int[6];
	Scanner scanner = new Scanner(System.in);
		
		//1. ����ڿ��� �Է� �ޱ�
		for(int i= 0; i<6; i++) {
		//i�� 1���� 5���� 1�� ���� �ݺ� => 6ȸ �ݺ�
		System.out.println(" 1~45 ���� �Է�: ");
		int ��ȣ = scanner.nextInt();
		}
		boolean ��� = true; // ����Ǵ� ���� ����
	//����1 : ��ȿ�� �˻�
	if( ��ȣ <1 || ��ȣ>45) { //1���� �۰ų� 45���� ũ�� ������ �� ���� ��ȣ �Է½� ���Է�
		System.out.println(" �˸�)) ������ �� ���� ��ȣ�Դϴ�.[���Է�]");
		i--; // ���� i�� �����Է�x
		��� = false;
	}// if end
	
	//����2 :�ߺ�üũ
		//1.�迭�� ��� �ε��� ȣ��
		//2.�Է¹��� ���� ������ ��
	for( int j =0; j<6; j++) {
		if( ��ȣ==����ڹ�ȣ[j]) {
			//2. �Է¹��� ���� j��° �ε������� ������ ��
			System.out.println("�˸�)) �̹� ������ ��ȣ�Դϴ�.[���Է�]");
			i--; //���� i�� �����Է�x
			��� = false;
		} //if end
	}//for2 end
	
	//�����Է� �̸� �迭�� �����ϱ�
	if(���==true) ����ڹ�ȣ[i] = ��ȣ;
	//for end
	
	
	//*����� �迭�� ��� �ε��� ���
	for(int temp : ����ڹ�ȣ) {
		System.out.println( temp+"\t");
	}
	//2.��ǻ�Ͱ� ��������
	
	//
}
