package cn.edu.ccut.test;
/**
 * InstanceOf
 * @author jwang
 *
 */
public class InstanceOf {

	public static void main(String[] args) {
		AA a = new AAB();
		AAB b = new AAB();
		AAC c = new AAC();
		System.out.println(a instanceof AA);
		System.out.println(b instanceof AA);
		System.out.println(c instanceof AAC);
	}

}

interface AA{
	
}

class AAB implements AA{
	
}

class AAC implements AA{
	
}

