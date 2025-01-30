// JRadioButton, 라디오버튼 컴포넌트

// JRadioButton, 라디오버튼이란 
// 여러 버튼으로 그룹을 형성하고, 하나만 선택되는 버튼
// 다른 버튼이 선택되면 이전에 선택된, 버튼은 자동으로 해제됨

// 체크박스와의 차이점
// 체크 박스는 각 체크박스마다 선택/해제 가능
// 라디오 버튼은 그룹에 속한 버튼 중 하나만 선택 상태가 됨

// 이미지를 가진 라디오버튼의 생성 및 다루기는 체크박스와 완전히 동일

// 생성자
// JRadioButton() 빈 라디오버튼
// JRadioButton(Icon image) 이미지 라디오버튼
// JRadioButton(Icon image, boolean selected) 이미지 라디오버튼
// JRadioButton(String text) 문자열 라디오버튼
// JRadioButton(String text, boolean selected) 문자열 라디오버튼
// JRadioButton(String text, Icon image) 문자열과 이미지를 가진 라디오버튼
// JRadioButton(String text, Icon image, boolean selected) 문자열과 이미지를 가진 라디오버튼
// selected : true이면 선택 상태로 초기화, 디폴트는 해제 상태

// 라디오버튼 생성 과정

// 1. 버튼 그룹 객체 생성
// ButtonGroup group = new ButtonGroup();

// 2. 라디오버튼 컴포넌트 생성
// JRadioButton apple= new JRadioButton("사과");
// JRadioButton pear= new JRadioButton("배");
// JRadioButton cherry= new JRadioButton("체리");

// 3. 라디오 버튼을 버튼 그룹에 삽입
// group.add(apple);
// group.add(pear);
// group.add(cherry);

// 4. 라디오 버튼을 컨테이너에 삽입
// container.add(apple);
// container.add(pear);
// container.add(cherry);

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("사과");
		g.add(apple);
		c.add(apple);
		
		JRadioButton pear = new JRadioButton("배", true);
		g.add(pear);
		c.add(pear);
		
		ImageIcon cherryIcon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\cherry.jpg" );
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);		
		
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\selectedCherry.jpg"); 
		cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(cherry);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String [] args) { 
		new RadioButtonEx();
	}
}