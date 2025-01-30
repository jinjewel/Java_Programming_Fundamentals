// 배열의 크기

// 배열은 자바에서 객체로 관리
// 배열 객체 내에 length 필드는 배열의 크기를 나타냄
// 배열이름.length -> 배열의 크기를 반환

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		
		// 배열의 선언과 생성
		int intArray[] = new int[5]; 
		int sum=0;
		
		// 사용자 입력 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");

		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
		}
		
		System.out.println("평균은 " + (float)sum/intArray.length);
		System.out.print("평균은 " + (double)sum/intArray.length);
		
		// 사용자 입력 객체 종료
		scanner.close();
	}
}

// 출력
// 5개의 정수를 입력하세요>>123 421 15 23 544
// 평균은 225.2
// 평균은 225.2