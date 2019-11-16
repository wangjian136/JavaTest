package cn.edu.ccut.test;

import static java.lang.Math.*;//JDK1.5

public class MathTest {

	public static void main(String[] args) {
		//计算绝对值
		System.out.println(abs(-12));
		//获取两个数最大值、最小值
		System.out.println(max(12, 13));
		System.out.println(min(12, 13));
		//计算加法
		System.out.println(addExact(12, 13));
		//返回随机数0.0 ~ 1.0
		System.out.println(random());
		//返回1 ~ 10的随机数
		System.out.println((int)(10*random()));
		//四舍五入(+0.5向下取整)
		System.out.println(round(-11.5));
		System.out.println(round(4.4));
	}

}
