package cn.edu.ccut.test;
/**
 * ForStatement
 * for(��ʼ���ʽ;�������ʽ;��������){ѭ����}
 * for(�������� ������ �����󼯺�){ѭ����}
 * @author Administrator
 *
 */
public class ForStatement {

	public static void main(String[] args) {
		//��1~100�ĺ�
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
