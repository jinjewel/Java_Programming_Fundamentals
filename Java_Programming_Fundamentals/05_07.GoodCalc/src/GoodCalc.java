// 추상 메소드 (abstract)
// 선언되어 있느나 구현되어 있지 않은 메소드로 서브 클래스에서 오버라이딩하여 구현해야함.

// 추상 메소드의 종류
// 추상 메소드를 하나라도 포함하는 클래스
// 추상 메소드가 하나도 없지만 추상 클래스로 선언한 클래스

// 추상클래스의 상속
// 그냥 단순 상속시 서브 클래스도 추상 클래스이므로 abstract로 선언해야 함
// 서브 클래스에서 오버라이딩을 하여 추상메소드를 재정의 하지 않으면 서브 클래스도 추상 클래스이다.
// 추상의 부분을 오버라이딩 한다면 완전한 클래스가 되면서 그냥 클래스가 된다.
// 서브 클래스에서 오버라이딩을 하여 추상메소드를 재정의하면 완전해지며 사용가능하다.

// 추상 클래스의 특징
// 추상 클래스는 객체를 생성 할 수 없다.
// 설계와 구현의 분리(슈퍼 클래스에서 개념 정의, 서브 클래스에서 구현)
// 계층적 상속 관계를 갖는 클래스 구조를 만들 때

abstract class Calculator {
	public abstract int add(int a, int b); // 추상 메소드
	public abstract int subtract(int a, int b); // 추상 메소드
	public abstract double average(int[] a); // 추상 메소드
}
public class GoodCalc extends Calculator {
	@Override // 제정의 하여 추상 해제
	public int add(int a, int b) { // 추상 메소드 구현
		return a + b;
	}
	@Override // 제정의 하여 추상 해제
	public int subtract(int a, int b) { // 추상 메소드 구현
		return a - b;
	}
	@Override // 제정의 하여 추상 해제, 추상 메소드가 없어서 완전한 클래스를 선언함
	public double average(int[] a) { // 추상 메소드 구현
		double sum = 0;
		for (int i = 0; i <a.length; i++) 
			sum += a[i];
		return sum/a.length;
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] { 2,3,4 }));
	}
}

// 출력
// 5
// -1
// 3.0