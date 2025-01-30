/*

LinkedLink<E> 

특성
java.util.LinkedLink 에 존재
List 인터페이스를 구현한 클래스
요소 객체들을 양방향으로 연결되어 관리, 요소 객체는 맨 앞, 맨 뒤에, 혹은 인덱스를 이용하여 중간에 삽입 가능
맨 앞이나 맨 뒤에 요소를 추가하거나 삭제할 수 있어 스택이나 큐로 사용 가능

Collection 믈래스

특성
java.util 패키지에 포함.
컬렉션에 대해 연산을 수행하고 결과로 컬렉션을 리턴
모든 메소드는 static 타입

메소드
.sort() .reverse() .max() .min() .binarySearch()

 */

import java.util.*; // Collections를 사용하기 위해 선언

public class CollectionsEx {
	static void printList(LinkedList<String> l) { 
		
		Iterator<String> iterator = l.iterator(); // 인덱스 없이 요소를 차례로 확인하기 위해 선언 
		
		while (iterator.hasNext()) { 
			String e = iterator.next(); 
			String separator; // 문자를 이어주는 연결문자를 저장
			if (iterator.hasNext())
				separator = "->"; 
			else // 더 이상 값이 없으면 줄바꿈
				separator = "\n"; 
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>(); 
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		Collections.sort(myList); // Collection는 static이므로 따로 선언없이 사용, 요소 정렬
		printList(myList); // 정렬된 요소 출력
		
		Collections.reverse(myList); // Collection는 static이므로 따로 선언없이 사용, 요소의 순서를 반대로
		printList(myList); // 요소 출력
		
		int index = Collections.binarySearch(myList, "아바타") + 1; 
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}
}

// 출력
// 매트릭스->스타워즈->아바타->터미네이터->트랜스포머
// 트랜스포머->터미네이터->아바타->스타워즈->매트릭스
// 아바타는 3번째 요소입니다.

