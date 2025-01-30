// 자바의 예외 처리
// 컴파일 오류
// 문법에 맞지 않게 작성된 코드
// 컴파일할 때 발견

// 예외
// 오동작이나 결과에 악영향을 미칠 수 있는 실행 중 발생한 오류
//   정수를 0으로 나누는 경우
//   배열보다 큰 인덱스로 배열의 원소를 접근하는 경우
//   존재하지 않는 파일을 읽으려고 하는 경우
//   정수 입력을 기다리는 코드가 실행되고 있을때, 문자가 입력된 경우
// 자바에서 예외 처리 가능
//   예외 발생 -> 자바 플랫폼 인지 -> 응용프로그램에서 전달

import java.util.Scanner;

public class DevideByZero {
	public static void main(String[] args) {
		
		// 사용자 입력 객체 선언
		Scanner scanner = new Scanner(System.in);
		
		int dividend; // 나뉨수
		int divisor; // 나눗수
		
		System.out.print("나뉨수를 입력하시오:"); 
		dividend = scanner.nextInt(); // 나뉨수 입력
		
		System.out.print("나눗수를 입력하시오:"); 
		divisor = scanner.nextInt(); // 나눗수 입력
		
		System.out.println(dividend+"를 "+ divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		
		// 사용자 입력 객체 종료
		scanner.close();
	}
}

// 출력
// 나뉨수를 입력하시오: 100
// 나눗수를 입력하시오: 20
// 100를 20로 나누면 몫은 5입니다.
//
// 나뉨수를 입력하시오: 100
// 나눗수를 입력하시오: 20
// ~~~~~오류 문자~~~~~~~~

