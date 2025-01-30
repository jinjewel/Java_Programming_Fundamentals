//JTextField, 텍스트필드 컴포넌트

// 텍스트필드란, JTextField
// 한 줄 짜리 텍스트(문자열) 입력 창을 구현한 컴포넌트
// 텍스트 입력 도중 <Enter>키가 입력되면 Action 이벤트 발생
// 입력 가능한 문자 개수와 입력 창의 크기는 서로 다름

// 생성자
// JTextField() 빈 텍스트필드
// JTextField(int cols) 입력 창의 열의 개수가 cols개인 텍스트필드
// JTextField(String text) text 문자열로 초기화된 텍스트필드
// JTextField(String text, int cols) 입력 팡의 열의 개수는 cols개이고, text 문자열로 초기화 된 텍스트필드

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
	public TextFieldEx() { setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());  
		
		c.add(new JLabel("이름 ")); 
		c.add(new JTextField(20)); 
		
		c.add(new JLabel("학과 ")); 
		c.add(new JTextField("컴퓨터공학과 ", 20)); 
		
		c.add(new JLabel("주소 ")); 
		c.add(new JTextField("서울시 ...", 20)); 
		
		setSize(300,150); 
		setVisible(true);
	}
	public static void main(String [] args) { 
		new TextFieldEx();
	}
}