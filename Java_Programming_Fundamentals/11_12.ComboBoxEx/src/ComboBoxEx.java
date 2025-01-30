// JComboBox<E>, 콤보박스 컴포넌트

// JComboBox<E>, 콤보박스란?
// 텍스트 필드와 버튼 그리고 드롭다운 리스트로 구성

// 생성자
// JComboBox<E>() 빈 콤보박스
// JComboBox<E>(Vector ListData) 벡터로부터 아이템을 공급받는 콤보박스
// JComboBox<E>(Object [] listData) 배열로부터 아이템을 공급받는 콤보박스

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear","peach", "berry", "strawberry", "blackberry"};
	private String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
	public ComboBoxEx() {
		setTitle("콤보박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]); // additem()메소드를 호출하여 아이템 동적 삽입
		c.add(nameCombo);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ComboBoxEx();
	}
}