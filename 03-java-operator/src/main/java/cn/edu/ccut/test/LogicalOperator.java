package cn.edu.ccut.test;

/**
 * LogicalOperator
 *  &&（与）、||（或）、!（非）、&（逻辑与）、|（逻辑或）、^（逻辑异或）
 * @author jwang
 *
 */
public class LogicalOperator {

	public static void main(String[] args) {
		boolean result = false;
		System.out.println("result = "+(1==1 && 1==2));//false
		System.out.println("result = "+(1==1 && 1==1));//true
		System.out.println("result = "+(1==3 || 1==2));//false
		System.out.println("result = "+(1==1 || 1==2));//true
		System.out.println("result = "+!(1==1));//false
		System.out.println("result = "+(1==1 & 1==2));//false
		System.out.println("result = "+(1==1 & 1==1));//true
		System.out.println("result = "+(1==3 | 1==2));//false
		System.out.println("result = "+(1==1 | 1==2));//true
	}

}
