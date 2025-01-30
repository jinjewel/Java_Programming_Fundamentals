// static를 이용한 환율 계산기

// final 믈래스와 메소드
// final 클래스는 상속이 불가. 사용 예) final class FinalClass{... }
// final 메소드는 오버라이딩(재정의)가 불가. 사용 예) public final int finalMethid( ... )

// final 필드 , 상수 선언
// 상수를 선언할때 사용을 하며. 사용 예) public static final double PI = 3.14
// 상수  필드는 선언시에 초기 값을 지정해야 한다. 재정의가 불가능 하므로
// 상수 필드는 실행중에 값을 변경할 수 없다. 또한 재정의도 불가능 하다.

package staticMenber;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate; // 한국 원화에 대한 환율

	public static double toDollar(double won) {
		return won / rate; // 한국 원화를 달러로 변환
	}

	public static double toKWR(double dollar) {
		return dollar * rate; // 달러를 한국 원화로 변환
	}

	public static void setRate(double r) {
		rate = r; // 환율 설정. KWR/$1
	}
}

public class staticMenber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		
		CurrencyConverter.setRate(rate); // 미국 달러 환율 설정
		
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		scanner.close();
	}
}

// 출력
// 환율(1달러)>> 1455
// 백만원은 $687.2852233676975입니다.
// $100는 145500.0원입니다.
