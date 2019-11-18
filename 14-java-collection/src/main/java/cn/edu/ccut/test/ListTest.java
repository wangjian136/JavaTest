package cn.edu.ccut.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * ListTest
 * @author jwang
 *
 */
public class ListTest {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		//public boolean add(E e):�򼯺���׷��Ԫ��
		arrayList.add("hello");
		//public void add(int index,E element):�򼯺���ָ������λ�����Ԫ��,�����Ԫ���Զ�����ƶ�
		arrayList.add(0, "world");
		System.out.println(arrayList);
		//public E remove(int index):ɾ��ָ������λ�õ�Ԫ��
		arrayList.remove(1);
		System.out.println(arrayList);
		//public boolean remove(Object o):ɾ���ض���Ԫ��
		arrayList.remove("world2");
		System.out.println(arrayList);
		//public void clear():��ռ���������Ԫ��
		//arrayList.clear();
		//public int size():��ȡ�����е�Ԫ�ظ���
		System.out.println(arrayList.size());
		//public boolean isEmpty():�ж��Ƿ�Ϊ�ռ��ϣ���sizeΪ0
		System.out.println(arrayList.isEmpty());
		//public boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ�أ��ײ����equals�ж�
		System.out.println(arrayList.contains("world"));
		arrayList.add("hello");
		arrayList.add(0,"hello");
		//public int indexOf(Object o):��ǰ��ʼ���ң�����ָ�������ڼ����е�����λ��
		//public int lastIndexOf(Object o):�Ӻ�ʼ���ң�����ָ�������ڼ����е�����λ��
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf("hello"));
		System.out.println(arrayList.lastIndexOf("hello"));
		//public E get(int index):��ü�����ָ��������ֵ
		System.out.println(arrayList.get(1));
		//public E set(int index,E element):�滻ָ������λ�õ�Ԫ��
		arrayList.set(2, "jwang");
		System.out.println(arrayList);
		//public Object[] toArray():������ת��Ϊ��������
		System.out.println(Arrays.toString(arrayList.toArray()));
		//public List<E> subList(int fromIndex,int toIndex):��ȡָ�������εļ��϶���,��ͷ����β
		System.out.println(arrayList.subList(0, 2));
		//public boolean addAll(Collection<? extends E> c):�������һ�������е�����Ԫ��
		List<String> v = new Vector<String>();
		List<String> newList = new LinkedList<String>();
		newList.add("china");
		arrayList.clear();
		arrayList.addAll(newList);
		System.out.println(arrayList);
		
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}

}
