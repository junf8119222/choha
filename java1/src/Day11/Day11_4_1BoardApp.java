package Day11;

import java.util.Scanner;

import Day06.Board;

public class Day11_4_1BoardApp {
	/*
	 * 게시판/댓글 프로그램[예외처리, 파일처리, 리스트]
	 *		//[m]게시물 클래스
	 *				//번호=인덱스, 제목, 내용, 작성자, 작성일, 조회수, 댓글리스트
	 *		//[m]댓글 클래스
	 *				//내용, 작성자, 작성일
	 *		//[c]컨트롤러 클래스
	 *				//1.목록 2.쓰기 3.보기 4.수정 5.삭제 6.댓글쓰기
	 *				//7.게시물저장 8.게시물불러오기 9.댓글저장 10.댓글불러오기 
	 *		//[v]Day11_4_1BoardApp 클래스
	 *				//입출력[입력받아 컨트롤러에게 입력받은 값 전달]
	 * 
	 *   
	 * 
	 *  
	 */
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		Controller.load();//2.파일 [모든 게시물] 불러오기
		while(true)
		try {//예외발생: 사용자가 문자 입력시 예외 발생!!!->catch 이동
			//모든 게시물 출력
			System.out.printf("%s\t%10s\t%10s\t%2s \n","번호","제목","작성자","조회수");
			int i = 0;//리스트내 인덱스
			for(Board board : Controller.boadList) {
				System.out.printf(" \n", i, board.getTitle(),
						board.getWriter(), board.getDate(), board.getViewcount());
				i++;
			}
			System.out.println("1.쓰기 2.보기 선택:");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("***게시물 등록***");
				//nextLine(): 공백포함 입력가능[문제: nextLine 앞에 일단 next 하나로]
				//해결방법: 일반 next와 nextLine 사이에 nextLine()
				scanner.nextLine();
				System.out.println("제목:"); String 제목 = scanner.nextLine();
				System.out.println("내용:"); String 내용 = scanner.nextLine();
				System.out.println("작성자:"); String 작성자 = scanner.next();
				System.out.println("비밀번호[수정/삭제시]:"); String 비밀번호 = scanner.next();
				Controller.write(제목, 내용, 작성자, 비밀번호); //인수 전달
			}
			else if(ch==2) {
				
				System.out.print("현 게시물 패스워드:");  String password = scanner.next();
				scanner.nextLine();//[일반 next 다음로 nextLine 사용하게 되면 문제 발생[]
			}
			else {}
		}catch(Exception e) {
			System.err.println("메시지))번호로 입력해주세요.");
			scanner = new Scanner(System.in);
		}	
	}// me
	
}// ce
