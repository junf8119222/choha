package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Day10_6_1 {
	//�ֱ����ġ : �޸� : RAM : ���α׷� ����ÿ��� ���� �޸�
	//���������ġ : C����̺�, USB,CD : (���α׷�) ���� [��������]/���α׷��� ������
	//����ó��[�ڹٳ� �޸𸮸� --> ���������ġ]
	//DBó��[�ڹٳ� �޸� --> DB ����[PC]
		//FileOutputStream : ������� Ŭ����
			//��ü��.write(����Ʈ��);
		//FileInputStream : �����Է� Ŭ����
			//��ü��.read(����Ʈ�迭);
		//String Ŭ����
			//���ڿ�.equals() : ���ڿ� �� �޼ҵ�
			//���ڿ�.getBytes(): ���ڿ� ->����Ʈ���� ��ȯ
			//new String( ����Ʈ�迭 ) :����Ʈ�迭 ->���ڿ�
	public static void main(String[] args)  {
		
		//1.�����Է�[�ڹ�->����]
		FileOutputStream �����Է� = new FileOutputStream("D:/java/java1.txt");
		//FileInputStream : ��������� Ŭ����
		//FileInputStream( ���ϰ��/���ϸ�.Ȯ����);//txt:�޸���
		String ���� = "�ڹٿ��� �Էµ� ������";
		�������.write(����.getBytes());//����[����]:
		
		//2.�����Է�
		FileInputStream �����Է� = new FileInputStream("");"
		byte[] bytes = new byte[1000]; 
		�����Է�.read(bytes);
		System.out.println("���ϳ���:"+new String(bytes));
	}
}
