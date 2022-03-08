package Day06;

public class Day06_5 {
	
	public static void main(String[] args) {
		
		//p.207
		
		//1. 빈생성자로 객체 생성
		Korean k1 = new Korean();
			//2.객체 생성후에 필드 값 변경
			k1.name ="유재석";
			k1.ssn ="123123-123123";
			System.out.println("k2 국적:"+k2.nation);
			System.out.println("k2 이름:"+k2.name);
			System.out.println("k2 주민등록번호:"+k2.ssn);
		//2. 필드 2개를 갖는 생성자로 객체 생성
		Korean k2 = new Korean("박자바","011225-1234567");
		System.out.println("k2 국적:"+k2.nation);
		System.out.println("k2 이름:"+k2.name);
		System.out.println("k2 주민등록번호:"+k2.ssn);
	}
		//1.빈생성자 객체
	Korean 한국인1 = new Korean();
			//한국인1 국적이 대한민국이고 이름, 주민등록번호 없음
		//2.필드 1개 생성자 객체 생성
	Korean 한국인2= new Korean("유재석");
			//한국인2 국적이 대한민국이고 이름이 유재석이고 주민등록번호가 없고
	
		//3.필드2개 생성자 객체 생성
	Korean 한국인3 = new Korean("강호동", "123456-123456");
			//한국인3 국적이 대한민국이고 이름이 강호동이고 주민등록번호가 있음
			
		//4.필드3개 생성자 객체 생성
	Korean 한국인4 = new Korean("일본", "신동엽","123456-123456");

}
