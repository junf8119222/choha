package Day06;

import java.util.Scanner;

public class Day06_3 {
	
	//ȸ���� ����׷�[Ŭ���� ����]
		//1.�ʵ�
			//1.���̵�2.��й�ȣ3.�̸�4.��ȭ��ȣ
		//1.�ʱ�޴�[1.ȸ������2.�α���3.���̵�ã��,4.��й�ȣã��]
			//1.ȸ�����Խ�
			//2.�α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó��
			//3.���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
			//4.��й�ȣã��� ���̵� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ���
//�ڹٿ��� �޸� ����ϴ� ���
	//1.����: �޸� 1�� �Ҵ�
		//int ������ =��;
	//2.�迭:������ ���̸�ŭ �Ҵ�
		//int[] �迭�� =new int[100]
	public static void main(String[] args) {
		//���� �����ϴ� ����:main 
		Scanner scanner = new Scanner(System.in)
		Member[] memberlist = new member[100];
		//Member Ŭ������ ������� ��ü(id,pw,name,phone) 100�� ������ �� �ִ� �迭 ����
		
		
		 while(true) {// ���α׷� ���� ���ѷ���[��������:x]
			 
			 System.out.println("-----------ȸ����[Ŭ��������]----------");
			 System.out.println("1.ȸ������2.�α���3.���̵�ã��4.��й�ȣã��");
			 System.out.print("����:");	int ch = scanner.nextInt();
			 
			 if(ch==1) {//ȸ������
				 //1.id, password, name, phone �Է� �ޱ�=> ����4��
				 System.out.println("------------ȸ������ ������--------------");
				 System.out.println("���̵�: ");	String id = scanner.next();
				 System.out.println("��й�ȣ:");	String password = scanner.next();
				 System.out.println("�̸�:");		String name = scanner.next();
				 System.out.println("����ó:");	String phone = scanner.next();
				 
				 //2.��ü ����
				 Member member = new Member();
				 
				 //3.�Է¹��� ����4���� ��ü�� �ʵ忡 �����ϱ�
				 member.id =id;
				 //��ü�� �ʵ� =�Է¹��� ��
				 member.password =password;
				 member.name =name;
				 member.phone =phone;
				 
				 //4. ������ ��ü�� �����ϴ� �迭�� ����
				 	//1.���� �ε��� ã��[������ �ƴϸ� ����ȸ���� ����]
				 int i =0;//�ε��� ��ġ ����;
				 for(Member temp : memberlist) {
					 //*memberlist �迭�� member ��ü �ϳ��� �����ͼ� temp ���� �ݺ�
					 //2. ���鿡 �ε����� ��ü ����
					 if(temp==null) {//���࿡ �ش� ��ü�� �����̸�
						memberlist[i] =member;//�ش� �ε����� ���� ������� ��ü ����
						System.err.println("�˸�)) ȸ������ ����");
						break;//for ������[ �ȳ����� ��� ���鿡 ��ü ����Ǳ� ������]
					 }
					 i++;//�ε��� ����
				 }//for �� end
				 
			 }//ȸ������ end
			 else if(ch==2) {//�α���
				 //1.�Է¹ޱ�
				 System.out.println("-------------�α��� ������-------------");
				 System.out.println("���̵�:");	String loginid =scanner.next();
				 System.out.println("��й�ȣ:");	String loginpassword =scanner.next();
				 
				 //2. ���� �迭[ȸ������Ʈ] �� �Է¹��� ���� ��
				 boolean logincheck =false;// true:�α��ν������� ���� ����
				 for(Member temp : memberlist) {
					 //*memberlist�� 0�� �ε������� �� �ε������� �ϳ��� temp�� ����
					 if(temp !=null && temp.id.equals(logincheck) &&
							 temp.password.equals(loginpassword)) {
						 //*��ü�� null�϶��� equals �Ұ�[null �ƴ� ���¿����� equals����]
						 System.err.println("�˸�)) �α��� ����");
						 logincheck =true;//�α��� �����ߴٴ� ǥ�� �����
					 }//for end
				 }//3.�α��� ���� ��
				 if(logincheck==false) {//�α��μ����ÿ��� �Ʒ� �ڵ� ����Ұ�
				 System.err.println("�˸�))������ ȸ�������� �����ϴ�.");
				 }
			 
			 else if(ch==3) {//���̵� ã��
				 //1.�̸��� ����ó�� �Է� �޴´�.
				 System.out.println("--------------���̵�ã�� ������--------------");
				 System.out.println("�̸�:");		String name = scanner.next();
				 System.out.println("����ó:");	String phone = scanner.next();
				 //2.�迭�� ������ �̸��� ����ó�� �ִ��� Ȯ���Ѵ�.[�α���ó�� ���]
				 boolean findcheck =false;
				 for(Member temp :memberlist) {
					 
					 if(temp != null && temp.name.equals(name) )
				 }
			 }
			 else if(ch==4) {
				 System.out.println("���̵�:");	String id =scanner.next();
				 System.out.println("��й�ȣ:");	String password =scanner.next();
				 for(Member temp memberlist) {
					 if(temp ! =null && temp.id.equals(id) &&
							 temp.phone.equals(phone)	) {
						 System.out.println("�˸�)) ��й�ȣ ã�� ����");
						 System.out.println("ȸ�� ��й�ȣ:"+ temp.password);
						 findcheck =true; //ã���Ǹ� true ����
					 }
				 }
			 }//��й�ȣ ã��
			 else {System.out.println("�˸�)) �˼����� ��ȣ�Դϴ�.");}//�׿�
			 //4.������ ��ü�� �����ϴ� �迭�� ����
			 	//1.���鿡 �ε��� ã��[������ �ƴϸ� ����ȸ���� ����]
			 int i =0;//�ε��� ��ġ ����;
			 for(Member temp : memberlist) {
				 //2.���鿡 �ε��� ��ġ ����
				 if(temp==null) {
					 memberlist[i] =member;//�ش� �ε����� ���� ������� ��ü ����
					 System.err.println("�˸�]]");
					 break;//for ������[�ȳ����� ��� ���鿡 ������ ��ü ����Ǳ� ������]
				 }
				 i++;//�ε��� ����
			 }//for�� end
			 
		 }//���α׷� ���� while end
	}// main end
}// class end
