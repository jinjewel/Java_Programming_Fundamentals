// GUI를 구성하는 2가지 방법
// 1. 컴포넌트 기반 GUI 프로그래밍
// 2. 그래픽 기반 GUI 프로그래밍

// 1. 컴포넌트 기반 GUI 프로그래밍
// 스윙 패키지에 주어진 GUI 컴포넌트 이용
// GUI 구성이 쉽다
// 자바 패키지에 제공하는 GUI 컴포넌트 한계
// 일반적인 GUI 프로그램에 적합

// 2. 그래픽 기반 GUI 프로그래밍
// 선, 원, 도형, 이미지를 직접 그려 그래픽 화면 구성
// 개발자의 작접 부담 높음
// 자바 패키지에 없는 독특한 GUI 구성 가능
// 게임 등 자유로운 GUI 

// 11장 - 컴포넌트 기반 GUI 프로그래밍
// 12장 - 그래픽 기반 GUI 프로그래밍

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
	public JComponentEx() { 
	
		super("JComponent의 공통 메소드 예제"); 
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
	
		JButton b1 = new JButton("Magenta/Yellow Button"); 
		JButton b2 = new JButton(" Disabled Button "); 
		JButton b3 = new JButton("getX(), getY()");
	
		b1.setBackground(Color.YELLOW); // 배경색 설정
		b1.setForeground(Color.MAGENTA); // 글자색 설정
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20픽셀 폰트 설정
		b2.setEnabled(false); // 버튼 비활성화
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor(); 
				frame.setTitle(b.getX() + "," + b.getY()); // 타이틀에 버튼 좌표 출력
			}
		}); 
		c.add(b1); 
		c.add(b2); 
		c.add(b3); // 컨텐트팬에 버튼 부착
	
		setSize(260,200); 
		setVisible(true);
	}
	public static void main(String[] args) { 
		new JComponentEx();
	}
}