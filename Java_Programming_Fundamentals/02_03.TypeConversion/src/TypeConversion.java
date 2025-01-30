// 자동 타입 변환(casting)
// 작은 타입은 큰 타입으로 자동 변환
// 피 연산자의 데이터 타입에 맞춰서 연산의 사용되는 값들이 자동 캐스팅 된다.

// 자동 타입 변환이 안되는 경우 : 큰 타입이 작은 타입으로 변환할 때
// 강제 타입 변환 : (변환될 타입)을 앞에 붙여서 강제 변환, 데이터 누락의 위험 있음

public class TypeConversion {
	public static void main(String[] args) {
		
		// 1바이트와 4바이트 정수령 변수 선언
		byte b = 127;
		int i = 100;
		
		// byte 형은 -128에서 127 사이의 수로 반환
		// 범위가 오버되는 값이면 -256을 하면서 데이터 값을 구한다.
		System.out.println(b+i);
		System.out.println(10/4); // 정수형을 나누는 것이므로 결과도 정수형이다.
		System.out.println(10.0/4); // 실수형을 나누는 것이므로 결과도 실수형이다.
		System.out.println((char)0x12340041); // 강제타입변환의 결과로 0x41이 된다.
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}

// 출력
// 227
// 2
// 2.5
// A
// -29
// 3.8
// 4
// 3
