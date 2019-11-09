package cn.edu.ccut.test;
/**
 * MethodRecursive
 * @author Administrator
 *
 */
public class MethodRecursive {

	public static void main(String[] args) {
		//數呾5腔論傚
		//5*4*3*2*1
		System.out.println(factorial(5));
	}
	
	//數呾論傚
	public static int factorial(int a){
		if(a == 1) {
			return 1;
		}else {
			return a*factorial(a-1);
		}
	}

}
