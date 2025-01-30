// JCheckBox에서 Item 이벤트 처리

// Item 이벤트
// 체크 박스나 라디오버튼의 선택 상태가 바뀔 발생하는 이벤트
// JCheckBox c = new JCheckBox("사과");
// c.setSelected(true); // 선택 상태 변경

// ItemListener 인터페이스의 추상 메소드
// void itemStateChanged(ItemEvent e) 체크박스의 선택/해제 상태가 변하는 경우 호출

// ItemEvent의 주요 메소드
// int getStateChange()
// 리턴값은 선택된 경우 ItemEvent.SELECTED, 해체된 경우 ItemEvent.DESELECTED
// object getItem()
// 이벤트를 발생시킨 아이템 객체 리턴, 체크박스의 경우 JCheckBox 컴포넌트의 레퍼런스 리턴

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	
	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"사과", "배", "체리"};
	private JLabel sumLabel; 
	
	class MyItemListener implements ItemListener {
		private int sum = 0; // 가격의 합
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) 
					sum += 100; 
				else if(e.getItem() == fruits[1]) 
					sum += 500; 
				else
					sum += 20000;
			}
			else {
				if(e.getItem() == fruits[0]) 
					sum -= 100; 
				else if(e.getItem() == fruits[1]) 
					sum -= 500; 
				else
					sum -= 20000;
			}
			
			sumLabel.setText("현재 "+ sum + "원 입니다.");
		}
	}
	public CheckBoxItemEventEx() { 
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		MyItemListener listener = new MyItemListener(); // ItemListener 인터페이스의 추상 메소드
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); 
			fruits[i].setBorderPainted(true); 
			fruits[i].addItemListener(listener);
			c.add(fruits[i]);
		}
		
		sumLabel = new JLabel("현재 0 원 입니다."); 
		c.add(sumLabel); 
		
		setSize(250,200); 
		setVisible(true);
	}
	public static void main(String [] args) { 
		new CheckBoxItemEventEx();
	}
}