// non-static 멤버(인스턴스 멤버)
// 공간적 특성 : 멤버들은 객체마다 독립적으로 별도 존재
// 시간적 특성 : 필드와 메소드는 객체 생성 후 비로소 사용가능
// 비공유 특성 : 멤버들은 다른 객체에 의해 공유되지 않고 배타적

// static 멤버(클래스 멤버): 클래스당 하나만 생성되면서 객체를 생성하지 않고 사용할 수 있다.
// 공간적 특성 : static 멤버들은 클래스 당 하나만 객체 내부가 아닌 클래스 코드가 적재되는 곳에 별도 생성 
// 시간적 특성 : static 멤버들은 클래스가 로딩될 때 공간 할당. 즉 객체 생성 전에 이미 생성되고 사용 가능.
//          : 객체가 사라져도 멤버는 사라지지 않고, 프로그램이 종료될 때 사라짐.
// 비공유 특성 : static 멤버들은 동일한 클래스의 모든 객체에 의해 공유

// static는 전역 변수와 전역 함수, 공유 멤버를 작성할 때 활용

// static 멤버를 가진 클래스 사례 : Math 클래스(java.lang.Math)
// 모든 필드와 메서드가 public static으로 선언. 즉 다른 모든 클래스에서 사용할 수 있음.
// 잘못된 사용법
// Math m = new Math(); -> Math() 생성자는 private 
// int n = m.abs(-5);
// 바른 사용법
// int n = Math.abs(-5)

class Calc {

	// static 멤버(클래스 멤버): 클래스당 하나만 생성되면서 객체를 생성하지 않고 사용할 수 있다.
	public static int abs(int a) {
		return a > 0 ? a : -a;
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}
}

public class CalcEx {
	public static void main(String[] args) {
		// 각 함수는 Calc의 static 객체이므로 따로 new 호출 필요 없이 사용 가능하다.
		// static는 non-static과 this에서는 사용 불가능하다.
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}
}

// 출력
// 5
// 10
// -8
