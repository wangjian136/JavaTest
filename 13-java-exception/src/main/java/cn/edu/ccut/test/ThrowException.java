package cn.edu.ccut.test;


public class ThrowException {

	public static void main(String[] args) throws Exception{
		System.out.println("=========");
		//throw new IOException("this is io exception");
		throw new CustomException("it's custom exception");
	}

}
