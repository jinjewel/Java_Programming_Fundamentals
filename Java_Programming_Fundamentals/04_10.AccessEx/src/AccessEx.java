// 접근지정자 이해
// 패키지 : 관련있는 클래스 파일(.class)을 저장하는 디렉터리, 자바 응용프로그램은 하나 이상의 패키지로 구성
// 접근 지정자 : 멤버를 보호하는 캡슐화의 정체에 묶인 보호를 일부 해제할 목적으로 생성
// 접근 지정자의 종류 : public, protected, 디폴트, private 
// public : 모든 패키지의 모든 클래스의 접근을 허용한다.
// protected : 같은 패키지 또는 다른 패키지여도 자식 클래스에도 접근 허용.
// 디폴트(생략, package-private라고도 불림) : 같은 패키지의 클래스에만 허용.
// private : 같은 클래스 내에서만 가능(같은 패키지내 클래스 이동 불가) 외부로부터 완벽차단 

class Sample {
	public int a;
	private int b;
	int c;
	
	public void Sample_print() {
		System.out.println("a :" + a +", b :"+b+", c :"+c);
	}
}

public class AccessEx {
	public static void main(String[] args) {
		
		Sample aClass = new Sample();
		
		// Sample 클래스의 a와 c는 각각 public, default 지정자로 선언이 되었으므로, 
		// 같은 패키지에 속한 AccessEx 클래스에서접근 가능
		// b는 private으로 선언이 되었으므로 AccessEx 클래스에서 접근 불가능
		aClass.a = 10;
		// aClass.b = 10; // 접근 불가
		aClass.c = 10;
		
		aClass.Sample_print();
	}
}

// 출력 -> ,가 아닌 +로 문자열을 이어줘야함
// a :10, b :0, c :10