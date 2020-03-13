package cn.edu.ccut.test;
/**
 * InterfaceClass
 * @author jwang
 *
 */
public interface InterfaceClass {
	//接口中字段的修饰符：public static final（默认不写）
	//接口中方法的修饰符：public abstract（默认不写）
	public void say();
	
}

interface InterfaceClass2 {

	public void play();
	
}
//Interface multiple inheritance
interface InterfaceClass3 extends InterfaceClass,InterfaceClass2{
	public void play();
}

//Multiple implementations of classes
class ImplClass2 implements InterfaceClass, InterfaceClass2{

	@Override
	public void say() {
		System.out.println("hello");
	}

	@Override
	public void play() {
		System.out.println("play");
	}
	
}

abstract class S{}
