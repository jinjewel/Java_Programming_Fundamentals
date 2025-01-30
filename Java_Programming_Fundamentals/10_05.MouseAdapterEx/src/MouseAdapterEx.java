// 어댑터 클래스
// 이벤트 리스너 구현에 따른 부담 해소를 위해
// 리스너 작성시 추상 메소드들을 모두 구현해야 하는 부담 해소 위해

// 어댑트 클래스
// 리스너의 모든 메소드가 단순 리턴하도록 구현해 놓은 클래스
// 예) class MouseAdapter implements MouseListener, MouseMotionListener{
// 예) 	public void mousePressed(MouseEvent e){}
// 예) 	public void mouseReleased(MouseEvent e){}
// 예) 	public void mouseClicked(MouseEvent e){}
// 예) 	public void mouseEntered(MouseEvent e){}
// 예) 	public void mouseExited(MouseEvent e){}
// 예) 	public void mouseDragged(MouseEvent e){}
// 예) }
// 추상 메소드가 하나뿐인 리스너는 어댑터 클래스 없음(ActionAdapter, ItemAdapter 클래스)

// JDK에서 제공하는 어댑터 클래스


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {
	
	private JLabel la = new JLabel("Hello"); 
	
	public MouseAdapterEx() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseAdapter()); 
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	
	public static void main(String [] args) { 
		new MouseAdapterEx();
	}
} 