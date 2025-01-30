// 도형 칠하기
// 도형을 그리고 내부를 칠하는 기능
// 도형의 외곽선과 내부를 따로 칠하는 기능은 없다.
// 도형 칠하기를 위한 메소드 : 도형 그리기 메소드 명에서 draw 를 fill로 대치하면 된다. 인자는 동일
// 예) drawRect() -> fillRect(), drawArc() -> fillArc()

// 칠하기 메소드
// void fillOval(int x1, int y1, int w, int h)
// void fillRect(int x1, int y1, int w, int h)
// void fillRoundRect(int x1, int y1, int w, int h, int arcWidth, int arcHeight)
// void fillArc(int x, int y, int w, int h, int startAngle, int arcAngle)
// void fillPolygon(int []x, int []y, int n)

import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(100, 350);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.fillRect(10,10,50,50);
			
			g.setColor(Color.BLUE);
			g.fillOval(10,70,50,50);
			
			g.setColor(Color.GREEN);
			g.fillRoundRect(10,130,50,50,20,20);
			
			g.setColor(Color.MAGENTA);
			g.fillArc(10,190,50,50,0,270);
			
			g.setColor(Color.ORANGE);
			
			int [] x ={30,10,30,60};
			int [] y ={250,275,300,275};
			g.fillPolygon(x, y, 4);
		}
	}
	public static void main(String [] args) {
		new GraphicsFillEx();
	}
}