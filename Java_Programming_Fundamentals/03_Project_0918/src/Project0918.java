import java.util.Scanner;

public class Project0918 {
	public static void main(String[] args) {
		
		String Name[] = new String[3]; // 영문 5자
		int Kor[] = new int[3];
		int Eng[] = new int[3];
		int Mat[] = new int[3];
		int Tot[] = new int[3];
		double Avg[] = new double[3];
		double min=100 , max=0;
		
		System.out.println("3명의 학생의 이름, 국어, 영어, 수학을 입력받아 성적 처리해 아래와 같이 출력을 하시오.");
		System.out.println("성적의 최솟값은 0, 최댓값은 100입니다.");
		for(int i=0 ; i<3 ; i++) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("학생" + (i+1) + "의 이름, 국어, 영어, 수학성적을 입력하세요.");
			
			Name[i] = scanner.next();
			Kor[i] = scanner.nextInt(); // 점수 읽기
			Eng[i] = scanner.nextInt(); // 점수 읽기
			Mat[i] = scanner.nextInt(); // 점수 읽기
			Tot[i] = Kor[i] + Eng[i] + Mat[i];
			Avg[i] = Tot[i] / 3;	
			
			if( min > Avg[i])
				min = Avg[i] ;
			else if(max < Avg[i])
				max = Avg[i] ;
		}
		System.out.println("이름 국어점수 영어점수 수학점수 총점 평균");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print(Name[i] + " " + Kor[i] + "   " + Eng[i] + "   " + Mat[i]);
			System.out.println("   " + Tot[i] + "  " + Avg[i]);
		}
		System.out.println("AVG MAX :" + max);
		System.out.println("AVG MIN :" + min);
	}
}

// 출력
// 학생2의 이름, 국어, 영어, 수학성적을 입력하세요.
// two 70 81 98
// 학생3의 이름, 국어, 영어, 수학성적을 입력하세요.
// three 10 9 100
// 이름 국어점수 영어점수 수학점수 총점 평균
// one 99   87   51   237  79.0
// two 70   81   98   249  83.0
// three 10   9   100   119  39.0
// AVG MAX :83.0
// AVG MIN :39.0
