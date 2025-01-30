// static 제약조건 1
// static 메소드는 non-static 멤버 접근을 할 수 없음.
// 객체가 생성되기 전에도 static는 사용가능하므로 non-static 멤버 접근 불가
// 반대로 non-static 메소드는 static 멤버 사용가능

// static 제약조건 2
// static 메소드는 this 사용불가
// 객체가 생성되기 전에도 static는 사용가능하므로 현재 객체를 가리키는 this 레버런스 사용 불가

public class StaticAndNonAndThis {
	int n;
	static int m;
	
	void f1(int x) { n = x; } // 정상, non-static 메소드는 non-static 필드 사용가능 (n)
	void f2(int x) { m = x; } // 정상, non-static 메소드는 static 필드 사용가능 (n)
	//static void s1(int x) { n = x; } // 컴파일 오류, static 메소드는 non-static 필드 사용불가 (n)
	//static void s2(int x) { f1(3); } // 컴파일 오류, static 메소드는 non-static 메소드 사용불가 (f1)	
	
	void g1(int x) { this.n = x; } // 정상, non-static 메소드에서는 non-static this 레퍼런스 사용 가능
	void g2(int x) { this.m = x; } // 정상, non-static 메소드에서는 static this 레퍼런스 사용 가능 
	//static void s1(int x ) {this.n = x;} // 컴파일 오류. static 메소드는 non-static this 레퍼런스 사용 불가 
	//static void s2(int x ) {this.m = x;} // 컴파일 오류. static 메소드는 static this 레퍼런스 사용 불가 
	
	public static void main(String[] args) {}
}