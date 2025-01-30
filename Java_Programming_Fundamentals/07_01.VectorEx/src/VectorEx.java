/*
컬렉션
요소 객체들의 저장소로 요소의 개수에 따라 크기가 자동 조절이 된다. 요소의 삽입, 삭제에 따른 요소의 위치 자동 이동
고정 크기의 배열을 다루는 어려움을 가변 크기의 컬렉션이 해소
컬렉션은 제네릭 기법으로 구현된다.
컬렉션의 요소는 객체만 가능하며 기본 타입 사용 불가하다.(Wrapper로 변환 필요, JDK 1.5부터 자동 박싱, 언박싱을 사용한다.)

JDK 1.5 이전 : 자동 박싱/언박싱이 없으므로 기본 타입을 Wrapper로 다 변환하여 선언 해야 했었다.
v.add(Integer.valueOf(4));
Integer n = (Integer)v.get(0);
int k = n.intValue();

JDK 1.5 이후 : 자동 박싱/언박싱으로 기본 타입 값 사용가능
v.add(4);
int k = v.get(0);

인터페이스
       Collection<E>                Map<K, V>
       
Set<E>   List<E>   Queue<E>  

클래스

HashSet<E> ArrayList<E> Vector<E> LinkedList<E> HashMap<K, V>

                        Stack><E>

제네릭
JDK 1.5에서 도입을 했으며, 모든 종류의 데이터 타입을 다룰 수 있도록 일반화된 타입
특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소드를 일반화시키는 방법
타입 매개 변수 표기방법 : <E>, <K>, <V>
제네틱 클래스 표기방법 : Stack<E>
나중에 제네틱 클래스를 구체화 한 경우 : Stack<Integer>, Stack<String>

Vector<E>

특성
java.util.Vector 에 존재
여러 객체들을 삽입, 삭제, 검색하는 컨테이너 클래스, 길이 제한이 없으며 크기가 커지면 자동으로 길이가 조절
Vector에 삽입 가능한 것 : 객체, null, Wrapper객체(기본타입을 변환)
Vector 맨뒤 혹은 중간에 객체를 삽입할 수 있으며, 객체를 삭제한다면 자동으로 자리가 이동된다.

선언
Vector<Integer> 변수이름 = new Vector<Integer>();

메서드
변수이름.add(E element) : 맨뒤에 추가
변수이름.add(int index, E element) : 인덱스 위치에 삽입
변수이름.capacity() : 백터의 현재 용량 리턴
변수이름.size() : 요소의 개수 리턴
변수이름.remove(int index) : 인덱스 요소 삭제
변수이름.remove(object o) : 객체 o와 같은 첫번째 요소 삭제
변수이름.clear() : 모든 요소 삭제
변수이름.isEmpty() : 벡터가 비어있으면 T
변수이름.get(int index) : 인덱스 값 반환
변수이름.elementAt(int index) : 인덱스 값 반환

오류
Vector<int> : <> 안에는 기본타입이 아닌 객체가 들어가야 한다.

*/

import java.util.Vector; // Vector<E>를 사용하기 위해서 불러온다.

public class VectorEx {
	public static void main(String[] args) {
		
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입
		
		// 벡터 중간에 삽입하기
		v.add(2, 100); // 4와 -1 사이에 정수 100 삽입
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size()); 
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		// 모든 요소 정수 출력하기
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		//벡터 속의 모든 정수 더하기
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i); sum += n; } // v.elementAt(i) : i번째 인덱스 값을 반환
		
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}

/* 출력

벡터 내의 요소 객체 수 : 4
벡터의 현재 용량 : 10
5
4
100
-1
벡터에 있는 정수 합 : 108

*/
