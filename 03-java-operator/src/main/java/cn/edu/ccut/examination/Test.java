package cn.edu.ccut.examination;

public class Test {

	public static void main(String[] args) {
		testSelfIncrease();
	}
	
	//自增自减需要注意的问题
	public static void testSelfIncrease(){
		int result = 1;
		int a ;
		a = result ++ ;
		System.out.println(a);//1
		a = ++ result;
		System.out.println(a);//3
		a = result --;
		System.out.println(a);//3
		a = -- result;
		System.out.println(a);//1
	}

}
