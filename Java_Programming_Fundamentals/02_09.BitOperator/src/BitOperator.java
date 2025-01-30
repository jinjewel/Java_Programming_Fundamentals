// 비트 논리 연산과 비트 시프트 연산

// 비트 연산 : 비트 논리 연산 과 비트 시프트 연산이 있음

// 비트 논리 연산
// 비트끼리 AND(&), OR(|), XOR(^), NOT(~) 연산
// 1 : 참
// 0 : 거짓

// 비트 시프트 연산
// 비트를 오른쪽이나 왼쪽으로 이동
// a >> b : 산술적 오른쪽 시프트 -> 결과값 : a / (b^2)
// a의 각 비트를 오른쪽으로 b번 시프트 한다. 최상위 비트의 빈자리는 시프트 전의 최상위 비트로 다시 채운다.
// a >>> b : 논리적 오른쪽 시프트 -> 결과값 : a / (b^2)
// a의 각 비트를 오른쪽으로 b번 시프트 한다. 최상위 비트의 빈자리는 항상 0으로 채운다. 
// a << b :: 산술적 왼쪽 시프트 -> 결과값 : a * (b^2)
// a의 각 비트를 왼쪽으로 b번 시프트 한다. 최하위 비트의 빈자리는 항상 0으로 채운다.

public class BitOperator {
	public static void main(String[] args) {
		
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		// 비트 논리 연산
		// printf("%x\n", Value) : Value값을 16진수 형식으로 출력
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); // 비트 AND
		System.out.printf("%04x\n", (short)(a | b)); // 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b)); // 비트 XOR
		System.out.printf("%04x\n", (short)(~a)); // 비트 NOT
		byte c = 20; // 0x14
		byte d = -8; // 0xf8
		
		// 비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c <<2); // c를 2비트 왼쪽 시프트
		System.out.println(c >>2); // c를 2비트 오른쪽 시프트. 0 삽입
		System.out.println(d >>2); // d를 2비트 오른쪽 시프트. 1 삽입
		System.out.printf("%x\n", (d >>>2)); // d를 2비트 오른쪽 시프트. 0 삽입
	}
}

// 출력
// [비트 연산 결과]
// 00ff
// 55ff
// 5500
// aa00
// [시프트 연산 결과]
// 80
// 5
// -2
// 3ffffffe
