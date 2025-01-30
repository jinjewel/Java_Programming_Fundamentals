// 이미지 일부분을 크기 조절하여 그리기

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx3 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx3() {
		setTitle("이미지 일부분을 크기 조절하여 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\backimage.png");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 원본 (100,50)에서 (200,200)까지의 사진을 출력화면 (20,20)에서 (250,100)까지에 표현
			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this); 
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawImageEx3();
	}
}