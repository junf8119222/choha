package Day03;

public class Day_1 {
	
	public static void main(String[] args) {
			
			// 1���� : ��� , �Է�
			// 2���� : ����(����), ���(����)
			// ���
				// ��ǻ���� �Ǵܷ�~~ => ����� ��
				// ����
					// 1. IF( ����[true/fasle] )���๮;
					// 2. IF( ���ǽ� ) ���๮[��];
					//		else ���๮[����];
					// 3. ���๮�� 2�� �̻�( ; 2�� �̻�
					// 4.IF( ����1 ) { ���๮[��1] }
					//	 ELSE IF( ����2 ) {���๮ [��2] }
					//	 ELSE IF( ����3 ) {���๮ [��3] }
					//	 ELSE  [���๮ ����]; }
					// 5. if ��ø
					//		if( ���ǽ� ) {
					//			if( ���ǽ� ){ ���๮; }
					//
					//		}else{
					//			if( ���ǽ� )( ���๮; )
					//			else { ���๮; }
					//		}
		// ���� 1
		if( 3> 1 ) System.out.println("��) 3�� 1���� ũ��. ");
			// ���࿡ 3�� 1���� ũ�� ���o �ƴϸ� ���x
			// true�̸� ����
		//���� 2
		if( 3>5 ) System.out.println("��) 3�� 5���� ũ��. ");
			// ���࿡ 3�� 5���� ũ�� ���o �ƴϸ� ���x
		//���� 3
		if( 3>1 ) System.out.println("��3) 3�� 1���� ũ��.");
		else System.out.println("��3_2) 3�� 1���� �۴�.");
		
		//����4
		if( 3>2 ) { // true ���๮ ���� [���๮ (;) 2���̻��϶� ]
			System.out.println("true"); 
			System.out.println("3�� 2���� ũ��."); }
		} //true ���๮ ��
		else // false ���๮ ����
			System.out.println("false");
		//����5
		if( 3>5 ) System.out.println("��5) 3�� 5���� ũ��");
		else if( 3>4 ) System.out.println("��5) 3�� 4���� ũ��.");
		else if( 3>3 ) System.out.println("��5) 3�� 3���� ũ��.");
		else if( 3>2 ) System.out.println("��5) 3�� 2���� ũ��.");
		else System.out.println("true ����.");//���� x ��Ű�� 1�� ȿ�� o
		//����� 1���� �� ����// ���� �߿��� ���� ȿ���� �ƴ� ����
		
		if( 3>5 ) System.out.println("��5) 3�� 5���� ũ��");
		if( 3>4 ) System.out.println("��5) 3�� 4���� ũ��.");
		if( 3>3 ) System.out.println("��5) 3�� 3���� ũ��.");
		if( 3>2 ) System.out.println("��5) 3�� 2���� ũ��.");
		if( 3<2 ) System.out.println("true ����.");//���� x 5�� ��Ű�� ȿ��x
		// ��쿡 ���� ����� ���������� ���
	}
	}
		

}
