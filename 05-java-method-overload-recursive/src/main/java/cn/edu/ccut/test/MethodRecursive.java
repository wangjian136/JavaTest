package cn.edu.ccut.test;
/**
 * MethodRecursive
 * @author Administrator
 *
 */
public class MethodRecursive {

	public static void main(String[] args) {
		//����5�Ľ׳�
		//5*4*3*2*1
		System.out.println(factorial(5));
	}
	
	//����׳�
	public static int factorial(int a){
		if(a == 1) {
			return 1;
		}else {
			return a*factorial(a-1);
		}
	}

}
