package cn.edu.ccut.test;

/**
 * ConditionalOperator
 *  int a = 1 > 2 ? 3 : 4;
 *  1 > 2 ==> a = 3
 *  1 <= 2 ==> a = 4
 * @author jwang
 *
 */
public class ConditionalOperator {

	public static void main(String[] args) {
		int a = 1 > 2 ? 3 : 4;
		System.out.println("a = "+a);//4
	}

}
