package cn.edu.ccut.test;

import static java.lang.Math.*;//JDK1.5

public class MathTest {

	public static void main(String[] args) {
		//�������ֵ
		System.out.println(abs(-12));
		//��ȡ���������ֵ����Сֵ
		System.out.println(max(12, 13));
		System.out.println(min(12, 13));
		//����ӷ�
		System.out.println(addExact(12, 13));
		//���������0.0 ~ 1.0
		System.out.println(random());
		//����1 ~ 10�������
		System.out.println((int)(10*random()));
		//��������(+0.5����ȡ��)
		System.out.println(round(-11.5));
		System.out.println(round(4.4));
	}

}
