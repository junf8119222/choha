package Day11;

public class Day11_3_1 {

	//p.422 ���� ������
		//����: ��� �޼ҵ忡�� try{}catch(){} ���� �ڵ� ������-> �Ѱ����� ���� �̵�
	
	public static void main(String[] args) {
		try {findclass();}
		catch( Exception e ) {}
		try { withdraw(30000);}
		catch(Exception e) {System.out.println(e);}
	}
public static void findclass() throws Exception {
	
//		try {//���ܰ� �߻��Ұ� ���� �ڵ�(���࿹��) Ȥ�� �Ϲݿ���[������]
		Class clazz = Class.forName()
//	}catch( Exception e) {
//		System.out.println(e);

	
	}
	}
}


//p.444~445 : ���� �����
public void withdraw( int money ) {
	if(20000 < money) {
		throw new Exception("�ܰ����")
	}
}