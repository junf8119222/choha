package Day06;

import java.util.Scanner;

public class Day06_6 {
	
	//게시판[클래스 버전]
		//0.게시물 설계=> 클래스 선언
			//필드: 제목, 내용, 작성자, 비밀번호
			//생성자: 사용자유무 선택
	
		//1.첫화면[모든 게시물(번호,작성자,제목) 출력]
		//2.메뉴[1.글쓰기2.글보기]
			//1.글쓰기[제목, 내용, 작성자, 비밀번호=>4개변수-> 객체화]
			//2.글보기[해당 글번호의 입력받아 해당 글 상세 페이지(번호,작성자,제목,내용) 표시]
				//글번호는 배열에 저장되는 순서[인덱스]
				//글보기 메뉴
		//3.글보기 메뉴[1.목록보기2.삭제3.수정]
			//1.삭제시: 작성자와 비밀번호 입력받아 동일하면 삭제
			//2.수정시: 작성자와 비밀번호 입력받아 동일하면 제목과 내용만 수정
	public static void main(String[] args) {//ms
		
		//준비[모든 {} 안에서 사용되는 변수 선언]
		Scanner scanner = new Scanner(System.in);//1.입력객체
		Board[] boardlist = new Board[100];//*Board 객체를 100개를 저장할 수 있는 1차원 선언
			//*Board 객체를 100개 저장할 수 있는 1차원 배열 선언
		
		while(true) {//프로그램 실행 무한루프[종료조건: x]
			System.out.println("------------커뮤니티------------");
///////////////////////////모든 게시물 조회//////////////////////////////////////////////
			System.out.println("번호\t작성자\t제목");
			int index =0;//인덱스 변수[배열내 객체 수 체크]
			for(Board board : boardlist) {//배열내 모든 객체(게시물) 출력 반복문
				if(board != null) {//만약에 해당 board 객체가 내용물이 있으면 출력
					System.out.printf("%d\t%s \n", index, board.writer , board.title);
				}
				index++;//인덱스 증가
			}
			/////////////////////////////////////////////////////////////////////////
			System.out.println("1.글쓰기2.글보기");
			int ch =scanner.nextInt();
			if(ch==1) {//1.글쓰기
/////////////////////////////////글쓰기////////////////////////////////////////				
				//1.4개 변수를 입력받는다.
				System.out.println("-------------------글쓰기 페이지----------------");
				System.out.print("title:");			String title= scanner.next();
				System.out.println("content:"); 	String content= scanner.next();
				System.out.println("writer:");		String writer= scanner.next();
				System.out.println("password:");	String password= scanner.next();
				//2.4개 변수를 객체화[객체를 만들어서 4개변수를 객체내 필드에 저장]
				Board board= new Board(title, content, writer, password);//4개 필드를 갖는 생성자 사용
				//3.배열내 빈공간을 찾아서 빈공간에 객체 대입
				int i =0;
				for(Board temp :boardlist) {
					if(board != null) {//빈공간 찾았으면
						boardlist[i] = board; //해당 인덱스에 새로운 객체 저장
						break;//한번 저장했으면 반복문 종료
						
					}
					i++;
				}
/////////////////////////////////////////////////////////////////////////////////////////// 
			}
			
			else if(ch==2) {//2.글쓰기
/////////////////////////////////////글보기//////////////////////////////////////////////////////				
					System.out.println(" 게시물 번호(인덱스) 선택: "); int bno =scanner.nextInt();
					
					System.out.println("-----------------게시물 상세페이지-------------------");
					//반복문 사용 목적x-> 출력할 위치[인덱스] 입력 받았기 때문에 -> 입력받은 인덱스 위치에 객체 출력
					System.out.printf("작성자: %s	제목	: %s \n" ,
							boardlist[bno].writer, boardlist[bno].content);
					
					System.out.printf("내용: %s \n" ,	boardlist[bno].content);
					System.out.println("-------------------------------------");
					System.out.print("1.목록보기(뒤로가기)2.글삭제3.글수정 선택:");
					
///////////////////////////////////////////////////////////////////////////////////////
					
					 int ch2 = scanner.nextInt();
					 if(ch==1) {}
					 else if(ch==2) {
////////////////////////////////////////////글삭제/////////////////////////////////////
						System.out.println("알림)) 현 게시물 비밀번호:");	String password =scanner.next();
						//반복문x 검색x =>삭제할 인덱스 위치를 입력받았기 때문에
						if(boardlist[bno].password.equals(password)	) {//게시물 객체내 비밀번호 ==입력한 비밀번호
							System.out.println("알림)) 삭제 성공");
							boardlist[bno] =null;//해당 게시물에 null 변경// 삭제 처리
							//삭체후에 삭제된 인덱스 뒤로 한칸씩 앞으로 이동
								//왜??? 만약에 해당코드가 없을경우 배열내 사이사이 공백 발생
							for(int i =bno; i<boardlist.length ; i++) {//배열길이 =100 인덱스: 0~99
								//i가 마지막인덱스와 같으면 마지막인덱스까지 1씩 
								if(i==boardlist.length-1)boardlist[boardlist.length-1]= null;
								//*검색된 게시물의 인덱스부터 마지막 인덱에는 null 대입
								else boardlist[i]=boardlist[i+1];//삭제된 게시물 다음 게시물
								//마지막 인덱스가 아니면 인덱스 당기기
									//*		만약에 2변 인덱스 삭제시
									//		2인덱스 =3인덱스
									//		3인덱스 =4인덱스
									//		4인덱스 =5인덱스
									//		~~~~~~~~~~~~
									//		98인덱스 =99인덱스[0번~99번-> 100개 인덱스]
									//		99인덱스 =null [99번 인덱스 : 마지막 인덱스]
								
					
							}
						}else {
							System.out.println("알림))비밀번호가 다릅니다.[삭제실패]");
						}
						
//////////////////////////////////////////////////////////////////////////////////////						
					}
					 else if(ch==3) {
/////////////////////////////////////////글수정//////////////////////////////////////
						 //1.비밀번호 입력받기
						 System.out.print("알림)) 현 게시물 비밀번호:"); String password =scanner.next();
						 //2.bno:현게시물(보고있는 게시물)의 인덱스 객체내 비밀번호가 입력받은 비밀번호가 동일하면
						 if(boardlist[bno].password.equals(password)) {
							 //해당 게시물의 제목과 내용을 새로 입력받아 현 게시물객체내 제목과 내용에 대입.
							 System.out.print("수정할 제목:");		boardlist[bno].title =scanner.next();
							 System.out.print("수정할 내용:");		boardlist[bno].content =scanner.next();
							 System.out.println("알림)) 비밀번호가 다릅니다.[수정실패]");
						 }
///////////////////////////////////////////////////////////////////////////////////////////						 
					 }
				 else {
					System.out.println("알림)) 알수없는 번호입니다.");							
			}
			
		}//프로그램 while end
		
	}//me
}//ce?????????????????????????????????????????????????????????????왜에러가 뜨는지 모르겠음??????
