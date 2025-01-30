// 도형 그리기와 칠하기

// 도형 그리기
// 선, 타원, 사각형, 둥근 모서리 사각형, 원호, 폐 다각형

// Graphics의 메소드
// void drawLine(int x1, int y1, int x2, int y2) : (x1, y1)에서 (x2, y2)까지 선을 그린다.
// void drawOval(int x, int y, int w, int h): (x, y)에서 w * h크기에 사각형에 내접하는 타원을 그린다.
// void drawRect(int x, int y, int w, int h): (x, y)에서 w * h크기에 사각형을 그린다.
// void drawRoundrect(int x, int y, int w, int h, int arcWidth, int arcHeight)
// (x, y)에서 w * h 크기의 사각형을 그리되, 4개의 모서리는 arcWidth와 arcHeight를 이용하여 원호를 그린다.
// arcWidth : 모서리 원의 수평 반지름, arcHeight : 모서리 원의 수직 반지름

// 원호와 폐다각형 그리기

// 원호와 폐다각형 그리는 Graphics 메소드
// void drawArc(int x, int y, int w, int h, int startAngle, int arcAngle)
// (x, y)에서 w * h 크기의 사각형에 내접하는 원호를 그린다. 3시 방향이 0도 기점이다. 
// startAngle 지점에서 arcAngle 각도만큼 원호를 그린다. arcAngle이 양수이면 반시계방향, 음수면 시계방향으로 그린다.
// startAngle : 원호의 시작 각도, arcAngle : 원호 각도

// void drawPolygon(int [] x, int [] y, int n)
// x, y 배열에 저장된 점들 중 n개를 연결하는 폐다각형을 그린다. (x[0], y[0]), ... ,(x[n-1], y[n-1])의 점들을 연결

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLineEx() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(200, 170);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.RED); // 빨간색 선택	
			g.drawLine(20, 20, 100, 100); // 선그리기
			
			g.setColor(Color.BLUE);
			g.drawOval(120,20,80,80);
			
			g.setColor(Color.YELLOW);
			g.drawRect(220,20,80,80);
			
			g.setColor(Color.ORANGE);
			g.drawRoundRect(320,20,120,80,80,20);
			
			g.setColor(Color.RED);
			g.drawArc(20,100,80,80,90,270);
			
			int []x = {120,150,180,150};
			int []y = {160,140,160,180};
			g.drawPolygon(x, y, 4);
			
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawLineEx();
	}
}