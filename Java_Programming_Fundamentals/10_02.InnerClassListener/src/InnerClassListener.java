
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제"); // 창 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창의 오른쪽 상단 - ㅁ x 표시
		
		Container c = getContentPane(); // 참조 객체 가져오기
		c.setLayout(new FlowLayout()); // 레이아웃 설정
		
		JButton btn = new JButton("Action"); // 버튼 추가
		btn.addActionListener(new MyActionListener()); // Action 리스너 설정
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	private class MyActionListener implements ActionListener { // 내부 클래스로 Action 리스너 작성
		public void actionPerformed(ActionEvent e) { 
			JButton b = (JButton)e.getSource(); // 버튼의 이름을 가져온다.
			if(b.getText().equals("Action")) // 버튼의 문자를 바꾼다.
				b.setText("액션");
			else
				b.setText("Action");
			// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			InnerClassListener.this.setTitle(b.getText()); // 프레임 타이틀에 문자를 바꾼다.
		}
	}
	public static void main(String [] args) { 
		new InnerClassListener();
	}
}