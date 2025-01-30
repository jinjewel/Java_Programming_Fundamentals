
// 자바 상속의 특징
// 클래스의 다중 상속 지원하지 않고, 상속 횟수 무제한.
// 상속의 최상위 조상 클래스는 java.lang.Object 클래스이다.

// 자바의 접근 지정자 4가지(public, protected, 디폴트, private)
// 슈퍼클래스의 private 멤버는 다른 모든 클래스에 접근 불허
// 슈퍼클래스의 디폴트 멤버는 패키지내 모든 클래스에 접근 허용
// 슈퍼클래스의 protected 멤버는 같은 패키지 내의 모든 클래스 혹은 다른 패키지의 서브 클래스는 접근 가능
// 슈퍼클래스의 public 멤버는 다른 모든 클래스에서 접근 가능

class Person {
	
	public String name; 
	int age; 
	protected int height; 
	private int weight; // private 때문에 직접 값 입력 불가, 함수를 통해 입력
	
	public void setWeight(int weight) { // private 인 weight에 값을 넣기 위해 함수를 사용
		this.weight = weight;
	}
	
	public int getWeight() { 
		System.out.print(weight); // weight 출력
		return weight; // weight값 리턴
	}
}
class Student extends Person {
	public void set() {
		age = 30; // 슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "홍길동"; // 슈퍼 클래스의 public 멤버 접근 가능
		height = 175; // 슈퍼 클래스의 protected 멤버 접근 가능
		// weight = 99; // 오류. 슈퍼 클래스의 private 접근 불가
		setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student(); // 객체 선언
		s.set(); // 값 기입
		s.getWeight(); // weight를 출력
	}
}

// 결과
// 99