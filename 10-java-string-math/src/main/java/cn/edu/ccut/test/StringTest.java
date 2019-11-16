package cn.edu.ccut.test;

import java.util.Arrays;

/**
 * StringTest
 * @author jwang
 *
 */
public class StringTest {

	public static void main(String[] args) {
		String str1 = "hello world";
		//public char charAt(int index):���ظ��ַ�����ָ�����������ַ�ֵ
		char a = str1.charAt(1);
		System.out.println(a);
		//public int compareTo(String anotherString):���ز���Ƚϵ������ַ���ǰ���ASCII���ֵ���������ַ�����С�Ƚϡ�����򷵻�0��С���򷵻ظ����������򷵻�������
		//public int compareToIgnoreCase(String anotherString):��������ͬ�ϣ�ֻ�����Ǻ��Դ�Сд
		System.out.println("A".compareTo("a"));
		System.out.println("A".compareToIgnoreCase("a"));
		//public String concat(String str):�������������ַ������ӣ��ȼ��ڡ�+��
		System.out.println("A".concat("a"));
		//public boolean contains(CharSequence s):�Ƚ�һ���ַ����Ƿ��������һ���ַ���
		System.out.println(str1.contains("a"));
		//public boolean startsWith(String prefix):�ж�ָ���ַ����Ƿ�����һ���ַ�����ͷ
		//public boolean startsWith(String prefix��int toffset):��ָ�����������ң��ж�ָ���ַ����Ƿ�����һ���ַ�����ͷ
		System.out.println(str1.startsWith("h"));
		System.out.println(str1.startsWith("e",1));
		//pubic boolean endsWith(String stuffix):�ж�ָ���ַ����Ƿ�����һ���ַ�����β
		System.out.println(str1.endsWith("d"));
		//public boolean equals(Object anObject):�����ж������ַ����������Ƿ�һ��
		//public boolean equalsIgnoreCase(Object anObject):�����ж������ַ����������Ƿ�һ�£����Դ�Сд
		System.out.println("hello".equals("Hello"));
		System.out.println("hello".equalsIgnoreCase("Hello"));
		//public int indexOf(String str):��ǰ��ʼ���ң�����ָ���ַ���str��ԭ�ַ���������λ��
		//public int indexOf(String str,int formIndex):��ָ������֮��ʼ���ң�����ָ���ַ���str��ԭ�ַ���������λ��
		//public int lastIndexOf(String str):�Ӻ�ʼ���ң�����ָ���ַ���str��ԭ�ַ���������λ��
		//public int lastIndexOf(String str,int formIndex):��ָ������֮ǰ��ʼ���ң�����ָ���ַ���str��ԭ�ַ���������λ��
		System.out.println("Helelo".indexOf("el"));
		System.out.println("Helelo".indexOf("el",2));
		System.out.println("Helelo".lastIndexOf("el"));
		System.out.println("Helelo".lastIndexOf("el",2));
		//public boolean isEmpty():�ж�һ���ַ����Ƿ�Ϊ�մ���������
		System.out.println("".isEmpty());
		//pubic int length():����ָ���ַ����ĳ���
		System.out.println("hello".length());
		System.out.println("�Ұ��ҵļ�".length());
		//public String replace(charSequence target,charSequence replacement):���ַ���ָ���Ӵ������滻�������ַ����滻
		//public String replaceAll(String regex,String replacement):���ַ���ָ���Ӵ������滻������������ʽ�滻
		//public String replaceFirst(String regex,String replacement):���ַ�����ָ���Ӵ���һ������滻������������ʽ�滻
		System.out.println("hello".replace("l", "a"));
		System.out.println("123a".replaceAll("[0-9]", "0"));
		System.out.println("hello".replaceFirst("l", "a"));
		//public String[] split(String regex):���ַ�������ָ���ִ����в���γ��ַ������飬����������ʽ
		//public String[] split(String regex��int limit):���ַ�������ָ���ִ����в���γ��ַ������飬���Ϊlimit�Σ���limitС�ڵ����㣬��ô�������޴β�֣�ֱ����ֽ���������������ʽ
		System.out.println(Arrays.toString("bool:and:fool".split(":")));
		System.out.println(Arrays.toString("bool:and:fool".split(":",2)));
		//public String substring(int beginIndex):��ָ�������������ַ�����ȡ
		//public String substring(int beginIndex,int endIndex):��ָ��������Χ�����ַ�����ȡ
		System.out.println("hello".substring(1));
		System.out.println("hello".substring(1,3));
		//public String toLowerCase():��ָ���ַ���ת��ΪСд��һ������Ӣ���ַ�����
		//public String toUpperCase():��ָ���ַ���ת��Ϊ��д��һ������Ӣ���ַ�����
		System.out.println("Hello".toLowerCase());
		System.out.println("Hello".toUpperCase());
		//public String trim():��ָ���ַ�����ͷȥβ��ȥ���ո��Ʊ����
		System.out.println("  ssss  ".trim());
		System.out.println("  ss  ss  ".trim());
		//public static String valueOf(������������)����������������ת��Ϊ�ַ�������
		//public String toString():ͬ��
		System.out.println(String.valueOf(1));
		System.out.println(new Integer(1).toString());
	}

}
