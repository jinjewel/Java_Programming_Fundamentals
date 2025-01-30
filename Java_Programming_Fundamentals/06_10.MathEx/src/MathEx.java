// Math 클래스
// 산술연산 메소드 제공
// java.lang 패키지에 Math 클래스
// 모든 매소드는 static 타입이므로 클래스 이름으로 바로 호출해야한다.

// 난수 발생
// Math.random() 메소드를 사용하여 0이상 1미만의 난수를 발생시킨다. 
// 0 부터 100까지 난수 생성-> (int)(Math.random()*101)
// 1 부터 100까지 난수 생성-> (int)(Math.random()*100 + 1)

// java.util.Random 클래스를 이요하여 다양한 형태로 난수 발생 가능

public class MathEx {
	public static void main(String[] args) {
		
		System.out.println(Math.PI); // 원주율 상수 출력
		System.out.println(Math.ceil(Math.PI)); // ceil(올림)
		System.out.println(Math.floor(Math.PI)); // floor(내림)
		System.out.println(Math.sqrt(9)); // 제곱근
		System.out.println(Math.exp(2)); // e의 2승
		System.out.println(Math.round(3.14)); // 반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.print("이번주 행운의 번호는 ");
		for(int i=0; i<5; i++)
			System.out.print((int)(Math.random()*45 + 1) + " ");
	}
}

// 쿨력
// 3.141592653589793
// 4.0
// 3.0
// 3.0
// 7.38905609893065
// 3
// 이번주 행운의 번호는 28 35 29 30 7 