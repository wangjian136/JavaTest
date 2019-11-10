package cn.edu.ccut.test;
/**
 * AbstractClass
 * @author jwang
 *
 */
public abstract class AbstractClass {

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
