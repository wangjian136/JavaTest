package cn.edu.ccut.jdk8;

public class NewFeatures {

	public static void main(String[] args) {
		A.play2();
	}
}

interface A{
	//JDK1.8之前只允许定义抽象方法
	public int add(int a,int b);
	//JDK1.8允许定义扩展方法  使用default关键字
	public default void play1() {
		System.out.println("JDK1.8新特性！");
	}
	//JDK1.8允许静态扩展方法  使用static关键字
	public static void play2() {
		System.out.println("JDK1.8新特性！");
	}
}
