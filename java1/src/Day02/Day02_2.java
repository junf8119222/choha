package Day02;

public class Day02_2 	
{ public static void main(String[] args) {
	
	byte var1 = -128; System.out.println(var1);
	byte var2 = -30; System.out.println(var2);
	byte var3 = 30; System.out.println(var3);
	//byte var4 = 300; System.out.println(var4);
		//�����߻� ; 128 �̻��� ������ �� ����.
	byte var4 = 'j'; System.out.println(var4);
	// ���� -> ����
	// p.43 char : 2����Ʈ[1����] �����ڵ�(�ڹ�:������ ��� ����) vs �ƽ�Ű�ڵ�
	char c1 = 'a'; System.out.println( c1 );
	char c2 = 97; System.out.println( c2 );		//10���� ǥ��
		//���� -> ���� ��ȯ
	char c3 ='\u0041'; System.out.println( c3 );	//16���� ǥ�� :	
	char c4 = '��'; System.out.println( c4 );
	char c5 = 44032; System.out.println( c5 );
	char c6 = '\uac00'; System.out.println( c6 );
	// ���� [�� ??? : ��ǻ�Ͱ� 2������ ����ϸ� ǥ������ ����---> ǥ������ �پ缺
		//2���� : 0 ,1
		//8���� : 0 ~ 7
		//10���� : 0 ~ 9
		//16���� : 0 ~ 9 a b c d e f
	
	short num1 = 30000; System.out.println( num1 );
	
	int num2 = 10; System.out.println( num2 ); //10����
	int num3 = 012; System.out.println( num3 );// 8������ �տ� 0 ���̱�
	int num4 =0xA;	System.out.println(	num4 ); //16������ �տ� 0x ���̱�
	
	long num5 = 10000000000l;	System.out.println( num5);		
	//[������ �ڿ� L] INT�� -> long�� 
	
	
	//p.47~48 float[ ������ �ڿ� f ] : 4����Ʈ / double (�Ǽ� �⺻Ÿ��): 8����Ʈ ;17�ڸ�
	//���� �� ũ�ٸ� �˸� ��
	double num6 = 3.14; System.out.println( num6 );
	float num7 = 3.14f; System.out.println( num7 );
	
	double num8 = 0.123456789123456789;
	float num9 =0.123456789123456789f;
	
	//p.48 boolean : 1��Ʈ [true Ȥ�� false]
		//����ġ : on, off
	boolean bo1 = true; System.out.println( bo1 );
	
		//p.49 : Ÿ�Ժ�ȯ
			//*ũ����� : byte -> short -> int-> long -> float -> double
			//1.�ڵ� ����ȯ
				//���� ���ڿ��� ū���ڷ� �̵�����
				//ū���ڿ��� ���� ���ڷ� �̵� �Ұ�
			byte ����Ʈ = 10;
			int ��Ʈ = ����Ʈ;//�ڵ� ����ȯ o
			//short ��Ʈ= ��Ʈ;//�ڵ� ����ȯ x ���� �߻�
	
			//2. ���� ����ȯ ( ĳ��Ʈ )
				//ū ���ڿ��� ���� ���ڷ� �̵� �����ε�... �� : ������ �ս�
				//(�������ڷ���)������
			short ��Ʈ = (short)��Ʈ;// int�� ������ short�� ��ȯ�ϴµ� ������ �߸�
					
}

}
