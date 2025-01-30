// for-each 문
// 배열이나 나열의 각 원소를 순차적으로 접근하는데 유용한 for문

package foreachEx;

public class foreachEx {
	public static void main(String[] args) {
		
		// 아래 for-each에서 k는 n[0], n[1], ..., n[4]로 반복
		int [] n = { 1,2,3,4,5 };
		int sum = 0;
		for (int k : n) {
			System.out.print(k + " "); // 반복되는 k 값 출력
			sum += k;
		}
		System.out.println("합은 " + sum + "입니다.");
		
		
		// 아래 for-each에서 s는 names[0], names[1], ..., names[5]로 반복
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" } ;
		for (String s : names) 
			System.out.print(s + " ");

		System.out.println();
	
		
		// 아래 for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복
		// enum 때문에 보이는 값은 월, 화, 수... 이지만 실제로 컴퓨터가 인식하는 값은 0,1,2 ... 이다.
		enum Week { 월, 화, 수, 목, 금, 토, 일 }
		for (Week day : Week.values()) 
			System.out.print(day + "요일 ");
		
		System.out.println();
	}
}

// 출력
// 1 2 3 4 5 합은 15입니다.
// 사과 배 바나나 체리 딸기 포도 
// 월요일 화요일 수요일 목요일 금요일 토요일 일요일  
