package cn.edu.ccut.test;
/**
 * IntegerTest
 * @author jwang
 *
 */
public class IntegerTest {

	public static void main(String[] args) {
		//public Integer(int value):构造方法,JDK1.5之后可自动装箱
		Integer a = new Integer(1);// Integer a = 1;
		//public int intValue():将Integer类型转化为int,JDK1.5之后可自动拆箱
		int b = a;
		//public static Integer valueOf(int i):将int转化为Integer,JDK1.5之后可自动装箱（默认使用该方法）
		//This method will always cache values in the range -128 to 127
		int c = 5;
		Integer d = Integer.valueOf(c);//Integer d = c;
		//public static int parseInt(String s):将字符串转化为int，注意可能抛出字符串匹配异常
		System.out.println(Integer.parseInt("5"));
	}

}
