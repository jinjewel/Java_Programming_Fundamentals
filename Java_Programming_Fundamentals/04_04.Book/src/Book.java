// 생성자 : 객체가 생성될 때 초기화를 위해서 자동으로 한 번 호출(실행)되는 메소드
// 생성자는 new를 통해 객체를 생성되며, 생성될 때, 반드시 객체당 한 번 호출.
// 리턴 타입을 따로 생성할 수 없다. 
// 기본 생성자 : 매개 변수 겂고 아무 작업 없이 단순 리턴하는 생성자(디폴트 생성자라고 부르기도 함)
// 클래스에 생성자가 하나도 선언되지 않은 경우, 컴파일러에 의해 자동으로 삽입
// 클래스에 생성자가 하나라도 작성된 경우 기본생성자는 자동 삽입되지 않음.
// 함수의 오버로딩 (메소드 인자의 개수나 자료형에 따라 생성자를 여러 개 선언하는 것)

public class Book {
	String title; // 필드(멤버 변수)
	String author; // 필드(멤버 변수)
	
	// 기본 생성자는 없는 상태
	// 함수의 오버로딩 (메소드 인자의 개수나 자료형에 따라 다른게 선언하는 것)	
	public Book(String t) { // 메소드 인자가 1개가 있는 생성자 
		title = t; 
		author = "작자미상";
	}
	
	public Book(String t, String a) { // 메소드 인자가 2개가 있는 생성자 
		title = t; 
		author = a;
	}

	public static void main(String[] args) {
		
		// 메소드 인자가 2개인 2번째 오버로딩 함수를 호출
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		
		// 메소드 인자가 1개인 1번째 오버로딩 함수를 호출
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}

// 출력
// 어린왕자 생텍쥐페리
// 춘향전 작자미상