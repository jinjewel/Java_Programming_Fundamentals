// 멀티태스킹
// 하나의 응용프로그램이 여러 개의 작업(태스크)을 동시에 처리

// 멀티태스킹 응용프로그램 사례
// 미디어 플레이어의 멀티테스킹 - 3개의 태스크 동시 실행
// 테트리스 게임의 멀티테스킹 -  3개의 태스크 동시 실행

// 스레드(thread) 개념과 실(thread)
// 마치 바늘이 하나의 실(thread)을 가지고 바느질하는 것과 자바의 스레드는 일맥 상통함

// ------------------사진

// 스레드와 멀티스레딩
// 스레드
// 사용자가 작성한 코드로서, JVM에 의해 스케줄링되어 실행되는 단위

// 자바의 멀티태스킹
// 멀티스레딩만 가능, 스레드는 JVM의 의한 실행 단위, 스케쥴링 단위
// 하나의 응용프로그램은 여러 개의 스레드로 구성 가능

// 멀티스레딩의 효과
// 한 스레드가 대기하는 동안 다른 스레드 실행
// 프로그램 전체적으로 시간 지연을 줄임

// 웹 서버의 멀티스레딩 사례
// ------------------ 사진

// 자바 스레드(Thread)란?
// 자바 스레드
// 자바 가상 기계(JVM)에 의해 스케쥴되는 실행 단위의 코드 블럭
// 스레드의 생명 주기는 JVM에 의해 관리됨
// JVM은 스레드 단위로 스케쥴링

// JVM과 멀티스레드의 관계
// 하나의 JVM은 하나의 자바 응용프로그램만 실행
// 예) 자바 응용프로그램이 시작될 때 JVM이 함께 실행됨, 자바 응용프로그램이 종료하면 JVM도 함께 종료함
// 하나의 응용프로그램은 하나 이상의 스레드로 구성 가능

// JVM과 자바 응용프로그램, 스레드의 관계
// ------------------- 사진

// 자바 스레드와 JVM
// ------------------- 사진

// 자바에서 스레드 만들기
// 스레드 실행을 위해 개발자가 하는 작업
// 스레드 코드 작성
// 스레드를 생성하고 스레드 코드를 실행하도록 JVM에게 요청

// 스레드 만드는 2 가지 방법
// 1. java.lang.Thread 클래스를 이용하는 경우
// 2. java.lang.Runnable 인터페이스를 이용하는 경우

// 1. Thread 클래스를 이용한 스레드 생성
// 스레드 클래스 작성, Thread 클래스 상속. 새 클래스 작성
// 스레드 코드 작성
// run() 메소드 오버라이딩
// run() 메소드를 스레드 코드라고 부름
// run() 메소드에서 스레드 실행 시작
//    class TimerThread extends Thread { -> 클래스 작성
//      ...
//      @Override
//      public void run() { // run() 오버라이딩 >- 메소드 오버라이딩
//         ...
//      }
//   }
// 스레드 객체 생성
//    TimerThread th = new TimerThread(); -> 객체 생성
// 스레드 시작
// start() 메소드 호출
// 스레드로 작동 시작, JVM에 의해 스케쥴되기 시작함
//   th.start();

// Thread를 상속받아 1초 단위로 초 시간을 출력하는 TimerThread 스레드 작성
// -----------------------------------  사진

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	private JLabel timerLabel; 
	
	public TimerThread(JLabel timerLabel) { 
		this.timerLabel = timerLabel; 
	}

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
			}		}
	}
}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) { 
		new ThreadTimerEx();
	}
}