// 처리할 예외 타입의 예
// ArithmeticException : 정수를 0으로 나눌때 발생
// NullPointerException : null 레퍼런스를 참조할 때 발생
// ClassCastException : 변환할 수 없는 타입으로 객체를 변환할 때 발생
// OutOfMemoryError : 메모리가 부족한 경우 발생
// ArrayIndexOutOfBoundsException : 배열의 범위를 벗어난 접근 시 발생
// IllegalArgumentException : 잘못된 인자 전달시 발생
// IOException : 입출력 동작 실패 또는 인터럽트 시 발생
// NumberFormatException : 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생
// InputMismatchException : 사용자 입력함수로 문자를 입력했지만 변수를 nextInt()로 받는 경우 등에서 발생

import java.util.Scanner;
import java.util.InputMismatchException;

// InputMismatchException 예외 처리 예제
public class InputException {
	public static void main(String[] args) {
		
		// 사용자 입력 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			
			try { // 예외를 확인할 코드
				n = scanner.nextInt(); // 정수 입력
			}
			catch(InputMismatchException e) { // 예외시 처리할 부분
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				
				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--; // 인덱스가 증가하지 않도록 미리 감소
				
				continue; // 다음 루프
			}
			
			sum += n; // 누적합하기
		}
		
		System.out.println("합은 " + sum);
		
		// 사용자 입력 객체 종료
		scanner.close();
	}
}

// 출력
// 정수 3개를 입력하세요
// 0>> 1
// 1>>or
// 정수가 아닙니다. 다시 입력하세요!
// 1>>12
// 2>>hihi
// 정수가 아닙니다. 다시 입력하세요!
// 2>>30
// 합은 43
