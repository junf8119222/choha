package Day12;

public class Day12_3_1 {
	
	public static void main(String[] args) {
		
		//도서 검색 프로그램
			//1.입력받기[System.in.read()]
			//2.String 배열을 이용한 여러 도서가 저장 
				//1.깃에서다운/선생님
			//3.검색기능, 수정기능
				//검색기능: 특정 문자를 입력받아 도서내 포함된 문자가 있으면 모두 출력
					//'언어' 검색-> "Tucker의 Go 언어 프로그래밍" /"혼자 공부하는 C 언어"
				//수정기능: 수정할 도서명의 일부를 입력 받아 출력된 도서명 중 번호를 선택
					//'수정' 수정-> 수정할 도서명 일부를 입력 받아-> 수정 완료
	String[] 도서목록 = {}
	
	while(true) {
		System.out.println("1.검색 2.수정");
		byte[] bytes =new byte[100];
		int count = System.in.read(bytes); //키보드로부터 []스트림 바이트를 읽어오기 //일반예외!!!![예외]
		//읽어온 바이트 갯수
		
		String ch = new String(bytes,0 , count-2);//바이트배열 --->문자열 변환[-2= \n\r제거]

		if(ch.equals("1")) {
			System.out.println("*** 검색 ***");
			System.out.println("검색 :"); count = System.in.read(bytes);
			String search = new String(bytes,0, count-2);//찾을문자
			for(String temp : 도서목록) {//모든 배열내 문자열을 하나씩 꺼내오기
				/*
				if(temp.indexOf(search) != -1) {//해당 문자열내 찾을 문자의 인덱스가 존재하면
					//indexOf 메소드 -1 반환되는 경우는 동일한 단어가 없을경우[검색x]
					System.out.println(temp);//해당 문자열내 찾을 문자가 존재하면 출력
				}*/
				//방법2
				if(temp.contains(search){
					//문자열.contains("찾을문자"): 문자열내 찾을 문자가 true[있다]/false[없다] 반환
					System.out.println(temp);
				}				
			}
			
		}else if(ch.equals("2")) {
			System.out.println("***수정***");
			System.out.println("수정할 도서명[일부]:");
			count = System.in.read(bytes);  //키보드로부터 바이트 읽어와서 배열에 저장
			String search = new String(bytes, 0, count-2);//0번인덱스 바이트부터 -2제외한
			int i =0;//인덱스
			for( temp.contains)(search)) {
					//문자열.contains("찾을문자"): 문자열내 찾을 문자가 true[있다]
					System.out.println("도서번호:"+i+"교재명:"+temp);
				}
				i++;
		}
			//도서번호[인덱스] 입력받아 수정하기
			System.out.print("도서번호 선택:");
				count = System.in.read(bytes);
				String oldstr = new String(bytes, 0, count-2);
				//ch2 문자열로 입력 받음 -->인덱스[숫자] 변환
				int index =Integer.parseInt(ch2);// ch2문자열로 입력받음 --->인덱스[숫자] 변환
				
			//수정 내용 입력받기
			System.out.println("기존 문자:");
				count = System.in.read(bytes);
				String oldstr = new String(bytes, 0, count-2);
			
			
		}
		
	}
	
	}

}
