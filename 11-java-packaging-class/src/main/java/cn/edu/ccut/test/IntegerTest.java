package cn.edu.ccut.test;
/**
 * IntegerTest
 * @author jwang
 *
 */
public class IntegerTest {

	public static void main(String[] args) {
		//public Integer(int value):���췽��,JDK1.5֮����Զ�װ��
		Integer a = new Integer(1);// Integer a = 1;
		//public int intValue():��Integer����ת��Ϊint,JDK1.5֮����Զ�����
		int b = a;
		//public static Integer valueOf(int i):��intת��ΪInteger,JDK1.5֮����Զ�װ�䣨Ĭ��ʹ�ø÷�����
		//This method will always cache values in the range -128 to 127
		int c = 5;
		Integer d = Integer.valueOf(c);//Integer d = c;
		//public static int parseInt(String s):���ַ���ת��Ϊint��ע������׳��ַ���ƥ���쳣
		System.out.println(Integer.parseInt("5"));
	}

}
