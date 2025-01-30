// 배치관리자가 없는 컨테이너란
// 응용프로그램에서 컴포넌트의 절대 크기와 절대 위치 결정

// 용도
// 컴포넌트의 크기나 위치를 개발자 임의로 결정하고 하고자 하는 경우
// 입력에 따라 컴포넌트들의 위치와 크기가 달라지는 경우
// 여러 컴포넌트들이 서로 겹쳐 출력하는 경우

// 컨테이너의 관리배치자 제거 방법
// container.setLayout(null);

// 컴포넌트의 절대 크기와 절대 위치 설정
// 크기 설정 : conponent.setSize(너비, 높이)
// 위치 설정 : conponent.setLocation(x좌표, y좌표);
// 위치와 크기 동시에 설정 : conponent.setBounds(x좌표, y좌표, 너비, 높이)


import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) { 
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b); // 버튼을 컨텐트팬에 부착
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) { 
		new NullContainerEx();
	}
}