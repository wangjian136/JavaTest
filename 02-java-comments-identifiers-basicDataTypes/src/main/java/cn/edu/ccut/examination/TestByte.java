package cn.edu.ccut.examination;

public class TestByte {

	public static void main(String[] args) {
		byte b1=1,b2=2,b3,b6; 
		final byte b4=4,b5=6; 
		b6=b4+b5; 
		//b3=(b1+b2); //因为byte类型再相加的时候，会自动转换成int类型，右边的int类型赋值给byte类型便会报错
		//System.out.println(b3+b6);
	}
}
