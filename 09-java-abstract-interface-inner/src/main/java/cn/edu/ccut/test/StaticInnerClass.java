package cn.edu.ccut.test;
/**
 * StaticInnerClass
 * @author jwang
 *
 */
public class StaticInnerClass {
	
	public static void main(String[] args) {
		//声明内部类对象
		C.D d = new C.D();
		d.show();
	}
	
}

//外部类C
class C {
	private String name = "约翰";
	//内部类D
	static class D{
		private static int age = 10;
		
		public void show(){
			System.out.println(D.age);
		}
	}
	
	public void play(){
		//访问静态内部类的静态属性
		System.out.println(D.age);
	}
}