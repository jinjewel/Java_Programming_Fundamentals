// 스레드 만들 때 주의 사항
// run() 메소드가 종료하면 스레드는 종료한다. - 스레드가 계속 살아있게 하려면 run() 메소드 내 무한루프 작성
// 한번 종료한 스레드는 다시 시작시킬 수 없다. - 다시 스레드 객체를 생성하고 start()를 호출해야 함
// 한 스레드에서 다른 스레드를 강제 종료할 수 있다. - 뒤에서 다룸

// Runnable 인터페이스로 스레드 만들기
// 1. 스레드 클래스 작성
// Runnable 인터페이스
// 구현하는 새 클래스 작성
// 2. 스레드 코드 작성
// run() 메소드 구현
// run() 메소드를 스레드 코드라고 부름
// run() 메소드에서 스레드 실행 시작
//	  class TimerRunnable implements Runnable {, 1. 스레드 클레스 작성
//		  ...
//		  @Override
//		  public void run() { // run() 메소드 구현, 2. 스레드 코드 작성
//		  	...
//	  	}
//	  }
// 3. 스레드 객체 생성
//    Thread th = new Thread(new TimerRunnable());
// 4. 스레드 시작
// start() 메소드 호출
//    th.start();

// Runnable 인터페이스를 상속받아 1초 단위로 초 시간을 출력하는 스레드 작성
// ----------------------- 사진

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; }

	@Override
	public void run() {
		int n=0; 
		while(true) { 
			timerLabel.setText(Integer.toString(n)); 
			n++; 
			try {
				Thread.sleep(1000); 
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(250,150);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) { 
		new RunnableTimerEx();
	}
}