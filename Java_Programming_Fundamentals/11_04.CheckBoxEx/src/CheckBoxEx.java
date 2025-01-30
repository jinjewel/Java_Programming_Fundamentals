// 레이블과 버튼의 정렬

// 수평 정렬 : 컴포넌트 내에 이미지와 텍스트의 수평 위치
// void setHorizontalAlignment(int align)
// align : 정렬의 기준을 지정하는 값, SwingConstants.LEFT, SwingConstants.CENTER, SwingConstants.RIGHT 

// 수직 정렬 : 컴포넌트 내에 이미지와 텍스트의 수직 위치
// void setVerticalAlignment(int align)
// align : 정렬의 기준을 지정하는 값, SwingConstants.TOP, SwingConstants.CENTER, SwingConstants.BOTTOM 

// JCheckBox, 체크박스 컴포넌트
// JCheckBox
// 선택(selected)과 비선택(deselected)의 두 상태만 가지는 체크 버튼

// 생성자
// JCheckBox() 빈 체크박스
// JCheckBox(String text) 문자열 체크박스
// JCheckBox(String text, boolean selected) 문자열 체크박스
// JCheckBox(Icon image) 이미지 체크박스
// JCheckBox(String text, boolean selected) 이미지 체크박스
// JCheckBox(String text, Icon image) 문자열과 이미지를 가진 체크박스
// JCheckBox(String text, Icon image, boolean selected) 문자열과 이미지를 가진 체크박스
// selected : true이면 선택 상태로 초기화, 디폴트는 해제 상태

// 문자열 체크 박스
// "사과" 텍스트를 가진 체크박스 생성
// JCheckBox c = new JCheckBox("사과");
// "배" 텍스트를 가지고 선택 상태로 체크박스 생성
// JCheckBox c = new JCheckBox("배", true); 
// true : 선택 상태로 초기화

// 이미지 아이콘을 가진 체크 박스 생성 예
// 체크 박스 모양 이 출력되지 않음, 선택 상태를 표현하는 이미지 아이콘을 따로 지정해야 함
// cherry.jpg 이미지와 "체리" 텍스트를 가진 체크 박스 생성 예
// ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
// JCheckBox cherry = new JCheckBox("체리", cherryIcon);
// ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
// cherry.setSelectedIcon(selectedCherryIcon); // 선택 상태의 이미지 달기

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox("사과");
		c.add(apple);
		
		JCheckBox pear = new JCheckBox("배", true);
		c.add(pear);
		
		ImageIcon cherryIcon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\cherry.jpg"); 
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		
		ImageIcon selectedCherryIcon = new ImageIcon( "C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\selectedCherry.jpg");
		cherry.setSelectedIcon(selectedCherryIcon);		
		
		cherry.setBorderPainted(true);
		
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String [] args) { 
		new CheckBoxEx();
	}
}