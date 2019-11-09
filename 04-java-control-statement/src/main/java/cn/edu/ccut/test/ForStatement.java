package cn.edu.ccut.test;
/**
 * ForStatement
 * for(初始表达式;布尔表达式;迭代因子){循环体}
 * for(对象类型 变量名 ：对象集合){循环体}
 * @author Administrator
 *
 */
public class ForStatement {

	public static void main(String[] args) {
		//求1~100的和
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		//foreach by JDK1.5
		int [] ins = {1,2,3,4,5,6};
		for(int i : ins) {
			System.out.print(i);
		}
	}

}
