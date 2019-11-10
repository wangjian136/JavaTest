package cn.edu.ccut.test;
/**
 * AnonymousInnerClass
 * @author jwang
 *
 */
public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		AnonymousInnerClass innerClass = new AnonymousInnerClass();
		innerClass.test(new E() {
			@Override
			public String show() {
				return "hello world";
			}
		});
	}
	
	public void test(E e){
		System.out.println(e.show());
	}

	
}

abstract class E{
	public abstract String show();
}