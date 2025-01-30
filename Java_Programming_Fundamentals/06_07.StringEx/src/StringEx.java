// String 클래스
// 하나의 문자열로 표현, 리스트 형식으로 들어와도 문자열로 표현

// java.lang 패키지에 존재
// 주소 : java.lang.String

// 문자열(String) 생성 방법
// 리터럴로 생성하는 방법, 예) String s = "Hello"; 
// JVM이 리터럴 관리, 같은 문자열을 저장한다고 하면 두 변수를 주소를 공유한다.

// String 객체로 생성하는 방법, 예) String t = new String("Hello")
// 힙 메모리에 String 객체 생성, 같은 문자열을 저장해도 주소가 다 다르다. 하지만 문자열의 수정은 불가능하다.

// String 객체의 주요기능
// 스트링 객체는 수정이 불가능하다.
// 기존에 문자열에 문자열을 붙여서 새로운 문자열을 만들수 있다. concat 메소드 사용
// 스트릴 비교시 반드시 주소가 아닌 값을 비교하는 equals() 메소드를 사용한다.
// 문자열 비교시 compareTo() 메소드를 사용한다. 사전의 문자 순서를 기준으로 음수, 0, 양수를 리턴한다.

// 문자열 비교시 compareTo() 메소드를 사용
// 문자열을 비교할 때 == 를 사용하면 안된다.

// 문자열에 문자 포함 확인
// contains() 메소드를 이용하여 문자열 안에 해당 문자가 들어있는지 확인한다.

// 문자열 대체하기
// replace(변하기전문자,바꿀문자) 메소드를 이용하여 해당문자를 원하는 문자로 바꾼다.

// 문자열 연결
// 기본타입의 문자열은 + 로 연결이 가능하다.
// String 객체 타입의 문자열은 concat() 메소드를 이용하여 새로운 문자열을 만들어 낸다.

// 문자열 분리
// split(기준문자) 메소드를 기준으로 문자열을 나눈다. 저장하는 변수는 배열로 선언하는게 좋다.

// 문자열 부분저장
// substring(인덱스) 메소드를 이용하여 인덱스부터의 문자열을 따로 분리한다.

// 문자열 공백 제거
// trim() 메소드를 이용하여 문자열 앞, 뒤에 공백 문자(탭, 엔터, 스페이스)들을 제거한다.

// 문자열 길이
// length() 메소드를 이용하여 문자열의 길이를 구한다. 공백 또한 포함한다.

// 문자열의 각 문자 접근
// charAt(index) 메소드를 이용하여 인덱스 번호의 문자에 접근한다. 인덱스 시작은 0부터 한다.

public class StringEx {
	public static void main(String[] args) {
		
		String a = new String(" C#");
		String b = new String(",C++ ");
		System.out.println(a + "의 길이는 " + a.length()); // 문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); // 문자열의 포함 관계
		
		System.out.println(a.compareTo(" C#")); // 두 문자열이 같은지 확인, 같으면 0
		System.out.println(a.equals("C#")); // 두 문자열이 같은지 확인, 같으면 True
		
		a = a.concat(b); // 문자열 연결
		System.out.println(a);
		
		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		
		a = a.replace("C#","Java"); // 문자열 대치
		System.out.println(a);
		
		String s[] = a.split(","); // 문자열 분리
		
		for (int i=0; i<s.length; i++)
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println(c);
	}
}

// 출력
//  C#의 길이는 3
// true
// 0
// false
//  C#,C++ 
// C#,C++
// Java,C++
// 분리된 문자열0: Java
// 분리된 문자열1: C++
// C++
// +


