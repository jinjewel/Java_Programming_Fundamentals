// 마우스 이벤트와 마우스 관련 리스너
// 마우스 이벤트(8가지 경우)
// --------------------사진

// 마우스가 눌러진 위치에서 떼어지는 경우 메소드 호출 순서
// mousePressed(), mouseReleased(), mouseClicked()
// 마우스가 드래그될 때 호출되는 메소드 호출 순서
// mousePressed(), mouseDragged(), mouseDragged(),..., mouseDragged(), mouseReleased()

// 마우스 리너스 달기
// MouseListener의 5 개의 이벤트를 처리하는 경우
// mouseEntered(), mouseExited(), mousePressed(), mouseReleased(),mouseClicked()
// 마우스 리스너 등록
// component.addMouseListener(myMouseListener);

// MouseMotionListener의 이벤트도 함께 처리하고자 하는 경우
// mouseDragged(), mouseMoved()
// 마우스 모션 리스너 등록 필요
// component.addMouseMotionListener(myMouseMotionListener);

// MouseEvent 객체로부터 얻을 수 있는 정보
// 1. 마우스 포인터의 위치(int getX(), int getY(),Point getPoint())
// 2. 입력된 마우스 버튼(int getButton())
// 3. 마우스 클릭 횟수(int getClickCount())

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event"); 
	
	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener); 
		
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener, MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+", "+e.getY()+")"); 
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
	}
	public static void main(String [] args) { 
		new MouseListenerAllEx();
	}
}