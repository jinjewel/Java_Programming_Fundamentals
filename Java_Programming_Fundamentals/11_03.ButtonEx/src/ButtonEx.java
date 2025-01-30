// JButton, 버튼 컴포넌트

// 버튼 컴포넌트
// 버튼 모양의 컴포넌트
// 버튼을 선택하면 Action 이벤트 발생

// 생성자
// JButton() 빈 레이블
// JButton(Icon image) 이미지 레이블
// JButton(String text) 문자열 레이블
// JButton(String text, Icon image) 문자열과 이미지를 가진 버튼

// 버튼 컴포넌트 생성 예
// "hello" 문자열을 가진 버튼 컴포넌트 생성 예
// JButton btn = new JButton("hello");

// 하나의 버튼에 3 개의 이미지 연결
// 마우스 접근에 따라 서로 다른 3 개의 이미지 출력 가능
// 사용자의 버튼 조작에 대한 시각적 효과를 극대화

// 3 개의 버튼 이미지

// 1. 버튼의 보통 상태 때 출력되는 이미지
// 생성자에 이미지 아이콘 전달
// 이미지 설정 메소드 : JButton.setIcon(Icon image)

// 2. 버튼에 마우스가 올라갈 때 출력되는 이미지
// 이미지 설정 메소드 : JButton.setRolloverIcon(Icon image);

// 3. 버튼을 누르고 있는 동안 출력되는 이미지
// 이미지 설정 메소드 : JButton.setPressedIcon(Icon image)

// 이미지 아이콘 생성
// new ImageIcon(이미지 경로명);
// 예) new ImageIcon("images/normalIcon.gif);

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\normalIcon.gif");
		JButton btn = new JButton("call~~", normalIcon);		
		
		ImageIcon rolloverIcon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\rolloverIcon.gif");
		btn.setRolloverIcon(rolloverIcon);
		
		ImageIcon pressedIcon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\pressedIcon.gif");
		btn.setPressedIcon(pressedIcon);
		
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String [] args) { 
		new ButtonEx();
	}
}