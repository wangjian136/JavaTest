package cn.edu.ccut.test;

import java.util.Arrays;

public class ArraysUtil {

	public static void main(String[] args) {
		String [] strs = {"hello","world","!"};
		//public static <T> List<T> asList(T... a):����������ת��ΪList����
		System.out.println(Arrays.asList(strs));
		//public static int binarySearch(Object[] a,Object key):ʹ���۰���ҵķ�ʽ�ڶ��������в���ָ������
		//����֪���۰���ҵ�ǰ����������Ҫ�������,����������ҳ������������ǲ�ȷ����
		//��������а�����������Ҷ���,���޷���֤���ҵ�����һ��
		int [] nums = {1,2,3,4,5};
		System.out.println(Arrays.binarySearch(nums, 3));
		//public static <T> T[] copyOf(T[] original,int newLength):�����������飬���ڲ������� System.arraycopy() ���������±� 0 ��ʼ���������ԭ���鳤�ȣ������ null �������
		String [] strs1 = Arrays.copyOf(strs, 2);
		System.out.println("str1="+Arrays.toString(strs1));
		String [] strs2 = Arrays.copyOf(strs, 5);
		System.out.println(Arrays.toString(strs2));
		//public static <T> T[] copyOfRange(T[] original,int from,int to):�����������飬ָ����ʼλ�ã��������ԭ���鳤�ȣ������ null �������
		String [] strs3 = Arrays.copyOfRange(strs, 0, 2);
		System.out.println("str3="+Arrays.toString(strs3));
		String [] strs4 = Arrays.copyOfRange(strs, 0, 4);
		System.out.println(Arrays.toString(strs4));
		//public static String toString(Object[] a):��������Ԫ�ص��ַ�����ʽ
		System.out.println(Arrays.toString(strs));
		//public static boolean equals(Object[] a,Object[] a2):�ж����������ֵ�Ƿ���ȣ����Դ˰�˳����бȽ�
		System.out.println(Arrays.equals(strs1, strs3));
		//public static void fill(Object[] a,Object val):��ָ��ֵȫ�����������
		//public static void fill(Object[] a,int fromIndex,int toIndex,Object val):��ָ��ֵȫ�����������ָ����������,ȡͷ��ȡβ
		String [] a = {"1","2","3"};
		Arrays.fill(a, "6");
		Arrays.fill(a, 0, 2, "8");
		System.out.println(Arrays.toString(a));
		//public static void sort(Object[] a):������Ԫ�ؽ������� (��������)
		int [] b = {1,4,2,6};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
