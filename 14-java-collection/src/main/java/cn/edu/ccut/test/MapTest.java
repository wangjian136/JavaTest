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
		//public V put(K key,V value):添加指定的键值对数据到map中
		hashMap.put("1", "hello");
		//public V remove(Object key):删除指定key的键值对
		//hashMap.remove("1");
		//public void clear():清空map中的所有数据
		//hashMap.clear();
		System.out.println(hashMap);
		//public int size():返回map集合中的键值对数
		System.out.println(hashMap.size());
		//public boolean isEmpty():判断map集合是否为空，即size为0
		System.out.println(hashMap.isEmpty());
		//public V get(Object key):获取指定key的值
		System.out.println(hashMap.get("1"));
		//public boolean containsKey(Object key):判断集合中是否包含指定的key
		System.out.println(hashMap.containsKey("1"));
		//public boolean containsValue(Object value):判断集合中是否包含指定的value
		System.out.println(hashMap.containsValue("hello"));
		//public V replace(K key,V value):提换指定的key的值为value
		hashMap.replace("1", "world");
		System.out.println(hashMap);
		//public Set<K> keySet():获取map集合中所有key的Set集合,通常用于遍历
		for (String key : hashMap.keySet()) {
			System.out.println("key="+key+",value="+hashMap.get(key));
		}
		//public Set<Map.Entry<K,V>> entrySet():获得map集合中所有Entry的Set集合,通常用于遍历
		for (Map.Entry<String,String> entry : hashMap.entrySet()) {
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		//public Collection<V> values():获得map集合中所有value的集合
		for (String value : hashMap.values()) {
			System.out.println("value="+value);
		}
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		Map<String, Object> map2 = new TreeMap<String, Object>();
		Map<String, Object> map3 = new Hashtable<String, Object>();
	}

}
