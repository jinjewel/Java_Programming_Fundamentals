// 객체의 소멸과 가비지 컬렉션

// 객체 소멸 : new에 의해 할당된 객체 메모리를 자바 가상 기계의 가용메모리로 되돌려 주는 행위
// 자바 응용프로그램에서 임의로 객체 소멸을 할 수 없음. 객체 소멸은 자바 가상 세계의 고유한 역활이며, 개발자 입장에선 다행임.

// 가비지 : 가치키는 레퍼런스가 하나도 없는 객체
// 가비지 컬렉션 
// 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집 반환, 자바에서 가비지를 자동 회수하는 과정
// 사용 메모리로 반환이 되며, 가비지 컬렉션 스레드에 의해 수행

// 개발자에 의한 강제 가비지 컬렉션
// System 또는 Runtime 객체의 gc() 메소드 호출, 
// 예) System.gc(); -> 강력한 가비지 컬렉션 요청

// 접근지정자 이해
// 패키지 : 관련있는 클래스 파일(.class)을 저장하는 디렉터리, 자바 응용프로그램은 하나 이상의 패키지로 구성
// 접근 지정자 : 멤버를 보호하는 캡슐화의 정체에 묶인 보호를 일부 해제할 목적으로 생성
// 접근 지정자의 종류 : public, protected, 디폴트, private 
// public : 모든 패키지의 모든 클래스의 접근을 허용한다.
// protected : 같은 패키지 또는 다른 패키지여도 자식 클래스에도 접근 허용.
// 디폴트(생략, package-private라고도 불림) : 같은 패키지의 클래스에만 허용.
// private : 같은 클래스 내에서만 가능(같은 패키지내 클래스 이동 불가) 외부로부터 완벽차단 

public class GarbageEx {
	public static void main(String[] args) {
		
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		
		// 가비지 : 주소(레퍼런스)는 생성되었는데 가리키는 변수가 없는 상황.
		a = null; // 가비지 발생, 매칭되고 있는 a의 주소는 그대로 있지만 가리키는 화살표가 사라지므로.
		d = c;
		c = null; // 가비지가 생성 안됨. 이전에 d가 주소를 가리키기 때문에.

		// 가비지 컬렉션 : 가비지가 있는 경우 자동으로 가비지를 자동 회수하는 과정
		// System 객체의 gc() 메소드를 호출하여 강제로 사용
		System.gc(); // 가비지 컬렉션 작동 요청
	}
}

// 출력
// (없음)