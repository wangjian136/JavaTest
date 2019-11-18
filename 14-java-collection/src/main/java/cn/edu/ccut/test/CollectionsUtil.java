package cn.edu.ccut.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * CollectionsUtil
 * @author jwang
 *
 */
public class CollectionsUtil {

	public static void main(String[] args) {
		//public static <T> boolean addAll(Collection<? super T> c,T... elements):������Ԫ����ӵ�������
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,3,2,4);
		System.out.println(list);
		//public static <T extends Comparable<? super T>> void sort(List<T> list):�Լ��Ͻ�������(��������)
		Collections.sort(list);
		System.out.println(list);
		//public static <T> int binarySearch(List<? extends Comparable<? super T>> list,T key):���ַ�����ָ��ֵ����
		System.out.println(Collections.binarySearch(list, 3));
		//public static <T> void sort(List<T> list,Comparator<? super T> c):��������������򣬱��絹������
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1==o2?0:(o1>o2?-1:1);
			}
		});
		//Collections.sort(list,(o1,o2)->{return o1==o2?0:(o1>o2?-1:1);});
		System.out.println(list);
	}

}
