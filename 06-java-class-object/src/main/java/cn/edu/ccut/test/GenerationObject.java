package cn.edu.ccut.test;

import cn.edu.ccut.bo.Person;

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
		Person person2 = new Person("1", "����", 23, "��", "�Ϻ��мζ���");
		System.out.println(person2);
	}

}
