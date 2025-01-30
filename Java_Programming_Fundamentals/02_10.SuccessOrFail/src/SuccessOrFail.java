// if 문

import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		// 사용자 입력 함수
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		
		// 입력한 값을 변수로 입력
		int score = scanner.nextInt();
		
		// 조건문
		if (score >= 80)
			System.out.println("축하합니다! 합격입니다.");
		
		// 사용자 입력 함수 종료
		scanner.close();
	}
}

// 출력
// 점수를 입력하시오: 100
// 축하합니다! 합격입니다.