package cn.edu.ccut.test;
/**
 * WhileStatement
 * while(�������ʽ){ѭ����}
 * @author Administrator
 *
 */
public class WhileStatement {

	public static void main(String[] args) {
		//��1~100�ĺ�
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
