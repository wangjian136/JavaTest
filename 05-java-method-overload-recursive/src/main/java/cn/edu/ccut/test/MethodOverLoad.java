package cn.edu.ccut.test;
/**
 * MethodOverLoad
 * @author Administrator
 *
 */
public class MethodOverLoad {

	public static void main(String[] args) {
		//����ӷ�-->1+2
		System.out.println(add(1, 2));
		//����ӷ�-->1+2+3
		System.out.println(add(1, 2, 3));
		//����ӷ�-->1+2+3+4+5
		System.out.println(add(1, 2, 3, 4, 5));
	}
	
	//�������������ĺ�
	public static int add(int a, int  b){
		return a + b;
	}
	//�������������ĺ�
	public static int add(int a, int  b, int c){
		return a + b + c;
	}
	//�����������ĺ�
	public static int add(int ... a){
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}

}
