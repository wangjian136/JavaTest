package cn.edu.ccut.test;
/**
 * IfElseIfElseStatement
 * if(布尔表达式1){语句块1}else if(布尔表达式2){语句块2}...else{语句块n}
 * @author Administrator
 *
 */
public class IfElseIfElseStatement {

	public static void main(String[] args) {
		//掷骰子游戏，骰子点数1~6
		int num = (int)(Math.random() * 6) + 1;
		if(num < 2) {
			System.out.println("点数小于2");
		}else if(num < 5){
			System.out.println("点数大于等于2，小于5");
		}else {
			System.out.println("点数大于5");
		}
	}

}
