package Day12;

public class Day12_3_1 {
	
	public static void main(String[] args) {
		
		//���� �˻� ���α׷�
			//1.�Է¹ޱ�[System.in.read()]
			//2.String �迭�� �̿��� ���� ������ ���� 
				//1.�꿡���ٿ�/������
			//3.�˻����, �������
				//�˻����: Ư�� ���ڸ� �Է¹޾� ������ ���Ե� ���ڰ� ������ ��� ���
					//'���' �˻�-> "Tucker�� Go ��� ���α׷���" /"ȥ�� �����ϴ� C ���"
				//�������: ������ �������� �Ϻθ� �Է� �޾� ��µ� ������ �� ��ȣ�� ����
					//'����' ����-> ������ ������ �Ϻθ� �Է� �޾�-> ���� �Ϸ�
	String[] ������� = {}
	
	while(true) {
		System.out.println("1.�˻� 2.����");
		byte[] bytes =new byte[100];
		int count = System.in.read(bytes); //Ű����κ��� []��Ʈ�� ����Ʈ�� �о���� //�Ϲݿ���!!!![����]
		//�о�� ����Ʈ ����
		
		String ch = new String(bytes,0 , count-2);//����Ʈ�迭 --->���ڿ� ��ȯ[-2= \n\r����]

		if(ch.equals("1")) {
			System.out.println("*** �˻� ***");
			System.out.println("�˻� :"); count = System.in.read(bytes);
			String search = new String(bytes,0, count-2);//ã������
			for(String temp : �������) {//��� �迭�� ���ڿ��� �ϳ��� ��������
				/*
				if(temp.indexOf(search) != -1) {//�ش� ���ڿ��� ã�� ������ �ε����� �����ϸ�
					//indexOf �޼ҵ� -1 ��ȯ�Ǵ� ���� ������ �ܾ �������[�˻�x]
					System.out.println(temp);//�ش� ���ڿ��� ã�� ���ڰ� �����ϸ� ���
				}*/
				//���2
				if(temp.contains(search){
					//���ڿ�.contains("ã������"): ���ڿ��� ã�� ���ڰ� true[�ִ�]/false[����] ��ȯ
					System.out.println(temp);
				}				
			}
			
		}else if(ch.equals("2")) {
			System.out.println("***����***");
			System.out.println("������ ������[�Ϻ�]:");
			count = System.in.read(bytes);  //Ű����κ��� ����Ʈ �о�ͼ� �迭�� ����
			String search = new String(bytes, 0, count-2);//0���ε��� ����Ʈ���� -2������
			int i =0;//�ε���
			for( temp.contains)(search)) {
					//���ڿ�.contains("ã������"): ���ڿ��� ã�� ���ڰ� true[�ִ�]
					System.out.println("������ȣ:"+i+"�����:"+temp);
				}
				i++;
		}
			//������ȣ[�ε���] �Է¹޾� �����ϱ�
			System.out.print("������ȣ ����:");
				count = System.in.read(bytes);
				String oldstr = new String(bytes, 0, count-2);
				//ch2 ���ڿ��� �Է� ���� -->�ε���[����] ��ȯ
				int index =Integer.parseInt(ch2);// ch2���ڿ��� �Է¹��� --->�ε���[����] ��ȯ
				
			//���� ���� �Է¹ޱ�
			System.out.println("���� ����:");
				count = System.in.read(bytes);
				String oldstr = new String(bytes, 0, count-2);
			
			
		}
		
	}
	
	}

}
