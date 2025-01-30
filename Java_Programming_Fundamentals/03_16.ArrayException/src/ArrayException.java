// 예외 처리(try-catch-finally문)
// 예외가 발생할 때 대응하는 응용프로그램 코드

// try-catch-finally문 사용가능
// try : 예외가 발생할 가능성이 있는 실행문
// catch : 처리할 예외 타입 선언 및 예외 처리문
// finally: 예외 발생 여부와 상관없이 무조건 실행되는 문장, finally문은 생략 가능

// try블록에서 예외가 발생하지 않은 경우
// try -> finally

// try블록에서 예외가 발생한 경우
// try -> catch -> finally

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

// ArrayIndexOutOfBoundsException 예외 발생 예제
public class ArrayException {
	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 0;
			
		try {
			for (int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
			}
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}

// 출력
// intArray[0]=0
// intArray[1]=1
// intArray[2]=3
// intArray[3]=6
// 배열의 인덱스가 범위를 벗어났습니다.



