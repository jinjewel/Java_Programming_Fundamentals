// StringBuffer 클래스
// 가변 크기의 문자열 저장 클래스
// java.lang 패키지에 StringBuffer 클래스

// String 클래스와 달리 문자열 변경 가능
// StringBuffer 객체의 크기는 스트링의 길이에 따라 가변적
// 생성, 예) StringBuffer sb = new StringBuffer("java");

// 스트링 버퍼에 연결
// append() 메소드를 이용하여 스트링 버터를 연결하는데 문자열을 연결하면 

// 스트링 버퍼의 현재 크기 반환
// capacity() 메소드를 이용하여 스트링 버퍼의 현재 크기를 반환한다.

// 스트칭 버퍼의 입부분 삭제
// delete(시작,끝) 메소드를 이용하여 시작과 끝사이의 문자열을 삭제한다.

// 스트링 버퍼의 삽입
// insert(인덱스, 문자열) 메소드를 이요하여 인덱스 부분에 문자열을 삽입한다.

// 스트링 버퍼에 문자열 대체하기
// replace(시작, 끝, 문자열)메소드를 이용하여 시작과 끝 사이를 문자열로 대체한다.

// 스트링 버퍼에 역순
// reverse() 메소드를 이용하여 스트링 버퍼 문자열의 순서를 바꿔서 반환한다.

// 스트링 버퍼의 길이 재정의
// setLength(길이) 메소드를 이용하여 기존의 스트링 버퍼 문자열을 길이에 맞게 다시 설정한다. 

public class StringBufferEx {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sb);
		
		sb.insert(7, " my"); // "my" 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // "my"를 "your"로 변경
		System.out.println(sb);
		
		sb.delete(8, 13); // "your " 삭제
		System.out.println(sb);
		
		sb.setLength(4); // 스트링 버퍼 내 문자열 길이 수정
		System.out.println(sb);
	}
}

// 출력
// This is pencil
// This is my pencil
// This is your pencil
// This is pencil
// This