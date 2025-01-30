// main()의 위치를 프레임 클래스 내의 멤버로 작성하거나, 
// 다른 클래스에 작성하여 불러올 수 도 있지만 교제는 전자를 권장한다.

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame"); // 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 오른쪽 맨 위 X포시 하기
		
		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.ORANGE); // 배경 설정
		contentPane.setLayout(new FlowLayout()); // 레이아웃 설정
		
		contentPane.add(new JButton("OK")); // 컨텐트 팬에 컴포넌트 달기 
		contentPane.add(new JButton("Cancel")); // 컨텐트 팬에 컴포넌트 달기 
		contentPane.add(new JButton("Ignore")); // 컨텐트 팬에 컴포넌트 달기 
		
		setSize(300, 150); // 창 사이즈 설정
		setVisible(true); // 화면에 보이게 하는 작업
	}
	
	public static void main(String[] args) { 
		new ContentPaneEx();
	}
}
