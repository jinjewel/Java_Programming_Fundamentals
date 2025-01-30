// 조건 연산자 ?

// (condition) ? (opr2) : (opr3)
// 세 개의 피연산자로 구성된 삼항 연산자 
// condition이 참이면 opr2를 반환, 거짓이면 opr3 반환

public class TernaryOperator {
	public static void main(String[] args) {
		
		// 변수 선언
		int a = 3, b = 5;
		
		// 조건연산자 사용
		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
	}
}

// 결과
// 두 수의 차는 2
