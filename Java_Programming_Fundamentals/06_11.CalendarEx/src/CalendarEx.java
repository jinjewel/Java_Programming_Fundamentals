// Calendar 클래스
// java.util 패키지에 Calendar 클래스
// 시간과 날짜 정보를 저장 및 관리

// 생성 예) Calendar now = Calendar.getlnstance();
// now는 현재의 날짜와 시간 정보를 가지고 정보를 생성
// Calendar 클래스는 추상 클래스 이므로 new를 이용한 선언 불가

// 날짜와 시간 알아내기
// int year = now.get(Calendar.YEAR); -> now에 저장된 년도 저장
// int month = noe.get(Calendar.MONTH) + 1 -> now에 저장된 달

// 날짜와 시간 설정하기
// now.clear(); -> 현재의 시간 및 날짜를 지운다.
// now.get(2000, 03, 29); -> 2000년 4월 29일로 설정, 달은 0~11로 표현되기 때문에 1을 빼준다.
// now.get(Calendar.HOUR_OF_DAY, 20); -> 저녁 8시로 설정
// now.get(Calendar.MIMUTE, 30); -> 30분으로 설정

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		
		int year = cal.get(Calendar.YEAR); // get()은 0~30까지의 정수 리턴.
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);  // 24시간 형식으로 시간 반환
		
		int ampm = cal.get(Calendar.AM_PM);		
		int hour = cal.get(Calendar.HOUR);  // 12시간 형식으로 시간 반환M);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg + year + "/" + month + "/" + day + "/");
		switch(dayOfWeek) {
			case Calendar.SUNDAY : System.out.print("일요일"); break;
			case Calendar.MONDAY : System.out.print("월요일"); break;
			case Calendar.TUESDAY : System.out.print("화요일"); break;
			case Calendar.WEDNESDAY : System.out.print("수요일"); break;
			case Calendar.THURSDAY : System.out.print("목요일"); break;
			case Calendar.FRIDAY: System.out.print("금요일"); break;
			case Calendar.SATURDAY : System.out.print("토요일"); break;
		}
		System.out.print("(" + hourOfDay + "시)");
		if(ampm == Calendar.AM) 
			System.out.print("오전");
		else 
			System.out.print("오후");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 "+ millisecond +"밀리초");
	}
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		printCalendar("현재 ", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear(); // 날싸 및 시간 정보 초기화
		firstDate.set(2016, 11, 25); // 2016년 12월 25일. 12월을 표현하기 위해 month에 11로 설정
		firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시
		firstDate.set(Calendar.MINUTE, 30); // 30분
		printCalendar("처음 데이트한 날은 ", firstDate);
	}
}

// 출력
// 현재 2023/10/29/일요일(5시)오전5시 17분 20초 283밀리초
// 처음 데이트한 날은 2016/12/25/일요일(20시)오후8시 30분 0초 0밀리초