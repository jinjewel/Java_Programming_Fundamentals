// 공유집계판 사례에서 synchronized 사용하지 않아 충돌로 인해 데이터에 오류가 발생한 경우
public class SynchronizedEx_Error { 
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

// 결과 : 컴퓨터가 좋아, 스레드의 역량이 남아있어 정상적인 결과를 보임, 여러개 창을 띄우고 하면 오류가 남
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




