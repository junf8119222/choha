package Day07;

public class Member {
	
	//1.�ʵ�
		int mno;				//ȸ����ȣ
		String id;				//���̵�
		String password;		//��й�ȣ
		String name;			//�̸�
		String phone;			//����ó
	//2.������[�����ڸ�==Ŭ������]
		//1.�������[�⺻������]: �޼ҵ� ȣ��� ��ü������
		public Member() {}
		//2.��� �ʵ带 �޴� ������: ȸ�����Կ� ��ü������
		public Member(int mno, String id, String password, String name, String phone) {
			super();
			this.mno = mno;
			this.id = id;
			this.password = password;
			this.name = name;
			this.phone = phone;
		}

		
	//3.�޼ҵ�
		//1.ȸ������ �޼ҵ�[�μ�x��ȯo: ���Լ���true/���Խ��� false]
		boolean ȸ������() {
			System.out.println("-----------ȸ������ ������-----------");
			//1.�Է¹޴´�[id, pw, name, phone]
			System.out.println("���̵�:");		Day07_5_BookApplication.scanner.next();
			System.out.println("��й�ȣ:");		Day07_5_BookApplication.scanner.next();
			System.out.println("�̸�:");			Day07_5_BookApplication.scanner.next();
			System.out.println("����ó:");		Day07_5_BookApplication.scanner.next();
				//*scanner ��ü�� �ٸ� Ŭ������ static ����Ǿ�����
				//static �ʵ�,�޼ҵ�� ��ü ���� ȣ�Ⱑ��[Ŭ������,�ʵ��,�޼ҵ��]
				//*���̵��ߺ�üũ
				for( Member temp : Day07_5_BookApplication.members) {
					if(temp != null && temp.id.equals(id)) {
						//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
						System.out.println("�˸�]] ���� ��� ���� ���̵��Դϴ�.");
						return false;//�Լ�����--->��
					}
				//*ȸ����ȣ �ڵ��ο�[������ȸ���� ȸ���� ��ȣ+1]
					int bno =0; //ȸ����ȣ �����ϴ� ����
					int j =0;//�ݺ�Ƚ��[�ε���]
				for(Member temp: Day07_5_BookApplication.members) {
					if(temp==null) {//null ã��[null ã������ null-1 �ϸ� ������ ȸ��]
						bno= 1; break;//������
				}
					else {//ù��° ȸ���� �ƴϸ�
						bno= Day07_5_BookApplication.members[j-1].mno+1;//null ��[������ȸ��]��ȣ��+1
						break;//������
					}
					j++//�ε��� ����
				}	
			//2.4������->��üȭ->1��
			Member member= new Member(0, id, password, name, phone);//��� �ʵ带 �޴� �����ڷ� ��ü ����
			//3.�迭�� �� ������ ã�Ƽ� ���ο� ȸ��[��ü]�ֱ�
			for(Member temp : Day07_5_BookApplication.members) {
				if(temp==null) {//������̸�//�ٸ��߱�
					Day07_5_BookApplication.members[i]= member;//�� �ε����� ���ο� ȸ�� ����
					syso
						bno=1;break;
				}
					Day07_5_BookApplication.members[j-1].mno + 1;=>
										//null �� [������ȸ��] ��ȣ�� +1
					break;
				}
				j++;
			}
			//4.���� ������ true ��ȯ ���н� false ��ȯ
			
			return true;//ȸ������ �޼ҵ� ����~~~~~~~~~~[��ȯ:true]
		}
		i++;//i����
		}
		return false;//ȸ������ �޼��� ����[��ȯ false]

		//2.�α��� �޼ҵ�[�μ�x��ȯo]
		String �α���() {
			System.out.println("-----------�α��� ������----------");
			System.out.println("���̵�:");	String id =Day07_5_BookApplication
			System.out.println("��й�ȣ:");	String password= Day07_5_BookApplication
			
			return "���̵�";
		}
		//3.���̵� ã��޼ҵ�[�μ�x��ȯx]
		void ���̵�ã��() {
			System.out.println("----------���̵�ã�� ������--------");
			//1.�Է� ���� ���� �迭�� ã��
			for(Member temp : Day07_5_BookApplication.members) {
				if(temp !=null && temp.name.equals.(name) &&
						temp.phone.equals(phone)) {
					System.out.println("�˸�)) ȸ���� ���̵� :"+temp.id);
					return;//������ ���� ã������ �ش� �޼ҵ� ����
				}
		}
		//3.ã������ ã�� id ����ϰ� �� ã������ ���� ���
		System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
		
		//4.��й�ȣã�� �޼ҵ�[�μ�x��ȯx]
		void ��й�ȣã��() {
			System.out.println("---------��й�ȣã�� ������--------");
			System.out.println("���̵�:");	String id=Day07_5_BookApplication.scanner.next();
			System.out.println("����ó:");	String phone = Day07_5_BookApplication.scanner.next();
		}
		
			
		//5.ȸ��Ż�� �޼ҵ�
		//6.ȸ������ �޼ҵ�

}
