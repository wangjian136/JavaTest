package cn.edu.ccut.test;
/**
 * Method
 * *【修饰符1 修饰符2 ...】 返回值类型 方法名（形参1，形参2...）{方法体}
 * @author Administrator
 *
 */
public class Method {

	public static void main(String[] args) {
		//计算加法-->1+2
		System.out.println(add(1, 2));
	}
	//用于计算加法的方法
	public static int add(int a, int  b){
		return a + b;
	}

}
