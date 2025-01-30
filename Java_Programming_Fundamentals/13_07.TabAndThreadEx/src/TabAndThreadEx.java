// producer-consumer 문제와 동기화

// producer-consumer 문제
// producer : 공유 메모리에 데이터를 공급하는 스레드
// consumer : 공유 메모리의 데이터를 소비하는 스레드
// 문제의 본질 - producer와 consumer 가 동시에 공유 데이터를 접근하는 문제

// producer-consumer 문제 사례
// 미디어 플레이어 - producer:입력스레드, consumer:재생스레드, 공유데이터:비디오버퍼
// ---------------------- 사진 41

// wait(), notify(), notifyAll()를 이용한 동기화

// 동기화 객체 : 두 개 이상의 스레드 동기화에 사용되는 객체

// 동기화 메소드
// wait()
//    다른 스레드가 notify()를 불러줄 때까지 기다린다.

// notify()
//    wait()를 호출하여 대기중인 스레드를 깨우고 RUNNABLE 상태로 만든다.
//    2개 이상의 스레드가 대기중이라도 오직 한 스레드만 깨운다.

// notifyAll()
//    wait()를 호출하여 대기중인 모든 스레드를 깨우고 모두 RUNNABLE 상태로 만든다.

// synchronized 블록 내에서만 사용되어야 함

// wait(), notify(), notifyAll()은 Object의 메소드
//    모든 객체가 동기화 객체가 될 수 있다.
//    Thread 객체도 동기화 객체로 사용될 수 있다.

// ---------------------------사진

// wait(), notify()를 이용한 바 채우기
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class MyLabel extends JLabel {
	int barSize = 0; // 바의 크기
	int maxBarSize; 
	
	MyLabel(int maxBarSize) { 
		this.maxBarSize = maxBarSize; 
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.MAGENTA); 
		
		int width = (int)(((double)(this.getWidth())) /maxBarSize*barSize); 
		if(width==0) 
			return; 

		g.fillRect(0, 0, width, this.getHeight()); 
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) { 
			try {
				wait(); 
			} 
			catch (InterruptedException e) { 
				return; 
			}
		}
		barSize++; 
		repaint(); // 바 다시 그리기
		notify(); 
	}

	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait(); 
			} 
			catch (InterruptedException e){ 
				return; 
			}
		}
		barSize--; 
		repaint(); // 바 다시 그리기
		notify(); 
	}
}

class ConsumerThread extends Thread { 
	MyLabel bar; 
	
	ConsumerThread(MyLabel bar) { 
		this.bar = bar; 
	}
	
	public void run() {
		while(true) {
			try {
				sleep(200); 
				bar.consume(); 
			} 
			catch (InterruptedException e){ 
				return;
			}
		}
	}
}

public class TabAndThreadEx extends JFrame { 
	MyLabel bar = new MyLabel(100); 
	
	TabAndThreadEx(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane(); 
		c.setLayout(null);
		
		bar.setBackground(Color.ORANGE); 
		bar.setOpaque(true); 
		bar.setLocation(20, 50); 
		bar.setSize(300, 20); 
		c.add(bar);

		c.addKeyListener(new KeyAdapter() { 
			public void keyPressed(KeyEvent e) { 
				bar.fill(); 
			}
		}); 
		
		setSize(350,200); 
		setVisible(true); 
		
		c.requestFocus(); 
		
		ConsumerThread th = new ConsumerThread(bar); 
		th.start(); // 스레드 시작
	}
	
	public static void main(String[] args) { 
		new TabAndThreadEx( "아무키나 빨리 눌러 바 채우기"); 
	}
}