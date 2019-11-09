package cn.edu.ccut.examination;

public class StatementBlock {

	public static void main(String[] args) {
		Tool tool1 = new Tool();
		//1、Static Statement Block
		//1、Statement Block
		//1、Constructor Method
		Tool tool2 = new Car();
	}

}

class Tool{
	//Static Statement Block
	static {
		System.out.println("1、Static Statement Block");
	}
	//Statement Block
	{
		System.out.println("1、Statement Block");
	}
	//Constructor Method
	public Tool() {
		System.out.println("1、Constructor Method");
	}
}

class Car extends Tool{
	//Static Statement Block
	static {
		System.out.println("2、Static Statement Block");
	}
	//Statement Block
	{
		System.out.println("2、Statement Block");
	}
	//Constructor Method
	public Car() {
		System.out.println("2、Constructor Method");
	}
}
