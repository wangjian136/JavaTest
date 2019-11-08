package cn.edu.ccut.test;

/**
 * ArithmeticOperator
 * +、-、*、/、%、++、--
 * @author jwang
 *
 */
public class ArithmeticOperator {

	public static void main(String[] args) {
		int result = 0;
		result = 3 + 4;//加
		System.out.println("3 + 4 = "+result);//7
		result = 3 - 4;//减
		System.out.println("3 - 4 = "+result);//-1
		result = 3 * 4;//乘
		System.out.println("3 * 4 = "+result);//12
		result = 4 / 3;//除
		System.out.println("4 / 3 = "+result);//1
		result = 4 % 3;//取余
		System.out.println("4 % 3 = "+result);//1
		result ++;//自增
		System.out.println("result++ = "+result);//2
		result --;//自减
		System.out.println("result-- = "+result);//1
	}

}
