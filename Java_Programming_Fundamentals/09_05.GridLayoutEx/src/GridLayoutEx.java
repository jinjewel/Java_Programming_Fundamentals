// GridLayout
// 배치방법 : 컨테이너 공간을 동일한 사각형 격자로 분할하고 각 셀에 하나의 컴포넌트 배치
// 격자 구성은 생성자에 생수와 열수 지정, 셀에 왼쪽에서 오른쪽으로, 위에서 아래로 순서대로 배치
// 컨테이너의 크기가 변하면 재배치
// 생성자
// GridLayout()
// GridLayout(행수, 열수)
// GridLayout(행수, 열수, 수평간격, 수직간격)

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // _ ㅁ X 출력
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
	
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) { 
		new GridLayoutEx();
	}
}