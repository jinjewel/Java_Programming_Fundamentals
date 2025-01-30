import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class ProJect extends JFrame {
	public ProJect() {
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container fra = getContentPane();
		fra.setLayout(null);
		
		JLabel tes = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		tes.setBounds(200, 30, 400, 10);
		fra.add(tes);
		
		JButton b1 = new JButton("콤보피자"); // 버튼 생성
		b1.setBounds(100, 50, 100, 20);
		fra.add(b1); // 버튼을 컨텐트팬에 부착
		
		JButton b2 = new JButton("포테이토 피자"); // 버튼 생성
		b2.setBounds(210, 50, 150, 20);
		fra.add(b2); // 버튼을 컨텐트팬에 부착

		JButton b3 = new JButton("불고기 피자"); // 버튼 생성
		b3.setBounds(370, 50, 100, 20);
		fra.add(b3); // 버튼을 컨텐트팬에 부착
		
		JLabel tes1 = new JLabel("개수: ");
		tes1.setBounds(480, 50, 40, 20);
		fra.add(tes1); // 버튼을 컨텐트팬에 부착
		
		JTextField textbox = new JTextField("3");
		textbox.setBounds(530, 50, 100, 20);
		fra.add(textbox); // 버튼을 컨텐트팬에 부착
		
		setSize(1000,300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}
	public static void main(String[] args) {
		ProJect frame = new ProJect();
	}
}
