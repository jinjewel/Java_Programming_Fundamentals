// 증감연산자
// ++. --
// a++ : 증가 전의 값 변환하고 a를 1증가
// a-- : 감소 전의 값 변환하고 a를 1감소
// ++a : a를 1증가하고 증가된 값 변환 
// --a : a를 1감소하고 감소한 값 반환

public class AssignmentlncDecOperator {
	public static void main(String[] args) {

		// 변수 선언
		int a=3, b=3, c=3;
		
		// 대입 연산자 사례
		a += 3; // a=a+3 = 6
		b *= 3; // b=b*3 = 9
		c %= 2; // c=c%2 = 1
		
		// 출력
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		int d=3;
		
		// 증감 연산자 사례
		a = d++; // a=3, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; // d=5, a=5
		System.out.println("a=" + a + ", d=" + d);
		a = d--; // a=5, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = --d; // d=3, a=3
		System.out.println("a=" + a + ", d=" + d);
	}
}

// 출력
// a=6, b=9, c=1
// a=3, d=4
// a=5, d=5
//  a=5, d=4
// a=3, d=3
