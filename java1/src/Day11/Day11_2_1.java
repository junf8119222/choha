package Day11;

import java.io.StreamCorruptedException;

public class Day11_2_1 {
	
	//p.422
		//��ǻ���� �ϵ���� ������ ���� [����Ұ���]
		//������� �߸��� ���� or �������� �߸��� �ڵ��� ������ ����
		//����: 1.�Ϲݿ��� 2.���࿹��
			//�Ϲݿ���: ������[����]���� ���� �˻�[�����ڿ��� ���� ����ó�� �ȳ�(������)]
			//���࿹��: ������[����]�Ŀ� ���� �˻�[������ ������ �Ǵ��ؼ� ����ó��]
		//����ó��
			//����: ������ �߻��ϸ� ���α׷��� ����ȴ�.[�������� ����]
			//���࿡ ������ �߻��ϸ� ��ü �ڵ尡 ����[���α׷��� ������� �ʰ�]
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }catch
	 * 
	 * }
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		//p.423[NullPointerException]
	try {
		String data = null;
		System.out.println(data.toString());//objectŬ���� �޼ҵ� : toString() : ��ü�������
			//���������� ���� ����[���� ����]
		//������ �߻��ϴ� ����: null�� �޸� �Ҵ��� ���� ������ ��ü������� �Ұ���
		
		
		
		}//try end
		catch(NullPointerException ��ü��) {
			System.out.println("���ܹ߻�:"+��ü��);
		}
		//p.424
		try{//���ܰ� �߻��� �� ���� �ڵ�
			String[] �迭 = new String[2];//String 2���� �����Ҽ� �ִ� �迭
			�迭[0]="a"; �迭[1]="b"; �迭[2]="c"
		}catch
		
		//p.426
		String data1 = "100"; //���ڿ�
		String data2 = "a100" //���ڿ�
		int value1 = Integer.parseInt(data1);//"100"->100
		int value2 = Integer.parseInt(data2);//"a100"->X[a�� ������ ǥ�� �Ұ���]
					//integer.paseInt(���ڿ�); ���ڿ�-> ����
		//���� �߻� ����: ���ڿ��� ���������� ��ȯ�� ���������� ���ڿ��� ��ȯ�� �Ұ���
		//������ �߻��ϸ� catch �̵�[���� �߻� ���� �ڵ� ����x]
		int result = value1 + value2;
		System.out.println(data1+"+"+data2+"="+result);
	}catch{
	
	}
	//p.428
	String ���ڿ� = "���缮" // �ڹ� Ŭ������ �ϳ�[������ object ���]
	Object ���۰�ü;		// �ڹ� Ŭ���� �ֻ��� Ŭ����
	
	���۰�ü = ���ڿ�;		//�ڽ�-->�θ�[����]
	���ڿ� = (String)���۰�ü;		//�θ�--->�ڽ� [�Ұ���]
		//��������ȯ
		//�����߿� ����ȯ
	//���� ����ó�� �Ǵ�
		//*�����(����� ����) ���õ� �ڵ�[������ ����ó��]
	
	}//me

}//ce