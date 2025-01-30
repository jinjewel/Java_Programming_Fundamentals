// 조건문 if-else

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		
		// 사용자 입력 함수
		Scanner num = new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		
		// 변수 입력
		int number = num.nextInt();
		
		// 조건문
		if (number % 3 == 0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		num.close();
	}
}

// 출력
// 수를 입력하시오: 123
// 3의 배수입니다.

// 수를 입력하시오: 121
// 3의 배수가 아닙니다.