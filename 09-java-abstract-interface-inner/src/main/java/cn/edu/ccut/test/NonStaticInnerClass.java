package cn.edu.ccut.test;
/**
 * NonStaticInnerClass
 * @author jwang
 *
 */
public class NonStaticInnerClass {
	
	public static void main(String[] args) {
		//声明内部类对象
		A.B b = new A().new B();
		b.show();
	}
	
}

//外部类A
class A {
	private String name = "约翰";
	//内部类B
	class B{
		private int age = 10;
		
		public void show(){
			//调用外部类属性
			System.out.println(A.this.name);
		}
	}
	
	public void play(){
		System.out.println(this.name);
	}
}
