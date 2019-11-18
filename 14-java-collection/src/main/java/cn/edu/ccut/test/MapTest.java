package cn.edu.ccut.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/**
 * MapTest
 * @author jwang
 *
 */
public class MapTest {

	public static void main(String[] args) {
		Map<String,String> hashMap = new HashMap<String, String>();
		//public V put(K key,V value):���ָ���ļ�ֵ�����ݵ�map��
		hashMap.put("1", "hello");
		//public V remove(Object key):ɾ��ָ��key�ļ�ֵ��
		//hashMap.remove("1");
		//public void clear():���map�е���������
		//hashMap.clear();
		System.out.println(hashMap);
		//public int size():����map�����еļ�ֵ����
		System.out.println(hashMap.size());
		//public boolean isEmpty():�ж�map�����Ƿ�Ϊ�գ���sizeΪ0
		System.out.println(hashMap.isEmpty());
		//public V get(Object key):��ȡָ��key��ֵ
		System.out.println(hashMap.get("1"));
		//public boolean containsKey(Object key):�жϼ������Ƿ����ָ����key
		System.out.println(hashMap.containsKey("1"));
		//public boolean containsValue(Object value):�жϼ������Ƿ����ָ����value
		System.out.println(hashMap.containsValue("hello"));
		//public V replace(K key,V value):�ỻָ����key��ֵΪvalue
		hashMap.replace("1", "world");
		System.out.println(hashMap);
		//public Set<K> keySet():��ȡmap����������key��Set����,ͨ�����ڱ���
		for (String key : hashMap.keySet()) {
			System.out.println("key="+key+",value="+hashMap.get(key));
		}
		//public Set<Map.Entry<K,V>> entrySet():���map����������Entry��Set����,ͨ�����ڱ���
		for (Map.Entry<String,String> entry : hashMap.entrySet()) {
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		//public Collection<V> values():���map����������value�ļ���
		for (String value : hashMap.values()) {
			System.out.println("value="+value);
		}
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		Map<String, Object> map2 = new TreeMap<String, Object>();
		Map<String, Object> map3 = new Hashtable<String, Object>();
	}

}
