package cn.edu.ccut.test;
/**
 * InterfaceClass
 * @author jwang
 *
 */
public interface InterfaceClass {
	//�ӿ����ֶε����η���public static final��Ĭ�ϲ�д��
	//�ӿ��з��������η���public abstract��Ĭ�ϲ�д��
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
