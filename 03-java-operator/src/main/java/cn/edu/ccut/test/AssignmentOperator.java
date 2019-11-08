package cn.edu.ccut.test;

/**
 * AssignmentOperator
 * =、+=、-=、/=、*=、%=
 * @author jwang
 *
 */
public class AssignmentOperator {

	public static void main(String[] args) {
		int result = 1;//等于
		System.out.println("result = "+result);//1
		result += 2;//加等于
		//result = result + 2;
		System.out.println("result = "+result);//3
		result -= 2;//减等于
		//result = result - 2;
		System.out.println("result = "+result);//1
		result *= 2;//乘等于
		//result = result * 2;
		System.out.println("result = "+result);//2
		result /= 2;//除等于
		//result = result / 2;
		System.out.println("result = "+result);//1
		result %= 2;//取余等于
		//result = result % 2;
		System.out.println("result = "+result);//1
	}

}
