package oodTest;

public class Main {
	public static void main(String[] args) {
	
		System.out.println("학생 클레스의 인스턴스들을 생성하고 조회하는 프로그램 입니다.");
		
		Student min = new Student(); // 입력받은 문자와 숫자를 이름과 나이로 지정한.
	
		min.setkoreanScore(); //입력받은 숫자를 국어겍체의 맴버 변수로 지정한
		min.setMathScore();	//입력받은 숫자를 수학 객체의 맴버 변수로 지정한다.
		
		min.getInfo();
		
		Student gang = new Student(); // 입력받은 문자와 숫자를 이름과 나이로 지정한.
		
		gang.setkoreanScore(); //입력받은 숫자를 국어겍체의 맴버 변수로 지정한
		gang.setMathScore();	//입력받은 숫자를 수학 객체의 맴버 변수로 지정한다.
		
		gang.getInfo();
	}
}
