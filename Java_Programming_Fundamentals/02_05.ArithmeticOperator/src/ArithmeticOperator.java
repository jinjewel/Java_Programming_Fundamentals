// 연산자 우선순위
// 높은
// ++ --
// +(부호) -(부로) ++ --
// 형변환
// * / %
// +(덧셈) -(뺄셈) 
// << >> >>>
// <> <= >= instanceof
// == !=
// & (비트 AND)
// ^ (비트 XOR)
// | (비트 OR)
// && (논리 AND)
// || (논리 OR)
// ? : (조건)
// = += -= *= /= %= &= ^= |= <<= >>= >>>=
// 낮음

// % : 나머지
// / : 몫

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		// 사용자 입력값 저장
		Scanner scanner = new Scanner(System.in);
		System.out.print("경과시간을 초단위로 입력하세요: ");
		
		// 변수 초기화
		int time = scanner.nextInt(); // 정수 입력
		int second = time % 60; // 60으로 나눈 나머지는 초
		int minute = (time / 60) % 60; // 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		
		// 출력
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		
		// 사용자 입력 종료
		scanner.close();
	}
}

// 결과
// 경과시간을 초단위로 입력하세요: 33567
// 33567초는 9시간, 19분, 27초입니다.