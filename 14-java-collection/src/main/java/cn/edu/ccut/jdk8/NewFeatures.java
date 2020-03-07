package cn.edu.ccut.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * NewFeatures
 * @author jwang
 *
 */
public class NewFeatures {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("2");
		list.add("3");
		list.add("3");
		list.add("4");
		//list.forEach(System.out::println);
		
		//stream
		//¹ıÂË
		Stream<String> stream = list.stream();
		Stream<String> stream2 = stream.filter(data -> data.equals("3"));
		//stream2.forEach(System.out::println);
		//È¥ÖØ
		Stream<String> stream3 = list.stream();
		//stream3.distinct().forEach(System.out::println);
		
		System.out.println(stream3.collect(Collectors.toList()));
	}

}
