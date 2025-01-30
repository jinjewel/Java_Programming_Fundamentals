// do-while문
// 최소한 한번은 실행

public class DowhileSample {
	public static void main(String[] args) {
		
		// a에서 z까지 문자 출력
		char c = 'a'; // 시작 문자 초기화
		do {
			System.out.print(c + " ");
			c = (char)(c + 1); // 아스키 코드값을 사용하여 문자로 캐스팅
		} while (c <= 'z'); 
	}
}

// 출력
// a b c d e f g h i j k l m n o p q r s t u v w x y z 