import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	
	private JLabel la = new JLabel();
	Container c = getContentPane();
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.addKeyListener(new MyKeyListener());
		
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		// 키 입력을 받을 수 있도록 포커스를 준다.
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			
			int keycode = e.getKeyCode();
			
			la.setText(e.getKeyText(keycode));
			
			// % 키를 판별하기 위해 e.getKeyChar() 호출
			if(e.getKeyChar() == '%') 
				c.setBackground(Color.YELLOW);
			// F1 키를 판별하기 위해 e.getKeyCode() 호출
			// KeyEvent.VK_F1 값과 비교
			else if(e.getKeyCode() == KeyEvent.VK_F1) 
				c.setBackground(Color.GREEN);
		}
	}
	public static void main(String [] args) { 
		new KeyCodeEx();
	}
}