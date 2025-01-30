// 객체 비교와 equals()
// = 연산자
// 기본타입이 아니면 전부 레퍼런스(주소)를 넘겨준다.

// == 연산자
// 두개의 래퍼런스 비교, 주소가 같은지 비교한다.

// boolean equals(Object obj)
// 객체 내용이 같은지 비교, 안데 있는 값이 같은지 확인한다.

class Point{
	private int x, y;;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj){
		Point p = (Point)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		Point d = a;
		
		if(a == b) // false
			System.out.println("a==b");
		if(a == d) // true
			System.out.println("a==d");
		if(b == d) // false
			System.out.println("b==d");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
		if(b.equals(d)) // true
			System.out.println("b is equal to d");
	}
}

// 출력
// a==d
// a is equal to b
// b is equal to d