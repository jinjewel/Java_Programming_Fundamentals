// System.in : 표준 입력 스트림 
// 입력 값을 바이트(문자 아님)로 리턴 
// 따라서 키 값을 바이크 데이터로 넘겨주므로 응용프로그램이 문자 정보로 변환해야 함

// java.util.Scanner 패키지에 Scanner 클래스를 사용하여 사용
// 입력되는 키 값을 공백으로 구분되는 아이템 단위로 읽음

// Scanner클래스에 내장 메서드
// .next() : String형으로 다음 토근을 문자열로 리턴
// .nextByte() : byte형으로 다음 토큰을 byte 타입으로 리턴
// .nextShort() : Short형으로 다음 토큰을 Short 타입으로 리턴
// .nextInt() : Int형으로 다음 토큰을 Int 타입으로 리턴
// .nextLong() : Long형으로 다음 토큰을 Long 타입으로 리턴
// .nextFloat() : Float형으로 다음 토큰을 Float 타입으로 리턴
// .nextDouble() : Double형으로 다음 토큰을 Double 타입으로 리턴
// .nextBoolean() : Boolean형으로 다음 토큰을 Boolean 타입으로 리턴
// .nextLine() : String형으로 '\n'을 포함하는 한 라인을 읽고 '\n'을 버리고 리턴 
// .close() : void형으로 Scanner에 사용 종료

import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
			
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기
		System.out.print("이름은 " + name + ", ");

		String city = scanner.next(); // 문자열 읽기
		System.out.print("도시는 " + city + ", ");

		int age = scanner.nextInt(); // 정수 읽기
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble(); // 실수 읽기
		System.out.print("체중은 " + weight + "kg, ");
		
		String single = scanner.next(); // 문자열 읽기
		System.out.println("독신 여부는 " + single + "입니다.");
		
		scanner.close(); // scanner 닫기
	}
}

// 출력
// 이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요
// 진석 서울 24 88 No
// 이름은 진석, 도시는 서울, 나이는 24살, 체중은 88.0kg, 독신 여부는 No입니다.



