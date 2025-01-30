// 객체 비교와 equals()
// = 연산자
// 기본타입이 아니면 전부 레퍼런스(주소)를 넘겨준다.

// == 연산자
// 두개의 래퍼런스 비교, 주소가 같은지 비교한다.

// boolean equals(Object obj)
// 객체 내용이 같은지 비교, 안데 있는 값이 같은지 확인한다.
class Rect {
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if (width*height == p.width*p.height)
			return true;
		else
			return false;
	}
}
public class EqualsExRect {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(6,1);
		Rect d = new Rect(3,4);
		Rect e = new Rect(6,2);
		
		if(a.equals(b)) // True
			System.out.println("a is equal to b");
		if(b.equals(c)) // True
			System.out.println("b is equal to c");
		if(a.equals(c)) // True
			System.out.println("a is equal to c");
		if(a.equals(d)) // False
			System.out.println("a is equal to d");		
		if(d.equals(e)) // True
			System.out.println("d is equal to e");
	}
}

// 출력
// a is equal to b
// b is equal to c
// a is equal to c
// d is equal to e
