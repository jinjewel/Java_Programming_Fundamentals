// 비정방형 배열
// 각 행의 열의 개수가 다른 배열

// 정방행렬
// 각 행의 열의 개수가 같은 배열

public class IrregularArray {
	public static void main(String[] args) {
	
		// 배열 선언
		int intArray[][] = new int[4][]; // 2차원 배열의 행을 4줄로 선언
		intArray[0] = new int[3]; // 0번째 행의 열을 3줄 선언
		intArray[1] = new int[2]; // 1번째 행의 열을 2줄 선언
		intArray[2] = new int[3]; // 2번째 행의 열을 3줄 선언
		intArray[3] = new int[2]; // 3번째 행의 열을 2줄 선언
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10 + j;
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}

// 출력
// 10 11 12 
// 20 21 
// 30 31 32 
// 40 41 