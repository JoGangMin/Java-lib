package oodTest;

public class Subjact {

	String name;
	int score;
	
	public Subjact() {
		this("과목이름이 정의되지 않음.");
	}
	
	public Subjact(String name) {
		this.name= name;
	}
	
		
	public Void getScore() {
		System.out.println("점수를 출력합니다.");
		return null;
	}
}
