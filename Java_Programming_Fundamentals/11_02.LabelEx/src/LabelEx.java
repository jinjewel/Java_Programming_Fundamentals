// JLabel, 레이블 컴포넌트

// JLabel의 용도
// 문자열이나 이미지를 컴포넌트화 하여 출력하기 위한 목적

// 생성자
// JLabel() 빈 레이블
// JLabel(Icon image) 이미지 레이블
// JLabel(String text) 문자열 레이블
// JLabel(String text, Icon image, int hAlign) 문자열과 이미지를 모두 가진 레이블
// hAlign : 수평 정렬 값으로 SwingConstants.LEFT, SwingConstants.RIGHT, SwingConstants.CENTER 중 하나

// 레이블 컴포넌트 생성 예
// 단순 텍스트 만을 가진 레이블 컴포넌트 생성
// JLabel textLabel = new JLabel("사랑합니다.");

// 이미지를 가진 레이블 컴표넌트 생성
// 이미지 파일로부터 이미지를 읽기 위해 ImageIcon 클래스 사용
// 다룰 수 있는 이미지 : png, gif, jpg
// ImageIcon image = new ImageIcon("images/sunset.jpg");
// JLabel imageLabel = new JLabel(image);

// 수평 정렬 값을 가진 레이블 컴포넌트 생성
// 텍스트 이미지 모두 출력하고자 하는 경우 수평 정렬 지정
// JLabel label = new JLabel("사랑합니다", image, SwingConstants.CENTER);

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
	public LabelEx() { 
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		JLabel textLabel = new JLabel("사랑합니다.");
		c.add(textLabel); 
		
		ImageIcon beauty = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\beauty.jpg"); 
		JLabel imageLabel = new JLabel(beauty);
		c.add(imageLabel);
		
		ImageIcon normalIcon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\normalIcon.gif"); 
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER); 
		c.add(label); 
		
		setSize(400,600); 
		setVisible(true);
	}
	public static void main(String [] args) { 
		new LabelEx();
	}
}