package cn.edu.ccut.test;

import cn.edu.ccut.bo.Person;
import cn.edu.ccut.util.PersonUtil;

/**
 * GenerationObject
 * 
 * @author jwang
 *
 */
public class GenerationObject {

	public static void main(String[] args) {
		//No-parameter construction method
		Person person1 = new Person();
		System.out.println(person1);
		//Parametric construction method
		Person person2 = new Person("1", "张三", 23, "男", "上海市嘉定区");
		System.out.println(person2);
		//PersonUtil
		System.out.println(PersonUtil.getPerson());
	}

}
