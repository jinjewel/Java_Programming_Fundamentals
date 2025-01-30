// 2차원 배열

// 배열 선언의 예 -> intArray와 charArray는 매열에 대한 레퍼런스 변수이다.
// int intArray[][]; 
// char charArray[][];
// int[][] intArray;
// char[][] charArray;

// 배열 생성의 예
// intArray = new int[10][5];
// charArray = new char[20][5];

// 선언과 생성을 동시에 하는 예
// int intArray[] = new int[10][5];
// char charArray[] = new char[20][5];

// 선언과 생성, 초기화를 동시에 하는 예
// int intArray[][] = {{0,1,2},{3,4,5}}

// 2차원 배열의 length 
// intArray.length -> 2
// intArray[0].length -> 3

public class ScoreAverage {
	public static void main(String[] args) {

		double score[][] = {{3.3, 3.4}, // 1학년 1, 2학기 평점
				         {3.5, 3.6}, // 2학년 1, 2학기 평점
				         {3.7, 4.0}, // 3학년 1, 2학기 평점
				         {4.1, 4.2} }; // 4학년 1, 2학기 평점
		double sum=0;
				
		for(int year=0; year<score.length; year++) // 각 학년별로 반복
			for(int term=0; term<score[year].length; term++) // 각 학년의 학기별로 반복
				sum += score[year][term]; // 전체 평점 합
				
		int n=score.length; // 배열의 행 개수, 4
		int m=score[0].length; // 배열의 열 개수, 2
				
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
	}
}

// 출력
// 4년 전체 평점 평균은 3.725