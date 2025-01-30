
import java.util.Scanner;

public class Rectangle {
	
	int width; // 멤버 변수(필드)
	int height; // 멤버 변수(필드)
	
	public int getArea() { // 멤버 함수(메소드)
		return width*height;
	}

	// static 때문에 따른 파일에서 불러올시 참조를 못함
	// public 다른 모든 클래스의 접근을 허용	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Rectangle rect = new Rectangle(); // 반드시 new로 선언
		
		System.out.print("면적을 구하려는 사각형의 너비와 높이를 입력해주세요. >> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		// 사용자 입력 객체 종료
		scanner.close();
	}
}

// 출력
// 면면적을 구하려는 사각형의 너비와 높이를 입력해주세요. >> 4 5
// 사각형의 면적은 20
