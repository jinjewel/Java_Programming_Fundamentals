// switch문
// case 와 default 부분으로 나뉜다.
// case문의 값은 문자, 정수, 문자열 리터럴만 허용
// 실수 리커럴, 수식은 허용되지 않음

// 각 문단에 break가 필수적으로 있어야 각 테이스를 잘 반환할 수 있음

import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		
		// 사용자 입력 함수 선언
		Scanner scanner = new Scanner(System.in);
		
		// 변수 입력
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		
		char grade;
		
		switch (score/10) {
			case 10: // score = 100
			case 9: // score는 90~99
				grade = 'A';
				break;
			case 8: // score는 80~89
				grade = 'B';
				break;
			case 7: // score는 70~79
				grade = 'C';
				break;
			case 6: // score는 60~69
				grade = 'D';
				break;
			default: // score는 59 이하
				grade = 'F';
		}
		// 출력
		System.out.println("학점은 " + grade + "입니다");
		
		// 사용자 입력 함수 종료
		scanner.close();
	}
}

// 출력
// 점수를 입력하세요(0~100): 89
// 학점은 B입니다
