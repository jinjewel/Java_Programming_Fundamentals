
// 다른 인처페이스 상속 가능, 다중 상속 가능
// 상속 : interface MobilePhoneInterface extends PhoneInterface
// 다중상속 : interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface
// 인터페이스에 추상 메소드를 모두 구현하지 못했으면 단순 상속 extends 키워드 사용
// 인터페이스에 모든 추상 메소드를 모두 구현하면 implements 키워드 사용

// 추상 클래스와 인터페이스 비교
// 유사점
// 객체를 생성할 수 없고, 상속을 위한 슈퍼 클래스로만 사용, 클래스의 디형성을 실현하기 위한 목적
// 다른점
// 추상 클래스 : 추상 메소드와 일반 메소드, 상수 변수 필드 모두 포함
// 인터페이스 : 변수 필드는 포함하지 않음, protected 접근 지정 선언 불가, 다중 상속 지원

interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언, public static 생략
	void sendCall(); // 추상 메소드, public abstract 생략
	void receiveCall(); // 추상 메소드, public abstract 생략
	default void printLogo() { // default 메소드, public 생략
		System.out.println("** Phone **");
	}
}
interface MobilePhoneInterface extends PhoneInterface { // 인터페이스를 상속받아 총 4개의 추상메소드 선언
	void sendSMS(); // 추상 메소드, public abstract 생략
	void receiveSMS(); // 추상 메소드, public abstract 생략
}
interface MP3Interface { // 인터페이스 선언, 2개의 추상메소드 선언
	public void play(); // 추상 메소드, public abstract 생략
	public void stop(); // 추상 메소드, public abstract 생략
}
class PDA { // 클래스 작성
	public int calculate(int x, int y) { 
		return x + y; 
	}
}

// SmartPhone 클래스는 PDA를 상속받고, 
// 다중 인터페이스 상속으로 MobilePhoneInterface와 MP3Interface 인터페이스를 상속받고
// 두 인터페이스에 선언된 6개의 추상 메소드를 모두 구현한다.
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface { 
	
	// MobilePhoneInterface의 추상 메소드 구현
	@Override 
	public void sendCall() { 
		System.out.println("따르릉따르릉~~"); 
	}
	@Override public void receiveCall() { 
		System.out.println("전화 왔어요."); 
	}
	@Override 
	public void sendSMS() { 
		System.out.println("문자갑니다."); 
	}
	@Override 
	public void receiveSMS() { 
		System.out.println("문자왔어요."); 
	}
	
	
	// MP3Interface의 추상 메소드 구현
	@Override 
	public void play() {
		System.out.println("음악 연주합니다."); 
	}
	@Override 
	public void stop() {
		System.out.println("음악 중단합니다."); 
	}
	
	// 추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다."); 
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone(); 
		phone.printLogo(); // default 메소드
		phone.sendCall(); // MobilePhoneInterface 인터페이스의 오버라이딩한 메소드 사용
		phone.play(); // MP3Interface 인터페이스의 오버라이딩한 메소드 사용
		System.out.println("3과 5를 더하면 " + phone.calculate(3,5)); // 슈퍼클래스의 메소드 사용
		phone.schedule(); // 추가로 작성한 메소드 사용
	}
}