package cn.edu.ccut.examination;

class Parent {
	public Parent(String str) {
		System.out.print("A");
	}
}

public class Test extends Parent{
	//���๹�췽������ʽ�ĵ��ø�����޲ι��췽�������û�еĻ������ʧ�ܣ�
	//����ʹ��super�ؼ�����ʾ�����������췽��
	public Test(String str) {
		super(str);
		System.out.print("B");
	}

	public static void main(String[] args) {
		new Test("C");
	}
}
