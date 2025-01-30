// 중첩 if-else문 사례

import java.util.Scanner;

public class Nestedif {
	public static void main(String[] args) {
		
		// 사용자 입력 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 점수 입력 후 변수에 대입
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		
		// 학년 입력 후 변수에 대입
		System.out.print("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt();
		
		// 조건문
		if(score >= 60) { // 60점 이상
			if(year != 4)
				System.out.println("합격!"); // 4학년 아니면 합격
			else if(score >= 70)
				System.out.println("합격!"); // 4학년이 70점 이상이면 합격
			else
				System.out.println("불합격!"); // 4학년이 70점 미만이면 불합격
		}
		else // 60점 미만 불합격
			System.out.println("불합격!");
		
		// 사용자 입력 함수 종료
		scanner.close();
	}
}

// 출력
// 점수를 입력하세요(0~100): 100
// 학년을 입력하세요(1~4): 3
// 합격!