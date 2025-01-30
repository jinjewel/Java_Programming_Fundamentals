// 패키지의 개념과 필요성

// 응용프로그램을 분담하여 개발할 경우 동일한 이름의 클래스가 존재할 가능성이 있는데 이러면 합칠때 오류발생

// 패키지
// 서로 관련된 클래스와 인터페이스의 컴파일 된 클래스 파일들을 하나의 디렉터리에 묶어놓은 것

// 모듈 
// 여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너
// JDK 9부터 자바 API 의 모든 클래스들을 패키지 기반에서 모듈들로 완전히 재구성
// 응용프로그램 역시 여러 개의 모듈로 분할하여 작성가능
// Java 9부터 전면적으로 도입, 복잡한 개념, 큰 자바 응용프로그램에는 개발, 유지보수 등에 적합
// 모듈의 목적
// 자바 API를 여러 모듈(99개)로 분할하여 응용프로그램의 실행에 적합한 모듈들로만 실행 환경을 구출할 수 있도록 함
// 메모리 등의 자원이 열악한 작은 소형기기에 꼭 필요한 모듈로 구성된 작은 크기의 실행 이미지를 만들기 위함.

// 자바 JDK에서 제공되는 모듈 파일들
// 자바가 설치된 Jmods 디렉터리에 모듈 파일 존재(모듈파일은 압축되어있다. jdk10번의 경우 99개의 모듈이 있다.)
// 모듈 파일에는 자바 API의 패키지와 클래스들이 들어있다.
// jmod명령을 이용하여 모듈 파일에 있는 패키지들을 풀어낼수 있다.

// 예) Scanner 클래스는 java파일안에 util파일안에 존재하므로 경로는 java.util.Scanner 이다.

// 다른 패키지에 작성된 클래스를 사용하기 위해서는 import를 사용하거나 안하거나의 방법으로 나뉜다.
// import를 이용하지 않는 경우 : 클래스를 사용할때 경로를 다 써줘야함.
// 예) java.util.Scanner scanner = new java.util.Scanner(System.in);
// import를 사용하는 경우 큭정 클래스의 이름만 선언하거나 *를 사용하여 전부 선언한다음 클래스를 사용한다.
// 예) import java.util.Scanner or import java.util.*
// 예) Scanner scanner = new Scanner(System.in);

// 패키지 선언
// 소스 파일 첫줄에 'package 패키지이름'을 선언하여 작성되는 클래스를 작성한 패키지에 저장하라는 뜻
// 예) package UI;
// 예) public class Tools { ... } // 이제 이 클래스의 경로명은 UI.Tools 가된다.
// 다른 클래스에서 Tools 클래스를 쓰려면 import UI.Tools; 라고 선언해야 한다.

package app;
// 다른 패키지에 있는 추상 클래스를 불러와 오버라이딩을 하기위해 import 패키지이름.클래스이름 을 추가한다.
import lib.Calculator;

public class GoodCalc extends Calculator{ // 추상 클래스를 상속받아 오버라이딩하여 사용
	public int add(int a, int b) { // 오버라이딩
		return a + b;
	}
	public int subtract(int a, int b) { // 오버라이딩
		return a - b;
	}
	public double average(int[] a) { // 오버라이딩
		double sum = 0; // 초기화 무조건 해줘야함
		for(int i=0; i < a.length ; i++) { 
			sum += a[i];
		}
		return sum / a.length;
	}
	public static void main(String[] args) {
		Calculator c = new GoodCalc() ; // 업캐스팅
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] {2,3,4}));
	}
}
// Run Confiquraions 에서 main class가 GoodCalc인걸 확인한다음 실행한다. 

// 출력
// 5
// -1
// 3.0