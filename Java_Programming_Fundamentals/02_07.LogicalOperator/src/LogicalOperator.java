// 비교 연산
// 두 피연산자를 비교하여 true, false의 논리 값을 내는 연산
// < > = 를 사용

// 논리 연산
// 논리 값으로 NOT, OR, AND, XOR 논리 연산, 논리 값을 내는 연산
// ! || && ^(서로 다를때 참) 를 사용

public class LogicalOperator {
	public static void main(String[] args) {
		
		// 비교 연산
		System.out.print("'a' > 'b' : ");
		System.out.println('a' > 'b');
		
		System.out.print("3 >= 2 : ");
		System.out.println(3 >= 2);
		
		System.out.print("-1 < 0 : ");
		System.out.println(-1 < 0);
		
		System.out.print("3.45 <= 2 : ");
		System.out.println(3.45 <= 2);		
		
		System.out.print("3 == 2 : ");
		System.out.println(3 == 2);
		
		System.out.print("3 != 2 : ");
		System.out.println(3 != 2);		
		
		System.out.print("!(3 != 2) : ");
		System.out.println(!(3 != 2));		
		
		// 비교 연산과 논리 연산 복합
		System.out.print("(3 > 2) && (3 > 4) : ");
		System.out.println((3 > 2) && (3 > 4));
		
		System.out.print("(3 != 2) || (-1 > 0) : ");
		System.out.println((3 != 2) || (-1 > 0));		
		
		System.out.print("(3 != 2) ^ (-1 > 0) : ");
		System.out.println((3 != 2) ^ (-1 > 0));		

	}
}

// 출력
// 'a' > 'b' : false
// 3 >= 2 : true
// -1 < 0 : true
// 3.45 <= 2 : false
// 3 == 2 : false
// 3 != 2 : true
// !(3 != 2) : false
// (3 > 2) && (3 > 4) : false
// (3 != 2) || (-1 > 0) : true
// (3 != 2) ^ (-1 > 0) : true


