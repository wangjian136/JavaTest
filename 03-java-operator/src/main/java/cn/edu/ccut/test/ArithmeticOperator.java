package cn.edu.ccut.test;

/**
 * ArithmeticOperator
 * +��-��*��/��%��++��--
 * @author jwang
 *
 */
public class ArithmeticOperator {

	public static void main(String[] args) {
		int result = 0;
		result = 3 + 4;//��
		System.out.println("3 + 4 = "+result);//7
		result = 3 - 4;//��
		System.out.println("3 - 4 = "+result);//-1
		result = 3 * 4;//��
		System.out.println("3 * 4 = "+result);//12
		result = 4 / 3;//��
		System.out.println("4 / 3 = "+result);//1
		result = 4 % 3;//ȡ��
		System.out.println("4 % 3 = "+result);//1
		result ++;//����
		System.out.println("result++ = "+result);//2
		result --;//�Լ�
		System.out.println("result-- = "+result);//1
	}

}
