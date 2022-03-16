package Day11;

public class Day11_1_1 {
	
	/////////???????????????????
	//접근제한자 정적 반타입 메소드명 
	
	
	public static void main(String[] args) {
		
		
					//구현객체
		
	//4.
		//Dao: DB접근객체 Dto:데이터이동객체
		
	//5.익명객체[인터페이스가 직접 구현]
		//구현객체: 인터페이스명 객체명 = new 클래스명();
		//익명객체: 인터페이스 객체명 = new 인터페이스(){구현};//1회용
	Action action = new Action() {
		
		@Override
		public void work() {
			System.out.println("복사를 합니다.");
		}
	};// 구현 끝
	
	action.work();
	}

	
}
