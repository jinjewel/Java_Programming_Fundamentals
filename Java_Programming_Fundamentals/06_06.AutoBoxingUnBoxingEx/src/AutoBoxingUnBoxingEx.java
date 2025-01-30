// 박싱과 언박싱
// 박싱 : 기본타입의 값을 Wrapper 객체로 변환
// 언박싱 : Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것

// JDK1.5부터 자동 박싱과 자동 언박싱을 제공

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		
		int n = 10;
		Integer intObject = n; // 자동 박싱(auto boxing)
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; // 자동 언박싱(auto unboxing)
		System.out.println("m = " + m);
	}
}

// 출력
// intObject = 10
// m = 20
