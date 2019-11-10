package cn.edu.ccut.test;
/**
 * NonStaticInnerClass
 * @author jwang
 *
 */
public class NonStaticInnerClass {
	
	public static void main(String[] args) {
		//�����ڲ������
		A.B b = new A().new B();
		b.show();
	}
	
}

//�ⲿ��A
class A {
	private String name = "Լ��";
	//�ڲ���B
	class B{
		private int age = 10;
		
		public void show(){
			//�����ⲿ������
			System.out.println(A.this.name);
		}
	}
	
	public void play(){
		System.out.println(this.name);
	}
}
