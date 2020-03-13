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
		//����ӷ�-->3.2+4.8
		System.out.println(add(3.2, 4.8));
		//����ӷ�-->1+2+3+4+5
		System.out.println(add(1, 2, 3, 4, 5));
	}
	
	//�������������ĺ�
	public static int add(int a, int b){
		System.out.println("���á��������������ĺ͡�����");
		return a + b;
	}
	
	//��������С���ĺ�
	public static double add(double a, double b){
		System.out.println("���á���������С���ĺ͡�����");
		return a + b;
	}
	
	//�������������ĺ�
	public static int add(int a, int  b, int c){
		System.out.println("���á��������������ĺ͡�����");
		return a + b + c;
	}
	//�����������ĺ͡�JDK1.5�ɱ������
	public static int add(int ... a){
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}

}
