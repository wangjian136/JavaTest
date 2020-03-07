package cn.edu.ccut.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NewFeatures2 {

	public static void main(String[] args) {
		//JDK1.8之前实现集合倒排序
//		List<Integer> result = new ArrayList<>();
//		result.add(2);
//		result.add(3);
//		result.add(1);
//		Collections.sort(result, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});
//		for (Integer a : result) {
//			System.out.println(a);
//		}
		
		//JDK1.8之后实现数字集合倒排序
		List<Integer> result = new ArrayList<>();
		result.add(2);
		result.add(3);
		result.add(1);
		Collections.sort(result, (o1,o2)-> o2 - o1);
		result.forEach(System.out::println);
	}
}
