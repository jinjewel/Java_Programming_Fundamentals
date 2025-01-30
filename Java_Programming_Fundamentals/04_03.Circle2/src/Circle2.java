public class Circle2 {
	int radius;
	String name;

	// Circle2의 생성자, 멘버 함수, 메소드
	// 생성자 : 객체가 생성될 때 초기화를 위해서 자동으로 한 번 호출(실행)되는 메소드
	// 생성자는 new를 통해 객체를 생성되며, 생성될 때, 반드시 객체당 한 번 호출.
    // 리턴 타입을 따로 생성할 수 없다. 
	// 기본 생성자 : 매개 변수 겂고 아무 작업 없이 단순 리턴하는 생성자(디폴트 생성자라고 부르기도 함)
    // 클래스에 생성자가 하나도 선언되지 않은 경우, 컴파일러에 의해 자동으로 삽입
	// 클래스에 생성자가 하나라도 작성된 경우 기본생성자는 자동 삽입되지 않음.
	// 함수의 오버로딩 (메소드 인자의 개수나 자료형에 따라 생성자를 여러 개 선언하는 것)
	public Circle2() { // 매개 변수 없는 생성자, 기본생성자
		radius = 1; // radius의 초기값은 1 
		name = ""; 
	}
	
	public Circle2(int r, String n) { // 메소드 인자가 2개가 있는 생성자, 함수의 오버로딩 실현
		radius = r;
		name = n;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	// static 때문에 따른 파일에서 불러올시 참조를 못함
	// public 다른 모든 클래스의 접근을 허용	
	public static void main(String[] args) {
		
		Circle2 pizza = new Circle2(10, "자바피자"); // Circle 객체 생성, 반지름 10
		pizza.name = "시험싫다";
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle2 donut = new Circle2(); // Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		
		System.out.println(donut.name + "의 면적은 " + area);
	}
}

// 출력
// 시험싫다의 면적은 314.0
// 도넛피자의 면적은 3.14


