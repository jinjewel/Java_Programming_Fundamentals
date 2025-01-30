
// 스윙의 페인팅 메카니즘

// 스윙 컴포넌트들이 그려지는 과정에 대한 이해 필요
// 바탕 컨테이너부터 그려짐

// --------------------- 그림

// 스윙의 페인팅에 관여되는 JComponent 메소드
// void paint(Graghics g) 컴포넌트 자신과 모든 자손 그리기
// void paintComponent(Graghics g) 컴포넌트 자신의 내부 모양 그리기
// void paintBorder(Graghics g 컴포넌트의 외각 그리기
// void paintChildren(Graghics g) 컴포넌트의 자식들 그리기(컨테이너의 경우)

// JComponent.paint()의 코드 구조
// 예)
// public void paint(Graphics g) { // g가 아래 3개의 메소드에 그대로 전달된다.
//    ...
//    paintComponent(g); // 1. 컴포넌트 자신의 내부 모양 그리기
//    paintBorder(g); // 2. 컴포넌트 자신의 외곽 그리기
//    paintChildren(g); // 3. 컴포넌트의 자식들 그리기
//    ...
// }

// 개발자가 paintComponent()를 직접 호출하면 안됨
// paintComponent()는 페인팅 메카니즘에 의해 자동으로 호출됨

// repaint() 메소드
// 강제로 컴포넌트의 다시 그리기 지시하는 메소드
// 예) component.repaint();
// 자바 플랫폼에게 지금 당장 컴포넌트를 다시 그리도록 지시
// 컴포넌트의 페인팅 과정 진행

// repaint()가 필요한 경우
// 프로그램 내에서 컴포넌트의 모양과 위치를 변경한 경우
// repaint()를 호출하면 자바 플랫폼에 의해 컴포넌트의 paintComponent()가 호출됨

// 부모 컴포넌트부터 다시 그리는 것이 좋음
// 만일 컴포넌트의 위치가 변경된 경우
// repaint()가 불려지면 이 컴포넌트는 새로운 위치에 다시 그려지지만, 
// 이전 위치에 있던 자신의 모양이 남아 있기 때문에 부모 컴포넌트의 repaint()를 호출하는 것이 좋음
// 예) component.getParent().repaint();

// revalidate()
// 컨테이너의 배치관리자에게 자식 컴포넌트들을 다시 배치 하도록 지시하는 메소드

// revalidate()가 필요한 경우
// 컨테이너에 변화가 생겨 다시 그려야할 때, 프로그램에서 컨테이너에 컴포넌트 새로 삽입, 삭제
// 예)
// container.revalidate(); // 컨테이너에 부착된 컴포넌트의 재배치 지시
// container.repaint(); // 컨테이너 다시 그리기 지시

// 마우스를 이용하여 출력창에 선 그리기
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLineMouseEx() {
		setTitle("drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new GraphicsDrawLineMouseEx();
	}
	
	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
}