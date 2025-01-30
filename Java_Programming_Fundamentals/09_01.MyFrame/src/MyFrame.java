// 자바의 GUI

// GUI의 목적
// 그래픽 이용, 사용자에게 이해하기 쉬운 모양으로 정보 제공
// 사용자는 마우스나 키보드를 통해서 쉽게 입력

// 자바 GUI의 특징
// 강력한 GUI 컴포넌트 제공, 쉬운 GUI 프로그래밍

// 자바의 GUI 프로그래밍 방법
// java.awt 패키지의 AWT 클래스와 javax.swing 패키지의 Swing 클래스 사용

// AWT(Abstract Windowing Toolkit)
// 자바가 처음 나왔을 때 함께 배포된 GUI 라이브러리
// java.awt 패키지에서 사용
// native 운영체제의 GUI 컴포넌트의 도움을 받아 작동을 하며 웅영체제에 많은 부담을 준다.
// 따라서 중량컴포넌트라고 하며, 처리속도는 빠르다는 장점을 가지고 있다. 

// Swing(스윙)
// AWT 기술을 기반으로 순수 자바 언어로 만들어진 라이브러리
// AWT 컴포넌트에 J자로 덧붙여진 이름의 클래스로 J로 시작하는 클래스가 해당한다.
// javax.swing 패키지에서 사용
// native 운영체제에 의존하지 않으며 경량 컴포넌트라고 불린다.

// Swing 컴포넌트는 2가지 유형으로 나뉜다.
// JConponent을 상속받는 클래스(대부분이다.)
// AWT의 Container를 상속받는 몇개의 클래스(JApplet, JFrame, JDialog )

// Swing 컴포넌트의 예시
// JButton, JCheckBox, JRadioButton, JSlider, JTextField, JPasswordField
// JSpinner, JTextArea, JComboBox, JList, JProgressBar, JToolTip
// JScrollPane, JColorChooser, JFrame, JDialog, JMenu, JTable, JTree
// JToolBar, JTabbedPane, JSplitPane

// GUI 라이브러리 계층 구조
// Object -> Component -> JConponent, JApplet, JFrame, JDialog 
// Swing클래스는 JConponent를 상속받아서 사용한다.
// JConponent : 스윙 컴포넌트의 공통적인 속성을 구현한 추상 클래스
// AWT의 Conponent를 상속받음.

// 컨테이너
// 다른 GUI 컴포넌트를 포함할 수 있는 컴포넌트로 다른 컨테이너에 포함될 수 있음
// java.awt.Container 상속
// AWT 컨테이너 : Panel, Frame, Applet, Dialog, Window
// Swing 컨테이너 : JPanel, JFrame, JApplet, JDialog, JWindow

// 최상위 컨테이너
// 다른 컨테이너에 속하지 않고 독립적으로 출력가능한 컨테이너(JFrame, JDialog, JApplet)
// 모든 컨포넌트는 컨테이너에 포함되어야 화면에 출력 가능

// 컴포넌트
// 컨테이너에 포함되어야 화며에 출력될 수 있는 순수 컴포넌트
// 모든 컴포넌트는 java.awt.Component를 상속받음
// 모든 Swing 컴포넌트는 javax.Swing.JComponent를 상속받음

// 컨테이너와 컴포넌트의 포함관계

// Swing GUI 프로그램 만들기
// 1. 스윙 프레임 작성 -> 2. main() 메소드 작성 -> 3. 프레임에 스윙 컴포넌트 붙이기

// Swing 패키지 사용을 위한 import문
// import.java.awt.* : 그래픽 처리를 위한 클래스들의 경로명
// import.java.awt. : AWT 이벤트 사용을 위한 경로명
// import.javax.swing.* : 스윙 컴포넌트 클래스 들의 경로명
// import.javax.swing.event.* : 스윙 이벤트를 위한 경로명

// 스윙 프레임
// 모든 Swing 컴포넌트를 담는 최상위 GUI 컨테이너
// JFrame을 상속받아 구현을 하며, 컴포넌트가 화면에 보이려면 스윙 프레임에 부착되어야 한다.
// 프레임을 닫으면 프레임 내의 모든 컴포넌트가 보이지 않게 됨.

// 스윙 프레임(JFrame) 기본 구성
// 프레임 - 스윙 프로그램의 기본 틀
// 메뉴바 - 메뉴들이 부착되는 공간
// 컨텐느 팬 - GUI 컴포넌트들이 부착되는 공간

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
