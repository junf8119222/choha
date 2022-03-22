package Day15;

public class Controller {
	
	//1.배열
	public static Car[] carList = new Car[100];
	//2.리스트 경우
	//public static Arraylist<Car> carlist = new Arraylsit
	
	
	//입차 메소드
	public static boolean 입차(String 차량번호) {
		
		//입차 코드 작성-->이것을 먼저 생각을 해야함/순서도(알고리즘)
			//1.입력받은 차량번호(인수) 가져온다.
			//*차량번호 중복체크()
			//2.입차날짜 을 구한다.
			//3.입차시간 을 구한다.
			//*출차시간, 금액은 출차시x
			//4.차량번호,입차날짜,입차시간 => 3개 변수 -> 1객체화
			//5.차량객체를 배열이나 리스트에 저장
		return false;
	}
	//출차 메소드
	public static boolean 출차(String 차량번호) {
		//출차 코드 작성
			//1.입력받은 차량번호(인수) 가져온다.
			//2.배열 or 리스트내 동일한 차량번호를 찾아서
			//3.출차시간(현재시간)을 구한다.
			//4.계산[출차시간 - 입차시간 =>(분-30)/10*1000]
			//5.차량객체를 배열이나 리스트에 저장
		return false;
	}
	
}
