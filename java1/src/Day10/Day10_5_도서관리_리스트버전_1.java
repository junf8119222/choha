package Day10;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_도서관리_리스트버전_1 {
	
	public static void main(String[] args) {
		
		//1.리스트[객체] 생성
		ArrayList<Book>bookList = new ArrayList<>();
	//리스트 클래스<리스트안에 저장할 클래스>
		//<클래스>:해당 클래스의 여러 객체를 리스트에 저장
		//길이는 가변[기본:10]
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.등록2.목록3.삭제4.수정");
			int ch = scanner.nextInt();
			if(ch==1) {
				//1.입력받기
				System.out.println("도서명:"); String 도서명 = scanner.next();
				System.out.println("저자:"); String 저자 = scanner.next();
				//2.객체화[여러개 변수---> 1개 객체
				Book_1 book_1 =new Book_1(도서명, 저자);
				//3.배열저장[공백을 찾아서] vs리스트[공백찾기x]
				
			}
		if(ch==2) {
			//1.배열[null 제외] vs 리스트[null관리 안해도됨
			for(Book book_1 : bookList) {
				System.out.printf(book_1.get도서명()+"\t"+book_1.get저자();)
			}
		}
		if(ch==3) {}
			//1.배열[삭제후에 뒤 인덱스 당기기] vs 인덱스[자동]
			// 1 2 3[2삭제] 1 null 3 4 vs 1 2 3 [2삭제] 1 3 4
			System.out.println("삭제할 도서명:"); String 도서명 = scanner.next();
			//도서찾기
			for( Book_1.get도서명.equals(도서명);) {
				//해당 도서명이 입력받은 도서명과 동일하면
				bookList.remove(book);
				break;//삭제 성공했으면 반복문 탈출
			}
		if(ch==4) {
			System.out.println("수정할 도서명:"); String 도서명 = scanner.next();
			//도서찾기
			for(Book_1 book_1 : bookList) {
				if(book_1.get도서명().equals(도서명){
					System.out.println("수정 저자:"); String 저자 = scanner.next();
					book_1.set저자(저자);//수정
					
				}
			}
		}
		}
	}

}
