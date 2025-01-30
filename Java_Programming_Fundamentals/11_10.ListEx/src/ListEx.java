// JList<E>, 리스트 컴포넌트

// JList<E>, 리스트 컴포넌트란?
// 여러 개의 아이템을 리스트 형식으로 보여주고 선택하는 컴포넌트
// JComboBox<E>와 기본적으로 같은 기능
// JScrollPane에 JList<E>를 삽입하여 스크롤 가능

// JList<E>
// JDK7부터 제네릭 리스트로 바뀜
// <E>에 지정된 타입의 객체만 저장하는 리스트

// 생성자
// JList<E>() 빈리스트
// JList<E>(Vextor ListData) 벡터로부터 아이템을 공급받는 리스트
// JList<E>(Object [] ListData) 배열로부터 아이템을 공급받는 리스트

// 리스트를 생성하는 방법

// 1. 객체 배열로 아이템 제공
// String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
// JList<String> strList = new JList<String>(fruits);

// 2. Vector로 아이템 제공
// Vector v = new Vector();
// v.add("apple"); v.add("banana"); v.add("kiwi");
// JList<String> vList = new JList<String>(v);

// 3. 빈 JList 컴포넌트를 생성하고 setListData()로 아이템 제공
// ImageIcon [] images = {new ImageIcon("images/icon1.png"),
// new ImageIcon("images/icon2.png"),
// new ImageIcon("images/icon3.png"),
// new ImageIcon("images/icon4.png")};
// JList<ImageIcon> imageList = new JList<ImageIcon>();
// imageList.setListData(images); // 이미지 배열 추가

// 4. 스크롤 지원
// JList<String> scrollList = new JList<String>(fruits);
// new JScrollPane(scrollList);

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	private String [] fruits= {"apple", "banana", "kiwi", "mango", "pear","peach", "berry", "strawberry", "blackberry"};
	private ImageIcon [] images = {
			new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\apple.jpg"), 
			new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\pear.jpg"), 
			new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\cherry.jpg"),
			new ImageIcon("C:\\Users\\User\\Desktop\\자바 프로그래밍 기초\\강의자료\\기말\\자바 11차시 사용 이미지 모음\\mango.jpg") };
	public ListEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JList<String> strList = new JList<String>(fruits);
		c.add(strList);

		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ListEx();
	}
}