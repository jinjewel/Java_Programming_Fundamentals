// JSlider, 슬라이더

// JSlider, 슬라이더란 : 마우스로 움직이면서 값을 선택하는 컴포넌트


// 슬라이더 생성
// 생성자
// JSlider() 디폴트 슬라이더 생성
// JSlider(int orientation) orientation 방향의 슬라이더 생성
// JSlider(int min, int max, int val) 최소, 최대, 초깃값을 가진 슬라이더 생성
// JSlider(int orientation, int min, int val)
// orientation은 JSlider.HORIZONTAL과 JSlider.VERTCAL 중 하나이며 각각 수평 슬라이더와 수직 슬라이더를 의미한다.
// min, max, val은 각각의 초깃값이다.

// 슬라이더의 모양 제어 ( 수업에서 안나감 )
// 슬라이더 방향 설정
// void setOrientation(int orientation)
// orientation : JSlider.HORIZONTAL, JSlider.VERTICAL

// 최대 최소 값 설정
// void setMaximum(int max)
// void setMinimum(int min)

// label 보이기/감추기
// void setPaintLabels(boolean b)
// b가 true이면 label 출력

// tick 보이기/감추기
// void setPaintTicks(boolean b)
// b가 true이면 눈금 출력

// track 보이기/감추기
// void setPaintTrack(boolean b)
// b가 true이면 track 출력

// 큰 눈금 간격 지정
// void setMajorTickSpacing(int space)

// 작은 눈금 간격 지정
// void setMinorTickSpacing(int space)

// 슬라이더 값 제어
// void setVaule(int n)
// n이 슬라이더의 값이 되며 이에 따라 슬라이더의 손잡이 위치가 변경된다.

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
	public SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		
		// label 보이기/감추기
		slider.setPaintLabels(true);
		// tick 보이기/감추기
		slider.setPaintTicks(true);
		// track 보이기/감추기
		slider.setPaintTrack(true);
		// 큰 눈금 간격 지정
		slider.setMajorTickSpacing(50);
		// 작은 눈금 간격 지정
		slider.setMinorTickSpacing(10);
		
		c.add(slider);
		
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String [] args) {
		new SliderEx();
	}
}