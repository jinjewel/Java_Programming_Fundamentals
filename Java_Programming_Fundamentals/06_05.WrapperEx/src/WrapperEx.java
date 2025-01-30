// Wrapper 클래스
// 자바의 기본 타입을 클래스화한 8개 클래스
// 기본타입-Wrapper클래스 짝을 지었을때
// byte-Byte , short-Short , int-Integer , long - Long
// float-Float , double-Double , char-Character , boolean-Boolean

// 이름이 Wrapper인 클래스는 존재하지 않음
// Wrapper클래스로 표현하는 이유 : 기본 타입의 값을 객테로 다룰 수 있게 함

// Wrapper 객체들은 거의 유사, 많은 메소드가 static 타입

// 기본타입의 값으로 Wrapper 객체 생성(자바 9부터 new객체를 이용한 Wrapper 생성 폐기)
// Integer ii = Integer.valueOf(10);
// Character cc = Character.valueOf('c');
// Float ff = Float.valueOf((double)3.14); // Float 객체는 double 타입의 값으로 생성 가능
// Double dd = Double.valueOf(3.14);
// Boolean bb = Boolean.valueOf(false);

// Wrapper 객체로부터 기본 타입 값 알아내기
// int i = ii.intValueOf();
// char c = cc.charValue();
// double d = dd.doubleValue();
// boolean b = bb.booleanValue(); 

// 기본타입을 문자열로 변환
// String s1 = Integer.toString(123);
// String s2 = Integer.toHexString(123); // 정수 123을 16진수의 문자열 "7b"로 변환
// String s3 = Double.toString(3.14);
// String s4 = Character.toString('a');
// String s5 = Booiean.toString(true);

// 문자열을 기본타입으로 변환
// int i = Integer.parseInt(s1);
// double d = Double.parseDouble(s3);
// boolean b = Boolean.parseBoolean(s5)

// 문자열로 Wrapper 객체 생성
// Integer ii = Integer.valueOf("10");
// Double dd = Double.valueOf("3.14");
// Boolean bb = Boolean.valueOf("false");

public class WrapperEx {
	public static void main(String[] args) {
		
		System.out.println(Character.toLowerCase('A')); // 'A'를 소문자로 변환
		char c1='4', c2='F';
		
		if(Character.isDigit(c1)) // 문자 c1이 숫자이면 true
			System.out.println(c1 + "는 숫자");
		
		if(Character.isAlphabetic(c2)) // 문자 c2가 영문자이면 true
			System.out.println(c2 + "는 영문자\n");
		
		System.out.println(Integer.parseInt("-123")); // "-123"을 10진수로 변환
		System.out.println(Integer.toHexString(28)); // 정수 28을 16진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28)); // 28을 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28)+"\n"); // 28에 대한 2진수의 1의 개수
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환	
		System.out.println(Double.parseDouble("3.14")+"\n"); // 문자열을 실수 3.14로 변환
		
		boolean b = (4>3); // b는 true
		System.out.println(Boolean.toString(b)); // true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false")); // 문자열을 false로 변환
	}
}

// 출력
// a
// 4는 숫자
// F는 영문자
//
// -123
// 1c
// 11100
// 3
//
// 3.14
// 3.14
//
// true
// false



