package cn.edu.ccut.test;

/**
 * RelationalOperator
 * ==、!=、<、<=、>、>=
 * @author jwang
 *
 */
public class RelationalOperator {

	public static void main(String[] args) {
		boolean result = 1 == 1;//相等
		System.out.println("result = "+result);//true
		result = 1 != 1;//不等于
		System.out.println("result = "+result);//false
		result = 1 < 2;//小于
		System.out.println("result = "+result);//true
		result = 1 <= 0;//小于等于
		System.out.println("result = "+result);//false
		result = 1 > 0;//大于
		System.out.println("result = "+result);//true
		result = 1 >= 0;//大于等于
		System.out.println("result = "+result);//true
	}

}
