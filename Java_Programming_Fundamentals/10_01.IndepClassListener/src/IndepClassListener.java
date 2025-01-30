// 이벤트 기반 프로그래밍

// 이벤트 종류
// 사용자의 입력 : 마우스 드래그, 마우스 클릭, 키보드 누름
// 센서로부터의 입력, 네트워크로부터 데어티 송수신
// 다른 응용프로그램이나 다른 스레드로부터의 메시지

// 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식
// 이벤트가 발생하면 이벤트를 처리하는 이벤트 리스너 실행
// 프로그램 내의 어떤 코드가 언제 실행될 지 이벤트 발생에 의해 전적으로 결정

// 반대되는 개념 : 배치 실행 - 프로그램의 개발자가 프로그램의 흐름을 결정하는 방식
// 현재의 개념 : 이벤트 - 대부분 약 90% 이벤트 기반으로 프로그램이 돌아간다.

// 이반트 기반 프로그램의 구조 - 이벤트 리스너 들의 집합

// 이벤트 처리 순서
// 이벤트 발생 : 마우스나 키보드의 움직임 혹은 입력
// 이벤트 객체 생성 : 현재 발생한 이벤트에 대한 정보를 가진 객체
// 이벤트 리스너 찾기 
// 이벤트 리스너 호출 : 이벤트 객체가 리스너에 전달죔
// 이벤트 리스너 실행

// 자바의 이벤트 기반 GUI 응용프로그램 구성
// PC등 하드웨어 : Action(만져지는 것들 : 마우스, 모니터 등등)
// 운영체제 
// 자바 가상 기계(JVM)
// 자바 응용프로그램(
// 이벤트 분배 스레드(ActionEvent 생성) -> 이벤트 리스너 -> JButton, JMenuItem, JTextField 등
// )
// 발생한 이벤트는 Action 이벤트
// 이벤트 소스는 JButton
// 이벤트 객체는 ActionEvent
// 이벤트 리스너는 이벤트 리스너4

// 이벤트 관련 용어
// 이벤트 소스 : 이벤트를 발생시킨 GUI 컴포넌트
// 이벤트 객체 : 발생한 이벤트에 대한 정보(이벤트 종류, 이벤트 소스, 화변 좌표, 마우스 버튼 종류)
// 이벤트 리스너 : 마우스, 키보드 등 이벤트를 처리하는 코드, 컴포넌트에 등록되어야 작동 가능
// 이벤트 분배 스레드
// -- 동작(자바 가상 기계로부터 이벤트의 발생을 통지 받음, 이벤트 소스와 이벤트 종류 결정, 
//           적절한 이벤트 객체 생성, 이벤트 리스너를 찾아 호출)
// -- 무한 루프를 실행하는 스레드

// 이벤트 객체
// 이벤트가 발샐할 때, 발생한 이벤트에 관한 정보를 가진 객체
// 이벤트 리스너에 전달됨 : 이벤트 리스너 코드에서 이벤트가 발생한 상황을 파악할 수 있게 함

// 이벤트 객체의 종류
// -------------------------- 사진

// 이벤트 객체에 포함된 정보
// 이벤트 종류, 이벤트 소스, 이벤트가 발생한 화면좌표 나 컴포넌트 내 좌표
// 클릭된 마우스 버튼 번호, 마우스 클릭 횟수, 눌린 키에 대한 코드값과 문자 값
// 체크박스, 라디오 버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 체크 상태

// 이벤트에 따라 조금씩 다른 정보 포함
// ActionEvent 객체 : 액션 문자열
// MouseEvent 객체 : 마우스의 우치 정보, 마우스 버튼, 함께 눌러진 키 정보 등
// ItemEvent 객체 : 아이템의 체트 상태

// 이벤트 소스 알아내기 - Object EventObject.getSource()
// 발생한 이벤트의 소스 컴포넌트 리턴
// Object 타입으로 리턴하므로 캐스팅하여 사용
// 모든 이벤트 객체에 대해 적용
// -------------------------- 사진

// 이벤트 객체와 이벤트 소스
// -------------------------- 사진

// 이벤트 리스너
// 이벤트를 처리하는 코드, 클래스로 작성, 실제 처리기
// JDK에서 이벤트 리스너 작성을 위한 인터페이스 제공 : 개발자가 리스너 인터페이스의 추상 메소드를 구현
// 예) ActionListener 인터페이스
// 예) interface ActionListener{ public void actionPerformed(ActionEvent e); }
// 예) actionPerformed를 구현 해야됨
// 예) MouseListener 인터페이스
// 예) interface MouseListener{ public void mousePressed(MouseEvent e); ...;}
// 예) mousePressed, ... 등의 메소드를 구현해야됨

// 리스너 인터페이스와 메소드
// -------------------------- 사진

// 리스너 등록 메소드가 addXXXListener인 이유
// 컴포넌트는 다른 이벤트에 대한 리스너를 동시에 가질수 있다.
// JButton.addActionListener(); // Action 리스너
// JButton.addKeyListener(); // Key 리스너
// JButton.addFocusLitener(); // Focus 리스너
// 컴포넌트는 한 이벤트에 대해 여러 개의 리스너를 동시에 가질 수 있다.
// JButton.addActionListener(new MyButtonListener1());
// JButton.addActionListener(new MyButtonListener2());
// JButton.addActionListener(new MyButtonListener3());
// 이때, 리스너는 등록된 반대 순으로 모두 실행된다.

// 이벤트 리스너 작성 방법 - 3가지 방법
// 독립 클래스로 작성
// -- 이벤트 리스너를 완전한 클래스로 작성
// -- 이벤트 리스너를 여러 곳에서 사용할 때 적합
// 내부 클래스로 작성
// -- 클래스 안에 멤버처럼 클래스 작성
// -- 이벤트 리스너를 특정 클래스에서만 사용할 떄 적합
// 익명 클래스로 작성
// -- 클래스의 이름 없이 간단히 리스너 작성
// -- 클래스 조차 만들 필요 없이 리스너 코드가 간단한 경우에 적합

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // c라는 객체를 찾고
		c.setLayout(new FlowLayout()); 
		
		JButton btn = new JButton("Action"); // 버튼 생성
		btn.addActionListener(new MyActionListener()); // Action 리스너 달기
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String [] args) { new IndepClassListener();
	}
}

class MyActionListener implements ActionListener { 
	public void actionPerformed(ActionEvent e) { 
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}

// 결과
// 버튼을 누르면 이름이 Action 과 액션 으로 바뀐다.

