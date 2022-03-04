package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {
	
	public static void main(String[] args) {
	
		//준비
		int 플레이어;		//사용자가 선택한수
		int 컴퓨터;		//컴퓨터가 난수를 생성한 수 저장
		int 게임수=0;		//총 가위바위보 실행 횟수 저장
		int 플레이어승리수=0 ; int 컴퓨터승리수=0;	//각 승리 수 저장
		Scanner scanner = new Scanner(System.in)//입력객체
				//;이 하나만 있으면 {}중괄호를 써도 되고 안써도 되고(IF)
				//;이 2개 이상이면 {}중괄호를 무조건 써야한다.(IF)
		while(true) {//프로그램 실행[무한루프 종료조건 : 3번 입력시에 종료(break)]
			
			System.out.println("--------가위바위보 게임-----------");
			System.out.println(" 가위(0) 바위(1) 보(2) 종료(3) 선택:");
			플레이어 = scanner.nextInt();// 입력한 수 저장
			System.out.println(" 플레이어가 낸수 : "+ 플레이어);
			
			Random random = new Random();//난수 객체 선언
					//random.nextInt() : int가 표현할 수 있는 범위내 난수 발생
					//random.nextInt(끝번호)+시작번호: 0~ 수 전까지 범위내 난수 발생
						//random.nextInt(10):0~9 중 난수 발생
						//random.nextInt(11)+10 :10~20 중 난수 발생
			컴퓨터 = random.nextInt(3)+1; //난수를 정수(int형)로 가져오기
			
			//승리자 판단
			if((플레이어==0 && 컴퓨터==2 || (플레이어==&&컴퓨터==0|| (플레이어==2&&컴퓨터==1)))) {//플레이어 승리 경우의수
				//플레이어가 이기는 경우의 수 //플레이어의 승리 경우의 수[0->2 /1->0 /2->1]
				System.out.println("알림)) 플레이어 승리");
				플레이어승리++; //승리수 증가
			}else if() {// 비기는 경우의 수
				System.out.println("알림)) 무승부 ");
			}
			else {//그외는 컴퓨터 승리
				System.out.println("알림)) 컴퓨터 승리 ");
				컴퓨터승리수++; //승리수 증가
			}
			
			//게임수 증가
			게임수++;
		}
		
	}
}
