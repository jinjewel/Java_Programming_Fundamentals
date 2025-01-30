// 상속
// 객체 지향의 상속 : 부모 클래스에 만들어진 필드, 메소드를 자식 클래스가 물려받음

// 객체 지향에서 상속의 장점
// 클래스의 간결화 : 멤버의 중복 작성 불필요
// 클래스 관리 용이 : 클래스들의 계층적 분류
// 소프트웨어의 생산성 향상 : 클래스 재사용과 확장 용이, 새로운 클래스의 작성 속도 빠름

// 자바에 상속 선언
// extends 키워드 사용
// 부모 클래스 -> 슈퍼 클래스 
// 자식 믈래스 -> 서브 클래스

class Point {
	// private으로 선언을 했으므로 x, y값을 기입하기 위해 따로 함수를 이용함.
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public void set(int x, int y) { // private의 x, y를 기입하기 위한 함수
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

//Point를 상속받은 ColorPoint 선언
class ColorPoint extends Point { 
	private String color; // 점의 색, private으로 선언을 했으므로 color값을 기입하기 위해 따로 함수를 이용해야함
	public void setColor(String color) { // private의 color를 기입하기 위한 함수
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
		
		Point p = new Point(); // Point 변수 선언 및 객체 생성
		p.set(1, 2); // Point 클래스의 set() 호출
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); // ColorPoint 객체
		cp.set(3, 4); // Point의 set() 호출
		cp.setColor("red"); // color는 private이므로 값을 대입하기 위해 ColorPoint의 setColor() 호출
		cp.showColorPoint(); // 컬러와 좌표 출력
	}
}

// 결과
// (1,2)
// red(3,4)