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
		//public char charAt(int index):返回该字符串的指定索引处的字符值
		char a = str1.charAt(1);
		System.out.println(a);
		//public int compareTo(String anotherString):返回参与比较的两个字符串前后的ASCII码差值，用来做字符串大小比较。相等则返回0，小于则返回负数，大于则返回正数。
		//public int compareToIgnoreCase(String anotherString):方法功能同上，只不过是忽略大小写
		System.out.println("A".compareTo("a"));
		System.out.println("A".compareToIgnoreCase("a"));
		//public String concat(String str):用来进行两个字符串连接，等价于“+”
		System.out.println("A".concat("a"));
		//public boolean contains(CharSequence s):比较一个字符串是否包含另外一个字符串
		System.out.println(str1.contains("a"));
		//public boolean startsWith(String prefix):判断指定字符串是否以另一个字符串开头
		//public boolean startsWith(String prefix，int toffset):从指定索引向后查找，判断指定字符串是否以另一个字符串开头
		System.out.println(str1.startsWith("h"));
		System.out.println(str1.startsWith("e",1));
		//pubic boolean endsWith(String stuffix):判断指定字符串是否以另一个字符串结尾
		System.out.println(str1.endsWith("d"));
		//public boolean equals(Object anObject):用来判断两个字符串的内容是否一致
		//public boolean equalsIgnoreCase(Object anObject):用来判断两个字符串的内容是否一致，忽略大小写
		System.out.println("hello".equals("Hello"));
		System.out.println("hello".equalsIgnoreCase("Hello"));
		//public int indexOf(String str):从前开始查找，返回指定字符串str在原字符串的索引位置
		//public int indexOf(String str,int formIndex):从指定索引之后开始查找，返回指定字符串str在原字符串的索引位置
		//public int lastIndexOf(String str):从后开始查找，返回指定字符串str在原字符串的索引位置
		//public int lastIndexOf(String str,int formIndex):从指定索引之前开始查找，返回指定字符串str在原字符串的索引位置
		System.out.println("Helelo".indexOf("el"));
		System.out.println("Helelo".indexOf("el",2));
		System.out.println("Helelo".lastIndexOf("el"));
		System.out.println("Helelo".lastIndexOf("el",2));
		//public boolean isEmpty():判断一个字符串是否为空串，即“”
		System.out.println("".isEmpty());
		//pubic int length():返回指定字符串的长度
		System.out.println("hello".length());
		System.out.println("我爱我的家".length());
		//public String replace(charSequence target,charSequence replacement):对字符串指定子串进行替换，基于字符串替换
		//public String replaceAll(String regex,String replacement):对字符串指定子串进行替换，基于正则表达式替换
		//public String replaceFirst(String regex,String replacement):对字符串中指定子串第一项进行替换，基于正则表达式替换
		System.out.println("hello".replace("l", "a"));
		System.out.println("123a".replaceAll("[0-9]", "0"));
		System.out.println("hello".replaceFirst("l", "a"));
		//public String[] split(String regex):将字符串根据指定字串进行拆分形成字符串数组，基于正则表达式
		//public String[] split(String regex，int limit):将字符串根据指定字串进行拆分形成字符串数组，拆分为limit段，若limit小于等于零，那么进行无限次拆分，直至拆分结束，基于正则表达式
		System.out.println(Arrays.toString("bool:and:fool".split(":")));
		System.out.println(Arrays.toString("bool:and:fool".split(":",2)));
		//public String substring(int beginIndex):从指定索引处进行字符串截取
		//public String substring(int beginIndex,int endIndex):从指定索引范围进行字符串截取
		System.out.println("hello".substring(1));
		System.out.println("hello".substring(1,3));
		//public String toLowerCase():将指定字符串转化为小写（一般用于英文字符串）
		//public String toUpperCase():将指定字符串转化为大写（一般用于英文字符串）
		System.out.println("Hello".toLowerCase());
		System.out.println("Hello".toUpperCase());
		//public String trim():将指定字符串掐头去尾的去除空格，制表符等
		System.out.println("  ssss  ".trim());
		System.out.println("  ss  ss  ".trim());
		//public static String valueOf(其他类型数据)：将其他类型数据转化为字符串数据
		//public String toString():同上
		System.out.println(String.valueOf(1));
		System.out.println(new Integer(1).toString());
	}

}
