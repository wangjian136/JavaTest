package cn.edu.ccut.test;
/**
 * IfElseIfElseStatement
 * if(�������ʽ1){����1}else if(�������ʽ2){����2}...else{����n}
 * @author Administrator
 *
 */
public class IfElseIfElseStatement {

	public static void main(String[] args) {
		//��������Ϸ�����ӵ���1~6
		int num = (int)(Math.random() * 6) + 1;
		if(num < 2) {
			System.out.println("����С��2");
		}else if(num < 5){
			System.out.println("�������ڵ���2��С��5");
		}else {
			System.out.println("��������5");
		}
	}

}
