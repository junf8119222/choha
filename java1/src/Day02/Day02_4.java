package Day02;

import java.util.Scanner;

public class Day02_4 {
	
	public static void main(String[] args) {
		//1.�Է�->����>���//���� ����
		Scanner scanner = new Scanner(System.in); 
		//2.�Է¹��� ������ -> ������ �̵�		
		System.out.println("�ݾ� : ");	int �ݾ� = scanner.nextInt();
		//3.����
		System.out.println(" �Է��� �ݾ� : " + �ݾ�);
		System.out.println(" �ʸ��� : " + (�ݾ�/100000) + "��");
		
		//�ݾ� = �ݾ� -( �ݾ�/100000)*100000;
		�ݾ� -= �ݾ� -( �ݾ�/10000)*10000; //�ݾ׿��� �ʸ��� ���� ����
		System.out.println(" ���� :"+ (�ݾ�/10000) + "��");

		System.out.println(" ����3) ���� �Է�:");	 int ����3 = scanner.nextInt();// �ϳ��� ������ �Է�
		System.out.println(" �Է��� ������ 7�� ��� �Ǵ� :" +( ����3%7 == 0));
	
		
	    
	    //�ݾ� = �ݾ� -( �ݾ�/100000)*100000;
	   
	    // %f : �Ǽ� ǥ��
	    	// %.����f		// %2.f :�Ҽ� 2�ڸ� ���� ǥ��
	    					// %5.f :�Ҽ� 5�ڸ� ���� ǥ��
	   //����10 : Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
	    		// ǥ��ü�� ���� =>(Ű - 100)*0.9
		System.out.println("����10) Ű: "); int Ű = scanner.nextInt();
		System.out.println("ǥ��ü��: " + (Ű-100)*0.9);
		
		//����11 Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
				//BMI ���� => ������/((Ű/100)*(Ű/100))
		System.out.println("����11) Ű :"); int Ű2 = scanner.nextInt();
		System.out.println("����11) ������ : "); int ������ =scanner.nextInt();
		System.out.println("BMI: " + ������/((Ű2/100)*(Ű2/100)));
		//double ���ϴ°� ���� Ű/100.0�� ��� ������ printf
		
		//����12 inch�� �Է¹޾� cm�� ��ġ��
		//* 1inch=2.54cm
		System.out.println("����12) inch"); int inch =scanner.nextInt();
		System.out.println("inch -> cm : "+ 2.54*inch);
		
		//����13 
		//�߰���� , �⸻��� ,�����򰡸� �Է� �޾� �ݿ����� ����ϱ�
			//�Ҽ� ��° �ڸ����� ���� ����ϱ�
		//�߰���� �ݿ����� =>30% //�⸻��� �ݿ����� =>30%  //������ �ݿ����� => 40%
		
		System.out.print(" ����13) �߰���� : "); double �߰���� = scanner.nextDouble();
		System.out.print(" ����13) �⸻��� : "); double �⸻��� = scanner.nextDouble();
		System.out.print(" ����13) ������ : "); double ������ = scanner.nextDouble();
		�߰���� = �߰���� * 0.3; �⸻��� *=0.3; ������ *=0.4;
		System.out.printf(" �ݿ����� ���� :%.f \n" , (�߰����+�⸻���+������));
		//����14
		//
		
		
		
		
		
		
	}

}
