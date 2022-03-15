package Day10;

public class parent {
	public String nation;
	public parent() {
		////////////?????????????????ctrl space parent 앞글자 왜 소문자????????
		this("대한민국");
		System.out.println("부모 빈생성자 실행");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("부모[1개인수] 생성자 실행");
	}
}
