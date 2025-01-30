// toString()
// java.lang 모듈에 Object 클래스 내 주요 메소드
// 다음과 같이 구현되어 있음
// public String toString() {
//	 return getClass().getName() + "@" + Integer.toHexString(hashCode());
// }
// 객체를 문자열로 반환해주며 
// 유리가 계속 쓰던 문자열 출력은 다 이 메소드를 통해 출력하는 것이다.
// 예) 평소 print(p) -> 사실 print(p.toString()) 
// 개발자는 자신만의 toString()작성 필요

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}
public class toStringEx {
	public static void main(String [] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p); // p는 p.toString()으로 자동 변환
		System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
	}
}

// 출력
// Point(2,3)
// Point(2,3)
// Point(2,3)입니다.