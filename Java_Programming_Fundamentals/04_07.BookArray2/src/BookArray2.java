import java.util.Scanner;

class Book {
	String title, author;

	public Book(String title, String author) {
		// this : class 객체 자신에 대한 래처런스
		// 반드시 생성자 코드의 제일 처음에 수행, 생성자 내에서만 사용 가능
		this.title = title;
		this.author = author;
	}
}

public class BookArray2 {
	// 접근 지정자 : public
	// 리턴 타입 : void
	// 메소드 이름 : main
	// 메소드 인자 : String[] args
	// 그리고 모든 객체에 대해 공유가 된다.
	public static void main(String[] args) {
		
		// Book 객체인 book가 여러 개 만들어진 준비를 한다.
		// new를 작성하면서 Book 객체인 book를 2개 만들고 각 객체에 레퍼런스를 매칭한다.
		Book[] book = new Book[2]; // Book 배열 선언 및 레퍼런스 배열 생성
		// Book[] book; : 레퍼런스 변수 book생성
		// book = new Book[2] : 레퍼런스 배열 생서
		
		// 사용자 입력 공간 선언
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) {
			
			System.out.print( (i+1) + "번 책 제목>>");
			String title = scanner.nextLine();
			
			System.out.print( (i+1) + "번 책 저자>>");
			String author = scanner.nextLine();
			
			// 배열의 각 객체에 생성자로 값을 대입할때 new를 사용하여 배열 원소 객체를 생성한다.
			book[i] = new Book(title, author); // 배열의 각 원소 객체 생성
		}
		
		for (int i = 0; i < book.length; i++) // 배열의 각 원소 객체 사용
			System.out.print( (i+1) + "번책 : (" + book[i].title + ", " + book[i].author + ")\n");
		
		scanner.close();
	}
}

// 출력
// 1번 책 제목>> 홍길동전
// 1번 책 저자>> 허균
// 2번 책 제목>> 노인과 바다
// 2번 책 저자>> 누구더라...
// 1번책 : ( 홍길동전,  허균)
// 2번책 : ( 노인과 바다,  누구더라...)