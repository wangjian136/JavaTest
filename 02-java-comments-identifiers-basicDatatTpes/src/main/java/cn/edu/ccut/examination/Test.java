package cn.edu.ccut.examination;

public class Test {

	public static void main(String[] args) {
		testDouble();
	}
	//由于存在精度问题,所以浮点类型的运算可能有误差
	public static void testDouble(){
		double a = 0.6;
		double b = 0.2;
		double c = 0.05;
		double d = 0.01;
		System.out.println(a/b);//2.9999999999999996
		System.out.println(c+d);//0.060000000000000005
	}

}
