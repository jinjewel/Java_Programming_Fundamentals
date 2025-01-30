// continue 문
// 반복문을 빠져 나가지 않으면서 다음 반복으로 진행

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		
		int sum=0;
		
		// 사용자 입력 객체 생성
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력된 값 중 양수의 값의 합을 출력합니다.");
		System.out.println("정수를 5개 입력하세요.");
		
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt(); 
			
			if(n<=0) 
				continue; // 양수가 아닌 경우 다음 반복으로 진행
			else 
				sum += n; // 양수인 경우 덧셈
			}
		
		// 결과 출력
		System.out.println("양수의 합은 " + sum);
		
		// 사용자입력 객체 종료
		scanner.close();
	}
}

// 출력
// 입력된 값 중 양수의 값의 합을 출력합니다.
// 정수를 5개 입력하세요.
// 14 -45 23 0 2
// 양수의 합은 39
