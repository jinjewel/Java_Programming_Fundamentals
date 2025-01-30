package lib;

// 다른 패키지에서 Calculator 클래스에 접근하도록 하기 위해 public으로 선언
public abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
