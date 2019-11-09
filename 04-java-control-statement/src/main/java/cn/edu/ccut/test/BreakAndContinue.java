package cn.edu.ccut.test;
/**
 * BreakAndContinue
 * break 和 continue 用于循环体内，与循环体进行配合
 * @author Administrator
 *
 */
public class BreakAndContinue {

	public static void main(String[] args) {
		//break
		int [] ins1 = {1,2,3,4,5,6};
		for(int i : ins1) {
			if(i == 2)
				break;
			System.out.print(i);//1
		}
		System.out.println();
		//continue
		int [] ins2 = {1,2,3,4,5,6};
		for(int i : ins2) {
			if(i == 2)
				continue;
			System.out.print(i);//13456
		}
	}

}
