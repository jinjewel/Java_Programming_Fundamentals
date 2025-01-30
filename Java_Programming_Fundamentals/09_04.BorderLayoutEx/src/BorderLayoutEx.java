// BorderLayout 배치방법
// 컨테이너 공간을 5구역으로 분할, 배치(동, 서, 남, 북, 중앙 순서)
// 배치 방법, add(Component comp, int index)

// 생성자
// void add(Component comp, int index)
// comp : 컨테이너에 삽입되는 컴포넌트
// index: 컴포넌트의 위치(동 : BorderLayout.EAST, 서 : BorderLayout.WEST 등등 )

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // _ ㅁ X 출력
		
		Container c = getContentPane(); // 컨텐트팬 알아내기
		c.setLayout(new BorderLayout(30, 20)); // 생손자를 바탕으로 가로 30, 세로 20로 표시
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200); // 프레임 크기 300×200 설정
		setVisible(true); // 프레임을 화면에 출력
	}
	public static void main(String[] args) { 
		new BorderLayoutEx();
	}
}