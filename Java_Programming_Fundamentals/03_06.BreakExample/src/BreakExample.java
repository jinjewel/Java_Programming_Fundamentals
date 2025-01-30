// break 문 

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
			
		// 사용자 입력 객체 생성
		Scanner scanner = new Scanner(System.in);
			
		// 문자열을 확인후 반복을 중단하는 코드 구현
		System.out.println("exit을 입력하면 종료합니다.");
			
		while(true) {
			System.out.print(">>");
			
			String text = scanner.nextLine();
			// .equals(비교할 문자) : 비교 메서드로 비교할 문자와 같으면 t, 아니면 f 반환
			if(text.equals("exit")) // "exit"이 입력되면 반복 종료
				break; // while 문을 벗어남
		}
			
		System.out.println("종료합니다...");
			
		// 사용자 입력 객체 종료
		scanner.close();
	}
}

// 출력
// exit을 입력하면 종료합니다.
// >> one
// >>two
// >>three
// >>exit
// 종료합니다...