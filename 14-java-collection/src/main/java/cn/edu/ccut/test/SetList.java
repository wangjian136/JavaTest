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
		//public boolean add(E e):向集合中追加元素
		hashSet.add("hello");
		System.out.println(hashSet);
		//public boolean remove(Object o):删除特定的元素
		hashSet.remove("world2");
		System.out.println(hashSet);
		//public void clear():清空集合中所有元素
		//hashSet.clear();
		//public int size():获取集合中的元素个数
		System.out.println(hashSet.size());
		//public boolean isEmpty():判断是否为空集合，即size为0
		System.out.println(hashSet.isEmpty());
		//public boolean contains(Object o):判断集合中是否包含指定的元素，底层根据equals判断
		System.out.println(hashSet.contains("world"));
		hashSet.add("hello");
		System.out.println(hashSet);
		//public Object[] toArray():将集合转化为对象数组
		System.out.println(Arrays.toString(hashSet.toArray()));
		//public boolean addAll(Collection<? extends E> c):添加另外一个集合中的所有元素
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
