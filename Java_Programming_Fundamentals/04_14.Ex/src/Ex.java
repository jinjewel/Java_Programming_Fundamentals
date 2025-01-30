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

class StaticSample{
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}

public class Ex {
	public static void main(String[] args) {
		StaticSample.m = 8; // static 필드를 클래스 이름으로 접근하는 방법
		System.out.println("StaticSample.m : " + StaticSample.m );
		
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5;
		s1.m = 50; // static 필드를 객체의 멤버로 접근하는 방법
		System.out.println("s1.m : " + s1.m );
		// System.out.println("s2.m : " + s2.m ); -> 오류, 아직 s2가 선언되지 않아서 
		s1.g(); // static 메서드를 객체의 멤버로 접근하는 방법
		
		s2 = new StaticSample();
		System.out.println("s2.m : " + s2.m );
		s2.n = 8;
		s2.h(); // static 메서드를 객체의 멤버로 접근하는 방법
		System.out.println("s1.m : " + s1.m );
		s2.g(); // static 메서드를 객체의 멤버로 접근하는 방법
		System.out.println("s1.m : " + s1.m );	
		
		StaticSample.f(); // static 메서드를 클래스 이름으로 접근하는 방법
		System.out.println("StaticSample.m : " + StaticSample.m );
	}
}

// 출력
// StaticSample.m : 8
// s1.m : 50
// s2.m : 20
// s1.m : 30
// s1.m : 20
// StaticSample.m : 5
