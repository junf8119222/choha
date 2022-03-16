package Day11;

import java.util.ArrayList;

public class Board {
	
	//1.필드
	private String title;
	private String content;
	private String password;
	private String writer;
	private int viewcount;
	private String date;
	private ArrayList<Reply_1>repList
							=new ArrayList<>();
	
	//2.생성자
		//1.빈생성자
	public Board() {}
		//2.게시물 등록시 사용되는 생성자[날짜 자동주입]

	public Board(String title, String content, String password, String writer, int viewcount, String date,
			ArrayList<Reply_1> repList) {
		super();
		this.title = title;
		this.content = content;
		this.password = password;
		this.writer = writer;
		this.viewcount = viewcount;
		this.date = date;
		this.repList = repList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<Reply_1> getRepList() {
		return repList;
	}

	public void setRepList(ArrayList<Reply_1> repList) {
		this.repList = repList;
	}
	//3.메소드 [private 필드 사용시 getter or setter 선언(자동 완성)]
	
	