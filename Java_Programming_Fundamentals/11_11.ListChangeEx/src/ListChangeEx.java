// 리스트의 아이템 변경

// JList<E>의 특징
// JList<E>(Vector listData)나 JList<E>(Object [] listData)로 리스트가 생성되고 나면 벡터나 배열을 수정해도 리스트 수정 안됨

// 리스트를 수정하는 간단한 방법

// JList<E>의 setListData()를 호출
// 리스트에 수정된 벡터나 배열을 새로 달아주는 방법
// 예)
// Vector<String> v = new Vector<String>();
// v.add("황기태"); v.add("이재문");
// JList<String> nameList = new JList<String>(v);

// 벡터 v를 수정하고, 벡터 v를 리스트에 다시 달기
// v.add("김남윤");
// nameList.setListData(v);

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ListChangeEx extends JFrame {
	private JTextField tf = new JTextField(10);
	private Vector<String> v = new Vector<String>();
	private JList<String> nameList = new JList<String>(v);
	
	public ListChangeEx() {
		setTitle("리스트 변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 입력 후 <Enter> 키"));
		
		c.add(tf);
		
		v.add("황기태");
		v.add("이재문");

		nameList.setVisibleRowCount(5);
		nameList.setFixedCellWidth(100);
		
		c.add(new JScrollPane(nameList));

		setSize(300,300);
		setVisible(true);
		
		//JTextField에 ActionLister 등록. <Enter> 키 처리
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource(); // 입력된 값 불러오기
				v.add(t.getText());
				t.setText(""); // 입력된 값 리셋
				nameList.setListData(v);
			}
		});
	}
	public static void main(String [] args) {
		new ListChangeEx();
	}
}