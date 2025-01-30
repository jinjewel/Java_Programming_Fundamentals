
// 메소드 오버라이딩(무시하기, 덮어쓰기)
// 수퍼 클래스에 선언된 메소드를 각 서브 클래스들이 자신만의 내용으로 새로 구현하는 기
// 동적 바인딩을 통해 실행 중에 다형성 실현되며, 슈퍼 클래스의 메소드를 서브 클래스에서 재정의
// 동적 바인딩 : 재정의로 인하여 슈퍼클래스에 정의된 메서드를 호출했지만 서브 클래스에 오버라이딩된 메소드가 무조건 실행되는 것
// 이와 반대로 컴파일러에서  super의 접근은 정적 바인딩으로 처리

class Shape { // 슈퍼 클래스
	public Shape next; 
	public Shape() { 
		next = null; 
	}
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() { // shape를 line에 맞게 메소드 오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() { // shape를 rect에 맞게 메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() { // shape를 circle에 맞게 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적 바인딩
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); 
		paint(new Shape()); 
		paint(new Line()); // 메소드 오버라이딩 사용
		paint(new Rect());  // 메소드 오버라이딩 사용
		paint(new Circle());  // 메소드 오버라이딩 사용
	}
}

// 출력
// Line
// Shape
// Line
// Rect
// Circle