package Day11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;

import Day06.Board;

public class Controller {
	//0.�Խù� ����Ʈ[��� �Խù��� ��� ����Ʈ]
	public static ArrayList<Board_1> boadList =
			new ArrayList<>();
	
	
	//2.����޼ҵ�
	public static void write(String ����, String ����, String �ۼ���, String ��й�ȣ) {
		//1.��üȭ[������ 4�� --->1�� ��ü]
		Board board =new Board(����, ����, �ۼ���, ��й�ȣ);
		//2.����Ʈ�� ����
		boadList.add(board);
		//3.���Ͽ� ����
		save();
	}
	//3.����޼ҵ�
	public static void view() {
		
	}
	//4.�����޼ҵ�
	public static void update() {
		
	}
	//5.�����޼ҵ�
	public static void delete() {
		
	}
	//6.��۾���޼ҵ�
	public static void replywrite()_{
		
	}
	//7.�Խù�����޼ҵ�
	public static void save() {//����Ʈ�� ��� �Խù��� ���Ͽ� ����
	try{
		//1.������� Ŭ����
		FileOutputStream outputStream = new FileOutputStream("D:/java/�Խù�����.txt");
		//2.���Ͽ� �ۼ��� ����[���پ� = �Խù� 1���� = ��ü 1����]
		for(Board_1 board_1 : boadList) {//,:�ʵ屸�п�  \n:��ü���п�
			String �ۼ����� = board_1.get
	}
	catch( Exception e) {
		System.err.println("�˸�)) �������� ����(�����ڿ��� ����)");}
	}
	
	//8.�Խù��ҷ�����޼ҵ�[���α׷� ����]����-->����Ʈ
	public static void load() {
		try {
			byte[] bytes = new byte[1000];//2.����Ʈ�迭 ����
			InputStream.read(bytes);//3.��� ����Ʈ �о�ͼ� ����Ʈ�� ����
			String file = new String(bytes);//4.����Ʈ-> ���ڿ� ��ȯ
			String[] boards = file.split("\n");//5.���ڿ� �ڸ���[���پ� [\n]-> 1�� ��ü]
			for(String board : boards) {//�迭�� ���ڿ� �ϳ��� ������ 
			}
				String[] field = temp.split(",")//6.���ڿ� �ڸ���[����[,]-> ���ʵ�]
				Board_1 board_1 =new Board_1)(field[0], field[1],
				field[2], field[3], Integer.parseInt(field[4],field[5],null));//7.��üȭ
									//��ȸ���� �ʵ� �������̹Ƿ� ���������� ����ȯ[Inter.parseInt(���ڿ�)]
			boadList.add(board_1);//8.����Ʈ ���
			}
		}catch(Exception e) {System.err.println("�˸�))���Ϸε� ����(�����ڿ��Թ���)");}
		
	}
}
