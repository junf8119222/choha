package Day10;

import java.util.Scanner;

public interface Ű����ũ_1 {
	//���: ����
	//Ŭ����:�Ե�����, ����ŷ
	//�������̽�: Ű����ũ
	//����ó��: ��ǰ��� ����
	public static void main(String[] args) {
		
		Ű����ũ_1 �Ե����� = new �Ե�����();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			�Ե�����.��ǰ���();
			int ch = scanner.nextInt();
			if(ch==-1) {
				�Ե�����.��ǰ�߰�();
			}
		}
		
	}
}
