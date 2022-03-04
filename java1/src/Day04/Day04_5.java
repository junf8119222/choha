package Day04;

import java.util.Scanner;

public class Day04_5 {
	
	public static void main(String[] args) {
	int[] 사용자번호 = new int[6];	//사용자가 선택한 번호 목록
	int[] 추첨번호 = new int[6];
	Scanner scanner = new Scanner(System.in);
		
		//1. 사용자에게 입력 받기
		for(int i= 0; i<6; i++) {
		//i는 1부터 5까지 1씩 증가 반복 => 6회 반복
		System.out.println(" 1~45 사이 입력: ");
		int 번호 = scanner.nextInt();
		}
		boolean 통과 = true; // 저장되는 조건 변수
	//조건1 : 유효성 검사
	if( 번호 <1 || 번호>45) { //1보다 작거나 45보다 크면 선택할 수 없는 번호 입력시 재입력
		System.out.println(" 알림)) 선택할 수 없는 번호입니다.[재입력]");
		i--; // 현재 i는 정상입력x
		통과 = false;
	}// if end
	
	//조건2 :중복체크
		//1.배열내 모든 인덱스 호출
		//2.입력받은 값과 같은지 비교
	for( int j =0; j<6; j++) {
		if( 번호==사용자번호[j]) {
			//2. 입력받은 값과 j번째 인덱스값과 같은지 비교
			System.out.println("알림)) 이미 선택한 번호입니다.[재입력]");
			i--; //현재 i는 정상입력x
			통과 = false;
		} //if end
	}//for2 end
	
	//정상입력 이면 배열에 저장하기
	if(통과==true) 사용자번호[i] = 번호;
	//for end
	
	
	//*사용자 배열내 모든 인덱스 출력
	for(int temp : 사용자번호) {
		System.out.println( temp+"\t");
	}
	//2.컴퓨터가 난수생성
	
	//
}
