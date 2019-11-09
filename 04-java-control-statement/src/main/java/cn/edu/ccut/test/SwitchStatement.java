package cn.edu.ccut.test;
/**
 * SwitchStatement
 * switch(表达式) {case 值1：语句序列1；break; case 值2：语句序列2；break;... default：默认语句；}
 * @author Administrator
 *
 */
public class SwitchStatement {

	public static void main(String[] args) {
		//掷骰子游戏，骰子点数1~6
		int num = (int)(Math.random() * 6) + 1;
		switch (num) {
		case 1:
			System.out.println("点数是1");
			break;
		case 2:
			System.out.println("点数是2");
			break;
		case 3:
			System.out.println("点数是3");
			break;
		case 4:
			System.out.println("点数是4");
			break;
		default:
			System.out.println("点数大于4");
			break;
		}
	}

}
