package cn.edu.ccut.test;
/**
 * IfElseStatement
 * if(�������ʽ){����1}else{����2}
 * @author Administrator
 *
 */
public class IfElseStatement {

	public static void main(String[] args) {
		//��������Ϸ�����ӵ���1~6
		int num = (int)(Math.random() * 6) + 1;
		if(num > 3) {
			System.out.println("���ˣ����������������");
		}else {
			System.out.println("���������������Ļ���������죡");
		}
	}

}
