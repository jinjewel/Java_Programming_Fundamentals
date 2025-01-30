package project9011;

import java.util.Scanner;

public class project9011 {

	public static void main(String[] args) {
		
		// 사용자 입력 함수 선언
		Scanner scanner = new Scanner(System.in);
		
		// 변수 선언 및 초기화
		System.out.print("이름과 국어, 영어, 수학의 점수를 차례로 입력해주세요(0~100): ");
		String name = scanner.next();
		int kor = scanner.nextInt(); // 정수로 점수 읽기
		int eng = scanner.nextInt(); // 정수로 점수 읽기
		int mat = scanner.nextInt(); // 정수로 점수 읽기		
		
		int score = kor + eng + mat;
		float avg = (float)score / 3; // 평균을 낼때 소수점도 중요하므로 실수형으로 캐스팅한다.
		char grade;		
		
		// 학점 계산
		switch ((int)avg/10) { // case는 실수형 리터럴을 인식하지 못하므로 정수형으로 바꿔준다.
			case 10: // score = 100
			case 9: // score는 90~99
				grade = 'A';
				break;
			case 8: // score는 80~89
				grade = 'B';
				break;
			case 7: // score는 70~79
				grade = 'C';
				break;
			case 6: // score는 60~69
				grade = 'D';
				break;
			default: // score는 59 이하
				grade = 'F';
		}
		
		// 출력문
		System.out.println("귀하의 성적은 다음과 같습니다.");
		System.out.print("이름: " + name + "\n수학점수: " + kor + "점, ");
		System.out.println("영어점수: " + eng + "점, 수학점수: " + mat + "점");
		System.out.println("총점: " + score + "점, 평균: " + avg + "점, 학점은 "+grade+" 입니다");
			
		// 사용자 입력 함수 종료
		scanner.close();
	}
}

// 출력
// 이름과 국어, 영어, 수학의 점수를 차례로 입력해주세요(0~100): 진석 79 69 97
// 귀하의 성적은 다음과 같습니다.
// 이름: 진석
// 수학점수: 79점, 영어점수: 69점, 수학점수: 97점
// 총점: 245점, 평균: 81.666664점, 학점은 B 입니다