package Day10;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_��������_����Ʈ����_1 {
	
	public static void main(String[] args) {
		
		//1.����Ʈ[��ü] ����
		ArrayList<Book>bookList = new ArrayList<>();
	//����Ʈ Ŭ����<����Ʈ�ȿ� ������ Ŭ����>
		//<Ŭ����>:�ش� Ŭ������ ���� ��ü�� ����Ʈ�� ����
		//���̴� ����[�⺻:10]
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.���2.���3.����4.����");
			int ch = scanner.nextInt();
			if(ch==1) {
				//1.�Է¹ޱ�
				System.out.println("������:"); String ������ = scanner.next();
				System.out.println("����:"); String ���� = scanner.next();
				//2.��üȭ[������ ����---> 1�� ��ü
				Book_1 book_1 =new Book_1(������, ����);
				//3.�迭����[������ ã�Ƽ�] vs����Ʈ[����ã��x]
				
			}
		if(ch==2) {
			//1.�迭[null ����] vs ����Ʈ[null���� ���ص���
			for(Book book_1 : bookList) {
				System.out.printf(book_1.get������()+"\t"+book_1.get����();)
			}
		}
		if(ch==3) {}
			//1.�迭[�����Ŀ� �� �ε��� ����] vs �ε���[�ڵ�]
			// 1 2 3[2����] 1 null 3 4 vs 1 2 3 [2����] 1 3 4
			System.out.println("������ ������:"); String ������ = scanner.next();
			//����ã��
			for( Book_1.get������.equals(������);) {
				//�ش� �������� �Է¹��� ������� �����ϸ�
				bookList.remove(book);
				break;//���� ���������� �ݺ��� Ż��
			}
		if(ch==4) {
			System.out.println("������ ������:"); String ������ = scanner.next();
			//����ã��
			for(Book_1 book_1 : bookList) {
				if(book_1.get������().equals(������){
					System.out.println("���� ����:"); String ���� = scanner.next();
					book_1.set����(����);//����
					
				}
			}
		}
		}
	}

}
