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
		//public boolean add(E e):向集合中追加元素
		arrayList.add("hello");
		//public void add(int index,E element):向集合中指定索引位置添加元素,后面的元素自动向后移动
		arrayList.add(0, "world");
		System.out.println(arrayList);
		//public E remove(int index):删除指定索引位置的元素
		arrayList.remove(1);
		System.out.println(arrayList);
		//public boolean remove(Object o):删除特定的元素
		arrayList.remove("world2");
		System.out.println(arrayList);
		//public void clear():清空集合中所有元素
		//arrayList.clear();
		//public int size():获取集合中的元素个数
		System.out.println(arrayList.size());
		//public boolean isEmpty():判断是否为空集合，即size为0
		System.out.println(arrayList.isEmpty());
		//public boolean contains(Object o):判断集合中是否包含指定的元素，底层根据equals判断
		System.out.println(arrayList.contains("world"));
		arrayList.add("hello");
		arrayList.add(0,"hello");
		//public int indexOf(Object o):从前开始查找，返回指定对象在集合中的索引位置
		//public int lastIndexOf(Object o):从后开始查找，返回指定对象在集合中的索引位置
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf("hello"));
		System.out.println(arrayList.lastIndexOf("hello"));
		//public E get(int index):获得集合中指定索引的值
		System.out.println(arrayList.get(1));
		//public E set(int index,E element):替换指定索引位置的元素
		arrayList.set(2, "jwang");
		System.out.println(arrayList);
		//public Object[] toArray():将集合转化为对象数组
		System.out.println(Arrays.toString(arrayList.toArray()));
		//public List<E> subList(int fromIndex,int toIndex):截取指定索引段的集合对象,含头不含尾
		System.out.println(arrayList.subList(0, 2));
		//public boolean addAll(Collection<? extends E> c):添加另外一个集合中的所有元素
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
