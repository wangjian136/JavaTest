package cn.edu.ccut.test;
/**
 * IfStatement
 * if(布尔表达式){语句块}
 * @author Administrator
 *
 */
public class IfStatement {

	public static void main(String[] args) {
		int a = 2;
		if(a == 1) {
			System.out.println("hello1");
		}
		//语句体只有一条语句的时候，可以省略{}
		if(a == 2)
			System.out.println("hello2");
		if(a == 3)
			System.out.println("hello3");
		System.out.println("hello4");
	}

}
