// 스레드 동기화(Thread Synchronization)

// 멀티스레드 프로그램 작성시 주의점
// 다수의 스레드가 공유 데이터에 동시에 접근하는 경우 - 공유 데이터의 값에 예상치 못한 결과 발생 가능

// 스레드 동기화
// 멀티스레드의 공유 데이터의 동시 접근 문제 해결책
// 공유 데이터를 접근하는 모든 스레드의 한 줄 세우기
// 한 스레드가 공유 데이터에 대한 작업을 끝낼 때까지 다른 스레드가 대기 하도록 함

// 두 스레드의 프린터 동시 쓰기로 충돌하는 사례
// ------------------ 사진 34 35

// 스레드 동기화 기법

// 스레드 동기화
// 공유 데이터에 동시에 접근하는 다수의 스레드가 공유 데이터를 배타적으로 접근하기 위해 상호 협력(coordination)하는 것
// 동기화의 핵심 - 스레드의 공유 데이터에 대한 배타적 독점 접근 보장

// 자바에서 스레드 동기화를 위한 방법
// synchronized로 동기화 블록 지정
// wait()-notify() 메소드로 스레드 실행 순서 제어

// synchronized 블록 지정
// synchronized 키워드
// 한 스레드가 독점 실행해야 하는 부분(동기화 코드)을 표시하는 키워드 - 임계 영역(critical section) 표기 키워드
// 메소드 전체 혹은 코드 블록

// synchronized 블록에 대한 컴파일러의 처리
// 먼저 실행한 스레드가 모니터 소유 - 모니터란 해당 객체를 독점적으로 사용할 수 있는 권한
// 모니터를 소유한 스레드가 모니터를 내놓을 때까지 다른 스레드 대기
// ------------------- 사진

// 아래 코드 설명
// SharedBoard의 add()를 스레드1이 실행하고 있는 동안, 스레드2가 호출하면 스레드2는 대기
// ------------ 사진


// 공유 집계판 사례를 코딩
public class SynchronizedEx { 
	public static void main(String [] args) { 
		SharedBoard board = new SharedBoard(); 
		
		Thread th1 = new StudentThread("kitae", board); 
		Thread th2 = new StudentThread("hyosoo", board); 
		
		th1.start(); 
		th2.start(); 
	}
}

class SharedBoard { 
	private int sum = 0; // 집계판의 합
	
	synchronized public void add() {
		int n = sum; 
		Thread.yield(); // 현재 실행 중인 스레드 양보
		n += 10; // 10 증가
		sum = n; // 증가한 값을 집계합에 기록
		System.out.println(Thread.currentThread().getName() + " : " + sum); 
	}
	
	public int getSum() { 
		return sum; 
	}
}

class StudentThread extends Thread { 
	private SharedBoard board; // 집계판의 주소
	
	public StudentThread(String name, SharedBoard board) {
		super(name); 
		this.board = board; 
	}
	@Override 
	public void run() {
		for(int i=0; i<10; i++) 
			board.add();
	}
}

// 출력
// kitae : 10
// kitae : 20
// kitae : 30
// kitae : 40
// kitae : 50
// kitae : 60
// kitae : 70
// kitae : 80
// kitae : 90
// kitae : 100
// hyosoo : 110
// hyosoo : 120
// hyosoo : 130
// hyosoo : 140
// hyosoo : 150
// hyosoo : 160
// hyosoo : 170
// hyosoo : 180
// hyosoo : 190
// hyosoo : 200
