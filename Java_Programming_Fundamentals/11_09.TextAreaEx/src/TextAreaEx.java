// JTextField의 주요 메소드

// 문자열 편집 불가능하게 하기
// JTextField.setEditable(false);

// 입력 창에 문자열 출력
// JTextField.setText("hello");

// 문자열의 폰트 지정
// JTextField.setFont(new Font("고딕체", Font.ITALIC, 20);

// TextArea, 텍스트영역 컴포넌트

// JTextArea, 텍스트영역이란?
// 여러 줄을 입력할 수 있는 텍스트 입력 창
// JScrollPane 컴포넌트에 삽입하면 스크롤바 지원됨

// 생성자
// JTextArea() 빈 텍스트필드
// JTextArea(int rows, int cols) 입력 창이 rows * cols 개의 무자 크기인 텍스트 영역
// JTextArea(String text) text 문자열로 초기화된 텍스트필드
// JTextArea(String text, int rows, int cols) 입력 창이 rows * cols 개의 무자 크기인 텍스트 영역이고 text 문자열로 초기화 된 텍스트필드

// 스크롤바
// 스크롤바를 생성시, 크기가 맞지 많은 경우에 스크롤바가 생성.
// new JScrollPane( 텍스트 필드 생성 );

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20);
	
	public TextAreaEx() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		
		c.add(tf);
		
		c.add(new JScrollPane(ta)); // 스크롤바 사용
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource(); // 입력된 값을 가져옴
				ta.append(t.getText() + "\n");
				t.setText(""); // t에 적혀있는 것을 리셋
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new TextAreaEx();
	}
}