package cn.edu.ccut.test;
/**
 * SwitchStatement
 * switch(���ʽ) {case ֵ1���������1��break; case ֵ2���������2��break;... default��Ĭ����䣻}
 * @author Administrator
 *
 */
public class SwitchStatement {

	public static void main(String[] args) {
		//��������Ϸ�����ӵ���1~6
		int num = (int)(Math.random() * 6) + 1;
		switch (num) {
		case 1:
			System.out.println("������1");
			break;
		case 2:
			System.out.println("������2");
			break;
		case 3:
			System.out.println("������3");
			break;
		case 4:
			System.out.println("������4");
			break;
		default:
			System.out.println("��������4");
			break;
		}
	}

}
