// 스레드 정보
// ---------------- 사진 21

// 스레드 상태
// 스레드 상태 6 가지
// NEW
//    스레드가 생성되었지만 스레드가 아직 실행할 준비가 되지 않았음
// RUNNABLE
//   스레드가 현재 실행되고 있거나
//   실행 준비되어 스케쥴링을 기다리는 상태
// WAITING
//   wait()를 호출한 상태 - 다른 스레드가 notify()나 notifyAll()을 불러주기를 기다리고 있는 상태
//   스레드 동기화를 위해 사용
// TIMED_WAITING
//   sleep(n)을 호출하여 n 밀리초 동안 잠을 자고 있는 상태
// BLOCK
//   스레드가 I/O 작업을 요청하면 JVM이 자동으로 BLOCK 상태로 만듦
// TERMINATED
//   스레드가 종료한 상태

// 스레드 상태는 JVM에 의해 기록 관리됨

// 스레드 상태와 생명 주기
// ------------------- 사진 23
// 주의 : ** wait(), notify(), notifyAll()은 Thread의 메소드가 아니며 Object의 메소드임 

// 스레드 우선순위와 스케쥴링

// 스레드의 우선순위
//    최대값 = 10(MAX_PRIORITY)
//    최소값 = 1(MIN_PRIORITY)
//    보통값 = 5(NORMAL_PRIORITY)

// 스레드 우선순위는 응용프로그램에서 변경 가능
//    void setPriority(int priority)
//    int getPriority()

// main() 스레드의 우선순위 값은 초기에 5
// 스레드는 부모 스레드와 동일한 우선순위 값을 가지고 탄생
// JVM의 스케쥴링 정책 : 철저한 우선순위 기반
//    가장 높은 우선순위의 스레드가 우선적으로 스케쥴링
//    동일한 우선순위의 스레드는 돌아가면서 스케쥴링(라운드 로빈 )

// main()을 실행하는 main 스레드
// main 스레드와 main() 메소드
// JVM은 응용프로그램을 실행을 시작할 때 스레드 생성 : main 스레드
// JVM은 main 스레드에게 main() 메소드 실행하도록 함 : main() 메소드가 종료하면 main 스레드 종료

public class ThreadMainEx {
	public static void main(String [] args) {
		
		String name = Thread.currentThread().getName(); // 스레드 이름 얻기
		long id = Thread.currentThread().getId(); // 스레드 ID 얻기
		int priority = Thread.currentThread().getPriority(); // 스레드 우선순위 값 얻기
		Thread.State s = Thread.currentThread().getState(); // 스레드 상태 값 얻기
		
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태 = " + s);
	}
}

// 출력
// 현재 스레드 이름 = main
// 현재 스레드 ID = 1
// 현재 스레드 우선순위 값 = 5
// 현재 스레드 상태 = RUNNABLE

