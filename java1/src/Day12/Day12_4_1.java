package Day12;

import java.util.Random;
import java.util.Scanner;

import javax.swing.event.CaretListener;

public class Day12_4_1 {
	
	Scanner scanner = new Scanner(System.in);
	
	String[] carlist = new String()[10];

	//������ȣ ���� ���α׷�
	//����
		//1.���� 0000~9999[4�ڸ� ����] ������ ���� 10�� �����ؼ� �迭�� ����
		//2.��� ���� ��ȣ�� �迭�� ����
		//3.���ڸ� ��ȣ�� Ȧ/¦ ����
		//4.���� ���ڸ� ��ȣ�� Ȧ�� ���� �迭�� ����
		//5.���� ���ڸ��� ��ȣ�� ¦�� ���� �迭�� ����
		//6.Ȧ������ �迭 ���//¦������ �迭 ���
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] carlist = new String[10];
		String[] evenlist = new String[10];
		String[] oddlist = new String[10];
		// *���ڿ� 10�� ������ �� �ִ� �迭 [������ȣ �ִ� 10�� ���� ����]
		while(true) {
			
			//��� ���� ��ȣ ���
			System.out.println("\n*** �������� ��� ������ȣ ***");
			for(String temp : Carlist) {
				if(temp != null) 
					if(Integer.parseInt(temp) % 2 ==0 ) {
						System.out.print(temp+"[¦]");
					}else {// ��%2
						System.out.print(temp+"[¦]");
					}
				}
			}
			//Ȧ������ ��ȣ ���
			System.out.println("\n*** �������� ��� Ȧ�� ���� ***");
			
			//¦������ ��ȣ ���
			System.out.println("\n*** �������� ��� ¦�� ���� ***");
			
			System.out.print("1.��������"); int ch = scanner.nextInt();
			if(ch==1) {
				//������ȣ ����
				Random random = new Random();//���� ��ü
				int intnum = random.nextInt(10000);//0~9999 �� ���� �߻�
				String strnum = String.format("%04d", intnum);//%0����d: ���ڸ�ŭ
				//�迭�� ������ ã�� ������ȣ ����
				boolean save = false;
				for(int i = 0; i<carlist.length ; i++) {
					if(carlist[i]==null) {carlist[i] = strnum; save=true; break;}
				}
				//¦������ ��ȣ ���
				
				//���࿡ ������� ������ ����
				if(save==false)System.err.println("���� [���� �Ұ�]");
										
			}
		}
		
	}

}
