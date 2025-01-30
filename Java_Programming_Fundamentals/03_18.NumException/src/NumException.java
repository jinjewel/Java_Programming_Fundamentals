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

// NumberFormatException 예외 처리 예제
public class NumException {
	public static void main(String[] args) {
		
		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
		int i=0;
		
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}
}

// 출력
// 숫자로 변환된 값은 23
// 숫자로 변환된 값은 12
// 3.141592는 정수로 변환할 수 없습니다.
