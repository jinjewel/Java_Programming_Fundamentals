// while 문

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		
		int count=0; // count는 입력된 정수의 개수
		int sum=0; // sum은 합
		
		// 사용자 입력 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int n = scanner.nextInt(); // 정수 입력
		
		// 누적 합 계산
		while(n != -1) { // -1이 입력되면 while 문 벗어남
			sum += n;
			count++;
			n = scanner.nextInt(); // 정수 입력
		}
		
		// 평균 계산
		if(count == 0)
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는 " + count + "개이며, ");
			System.out.println("평균은 " + (float)sum/count + "입니다.");
		}
		
		// 사용자 입력 객체 scanner 종료
		scanner.close();
	}
}

// 출력
// 정수를 입력하고 마지막에 -1을 입력하세요.
// 13 15 17 1020 32 -1
// 정수의 개수는 5개이며, 평균은 219.4입니다.