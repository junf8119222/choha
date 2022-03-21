package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2_1 {

	public static void main(String[] args) {
		
		//p.539
			//Date 클래스(java.util): 시스템 날짜/사간
		Date date = new Date();//date 객체 생성
		System.out.println("현재 날짜/시간"+ date);
		
			//SimpleDateFormat 클래스 : 날짜/시간 포멧(형식=모양) 변환
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm 분 ss초");
		//날짜에 형식 적용하기[date 형식 -> String형 변환]
		
		//p.540
			//Calendar 클래스 :운영체제 시간대의 날짜/시간에 대한 정보
		Calendar now = Calendar.getInstance(); //Calendar클래스내 객체 호출
			//이미 Calendar클래스내 객체 존재!! =별도로 객체생성x
		System.out.println("연도:"+ now.get(Calendar.YEAR)); //연도
		System.out.println("월:"+(now.get(Calendar.MONTH)+1));//월: 0~11[0:1월]
		
		//요일[숫자]-> 한글 변환
		int week = now.get(Calendar.DAY_OF_WEEK);
		String 요일 = null;//한글 요일을 저장할 변수 사용할 예정
		switch (week) {
			case 1 : 요일 = "일요일"; break;
			case 2 : 요일 = "월요일"; break;
			case 3 : 요일 = "화요일"; break;
			case 4 : 요일 = "수요일"; break;
			case 5 : 요일 = "목요일"; break;
			case 6 : 요일 = "금요일"; break;
			case 7 : 요일 = "토요일"; break;
		}
		System.out.println("요일[한글]:"+ 요일);
		
		//오전/오후
		System.out.println("오전/오후 :"+ now.get(Calendar.AM_PM));//0:오전 1:오후
		//한글 변환
		int ampm = now.get(Calendar.AM_PM);
		String 오전오후 = null;
		if(am==0) 오전오후 = "오전";
		else 오전오후 ="오후";
		System.out.println("오전/오후:" +오전오후);
		
		//추가입력
		System.out.println("");
		
		//ZoneDateTime 클래스 : 세계 협정시계	//추가입력
		ZonedDateTime 협정시 = ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println("협정시:"+ 협정시);
		협정시 = ZonedDateTime.now(ZoneId.of)
		
			
			
			
		
	}
	
}
