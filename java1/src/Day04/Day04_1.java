package Day04;

import java.util.Scanner;

public class Day04_1 {
	
	public static void main(String[] args) {
		//��� : if, switch
		//�ݺ��� : for[], while
		//for ��2) 1~100 �����հ�
		for( int j = 1; j<=10; j++ ) {
			sum += j; //sum = sum + j
		}
		System.out.println("for 1~100���� ������:" + sum );
		
		// while ��2) 1~100 �����հ�
		int j = 1;
		while( j<=100 ) { //2. ���ǽ� [ true�ӳ� ���� o �ƴϸ� ����x
			sum2 += j; //4.���๮;
			j++; //3.������
		}
		
		System.out.println(" while 1~100���� ������: "+sum2);
		
		//while ��3 ���ѷ���
		while(true) {//���ǽ��� true ���� // true ��� => ���ѷ���
			System.out.println("���ѷ���");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if( exit==3 )
				break; // ���� ����� �ݺ��� Ż�� [if����]
		}
	
}

}
