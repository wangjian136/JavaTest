package cn.edu.ccut.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * SetList
 * @author jwang
 *
 */
public class SetList {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		//public boolean add(E e):�򼯺���׷��Ԫ��
		hashSet.add("hello");
		System.out.println(hashSet);
		//public boolean remove(Object o):ɾ���ض���Ԫ��
		hashSet.remove("world2");
		System.out.println(hashSet);
		//public void clear():��ռ���������Ԫ��
		//hashSet.clear();
		//public int size():��ȡ�����е�Ԫ�ظ���
		System.out.println(hashSet.size());
		//public boolean isEmpty():�ж��Ƿ�Ϊ�ռ��ϣ���sizeΪ0
		System.out.println(hashSet.isEmpty());
		//public boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ�أ��ײ����equals�ж�
		System.out.println(hashSet.contains("world"));
		hashSet.add("hello");
		System.out.println(hashSet);
		//public Object[] toArray():������ת��Ϊ��������
		System.out.println(Arrays.toString(hashSet.toArray()));
		//public boolean addAll(Collection<? extends E> c):�������һ�������е�����Ԫ��
		Set<String> newSet = new TreeSet<String>();
		newSet.add("china");
		hashSet.clear();
		hashSet.addAll(newSet);
		System.out.println(hashSet);
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
	}

}
