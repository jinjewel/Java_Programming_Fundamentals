// 디폴트 패키지
// package 선언문이 없이 만들어진 클래스의 패키지로 현재 디렉터리를 뜻한다.

// 패키지의 특징
// 패키지는 계층구조이다 : 관련된 클래스 파일들 하나의 패키지로 계층화하여 관리용이
// 패키지별 접근 제한 : 패키지 별로 접근 권한 가능
// 동일한 이름의 클래스와 인터페이스의 사용가능 : 서로다른 패키지에 같은 이름의 파일이 존재가능
// 높은 소프트웨어 재사용성

// 모듈
// Java 9에서 도입된 개념
// 패키지와 이미지 등의 리소스를 담은 컨테이너
// 모듈 파일(.jmod)로 저장

// 자바 플랫폼
// 자바의 개발 환경(JDK)과 자바의 실행환경(JRE)을 지칭, Java SE(자바 API) 포함
// 자바 API의 모든 클래스는 여러개의 모듈로 재구성되어 JDK의 jmods 디렉터리에 저장되어 배포
// 모듈 파일로부터 모듈을 부는 명령
// 예) jmod extract "C:\Program Files\java\jdk-10\jmods\java.base.jmod"
// 예) - 현재 디렉터리에 java.base 모듈이 풀림

// 자바 실행 환경
// JRE : 디폴트 자바 실행 환경 
// 자바 모듈, 자바 가상 기계 등으로 구성, 원래는 실행되는 컴퓨터에 저장하고 사용하다가(용양이 매우 큼)
// 자바9 이우 모듈의 비공개 파일에 저장하여 응용프로그램 실행시 모듈 파일에서 로딩을 하도록 바뀌었음

// Custom JRE : 맞줌형 실행 환경 -> 오라클이 추구하는 방향이다.
// 자바 8까지 소형기기에는 용량이 부족해 사용하지 못하다가 자바9이후 모듈의 탄생으로 필요한 모듈만 가지고
// 메모리가 열악한 소형 기기에서도 Custom JRE구축이 가능해졌다.

// 자바 모듈화의 목적
// 자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위하여 사용하고
// 불필요한 모듈의 로딩 및 저장을 안하도록 하여 시스템의 부담이 감소시켜 소형기기에도 사용 가능하게 한다.

// 주요패키지
// java.lang(자바 언어 패키지)-스트링, 함수, 입출력 등 기본적인 클래스와 인터페이스(import문 없이 사용가능)
// java.util(자바 유틸리티 패키지)-날짜, 시간 등 다양한 유틸 클래스와 인터페이스
// java.id(자바 입출력 패키지)-키보드, 모니터 등으로 입출력할 수 잇게 하는 클래스와 인터페이스
// java.awt(자바 GUI 패키지)-GUI 프로그래밍을 위한 클래스와 인터페이스
// javax.swing(자바 GUI 패키지)-GUI 프로그래밍을 위한 스윙 패키지(java.awt 경량화)

// Objact 클래스
// java.lang 패키지에 포함 - import 선언 필요 없음
// 모든 클래스의 수퍼 클래스
// 모든 클래스에 강제 상속이고 모든 객체가 공통으로 가지는 객체의 속성을 나타내는 메소드 보유
// 못보던 메소드들이 포함

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;	
	}
}
public class ObjectPropertyEx {
	public static void print(Object obj) {
		// 현 객체의 런타임 클래스의 이름을 리턴(.getName이 없으면 Class Point반환)
		System.out.println(obj.getClass().getName()); // 클래스 이름
		// 현 객체에 대한 해시 코드 값 리턴
		System.out.println(obj.hashCode()); // 해시 코드 값, 16진로 반환
		// 현 객체에 대한 문자열 표현을 리턴
		System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
		System.out.println(obj); // 객체 출력
	}
	public static void main(String [] args) {
		Point p = new Point(2,3);
		print(p);
	}
}

// 츨력
// Point
// 1665404403
// Point@63440df3
// Point@63440df3