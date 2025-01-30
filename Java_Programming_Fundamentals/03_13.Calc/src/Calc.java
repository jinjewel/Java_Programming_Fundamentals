// main() 메소드
// main()은 자바 응용프로그래밍의 실행 시작 메소드
// 반드시 public static void main(문자열배열자료형 매개변수이름) 로 선언해야함
// public : 다른 클래스에서 메소드 접근 허용
// static 객체 생성 전부터 호출가능
// void : 리턴값 없음

// 이클립스에서 main()메소드에 인자전달 방법

// Run – Run Configurations – Arguments – Program argument 에 변수 입력
// 변수 입력란에 "2 20.5 88.1"를 대입 후 run

public class Calc {
	public static void main(String[] args) {
		
		double sum = 0.0;
		
		for (int i=0; i<args.length; i++) // 인자 개수만큼 반복
			sum += Double.parseDouble(args[i]); // 문자열을 실수(double 타입)로 변환하여 합산
		
		System.out.println("합계 : " + sum);
	}
}

// 출력
// 합계 : 110.6