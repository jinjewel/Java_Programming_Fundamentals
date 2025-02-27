// JSlider와 Change 이벤트

// Change 이벤트
// JSlider의 값(value)이 바뀌면 발생
// 예) 사용자가 슬라이더의 손잡이를 움직이는 경우
// 예) JSlider의 setValue(int n)를 호출하여 값(value 필드)이 바뀌는 경우

// ChangeListener의 메소드
// void stateChanged(ChangeEvent e)
// 컴포넌트의 상태가 변할 때 호출되며 changeEvent 객체를 인자로 전달받는다.

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {
	private JLabel colorLabel;
	private JSlider [] sl = new JSlider [3];
	
	public SliderChangeEx() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i=0; i<sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			
			sl[i].setPaintLabels(true);
			
			sl[i].setPaintTicks(true);
			
			sl[i].setPaintTrack(true);
			
			sl[i].setMajorTickSpacing(50);
			
			sl[i].setMinorTickSpacing(10);
			
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		colorLabel = new JLabel(" SLIDER EXAMPLE ");
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
		c.add(colorLabel);
		
		setSize(300,230);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			colorLabel.setBackground(new Color(r,g,b));
		}
	}
	
	public static void main(String [] args) {
		new SliderChangeEx();
	}
}