package cn.edu.ccut.test;
/**
 * AbstractClass
 * @author jwang
 *
 */
public abstract class AbstractClass {
	
	int a;
	
	public AbstractClass() {
		// TODO Auto-generated constructor stub
	}

	public abstract void play();
	
	public void say() {
		System.out.println("hello");
	}
	
}

class ImplClass extends AbstractClass{

	@Override
	public void play() {
		System.out.println("play");
	}
	
	
}
//抽象类中可以没有抽象方法
abstract class Test01{
	private static void say() {
		System.out.println("hello");
	}
}
