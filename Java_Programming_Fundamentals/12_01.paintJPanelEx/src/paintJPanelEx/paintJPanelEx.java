// 스윙 컴포넌트 그리기, paintComponent()

// 스윙의 그리기 기본 철학
// 모든 컴포넌트는 자신의 모양을 스스로 그린다. 컨테이너는 자신을 그린 후, 그 위에 자식들에게 그리기 지시

// public void paintComponent(Graphics g)
// 스윙 컴포넌트가 자신의 모양을 그리는 메소드
// JComponent의 메소드 : 모든 스윙 컴포넌트가 이 메소드를 가지고 있음
// 컴포넌트가 그려져야 하는 시점마다 호출 : 크기가 변경되거나, 위치가 변경되거나 컴포넌트가 가려졌던 것이 사라지는 등 

// Graphics 객체
// java.awt.Graphics에서 사용가능하며, 컴포넌트 그리기에 필요한 도구를 제공하는 객체
// 색 지정, 도형 그리기, 클리핑, 이미지 그리기 등의 메소드 제공

// 사용자가 원하는 모양을 그리고자 할 때
// paintComponent(Graphics g) 오버라이딩
// 예)
// class MyComponent extends JXXX { // JXXX는 기존의 스윙 컴포넌트
//    ...
//    public void paintComponent(Graphics g) { // 오버라이딩
//       ... 필요한 코드 작성 ...
//    }
// }

// JPanel : 사용자가 그래픽을 통해 다양한 UI를 창출하는 일종의 캔버스

package paintJPanelEx;

import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public paintJPanelEx() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(250,220);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) { // 앨 구현해야 사용가능
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
			g.drawRect(10,10,35,35);
			g.drawRect(50,50,70,70);
			
			g.setColor(Color.MAGENTA);
			g.drawRect(90,90,105,105);
		}
	}
	public static void main(String [] args) {
		new paintJPanelEx();
	}
}
