// 배열
// 배열 선언과 배열 생성의 두 단계 필요

// 배열 선언의 예 -> intArray와 charArray는 매열에 대한 레퍼런스 변수이다.
// int intArray[]; 
// char charArray[];
// int[] intArray;
// char[] charArray;

// 배열 생성의 예
// intArray = new int[10];
// charArray = new char[20];
// int intArray[] = new int[10];
// char charArray[] = new char[20];

// 선언과 생성을 동시에 하는 예
// int intArray[] = {0,1,2,3,4,5,6,7,8,9};

// 잘못된 배열의 선언
// int intArray[10]; // 컴파일 오류, 배열의 크기를 미리 지정하면 안됨

// 배열의 인덱스
// 인덱스는 0무터 입력한 값의 -1만큼의 수까지 매칭되어 입력한 수만큼의 배열이 생성된다.
// 인덱스로 접근할 때 음수사용이 불가능하고, 0~(입력한값-1)까지의 인덱스만으로 접근해야한다.

// 하나의 배열을 다수의 레퍼런스가 참조(공유)가능
// int intArray[] = new int[10];
// int myArray[] = intArray;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		
		// 사용자 입력 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 배열의 선언 및 생성
		int intArray[] = new int[5]; // 배열 생성
		int max=0; // 현재 가장 큰 수
		
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장
			if(intArray[i] > max) // intArray[i]가 현재 가장 큰 수보다 크면
				max = intArray[i]; // intArray[i]를 max로 변경
		}
		
		// 출력문 생성
		System.out.print("가장 큰 수는 " + max + "입니다.");
		
		// 사용자지정 객체 종료
		scanner.close();
	}
}

// 출력
// 양수 5개를 입력하세요.
// 24 65 54 13 61
// 가장 큰 수는 65입니다.
