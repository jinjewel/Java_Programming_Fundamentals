// 그래픽 기반 GUI 프로그래밍
// 스윙 컴포넌트를 사용하지 않고
// 선, 원, 이미지 등을 직접 그려 GUI 화면을 구성하는 방식

// 장점
// 스윙 컴포넌트로 만들 수 없는 자유로운 GUI 가능 : 차트, 게임 등 자유로운 모양을 표현에 효과적
// 그래픽 그리기는 컴포넌트 그리기보다 빠르다
// 자바의 GUI 바탕 기술을 이해하는데 도움
// 개발자 자신만의 컴포넌트를 창작

// Graphics의 좌표 체계

//  Graphics의 기능
// 색상 선택하기, 문자열 출력, 도형 그리기, 도형 칠하기, 이미지 출력, 클리핑

// 문자열 그리기
// void drawString(String str, int x, int y)
// (x,y) 영역에 str 문자열 그리기
// 현재 색과 현재 폰트로 출력

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		setTitle("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(250,200);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawString("자바는 재밌다.~~", 30,30);
			g.drawString("얼마나? 하늘만큼 땅만큼 !!!!", 60, 60);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawStringEx();
	}
}