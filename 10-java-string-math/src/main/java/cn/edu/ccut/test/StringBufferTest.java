package cn.edu.ccut.test;

/**
 * StringBufferTest
 * @author jwang
 *
 */
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("hello");
		//public StringBuffer append(String str):在字符串后追加新的字符串
		System.out.println(sf.append(" world"));
		//public StringBuffer insert(int offset,String str):在指定索引处插入对应的字符串
		System.out.println(sf.insert(1, "gg"));
		//public StringBuffer reverse():将指定的字符串进行翻转，如abcd翻转后为dcba
		System.out.println(sf.reverse());
		//public StringBuffer delete(int start,int end):删除指定索引区间的字符串
		System.out.println(sf.delete(0, 2));
	}

}
