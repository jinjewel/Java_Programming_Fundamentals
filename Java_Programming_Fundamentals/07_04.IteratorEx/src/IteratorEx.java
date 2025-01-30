/*

iterator<E> 인터페이스
컬렉션의 순차 검색을 위하여 iterator를 사용한다.
iterator 객체를 이용하여 인덱스 없이 순차적 검색이 가능하다.
Vector<E>, ArrayList<E>, LinkedList<E>가 상속받는 인터페이스

iterator<E> 인터페이스 메소드
객체이름.hasNext() : 다음 요소가 있다면 T
객체이름.next() : 다음 요소 리턴
객체이름.remove() : 마지막으로 리턴된 요소 제거

 */

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>(); 
		
		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입
		v.add(2, 100); // 4와 -1 사이에 정수 100 삽입
		
		// Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator(); // Iterator 객체 얻기
		
		while(it.hasNext()) { // it에 다음 요소가 있다면 반복
			int n = it.next(); // it에 다음 요소를 반환
			System.out.println(n);
		}
		
		//Iterator를 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator(); // Iterator 객체 얻기
		while(it.hasNext()) { // it에 다음 요소가 있다면 반복
			int n = it.next(); // it에 다음 요소를 반환
			sum += n; 
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}

// 출력
// 5
// 4
// 100
// -1
// 벡터에 있는 정수 합 : 108
