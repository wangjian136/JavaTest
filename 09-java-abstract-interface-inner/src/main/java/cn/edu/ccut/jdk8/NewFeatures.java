package cn.edu.ccut.jdk8;

public class NewFeatures {

	public static void main(String[] args) {
		A.play2();
	}
}

interface A{
	//JDK1.8֮ǰֻ��������󷽷�
	public int add(int a,int b);
	//JDK1.8��������չ����  ʹ��default�ؼ���
	public default void play1() {
		System.out.println("JDK1.8�����ԣ�");
	}
	//JDK1.8����̬��չ����  ʹ��static�ؼ���
	public static void play2() {
		System.out.println("JDK1.8�����ԣ�");
	}
}
