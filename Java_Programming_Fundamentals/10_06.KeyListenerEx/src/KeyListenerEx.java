// key 이벤트와 포커스
// 키 입력 시 다음 세 경우에 key이벤트 발생
//  1. 키를 누르는 순간
//  2. 누른 키를 떼는 순간
//  3. 누른 키를 떼는 순간(유니코드 키의 경우에만)
// 키 이벤트를 받을 수 있는 조건 : 모든 컴포넌트 가능하지만, 현재 포커스를 가진 컴포넌트
// 포커스
// 컴포넌트나 응용프로그램이 키 이벤트를 독접하는 권한
// 컴포넌트에 포커스 설정 방법 : 다음 2라인의 코드 필요
// -- component.setFouseable(true); // component가 포커스를 받을 수 있도록 설정
// -- component.requestFouse(); // component에 포커스 강제 지정

// 컴포넌트에 포커스 주기
// 스윙 프레임이 만들어질 포커스를 주고자 하는 경우
// -- JFrame의 setVisible(true) 이후에 포커스를 주어야 함
// 예) setVisible(true);
// 예) component.setFocusable(true);
// 예) component.requestFocus();
// 마우스로 컴포넌츠를 클릭할 때 포커스 지정하는 방법
// 언제든지 필요할 때 포커스 줄 수 있음
// 예) component.addMouseListener(new MouseAdapter() { 
// 예) 	public void mouseClicked(MouseEvent e) {
// 예) 		Component c = (Component)e.getSource();
// 예) 		component.setFocusable(true);
// 예) 		component.requestFocus();
// 예) 	}
// 예) });

// keyListener의 메소드와 키
// keyListener의 3개 메소드(실행되는 순서 : 1, 3, 2)
// 1. void keyPressed(keyEvent e){}
// 2. void keyReleased(keyEvent e){}
// 3. void keyTyped(keyEvent e){}
// 컴포넌트에 키 이벤트 리스너 등록
// component.addKeyListener(myKeyListener);

// 가상키 : 가상키 코드는 KeyEvent 클래스에 상수로 선언
// --------------- 그림

// 입력된 키 판별
// 키가 입력되면 키 정보를 가진 이벤트 객체 생성 : ketEvnet 객체
// 1. 키의 문자 코드(유니코드) 알아내기, char KeyEvnet.getKeyChar()
// -- 눌러진 키가 문자 키인 경우에만 작동하며 문자코드(유니코드) 리턴
// 2. 입력된 키의 가상키 값 알아내기, int KeyEvent.getKeyCode()
// -- 가상 키 값은 KeyEvent 클래스의 상수로 정의됨
// 3. 키 이름 문자열 리턴 String KeyEvent.getKeyText(int keyCode)
// -- Static 메소드로 매개변수 keyCode의 코드 값(가상 키)에 해당하는 키의 이름 문자열 리턴

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyListenerEx extends JFrame {
	
	private JLabel [] keyMessage; 
	
	public KeyListenerEx() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel [3]; 
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			// 컴포넌트의 바탕색이 보이도록 하기 위해서는 컴포넌트가 불투명하기 지정될 필요 있음
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
		}
	}
	public static void main(String [] args) { 
		new KeyListenerEx();
	}
}