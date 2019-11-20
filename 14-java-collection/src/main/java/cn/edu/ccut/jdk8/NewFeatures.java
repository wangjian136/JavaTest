package cn.edu.ccut.jdk8;

import java.util.ArrayList;
import java.util.List;
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
		list.forEach(t->System.out.println(t));
	}

}
