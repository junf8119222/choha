package Day06;

public class Board {
	//*Board Ŭ���� ����
		//main�޼ҵ�x
	//1.�ʵ�
	String title;
	String content;
	String writer;
	String password;
	
	//2.������[Ŭ�����̸��� �����ϸ� �����ڸ�]
		//1.�������
	Board(){}
		//2.1�� �ʵ带 �޴� ������
	Board( String title ){//�ܺ� ����
		this.title =title;
		//this.�ʵ��=>���κ���
		//*�ܺηκ��� ���� ������ ���κ����� ����
	}
		//3.2�� �ʵ带 �޴� ������
	public Board(String title, String cotent) {
		super();
		this.title = title;
		this.content = cotent;
	}
	
	
		//4.3�� �ʵ带 
	public Board(String title, String cotent, String writer) {
		super();
		this.title = title;
		this.content = cotent;
		this.writer = writer;
	}

		
		// 4�� �ʵ带 �޴� ������
	
		public Board(String title, String cotent, String writer, String password) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	
	
	
	
	//3.�޼ҵ�

}
