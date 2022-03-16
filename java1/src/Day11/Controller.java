package Day11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;

import Day06.Board;

public class Controller {
	//0.게시물 리스트[모든 게시물을 담는 리스트]
	public static ArrayList<Board_1> boadList =
			new ArrayList<>();
	
	
	//2.쓰기메소드
	public static void write(String 제목, String 내용, String 작성자, String 비밀번호) {
		//1.객체화[변수가 4개 --->1개 객체]
		Board board =new Board(제목, 내용, 작성자, 비밀번호);
		//2.리스트에 저장
		boadList.add(board);
		//3.파일에 저장
		save();
	}
	//3.보기메소드
	public static void view() {
		
	}
	//4.수정메소드
	public static void update() {
		
	}
	//5.삭제메소드
	public static void delete() {
		
	}
	//6.댓글쓰기메소드
	public static void replywrite()_{
		
	}
	//7.게시물저장메소드
	public static void save() {//리스트내 모든 게시물을 파일에 저장
	try{
		//1.파일출력 클래스
		FileOutputStream outputStream = new FileOutputStream("D:/java/게시물파일.txt");
		//2.파일에 작성할 내용[한줄씩 = 게시물 1개씩 = 객체 1개씩]
		for(Board_1 board_1 : boadList) {//,:필드구분용  \n:객체구분용
			String 작성내용 = board_1.get
	}
	catch( Exception e) {
		System.err.println("알림)) 파일저장 실패(관리자에게 문의)");}
	}
	
	//8.게시물불러오기메소드[프로그램 시작]파일-->리스트
	public static void load() {
		try {
			byte[] bytes = new byte[1000];//2.바이트배열 선언
			InputStream.read(bytes);//3.모든 바이트 읽어와서 바이트에 저장
			String file = new String(bytes);//4.바이트-> 문자열 변환
			String[] boards = file.split("\n");//5.문자열 자르기[한줄씩 [\n]-> 1개 객체]
			for(String board : boards) {//배열내 문자열 하나씩 꺼내기 
			}
				String[] field = temp.split(",")//6.문자열 자르기[한줄[,]-> 각필드]
				Board_1 board_1 =new Board_1)(field[0], field[1],
				field[2], field[3], Integer.parseInt(field[4],field[5],null));//7.객체화
									//조회수는 필드 정수형이므로 정수형으로 형변환[Inter.parseInt(문자열)]
			boadList.add(board_1);//8.리스트 담기
			}
		}catch(Exception e) {System.err.println("알림))파일로드 실패(관리자에게문의)");}
		
	}
}
