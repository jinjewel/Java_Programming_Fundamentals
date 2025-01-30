/*
컬렉션 매개변수로 받는 메소드 만들기
예시) public void 함수이름(Vector<Integer> v)

java 7 이전 : 모든 객체와 형식을 선언해야됨
java 7 이후 : 컴파일러에 타입추론 기능이 추가되어서 다이어몬드 연산자(<>)에 타입 매개변수 생략
java 10 이후 : var 키워드 도입. 지역변수 타입 추론 가능

ArrayList<E>

특성
java.util.ArrayList 에 존재
가변 크기의 배열을 구현한 클래스
삽입 가능한 것 : 객체, null, Wrapper 객체(기본타입을 변환)
리스트의 중간 혹은 맨 뒤에 객체 추가 가능, 임의의 위치에 있는 객체 삭제 가능
벡터와 달리 스레드 동기화의 기능이 없으므로 불안정한 형태를 유지, 개발자가 스체드 동기화 코드를 짜야한다.
즉, 하나의 객체를 사용하고 있는데, 다른 사용자가 들어와서 처리를 할 수 있는 상태. 
벡터보단 빠르지만 불안정하다.
<-> 벡터는 느리지만 안정적이다. 즉 하나의 값은 처리가 끝나면 다른 스레드를 처리할 수 있다.

메소드
변수이름.add(E element) : 맨뒤에 추가
변수이름.add(int index, E element) : 인덱스 위치에 삽입
변수이름.size() : 요소의 개수 리턴
변수이름.remove(int index) : 인덱스 요소 삭제
변수이름.remove(object o) : 객체 o와 같은 첫번째 요소 삭제
변수이름.clear() : 모든 요소 삭제
변수이름.isEmpty() : 벡터가 비어있으면 T
변수이름.get(int index) : 인덱스 값 반환
변수이름.elementAt(int index) : 인덱스 값 반환
<-> 벡터와 달리 .capacity()메소드가 없다.

*/

import java.util.*; // ArrayList<E>를 사용하기 위해 선언

public class ArrayListEx {
	public static void main(String[] args) {
		
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in); 
		System.out.println("입력된 4명의 이름중 가장 긴 이름을 출력하겠습니다.");
		
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next(); // 키보드로부터 이름 입력
			a.add(s); // ArrayList 컬렉션에 삽입
		}
		
		// ArrayList에 들어 있는 모든 이름 출력
		for(int i=0; i<a.size(); i++) {
			// ArrayList의 i 번째 문자열 얻어오기
			String name = a.get(i); // 자동 언박싱
			System.out.print(name + " ");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0; 
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i; 
		}
		
		System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex)); // a.get(idx) : idx번째 값을 반환
		scanner.close();
	}
}

/* 출력
입력된 4명의 이름중 가장 긴 이름을 출력하겠습니다.
이름을 입력하세요>>Mike
이름을 입력하세요>>Jane
이름을 입력하세요>>Ashley
이름을 입력하세요>>Helen
Mike Jane Ashley Helen 
가장 긴 이름은 : Ashley
*/