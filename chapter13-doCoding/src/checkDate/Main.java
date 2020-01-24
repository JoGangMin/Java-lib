package checkDate;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		//test
		int i=0;
		
		while(true) {
			if(i%4 ==0) {
				if(i%400 ==0 || i%4 ==0) {
					System.out.println(i);
				}
				else if(i%100 == 0){
					
				}
				
			}
			
			else if (i>=400) {
				break;
			}
			i++;
		}
		
		
		
		System.out.println("당신이 입력한 날짜가 달력에서 유효한 날자인지 확인하는 프로그램 입니다.\n"
				+ "날자를 입력하세요\n");
		
		System.out.println("년");
		int year = sc.nextInt();
		
		System.out.println("월");
		int month = sc.nextInt();
		
		System.out.println("일");
		int day = sc.nextInt();
		
		MyDate date = new MyDate(day, month, year);
		
		date.dateParser();
		date.getResult();
		
		
	}
}
