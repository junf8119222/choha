package Day14;

import java.util.ArrayList;

public class 게시판 {
	
	//1.필드
	private String title;
	private String content;
	private String writer;
	private int point;
	
	//2.생성자[객체 생성시 초기값=처음값]
	//1.빈생성자
	public 게시판() {}
	//2.모든필드 생성자

	public 게시판(String title, String content, String writer, int point) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.point = point;
	}
	
		//3.특정필드
	
}
