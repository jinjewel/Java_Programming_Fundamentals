// StringTokenizer
// java.util 패키지에 String.Tokenizer 클래스
// 하나의 문자열을 여러 문자열로 분리 해준다.
// 생성 예) StringTokenizer stz = new StringTokenizer(문자열, 구분기호) 
// 구분기호에 문자열로 들어온다면 그 문자열의 요소 하나하나가 구분기호가 된다.
// String에 split() 메소드를 이용하여 동일한 구현 가능

// 토크나이저가 분리한 토큰의 개수 리턴
// countTokens() 메소드를 사용

// 토크나이저에 다음 토큰이 있으면 True 리턴 아니면 False 리턴
// hasMoreTokens() 메소드 사용

// 토크나이저에 들어 잇는 다음 토큰 리턴
// nextToken() 메소드 사용

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		
		System.out.println(st.countTokens()); // 토크나이저가 분리한 토큰의 개수 리턴
		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken()); // 토크나이저에 들어 잇는 다음 토큰 리턴
	}
}

// 출력
// 5
// 홍길동
// 장화
// 홍련
// 콩쥐
// 팥쥐
