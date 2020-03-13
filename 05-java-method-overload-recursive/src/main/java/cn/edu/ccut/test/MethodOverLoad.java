package cn.edu.ccut.test;
/**
 * MethodOverLoad
 * @author Administrator
 *
 */
public class MethodOverLoad {

	public static void main(String[] args) {
		//计算加法-->1+2
		System.out.println(add(1, 2));
		//计算加法-->1+2+3
		System.out.println(add(1, 2, 3));
		//计算加法-->3.2+4.8
		System.out.println(add(3.2, 4.8));
		//计算加法-->1+2+3+4+5
		System.out.println(add(1, 2, 3, 4, 5));
	}
	
	//计算两个整数的和
	public static int add(int a, int b){
		System.out.println("调用【计算两个整数的和】方法");
		return a + b;
	}
	
	//计算两个小数的和
	public static double add(double a, double b){
		System.out.println("调用【计算两个小数的和】方法");
		return a + b;
	}
	
	//计算三个整数的和
	public static int add(int a, int  b, int c){
		System.out.println("调用【计算三个整数的和】方法");
		return a + b + c;
	}
	//计算多个整数的和【JDK1.5可变参数】
	public static int add(int ... a){
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}

}
