package checkDate;

public class MyDate {	
	public boolean isValid;
	
	private int day, month, year;
	
	public MyDate(int day, int month, int year) {
		this.day= day;
		this.month = month;
		this.year = year;
	}
	
	public void dateParser(){
		boolean year = false;
		boolean	month = false;
		boolean day = false;
		
		if(this.year > 0) { //년 검사.
			year = true;
		}
		
		if(this.month >0 && this.month <=12) { // 달 검사.
			month =true;
		}
		
		if(this.day<=31) { // 일검사.
			switch (this.month) { 
			//31일 까지 있는경우.
			case 1:case 3:case 5:case 7:case 8:case 10:case 12: 
				if(this.day >0 && this.day <=31) { // 일 검사.
					day =true;
				}
				break;
				
			//30일까지 있는경우.
			case 4: case 6: case 9: case 11: 
				if(this.day >0 && this.day <=30) { // 일 검사.
					day =true;
				}
				break;
			//윤년 2월에 관한 일 검
			case 2:
				
				if(this.year%4==0 || this.year%400==0) { 
						if(this.year%100 == 0) {
							
						}
						else {
							if(this.day >0 && this.day <=29) { // 일 검사.
								day =true;
							}	
						}
				}
				else {
					if(this.day >0 && this.day <=28) { // 일 검사.
						day =true;
					}
				}
			default:
				//기본값.
				break;
			}//end day check
		}
		
		if(year && month && day) {
			isValid = true;
		}
		else {
			isValid = false;
		}
	}// end dat parser
	// 년,월,일 모두 달력에 존제하는 날자에 관한 결과를 출력한다.
	public void getResult() {
		if(isValid == true) {
			System.out.println("정상입니다.");
		}
		else {
			System.out.println("그런 날짜는 없습니다.");
		}
	}
}
