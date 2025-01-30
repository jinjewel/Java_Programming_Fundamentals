// 다중 if-else
// 조건문이 너무 많은 경우 switch 문 사용 권장

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		
		// 사용자 입력 함수
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		
		// 변수 저장
		int score = scanner.nextInt(); // 점수 읽기
		char grade;
		
		// 조건문
		if(score >= 90) // score가 90 이상
			grade = 'A';
		else if(score >= 80) // score가 80 이상 90 미만
			grade = 'B';
		else if(score >= 70) // score가 70 이상 80 미만
			grade = 'C';
		else if(score >= 60) // score가 60 이상 70 미만
			grade = 'D';
		else // score가 60 이만
			grade = 'F';
		
		// 출력
		System.out.println("학점은 "+ grade + "입니다.");
		
		// 사용자 입력 함수 종료
		scanner.close();
	}
}

// 출력
// 점수를 입력하세요(0~100): 88
// 학점은 B입니다.

// 점수를 입력하세요(0~100): 59
// 학점은 F입니다.
