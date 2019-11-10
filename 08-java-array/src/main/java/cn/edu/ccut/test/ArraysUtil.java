package cn.edu.ccut.test;

import java.util.Arrays;

public class ArraysUtil {

	public static void main(String[] args) {
		String [] strs = {"hello","world","!"};
		//public static <T> List<T> asList(T... a):将对象数组转化为List集合
		System.out.println(Arrays.asList(strs));
		//public static int binarySearch(Object[] a,Object key):使用折半查找的方式在对象数组中查找指定对象
		//我们知道折半查找的前提是数组需要是有序的,数组无序查找出来的索引将是不确定的
		//如果数组中包含多个待查找对象,将无法保证查找的是哪一个
		int [] nums = {1,2,3,4,5};
		System.out.println(Arrays.binarySearch(nums, 3));
		//public static <T> T[] copyOf(T[] original,int newLength):拷贝出新数组，其内部调用了 System.arraycopy() 方法，从下标 0 开始，如果超过原数组长度，则会用 null 进行填充
		String [] strs1 = Arrays.copyOf(strs, 2);
		System.out.println("str1="+Arrays.toString(strs1));
		String [] strs2 = Arrays.copyOf(strs, 5);
		System.out.println(Arrays.toString(strs2));
		//public static <T> T[] copyOfRange(T[] original,int from,int to):拷贝出新数组，指定起始位置，如果超过原数组长度，则会用 null 进行填充
		String [] strs3 = Arrays.copyOfRange(strs, 0, 2);
		System.out.println("str3="+Arrays.toString(strs3));
		String [] strs4 = Arrays.copyOfRange(strs, 0, 4);
		System.out.println(Arrays.toString(strs4));
		//public static String toString(Object[] a):返回数组元素的字符串形式
		System.out.println(Arrays.toString(strs));
		//public static boolean equals(Object[] a,Object[] a2):判断两个数组的值是否相等，将以此按顺序进行比较
		System.out.println(Arrays.equals(strs1, strs3));
		//public static void fill(Object[] a,Object val):将指定值全部填充至数组
		//public static void fill(Object[] a,int fromIndex,int toIndex,Object val):将指定值全部填充至数组指定索引区间,取头不取尾
		String [] a = {"1","2","3"};
		Arrays.fill(a, "6");
		Arrays.fill(a, 0, 2, "8");
		System.out.println(Arrays.toString(a));
		//public static void sort(Object[] a):对数组元素进行排序 (串行排序)
		int [] b = {1,4,2,6};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
