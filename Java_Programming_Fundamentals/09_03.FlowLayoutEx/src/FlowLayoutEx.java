// 응용프로그램 내에서 스스로 종료
// System.exit(0); 사용

// 프레임 종료버튼(X)이 클릭되면 어떤 일이 벌어지는가?
// 프레임을 종료하여 프레임 윈도우가 닫힘
// 프레임이 화면에서 보이지 않게 되고 응용프로그램이 사라짐

// 프레임이 보이지 않게 되지만 응용프로그램이 종료한 것 아님
// 키보드나 마우스 입력을 받지 못함
// 다시 setVisible(true)를 호출하면 보이게 되고 이전 처럼 작동함

// 프레임 종료버튼이 클릭될 때 프레임을 닫고 응용 프로그램이 종료하도록 하는 방법
// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// 스윙 프로그램이 실행되는 동안 생성되는 스레드 
// 메인 스레드 - main()을 실행하는 스레드, 자바 응용프로그램의 실행을 시작한 스레드
// 이벤트 분배 스레드 : 스윙 응용프로그램이 실행될 때 자동으로 실행되는 스레드

// 자바 응용프로그램의 종료 조건
// 실행 중인 사용자 스레드가 하나도 없을 때 종료

// 스윙 프로그램 main() 종료 뒤 프레임이 살아 있는 이유
// 메인 스레드가 종료되어도 이벤트 분배 스데드가 살아 있어 프레임 화면을 
// 그리고 마우스나 키 입력을 받기 때문에 살아 있다.

// 컨테이너와 배치 개념
// 컨테이너 마다 하나의 배치 관리자가 존재하며, 삽입되는 모든 컴포넌트의 위치와 크기를 결정 및 배치
// 컨테이너의 크기가 변하면 내부 컴포넌트들의 위치와 크기를 모드 재조절하고 재배치한다.
// 배치 관리자(Layout Manager)

// 배치 관리자 대표 유형 4가지, java.awt 패키지에 구현되어 있음
// FlowLayout, BorderLayout, GridLayout, CardLayout

// 컨테이너의 디폴트 배치관리자
// 표

// FlowLayout
// 배치 방법 : 컨테이너 공간 내에 왼쪽에서 오른쪽, 위에서 아래쪽으로 컨포넌트를 배치한다.
// 컨테이너의 크기가 바뀌면 컴포넌트가 재배치된다.
// 생성자
// FlowLayout()
// FlowLayout(정렬방법)
// FlowLayout(정렬방법, 수평간격, 수직간격)
// 정렬방법 : FlowLayout.LEFT , FlowLayout.CENTER , FlowLayout.RIGHT
import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample"); // 제목 입력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // _ ㅁ X 출력
		Container c = getContentPane(); // 컨텐트팬 알아내기
		
		// 컨테이너에 새로운 배치관리자 설정, 왼족 정렬, 수평 30픽셀, 수직 40픽셀 조정
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200); // 창 크기
		setVisible(true); // 화면에 출력
	}
	
	public static void main(String[] args) { 
		new FlowLayoutEx();
	}
}
