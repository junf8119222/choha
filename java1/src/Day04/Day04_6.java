package Day04;

import java.util.Scanner;

public class Day04_6 {
	
	public static void main(String[] args) {
		//�������ϸ� ����ȵ� 1,2���� �� �ʿ� ���� ��Ǵ�� ���� �ܿ�� �ǰ�
		//3~4������ ���� ������ �ϸ� ��1.����� ���� �ź��ٴ�(���к��ٴ� ���α׷�) Ű����ũ �� ���α׷� ¥�°� �߿�
		//��� 1.�ڵ� ���� ģ��[���� �켱]
		//2.�� ģ��[�ڵ� �Ⱥ���-> ���� Ƚ��]
		//3.5���̻� �ľ��� Ű����ũ �������� 10�� �ȿ� ġ�� ���ϴ� ��
		//4.�ζ��Ǻ���10��
		//5.ƽ����15��
		//����������[10��] �б�����ó�� �������� �ʴ´�. ������ ������ �����ʴ�. ������ �Ǹ� ��
		/*
		 * ��� ���� [ ƽ���� ���� ]
				1. ������ 9ĭ ���� 
					1. String[] �迭 = new String[9]
			
				2. ����ڿ��� 0~8 �ε�����ȣ �Է¹ޱ�
					1. �ش� �ε����� O ǥ��
					2. �̹� �� �ڸ��� �� �Է� 
			
				3. ��ǻ�ʹ� 0~8 ���� ���� �߻� 
					1. �ش� �ε����� X ǥ��
					2. �̹� �� �ڸ��� �� ���� ����  
			
				4. �¸��Ǵ� 
					���� �ε������� ����� ��� �����ϸ�
					012 345 678
						ù��° �ε����� 0���� 6���� 3������
							�ι�° : ù��° +1
							����° : ��
					���� �ε������� ����� ��� �����ϸ� 
					036 147 258
					�밢�� �ε������� ����� ��� �����ϸ� 
					048 246
		 */
		//�غ�
		Scanner scanner = new Scanner(System.in);	//1.�Է°�ü
		String[] ������ = { "[ ]", "[ ]", "[ ]" ,
							"[ ]","[ ]","[ ]" ,
							"[ ]","[ ]","[ ]" }; //String ��ü 9���� ������ �� �ִ� �迭 ����
		String[]
		//���ӽ���
		while(true){//���ѷ��� �������� : 1. 9ĭ ��� ���� ������� 2. 3���� �Ǿ��� ��[�¸���]
			System.out.println(" ��ġ ���� : "); int ��ġ = scanner.nextInt();
			if( ������[��ġ].equals("[ ]") ) {
				// ������ ��ġ�� �����̸� �� �α�
				������[��ġ] = "[O]";
				break;	// ���� ����� �ݺ��� Ż��;
			}else {
				System.out.println("�˸�)) �ش� ��ġ�� �̹� ���� ����. [�� ����]");
			}
		} // while2 end [ �÷��̾� ���� �Է½� break; ]
		//////////////////////2. ��ǻ�� ����(�ε���) ����/////////////////
		//1. ���η� �̱�� ��
		//2. ���η� �̱�� ��
		for( int i =0; i<=2; i++ ) {// *i�� 0���� 2���� 1������->
			if(����[i].equals(������[i+3]) && ������[i+3].equals(������[i+6])) {
				�¸��� = ������[i];
			}
		}
		//3. �밢������ �̱�� ��
		if( ������[0].equals(������[4]) && ������[4].equals(������[8]){
			�¸��� = ������[0];
		}
		if( ������ [2])
	//////////////////////////4.��������//////////////////////
		if(�¸���.equals"[0]") ){
			System.out.println(" �˸�)) ��ǻ�� �¸�");
        //////////5.���º�/////////////////////////////
		} //while1 end [��������]
	}// main end
}//class end