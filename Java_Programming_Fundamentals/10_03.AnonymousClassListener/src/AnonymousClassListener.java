// 익명 클래스로 이벤트 리스너 작성
// 익명 클래스란 : (클래스 정의 + 인스턴스 생성) 을 한번에 작성
// ActionListener를 구현하는 익명의 이벤트 리스너 작성
// 예) 정상
// 예) class MyActionListener implements ActionListener{ 
// 예) 	public void actionPerformed(ActionEvent e){ ... }
// 예) }
// 예) b.addActionListener(new MyActionListener());
// 예) 익명의 이벤트 리스너 작성
// 예) b.addActionListener(new MyActionListener(){ 
// 예) 	public void actionPerformed(ActionEvent e){ ... } 
// 예) });

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		JButton btn = new JButton("Action");
		c.add(btn);
		
		// 익명 클래스로 Action 리스너 작성
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				// AnonymousClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
				setTitle(b.getText());
			}
		});
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String [] args) { 
		new AnonymousClassListener();
	}
}