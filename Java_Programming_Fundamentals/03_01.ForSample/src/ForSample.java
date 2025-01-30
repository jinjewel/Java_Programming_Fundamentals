// for문의 구성

// for문의 특이한 형태
// for(초기작업; ; 반복후작업) // 반복조건이 비어 있으면 true로 간주, 무한 반복
// for(i=0; i<10; i++, System.out.println(i)) // 초기 작업과 반복후작업은 ‘,’로 분리하여 여러 문장 나열 가능

public class ForSample {
	public static void main(String[] args) {
		
		// 일정 값까지의 합
		int sum=0; 
		for(int i=1; i<=10; i++) { // 1~10까지 반복
			
			// 누적 합
			sum += i;
			
			// 출력문
			System.out.print(i); // 더하는 수 출력
			if(i<=9) // 1~9까지는 '+' 출력
				System.out.print("+");
			else { // i가 10인 경우
				System.out.print(" = "); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
		}
	}
}

// 출력 
// 1+2+3+4+5+6+7+8+9+10 = 55
