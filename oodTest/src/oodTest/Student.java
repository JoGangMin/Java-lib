package oodTest;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	
	String studentName;
	int studentAge;

	Subjact korean = new Subjact("국어");
	Subjact math = new Subjact("수학");
	Subjact error = new Subjact();
	
	public Student() {	// 이름과 나이를 가지는 학생객체 생성
		System.out.println("이름을 입력해주세요.");
		studentName = sc.nextLine();
		System.out.println("나이를 입력해주세요.");
		studentAge = sc.nextInt();
	}
	
	public void setkoreanScore() {
		System.out.println("국어 점수를 입력해 주세요.");
		korean.score =sc.nextInt();
	}
	
	public void setMathScore() {
		System.out.println("수학 점수를 입력해 주세요.");
		math.score = sc.nextInt();
	}
	
	public void getInfo() {
		System.out.println("\n이름 :"+studentName
				+ "\n나이 :"+studentAge
				+ "\n수학점수 :"+math.score
				+ "\n국어점수 :"+korean.score);
	}
}
