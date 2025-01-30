// 실세계의 인터페이스
// 정해진 규격(인터페이스)에 맞기만 하면 연결 가능. 각 회사마다 구현방법은 다름
// 정해진 규격(인터페이스)에 맞지않으면 연결 불가.

// 자바의 인터페이스(interface 키워드로 선언)란
// 클래스가 구현해야 할 메소드들이 선언되는 추상형
// 스펙을 주어 클래스들이 그 기능을 서로 다르게 구현할 수 있도록 하는 클래스의 규격 선언이며
// 클래스의 다형성을 실현하는 도구이다.
// 설계를 하는 것처럼 이것이것을 여기서 해야된다 라는 선언을 하는 것

// 여전히 인터페이스에는 필드 선언 불가
// 인터페이스의 객체 생성 불가, 변수 선언 가능
// new PhoneInterface(); : 불가 / PhoneInterface galaxy; : 가능 

// 다른 인처페이스 상속 가능, 다중 상속 가능
// 상속 : interface MobilePhoneInterface extends PhoneInterface
// 다중상속 : interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface
// 인터페이스에 추상 메소드를 모두 구현하지 못했으면 단순 상속 extends 키워드 사용
// 인터페이스에 모든 추상 메소드를 모두 구현하면 implements 키워드 사용

// 인터페이스의 구성요소들
// 상수 : public 만 허용, public static final 생략
// 추상 메소드 : public abstract 생략
// default 메소드 : 인터페이스에 코드가 작성되는 메소드. public 접근 지정자만 허용, 생략가능
// private 메소드 : 인터페이스 내에 있는 메소드 코드가 작성되야함. 같은 인터페이스 내 다른 메소드에 의해서만 호출가능
// static 메소드 : public, private 모두 지정 가능. 생략하면 public

interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언, public static 생략
	void sendCall(); // 추상 메소드, public abstract 생략
	void receiveCall(); // 추상 메소드, public abstract 생략
	default void printLogo() { // default 메소드, public 생략
		System.out.println("** Phone **");
	}
}
class SamsungPhone implements PhoneInterface { // 인터페이스 구현 완료 후 implements 추가
	// PhoneInterface의 모든 추상 메소드 구현 후 implements 붙임
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	// 메소드 추가 작성
	public void flash() { 
		System.out.println("전화기에 불이 켜졌습니다."); 
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall(); // 오버라이딩으로 재정의 후 
		phone.receiveCall();
		phone.flash();
	}
}

// 출력
// ** Phone **
// 띠리리리링
// 전화가 왔습니다.
// 전화기에 불이 켜졌습니다.