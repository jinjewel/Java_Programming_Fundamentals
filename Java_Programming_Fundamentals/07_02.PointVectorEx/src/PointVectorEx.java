

import java.util.Vector; // Vector<E> 를 사용하기 위해 선언 

class Point {
	private int x, y; // private로 선언
	
	public Point(int x, int y) { // 생성자를 통해 private 변수에 값을 저장
		this.x = x; this.y = y;
	}
	
	public String toString() { // 출력 설정
		return "(" + x + "," + y + ")"; 
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		
		Vector<Point> v = new Vector<Point>(); // Point 객체를 요소로만 가지는 벡터 생성
		
		// 3 개의 Point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8)); 
		v.remove(1); // 인덱스 1의 Point(-5, 20) 객체 삭제
		
		// 벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // 벡터에서 i 번째 Point 객체 얻어내기
			System.out.println(p); // p.toString()을 이용하여 객체 p 출력
		}
	}
}

/* 출력

(2,3)
(30,-8)

*/
