// 업캐스팅 : 서브 클래스 객체를 슈퍼 클래스 타입으로 타입 변환
// 업캐스팅 된 래퍼런스(변수)는 객체 내에 슈퍼 클래스의 멤버만 접근 가능 
// 업캐스팅이 되었다면 서브 클래스의 필드와 메소드는 사용할 수 없다.
// 사용 예) 
// super S ; 슈퍼클래스의 변수 선언
// sub s = new sub; 서브클래스의 변수 선언와 레퍼런스 할당
// S = s; 슈퍼클래스변수에 서브클래스변수를 대입, 업캐스팅

// 다운캐스팅 : 슈퍼 클래스 객체를 서브 클래스 타입으로 변환
// 다운캐스팅을 할때 어떤 서브 클래스로 선언할 지 명시적인 타입변환을 호출해야한다.
// 사용 예) 
// super S = new super; 슈퍼클래스의 변수 선언과 레퍼런스 할당
// sub s; 서브클래스의 변수 선언
// s = (sub)S; 서브클래스로 강제 형변환으로 다운 캐스팅 

// instanceof 연산자 : 레퍼런스가 가리키는 객체의 타입식별을 위해 사용
// 반환값으로 True / False
// 사용 예)
// 변수 instanceof 클래스 ; 변수이 클래스타입(슈퍼클래스도 가능)이면 True, 아니면 False

class Person { }
class Student extends Person { }
class Researcher extends Person { }
class Professor extends Researcher { }

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t"); 
		print(new Student()); // st는 p타입 st타입이고, st는 re타입이 pr타입이 아님. 
		System.out.print("new Researcher() ->\t"); 
		print(new Researcher()); // re는 p타입 re타입이고, re는 st타입이 pr타입이 아님. 
		System.out.print("new Professor() ->\t"); 
		print(new Professor()); // pr는 p타입 re타입 pr타입 이고, pr는 st타입이 아님. 
	}
}

// 출력
// new Student() ->	Person Student 
// new Researcher() ->	Person Researcher 
// new Professor() ->	Person Researcher Professor 