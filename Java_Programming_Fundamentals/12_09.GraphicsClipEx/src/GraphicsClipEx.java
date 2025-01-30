// 클리핑(Clipping)이란?
// 클리핑 영역에서만 그래픽이 이루어지도록 하는 기능
// 클리핑 영역 : 하나의 사각형 영역

// 클리핑이 작동하는 그래픽 기능
// 그리기, 칠하기, 이미지 그리기, 문자열 출력 등에서 모드 클리핑 작동

// ------------------사진

// Graphics의 클리핑 메소드
// void setClip(int x, in y, int w, int h)
// 그래픽 대상 컴포넌트의 (x, y) 위치에서 w x h 의 사각형 영역을 클리핑 영역으로 지정

// void clipRect(int x, in y, int w, int h)
// 기존 클리핑 영역과 지정된 사각형 영역((x,y)에서 w x h의 영역)의 교집합 영역을 새로운 클리핑 영역으로 설정
// clipRect()이 계속 불리게 되면 클리핑 영역을 계속 줄어들게 됨

// 패널에 (100, 20)에서 150×150 크기로 클리핑 영역을 설정
import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsClipEx() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\backimage.png");
		private Image img = icon.getImage(); // 이미지 객체
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setClip(100, 20, 150, 150); // 출력화면에 그림이 보이는 구멍이 뚤린 느낌으로 표현이 됨, 출력창을 움직여 그림이 달라지면 출력 그림도 달라짐
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			g.setColor(Color.YELLOW); // 그림위에 작성이 되는 텍스트, 주소가 곂치기 때문에
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}
	public static void main(String [] args) {
		new GraphicsClipEx();
	}
}