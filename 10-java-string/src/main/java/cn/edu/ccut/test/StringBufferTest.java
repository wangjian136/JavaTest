package cn.edu.ccut.test;

/**
 * StringBufferTest
 * @author jwang
 *
 */
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("hello");
		//public StringBuffer append(String str):���ַ�����׷���µ��ַ���
		System.out.println(sf.append(" world"));
		//public StringBuffer insert(int offset,String str):��ָ�������������Ӧ���ַ���
		System.out.println(sf.insert(1, "gg"));
		//public StringBuffer reverse():��ָ�����ַ������з�ת����abcd��ת��Ϊdcba
		System.out.println(sf.reverse());
		//public StringBuffer delete(int start,int end):ɾ��ָ������������ַ���
		System.out.println(sf.delete(0, 2));
	}

}
