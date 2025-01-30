/*

제네릭에서 배열의 제한
제네릭 클래스 또는 인터페이스의 비열을 허용하지 않음.
예) GStack<String>[] gs = new GStack<String>[10]; 오류
제네릭 타입의 배열도 허용하지 않음.
예) T[] a = new T[10]; 오류
타입 매개변수의 배열에 레퍼런스는 허용
예) public void myArray(T[] a) {...} 허용

제네릭 메소드 선언 가능
예) static <T> void toStack(T[] a, GStack <T> gs)

제네릭의 장점
컴파일 시에 타입이 결정되어 보다 안전한 프로그래밍 가능
런타임 타입 충돌 문제 방지
ClassCastException 방지

 */

class GStack<T> {
	int tos; 
	Object [] stck; 
	
	public GStack() { 
		tos = 0; 
		stck = new Object [10];
	}
	
	public void push(T item) {
		if(tos == 10) 
			return; 
		stck[tos] = item; 
		tos++; 
	}
	
	public T pop() {
		if(tos == 0) 
			return null; 
		tos--; 
		return (T)stck[tos]; // 타입 캐스팅
	}
}

public class GenericMethodExample {
	
	public static <T> GStack<T> reverse(GStack<T> a) { // T가 타입 매개 변수인 제네릭 메소드
		
		GStack<T> s = new GStack<T>(); 
		
		while (true) { 
			T tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄
			
			if (tmp==null) // 스택이 비었음
				break; 
			else 
				s.push(tmp); // 새 스택에 요소를 삽입
		}
		return s; // 새 스택을 반환
	}
	public static void main(String[] args) {
		
		// Double 타입의 GStack 생성
		GStack<Double> gs = new GStack<Double>(); 
		
		// 5개의 요소를 스택에 push
		for (int i=0; i<5; i++) { 
			gs.push(new Double(i)); 
		}
		
		gs = reverse(gs);
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}
}