// 스윙에서 이미지를 그리는 2 가지 방법

// 1. JLabel 컴포넌트로 이미지 그리기
// 예)
//    ImageIcon image = new ImageIcon("images/apple.jpg");
//    JLabel label = new JLabel(image);
//    panel.add(label);
// 장점
// 이미지 그리기가 간편하고 쉬운 장점
// 이미지가 컴포넌트이므로 이벤트 발생
// 이미지에 마우스 클릭하면 이벤트 받을 수 있음

// 단점
// 이미지 크기 조절 불가 : 원본 크기로만 그리기

// 2. JPanel에 Graphics 메소드로 이미지 그리기
// 장점
// 이미지의 원본 크기와 다르게, 이미지 일부분 등 그리기 가능

// 단점
// 컴포넌트로 관리 되지 않음
// 개발자가 상황에 따라 이미지의 위치나 크기 등을 적절히 조절해야 함
// 이미지가 마우스를 클릭해도 이미지에 이벤트 발생하지 않음

// 총 6 개의 메소드

// 원본 크기로 그리기
// void drawImage(Image img, int x, int y, Color bgColor, ImageObserver observer)
// void drawImage(Image img, int x, int y, ImageObserver observer)

// 크기 조절하여 그리기
// void drawImage(Image img, int x, int y, int width, int height, Color bgColor, ImageObserver observer)
// void drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)

// 원본의 일부분을 크기 조절하여 그리기
// void drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, 
//                                                                                    Color bgColor, ImageObserver observer)
// void drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer)

// ImageObserver는 이미지가 다 그려졌을 때, 통보를 받는 객체를 지정하는 매개변수
// 이미지는 경우에 따라 디코딩 등으로 인해 시간이 오래 걸릴 수 있기 때문에, 이미지 그리기가 완료되었는지 통보 받을 때 사용.
// 보통의 경우 this를 주거나 null을 주어 통보를 받지 않을 수 있음

// 이미지 그리기 샘플 코드

// 이미지 로딩 : Image 객체 생성
//    그리고자 하는 이미지가 “image/image0.jpg”인 경우
//    ImageIcon icon = new ImageIcon(“image/image0.jpg”);
//    Image img = icon.getImage();
// 원본 이미지를 (20,20) 위치에 원본 크기로 그리기, 고정 크기임
//    public void paintComponent(Graphics g) {
//    super.paintComponent(g);
//    g.drawImage(img, 20, 20, this);
//    }
// 원본 이미지를 100x100 크기로 조절하여 그리기, 고정 크기임
//    public void paintComponent(Graphics g) {
//    super.paintComponent(g);
//    g.drawImage(img, 20, 20, 100, 100, this);
//    }
// 원본 이미지를 패널에 꽉 차도록 그리기, 
// JPanel의 크기로 조절하여 그리기, 가변 크기임, JPanel의 크기가 변할 때마다 이미지의 크기도 따라서 변함
//    public void paintComponent(Graphics g) {
//    super.paintComponent(g);
//    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
//    }
// 원본 이미지의 (50, 0)에서 (150,150) 사각형 부분을 JPanel의 (20,20)에서 (250,100) 영역에 그리기, 고정 크기임
//    public void paintComponent(Graphics g) {
//    super.paintComponent(g);
//    g.drawImage(img, 20,20,250,100,50,0,150,150, this);
//    }

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx1() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(300, 420);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\backimage.png");
		private Image img = icon.getImage(); // 이미지 객체
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, this);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawImageEx1();
	}
}