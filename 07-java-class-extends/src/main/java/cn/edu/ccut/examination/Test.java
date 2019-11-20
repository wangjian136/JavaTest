package cn.edu.ccut.examination;

class Parent {
	public Parent(String str) {
		System.out.print("A");
	}
}

public class Test extends Parent{
	//子类构造方法会隐式的调用父类的无参构造方法，如果没有的话会编译失败，
	//必须使用super关键字显示调用其他构造方法
	public Test(String str) {
		super(str);
		System.out.print("B");
	}

	public static void main(String[] args) {
		new Test("C");
	}
}
