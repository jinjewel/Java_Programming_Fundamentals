// 이벤트 리스너
// 이벤트를 처리하는 코드, 클래스로 작성, 실제 처리기
// JDK에서 이벤트 리스너 작성을 위한 인터페이스 제공 : 개발자가 리스너 인터페이스의 추상 메소드를 구현
// 예) ActionListener 인터페이스
// 예) interface ActionListener{ public void actionPerformed(ActionEvent e); }
// 예) actionPerformed를 구현 해야됨
// 예) MouseListener 인터페이스
// 예) interface MouseListener{ public void mousePressed(MouseEvent e); ...;}
// 예) mousePressed, ... 등의 메소드를 구현해야됨

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame {
	
	private JLabel la = new JLabel("Hello"); 
	
	public MouseListenerEx() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			// 마우스 버튼이 눌러진 위치를 알아내어 
			// la("hello" 문자열)를 그 위치로 옮긴다.
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String [] args) { 
		new MouseListenerEx();
	}
} 