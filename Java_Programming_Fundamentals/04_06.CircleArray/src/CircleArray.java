// 객체의 치환은 개체가 복사되는 것이 아니며 레퍼런(주소)가 복사된다.

class Circle {
	int radius;
	// public : 패키지 관계 없이 모든 클래스에게 접근 허용
	// 동일 클래스 내에만 접근 허용, 상속 받은 서브 클래스에서 접근 불가
	public Circle(int radius) {
		// this : class 객체 자신에 대한 래처런스
		// 반드시 생성자 코드의 제일 처음에 수행, 생성자 내에서만 사용 가능
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		// Circle[] c = new Circle[5]; 로도 선언가능, 컴퓨터에 생성과 레퍼런스 매칭이 동시에 진행된다.
		Circle[] c; // 레퍼런스 변수 c 생성. Circle 객체인 c가 여러개 만들어진 준비를 한다. 
		c = new Circle[5]; // 레퍼런스 배열생성. Circle 객체인 c를 5개 만들고 각 객체에 레퍼런스를 매칭한다.
		
		for (int i = 0; i < c.length; i++)
			c[i] = new Circle(i); // 각 객체에 생성자를 호출하기 위해서 new를 사용해야한다.
		
		for (int i = 0; i < c.length; i++)
			System.out.print((int) (c[i].getArea()) + " "); // 실수부분을 잘라내서 정보 누락 생김
	}
}

// 출력
// 0 3 12 28 50 