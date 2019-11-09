package cn.edu.ccut.test;
/**
 * IfElseStatement
 * if(布尔表达式){语句块1}else{语句块2}
 * @author Administrator
 *
 */
public class IfElseStatement {

	public static void main(String[] args) {
		//掷骰子游戏，骰子点数1~6
		int num = (int)(Math.random() * 6) + 1;
		if(num > 3) {
			System.out.println("官人，您今天手气不错嘛！");
		}else {
			System.out.println("垃圾，就你这样的还敢在这里混！");
		}
	}

}
