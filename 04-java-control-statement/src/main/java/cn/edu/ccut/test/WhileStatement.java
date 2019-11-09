package cn.edu.ccut.test;
/**
 * WhileStatement
 * while(布尔表达式){循环体}
 * @author Administrator
 *
 */
public class WhileStatement {

	public static void main(String[] args) {
		//求1~100的和
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
