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
		//计算加法-->1+2+3+4+5
		System.out.println(add(1, 2, 3, 4, 5));
	}
	
	//计算两个整数的和
	public static int add(int a, int  b){
		return a + b;
	}
	//计算三个整数的和
	public static int add(int a, int  b, int c){
		return a + b + c;
	}
	//计算多个整数的和
	public static int add(int ... a){
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}

}
