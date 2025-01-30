// 슈퍼클래스와 서브 클래스의 생성자 간의 호출 및 실행 관계

// 상속 관계에서의 생성자
// 슈퍼클래스와 서브 클래스 각각 여러 생성자 작성 가능
// 서브 클래스에서 슈퍼클래스의 생성자 하나 선택(super()함수 사용)을 하며 실행,
// 선택하지 않는 경우는 컴파일러가 자동으로 슈퍼 클래스의 기본생성자 선택하여 실행, 기본생성자가 없으면 오류
// 단, super()를 호출하려면 서브클래스의 생성자코드의 제일 첫 라인에서 선언해야 함

class A{
	// public A() { System.out.println("class A 기본생성자"); } // 기본생성자 삭제한다면
	public A(int x) { System.out.println("class A 생성자1"); }
	public A(int x, int y) { System.out.println("class A 생성자2"); }
}

class B extends A{
	public B() { 
		System.out.println("class B 기본생성자"); 
	}
	public B(int x) { 
		super(x);
		System.out.println("class B 생성자1"); 
	}
	public B(int x, int y) { 
		super(x,y);
		System.out.println("class B 생성자2"); 
	}
}

class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public Point() { // private x, y에 값을 대입하기 위한 기본생성자
		this.x = this.y = 0;
	}
	public Point(int x, int y) { // 인수가 2개짜리 생성자1 
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point { // Point를 상속받음
	private String color; // 점의 색
	public ColorPoint(int x, int y, String color) { // 인수 3개짜리 생성자로 입력받은 좌표와 색상을 대입
		super(x, y); // Point에 기본생성자자가 아닌 인수가 2개인 생성자를 호출
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
		// B b = new B(); // B에서 A클래스로 생성자 호출할때 super를 따로 지정하지 않아 기본생성자를 호출하지만 없어서 오류
		System.out.println();
		B b1 = new B(5);
		System.out.println();
		B b2 = new B(5,5);
	}
}

// 출력
// blue(5,6)
//
// class A 생성자1
// class B 생성자1
//
// class A 생성자2
// class B 생성자2