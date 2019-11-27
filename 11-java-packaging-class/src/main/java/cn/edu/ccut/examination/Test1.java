package cn.edu.ccut.examination;

public class Test1 {

	public static void main(String[] args) {
		Integer a = new Integer(5);
		Integer b = new Integer(5);

		Integer c = 5;
		Integer d = 5;
		
		Integer e = 128;
		Integer f = 128;
		
		int g = 128;
		
		System.out.println(a == b);//false
		System.out.println(b == c);//false
		System.out.println(c == d);//true //自动装箱valueOf(int a)
		System.out.println(e == f);//false
		System.out.println(f == g);//true //自动拆箱intValue()
		
	}

}
