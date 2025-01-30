// 동적바인딩 : 컴파일러가 동적으로 실행할 메소드를 실행할 시에 결정
// 업캐스팅 시 오버라이딩이 호출된 함수가 원래 슈퍼클래스의 함수를 대체하는 상황

// super는 슈퍼클래스의 멤버를 접근할 때 사용되는 레퍼런스로 서브 클래스에서만 사용한다.
// 컴파일러는 super의 접근을 정적바인딩으로 처리 

// 메소드 오버로딩( 생성자 오버로딩 ) : super키워드를 사용하여 슈퍼클래스의 생성자를 호출 시 정적 바인딩
// 이름이 같은 여러 개의 메소드를 중복 작성하여 사용의 편리성 항상, 다형성 실현
// 메소드 오버라이딩 ( 메소드 재정의 ) : 업캐스팅 후 오버라이딩 된 메서드 호출시 동적 바인딩
// 슈퍼 클래스에 구현된 메소드를 무시하고 서브 클래스에서 새로운 기능의 메소드를 재정의. 다형성 실현

class Weapon {
	protected int fire() { 
		return 1; // 무기는 기본적으로 한 명만 살상
	}
}
class Cannon extends Weapon {
	@Override
	protected int fire() { // 오버라이딩
		return 10; // 대포는 한 번에 10명을 살상
	}
}

public class Overriding {
	public static void main(String[] args) {
		
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		
		weapon = new Cannon();
		// weapon.fire()를 하면서 weapon.fire가 cannon.fire로 오버라이딩 되는 상황
		// 동적 바인딩이 실행
		System.out.println("대포의 살상 능력은 " + weapon.fire());
	}
}

// 출력
// 기본 무기의 살상 능력은 1
// 대포의 살상 능력은 10